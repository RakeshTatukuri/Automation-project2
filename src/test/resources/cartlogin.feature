Feature: Test opencart application

  Scenario: Test login with valid data
    Given open opencart login page
    When user enters valid credentials
      | email                  | password  |
      | jaisriram123@gmail.com | sriram123 |
    Then user should be able to login into opencart application
