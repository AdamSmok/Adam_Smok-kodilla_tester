Feature: Deposit money into wallet
  Scenario: User deposits money into their wallet
    Given my wallet balance is $50
    When I deposit $100
    Then my wallet balance should be $150
    And I should be notified of "deposit successful"