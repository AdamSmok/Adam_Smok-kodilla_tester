Feature: Multiple transactions
  Scenario: User deposits and withdraws multiple times
    Given my wallet balance is $100
    When I deposit $50
    And I withdraw $30
    And I deposit $20
    And I withdraw $40
    Then my wallet balance should be $100
    And I should be notified of "no notification"