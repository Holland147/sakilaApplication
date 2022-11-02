Feature: Check to see if the program can search for a film ID.

  Scenario: i the user select a certain film ID.
    Given a user wants to select a certain film
    When a user selects a film id to view
    Then the program selects the view