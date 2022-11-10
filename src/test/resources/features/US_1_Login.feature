Feature: As a user, I should be able to log in.
@trycloud
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When  user use username "<username>" and passcode "<password>"
    And   user click the login button
    Then  verify the user should be at the dashboard page
    Examples:
      | username    | password    |
      | user8       | Userpass123 |
      | user38      | Userpass123 |
      | user68      | Userpass123 |
      | user98      | Userpass123 |