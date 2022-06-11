Feature: Create a property

  Scenario: Verify whether the property has created or not
    Given initilaize with chrome browser
    And navigate to url "http://realty-real-estatem1.upskills.in/"
    When user clicks on login/register link
    Then user enters the Username as "mohankrishna176@gmail.com" and Password as "Secret@123&&"
    And user clicked on login button
    Then user can see the dashboard
    And mousehover to properties and click on properties module
    And click on add new
    And enter the Title as "MyFirstProperty" and price as "60000"
    And click on publish
    And click on all properties
    And close the browser
