Feature: Move the property to trash

  Scenario: Move the property to trash
    Given initilaize with chrome browser
    And navigate to url "http://realty-real-estatem1.upskills.in/"
    When user clicks on login/register link
    Then user enters the Username as "mohankrishna176@gmail.com" and Password as "Secret@123&&"
    And user clicked on login button
    And mousehover to properties and click
    And mousehover to property checkbox and click on that
    And select move to trash from the dropdown
    And mousehover to trash tab and click the link
    And check whether the property is moved to trash
    And close the browser
