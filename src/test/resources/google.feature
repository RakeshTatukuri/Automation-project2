Feature: Test google application

  Background: 
    Given open google application

  Scenario: Test google home page title
    #Given open google application
    When I capture current title of page
    Then Title should match with google

  Scenario: Test google search feature with valid keyword
    #Given open google application
    When I enter valid keyword "testng" into search box
    Then I should get valid search result
