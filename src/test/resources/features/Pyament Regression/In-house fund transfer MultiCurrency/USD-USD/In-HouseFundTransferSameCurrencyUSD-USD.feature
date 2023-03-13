@Payment_In_House_Fund_Transfer_Same_Currency_MCY_USD_USD
Feature: Payment In House Fund Transfer and MCY Automation Test Case Execution USD-USD

  @PaymentSIT_In_House_MCY_Currency_USD_USD
  Scenario:In house fund transfer same & MCY currency USD_USD
    Given In house fund transfer same & MCY currency USD_USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |10            |5                 |SHA          |USD                         |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then Verify the actual deduction amount
    Then Verify the Charge Options field
      |Charge Option|
      |SHA          |
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify fees
    Then Verify T24 transaction status
    Then Verify of successful deduction of MYC transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|