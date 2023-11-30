@tag
Feature: Calculator

  Scenario: divide two numbers and get root
    Given Two input values, 4 and 1
    When I divide first value by second value
    Then I get the root
    Then I expect the result 2

  Scenario Outline: divide two numbers and get root
    Given Two input values, <first> and <second>
    When I divide first value by second value
    Then I get the root
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 4     | 1      | 2      |
      | 36    | 4      | 3  	|
      | -4    | -1      | 2  	|