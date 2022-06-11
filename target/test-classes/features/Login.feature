Feature: Login as an admin

  Scenario: Successful logins with valid credentials
    Given initilaize with chrome browser
    And navigate to url "http://realty-real-estatem1.upskills.in/"
    When user clicks on login/register link
    Then user enters the Username as "mohankrishna176@gmail.com" and Password as "Secret@123&&"
    And user clicked on login button
    Then verify user is successfully logged in
    And close the browser
