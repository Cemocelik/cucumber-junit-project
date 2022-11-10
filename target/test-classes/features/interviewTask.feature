Feature: hioscar.com care options web app testing
@wip
  Scenario: Hioscar Search functionality result title verification
    Given user on hioscar home page
    When  user click search network
    And   user select from Coverage year dropdown Select 2023 option
    And   user select from Coverage access dropdown Select Employer-provided option
    And   user select from Network partner dropdown Select Oscar option
    And   user select from Coverage area dropdown Select New Jersey
    And   user click continue button
    Then  user see title contains “Oscar”