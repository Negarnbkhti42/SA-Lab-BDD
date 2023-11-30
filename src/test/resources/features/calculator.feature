@tag
Feature: Calculator

  Scenario: divide two numbers and get root
    Given Two input values, 4 and 1
    When I divide first value by second value
    Then I get the root
    Then I expect the result 2