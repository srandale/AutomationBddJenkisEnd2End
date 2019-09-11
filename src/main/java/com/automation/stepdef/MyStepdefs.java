package com.automation.stepdef;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {

    WebDriver driver;
    @Before
    public void setupTest() throws Throwable {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        // capabilities.setCapability("chrome.binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nammu\\IdeaProjects\\AutomationBddJenkisEnd2End\\drivers\\chromedriver.exe");
        //capabilities.setCapability("chrome.debuggerAddress", "127.0.0.1:4723");

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        //driver.get("http://the-internet.herokuapp.com/login");
        Thread.sleep(1000);
    }


    @Given("User is on web page")
    public void user_is_on_web_page() {
        driver.get("http://the-internet.herokuapp.com/login");
    }

    @When("Enters \"([^\"]*)\" for username field")
    public void enters_for_username_field(String username) {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
    }

    @When("Enters \"([^\"]*)\" for password field")
    public void enters_for_password_field(String pwd) {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
    }

    @Then("login successfull and \"([^\"]*)\" message displayed")
    public void login_successfull_and_message_displayed(String expected) {
        String actualTxt=driver.findElement(By.xpath("//*[@id=\"content\"]/div/h4")).getText();
        Boolean match = actualTxt.contains(expected);
        assertTrue("Matches",match);
    }


    @After
    public void quit() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
}
