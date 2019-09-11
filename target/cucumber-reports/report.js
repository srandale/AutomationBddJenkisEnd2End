$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Validate various links on page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid id and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on web page",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters \"tomsmith\" for username field",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.enters_for_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters \"SuperSecretPassword!\" for password field",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.enters_for_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login successfull and \"Welcome to the Secure Area. When you are done click logout below.\" message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.login_successfull_and_message_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});