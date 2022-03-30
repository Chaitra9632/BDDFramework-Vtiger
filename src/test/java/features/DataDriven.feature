#Author: your.email@your.domain.com
Feature: Data Driven Testing

#Background is used for execution of preconditions
  Background: 
   #Given launch "Chrome" Browser -> taken care in hook class
    And Enter the URL "http://localhost:8888"
    And In login page enter username "admin" and password "manager"
    And click on Login Button
    When Home page is displayed click on Organization link

  @Smoke @End2End #Two groups can be used for a particular scenario
  Scenario: As a user I want to Create new Organization with mandatory fields
    And Click on create organization lookm up image
    And Enter the organization name "IDEXCEL"
    Then Validate wheather the organization is created or not  "IDEXCEL"

  @Regression
  Scenario Outline: I want to create multiple Organization with Organization name and industry Type
    And Click on create organization lookm up image
    And enter organizattion name "<OrgName>"
    And From drop down select industry type as "<IndustryType>"
    Then Validate "<OrgName>" and "<IndustryType>" dropdown

    Examples: 
      | OrgName  | IndustryType |
      | Amazon   | Education    |
      | FlipKart | Technology   |
      | Myntra   | Engineering  |

  #Scenario: I want to read data from below table
    #When I want to read data from below table
      #| country | Currency |
      #| India   | Rupees   |
      #| USA     | Dollars  |
