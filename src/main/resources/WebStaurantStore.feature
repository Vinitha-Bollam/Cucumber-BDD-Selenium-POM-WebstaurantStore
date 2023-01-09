@All @ProductSearch
Feature: Product Search

  @SearchResults
  Scenario Outline: Verify word 'Table' as title on every Product when a user search for a "<Search>"
    Given  User navigates to Webstaurantstore
    When User search for "<Search>"
    Then User should see every product with the word "<TitleWord>" in its title for "<Search>" search
    Then User should select last of found items to Cart
    And User should Empty Cart

    Examples:
      | Search                            | TitleWord |
      | stainless work table | Table         |
      | stainless  table            | Table        |
      | table                                | Table        |

