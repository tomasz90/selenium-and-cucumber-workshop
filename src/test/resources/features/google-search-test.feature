Feature: Testing google search
  
  #TODO: Implement given steps:
  
  Background: Landing page
    Given I am on google page

  Scenario: Test basic search
    #SOME_WORD shouldn't be hardcoded in stepdefs
    When  I enter SOME_WORD into search bar 
    And   I click enter
    Then  I should see expected results

  Scenario: Test search using search bar tips
    When  I enter SOME_WORD into search bar
    Then  I should see search bar tips
    When  I click first result
    Then  I should see expected results