Feature:Login scenarios

  @emptyUser
  Scenario: empty username field
    When user enters empty username and admin password
    And user clicks on login button
    Then user can see error message Username cannot be empty
    Then user enters admin username and admin password
    And user clicks on login button

    @emptyPass
    Scenario: empty password field
      When user enters admin username and empty password
      And user clicks on login button
      Then user can see error message Password is empty
      Then user enters admin username and admin password
      And user clicks on login button


@incorrectUser
      Scenario: incorrect admin field
        When user enters incorrect username and admin password
        And user clicks on login button
        Then user can see error message Invalid credentials
       Then user enters admin username and admin password
       And user clicks on login button

  @incorrectPass
  Scenario: incorrect password field
    When user enters admin username and incorrect password
    And user clicks on login button
    Then user can see error message Invalid credentials
    Then user enters admin username and admin password
    And user clicks on login button
