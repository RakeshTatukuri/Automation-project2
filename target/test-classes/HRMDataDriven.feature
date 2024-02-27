Feature: Test orange HRM application

  Scenario Outline: Test data driven for login feature
    Given open hrm application
    When user enters username "<un>" and enters password "<pwd>"
    When user click on login button from hrm page
    Then as per test data for valid dataset user should be able to login

    Examples: 
      | un    | pwd      |
      | Admin | admin123 |
      | test  | test123  |
      | Admin | admin123 |
      | ram   | ram123   |
