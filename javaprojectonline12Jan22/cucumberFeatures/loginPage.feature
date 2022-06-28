@tag
Feature: Facebook login feature
  I want to use this template for my login feture file

  Background: Pre condition
    Given I am the user of facebook application

  @tag1
  Scenario: Valid login scenario
    When I enter valid username
    And I enter valid password
    And I click on login button

  @tag2
  Scenario: Invalid login scenario
    When i enter invalid username
    And I enter invalid password
    And I click on login button
    Then i should not be able to login sucessfully
    And Error message should display
