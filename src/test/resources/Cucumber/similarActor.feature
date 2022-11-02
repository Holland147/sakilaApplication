Feature: check to see if an actor has similar features
  as a user i, can check to see if actors have similar features.

  Scenario: The program succesfully retrives and displays similar features.
    Given a user selects an actor
    When a user choses to compare and actor
    Then the program returns the sdetails