
import com.vimalselvam.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="com.automation.stepdef",
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"},
        /*plugin = { "pretty","json:target/cucumber-json/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},*/
        monochrome = true)
public class Runner {
   /* @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));

    }*/
   @AfterClass
   public static void teardown() {
       Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Mac OSX");
       Reporter.setTestRunnerOutput("Sample test runner output message");
   }
}

