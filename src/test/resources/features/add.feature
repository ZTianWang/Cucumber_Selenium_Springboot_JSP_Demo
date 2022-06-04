@Test
Feature: Add numbers

  @Add
  Scenario Template: Add two numbers
    Given I was in the add page
    When I enter num1 <num1>
    And I enter num2 <num2>
    And I click add button
    Then The result is <result>
    Examples:
      | num1 | num2 | result |
      | 12   | 5    | 17     |
      | 4    | 8    | 12     |

  @Login
  Scenario: login
    Given I visit the login page
    When I enter "user1" as user name field
    And I enter "password" as password field
    And I press the submit button
    Then I should see the welcome page
