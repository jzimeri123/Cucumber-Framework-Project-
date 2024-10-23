Feature:Login scenarios

  @emptyUser
  Scenario: empty username field
    When when user enters "Hum@nhrm123" in password
    And user clicks on login button
    Then user can see the error message "Username cannot be empty"
    When user enters "Admin" in username
    Then when user enters "Hum@nhrm123" in password
    And user clicks on login button

    @emptyPass
    Scenario: empty password field
      When user enters "Admin" in username
      And user clicks on login button
      Then user can see password error message "Password is Empty"
      When user enters "Admin" in username
      Then when user enters "Hum@nhrm123" in password
      And user clicks on login button


@incorrectUser
      Scenario: incorrect admin field
        When user enters "Administrator" in username
        And when user enters "Hum@nhrm123" in password
        And user clicks on login button
        Then user can see invalid error message "Invalid credentials"
        When user enters "Admin" in username
        Then when user enters "Hum@nhrm123" in password
        And user clicks on login button

  @incorrectPass
  Scenario: incorrect password field
    When user enters "Admin" in username
    And when user enters "Human123" in password
    And user clicks on login button
    Then user can see invalid error message "Invalid credentials"
    When user enters "Admin" in username
    Then when user enters "Hum@nhrm123" in password
    And user clicks on login button



