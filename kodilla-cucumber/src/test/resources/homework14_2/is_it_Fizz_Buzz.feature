Feature: FizzBuzz Game

  Scenario Outline: Playing FizzBuzz game

    Given the number is <number>
    When  Checking number
    Then  I should get <result>

    Examples:
      | number | result |
      | 1 | "None" |
      | 2 | "None" |
      | 3 | "Fizz" |
      | 4 | "None" |
      | 5 | "Buzz" |
      | 6 | "Fizz" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 20 | "Buzz" |
      | 30 | "FizzBuzz" |