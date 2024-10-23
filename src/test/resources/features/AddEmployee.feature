Feature: Add employee in HRMS


Background:
  #When user enters admin username and admin password
  When user enters "Admin" in username
  And when user enters "Hum@nhrm123" in password
  And user clicks on login button
  Then user is navigated to dashboard page
  When user clicks on PIM option
  And user clicks on add employee option

  @NoEmployeeID
  Scenario Outline: adding employee with first, middle, last names and no employeeID
    When user enters "<firstname>","<middlename>" and "<lastname>"
    And user clicks on save button
    Then employee is added successfully and "Personal Details" is displayed
    Examples:
      | firstname | middlename | lastname |
      |  Ana      |            |  Smith   |
      |  Mary     |  Joe       | Johnson  |


  @WithEmployeeID
Scenario Outline:adding employee providing employee ID, first,last and middle names
    When user enters "<firstname>","<middlename>" and "<lastname>"
    And user enters unique employee ID
    And user clicks on save button
    Then employee is added successfully and "Personal Details" is displayed
  Examples:
    | firstname | middlename | lastname |
    |  Kaden    |            | Jacob    |
    |  Arlind   |   Karl     |Gabel     |

  @EmptyFirstName
  Scenario Outline: empty firstname
    When user enters "<firstname>","<middlename>" and "<lastname>"
    And user enters unique employee ID
    And user clicks on save button
    Then user can see error message "Required"
    Examples:
      | firstname | middlename | lastname |
      |           |    Laura   | Smith    |

  @emptyLastName
  Scenario Outline: empty last name field
    When user enters "<firstname>","<middlename>" and "<lastname>"
    And user enters unique employee ID
    And user clicks on save button
    Then user can see "Required" error message in last name
    Examples:
      | firstname | middlename | lastname |
      |  Luisa    |    Anne    |          |

  @existingEmpID
  Scenario Outline: existing employee ID
    When user enters "<firstname>","<middlename>" and "<lastname>"
    And user enters "11111111" in existing employee ID
    And user clicks on save button
    Then user can see the "Failed To Save" error message
    Examples:
      | firstname | middlename | lastname |
      |  Arlind   |   Karl     |Gabel     |








