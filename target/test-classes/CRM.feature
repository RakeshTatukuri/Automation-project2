Feature: Test CRM application

  Background: 
    Given open CRM application

  @signin
  Scenario: Test sign in link
    When user click on sign in link
    Then sign in page should open

  @login
  Scenario: Test login feature for valid data
    When user enters email "test@gmail.com" and password "test1234"
    When user clicks on submit button
    Then for valid data user should be able to login
