# new feature
# Tags: optional


Feature: Delete Product feature

  Background:
    Given user has already logged in to application
      |username|password|
      |admin@example.com|password|
    And user has clicked on Products tab

  Scenario: Deleting a product from the product list
    Given a list of products
    When User clicks on delete button for the first product
    And accepts the delete warning
    Then the product list should decrease by One

