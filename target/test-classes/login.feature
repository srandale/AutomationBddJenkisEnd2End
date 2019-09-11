#Created by Shivling Randale
#Date - 09/07/2019

Feature: Validate various links on page

  Scenario: Login with valid id and password
    Given User is on web page
    When Enters "tomsmith" for username field
    And Enters "SuperSecretPassword!" for password field
    And clicks on login button
    Then login successfull and "Welcome to the Secure Area. When you are done click logout below." message displayed

