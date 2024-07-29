Feature: Cash Withdrawal

  Scenario Outline: Withdraw money from wallet
    Given I have deposited <initial_balance> in my wallet
    When I request <withdrawal_amount>
    Then <dispensed_amount> should be dispensed
    And my wallet balance should be <final_balance>
    And I should be notified of <notification>

    Examples:
      | initial_balance | withdrawal_amount | dispensed_amount | final_balance | notification          |
      | 200             | 30                | 30               | 170           | "no notification"     |
      | 50              | 100               | 0                | 50            | "insufficient funds"  |
      | 0               | 30                | 0                | 0             | "insufficient funds"  |
      | 0               | -50               | 0                | 0             | "invalid request"     |
      | 100             | 100               | 100              | 0             | "no notification"     |
      | 100             | -30               | 0                | 100           | "invalid request"     |