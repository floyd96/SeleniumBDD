# new feature
# Tags: optional

Feature: New Product creation feature

  Background:
    Given user has already logged in to application
      |username|password|
      |admin@example.com|password|
    And user has clicked on Products tab
    And  User clicks on New Product

  Scenario: User creates a new product with correct entries
    When enters a product name as "Generic product1"
    And enters a product SKU as "Generic Product SKU"
    And enters a product description as "Generic Product description"
    And Clicks on Create Product
    Then new Product should be created

  Scenario: User tries to creates a new product with non unique product title
    When enters a product name as "Generic product1"
    And enters a product SKU as "Some unique SKU"
    And enters a product description as "Some unique description"
    And Clicks on Create Product
    Then error message should be displayed

  Scenario: User tries to creates a new product with non unique product SKU
    When enters a product name as "Some Unique Title"
    And enters a product SKU as "Generic dProduct SKU"
    And enters a product description as "Some unique description"
    And Clicks on Create Product
    Then error message should be displayed

  Scenario: User tries to creates a new product with non unique product description
    When enters a product name as "Some Unique Title"
    And enters a product SKU as "Some unique Product SKU"
    And enters a product description as "Generic Product description"
    And Clicks on Create Product
    Then error message should be displayed


