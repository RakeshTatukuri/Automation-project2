Feature: Test opencart application

  Scenario: Test register feature with valid dataset using datatables
    Given open opencart application with register page
    When user enter valid dataset
      | fname | lname  | email               | tphone     | password  | cpassword |
      | JAI   | SRIRAM | jaisriram123@gmail.com | 9087654321 | sriram123 | sriram123 |
    When user clicks on radio button
    When user select privacy policy checkbox
    When user clicks on continue button
    Then user should able to register into application
    