# new feature
# Tags: optional

Feature: LogIn Page Feature

  Scenario: LogIn with correct credentials
    Given user is on Login Page
    When user enters username "admin@example.com"
    And user enters password "password"
    And user clicks on logIn button
    Then user gets title of the page
    And page title should be "Dashboard | Qa Test"
