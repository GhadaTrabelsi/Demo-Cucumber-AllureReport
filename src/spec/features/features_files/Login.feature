@Login
Feature: Search a word in Google

  Background: 
    Given On the Google Search Page

  Scenario: Search a word in Google
    When Type Ducks and click on the Search
    Then Check for the Search Results

  