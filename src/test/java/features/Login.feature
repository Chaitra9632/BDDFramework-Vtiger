#Author: Chaitra M
Feature: Login feature

  @Smoke
  Scenario: As a user I want to Login to application with valid credentials
    Given I will launch browser
    Given I will enter the URL
    When Login page is displayed i will enter username and password
    And I will click on Login
    Then I will validate wheather home page is displayed or not

  @Regression
  Scenario: As a user I will enter invalid username and password
    Given I will launch browser
    Given I will enter the URL
    When Login page is displayed enter invalid username and password
    And I will click on Login
    Then Validate for error message is displayed or not
