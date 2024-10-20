Feature: Add employee in HRMS


Background:
  When user enters admin username and admin password
  And user clicks on login button
  Then user is navigated to dashboard page
  When user clicks on PIM option
  And user clicks on add employee option

  @FirstLastName
  Scenario: adding employee w/o employee ID with first and last name
    When user enters firstname and lastname in fields
    And user clicks on save button
    Then employee is added successfully


  @FirstMiddleLastName
  Scenario: adding employee w/o employee ID with first, middle and last name
    When user enters first middle and last name in fields
    And user clicks on save button
    Then employee is added successfully

@FirstLastID
  Scenario: adding employee providing employee ID, first and last name
    When user enters firstname and lastname in fields
    And user enters unique employee ID
    And user clicks on save button
    Then employee is added successfully

@FirstMiddleLastID
Scenario: adding employee providing employee ID, first, middle and last name
  When user enters first middle and last name in fields
  And user enters unique employee ID
  And user clicks on save button
  Then employee is added successfully

  @emptyFirstName
  Scenario: empty first name field
    When user enters empty firstname and valid lastname in fields
    And user enters unique employee ID
    And user clicks on save button
    Then user can see error message Required

@emptyLastName
    Scenario: empty last name field
      When user enters valid firstname and empty lastname in fields
      And user enters unique employee ID
      And user clicks on save button
      Then user can see Required error message

  @existingEmpID
      Scenario: existing employee ID
        When user enters firstname and lastname in fields
        And user enters existing employee ID
        And user clicks on save button
        Then user can see Failed To Save: Employee Id Exists error message


