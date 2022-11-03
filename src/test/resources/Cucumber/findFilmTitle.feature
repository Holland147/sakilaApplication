Feature: Search for a film title

  Scenario: i the user want a certain film by searching the title name.
    Given a user wants to select a certain film by searching for the title
    When a user inputs a title
    Then the program selects the title that the user has implemented