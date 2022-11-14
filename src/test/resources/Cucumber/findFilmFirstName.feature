Feature: Search for films by an actors first name

  Scenario: i the user wants to search for films by an actors first name
    Given the user wants to find a film by an actors first name
    When the user inputs an actors first name
    Then The program provides a list of films that the actor first name is in