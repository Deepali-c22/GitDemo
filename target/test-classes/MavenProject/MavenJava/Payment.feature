Feature: Open Google website

  
  Scenario Outline: Google homepage is displayed
    Given Use redirects to google homepage
    And Enters text <name>
    Then clicks on search button
    And results are displayed

    Examples: 
      | name  |
      | Hello |
      | World |
