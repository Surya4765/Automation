Feature: Validate the Login functionality of an application

  @TS01 @RegressionTest
  Scenario: To validate the error message
    Given User launch the browser and navigate to URL
    When User enter the username "user1" and password "123"
    And User clicks the login button
    Then Validate the error message

  @TS02 @SmokeTest @RegressionTest
   Scenario: User validate the login functionality of the application
     Given User launch the browser and navigate to URL
     When User enter the username "user2" and password "123"
     And User clicks the login button
     Then Validate whether the user navigate to homepage

    @TS03
    Scenario Outline: Multiple User validation
      Given User launch the browser and navigate to URL
      When User enter the username "<User Name>" and password "<Password>"
      And User clicks the login button
      Then Validate the error message
      Examples:
        | User Name | Password |
        | abc       | Password |
        | xyz       | Password |
        | uyt       | Password |

