@PaymentSIT
Feature: receipt and payment service

@PaymentSIT_SingleCurrency_SHA_SGD_SGD
Scenario:Overseas transfer in the same currency and single currency SHA SGD-SGD = 250k
  Given Overseas transfer in the same currency and single currency SHA SGD-SGD
    |Deposit amount|Transfer out amount|Charge Option|
    |250001        |250000             |SHA          |
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
  Then Verify cut off time date
  When Verify of successful deduction of transfer-out account
    |windows Title            |
    |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_SHA_USD_USD
  Scenario:Overseas transfer in the same currency and single currency SHA USD-USD =0.01
    Given Overseas transfer in the same currency and single currency SHA USD-USD
      |Deposit amount|Transfer out amount|Charge Option|
      |10            |0.01               |SHA          |
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
    Then Verify cut off time date
    When Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_SHA_USD_USD
  Scenario:Overseas transfer in the same currency and single currency SHA USD-USD = 250k
    Given Overseas transfer in the same currency and single currency SHA USD-USD
      |Deposit amount|Transfer out amount|Charge Option|
      |190000        |190000             |SHA          |
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
    Then Verify cut off time date
    When Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_SHA_USD_USD
  Scenario:Overseas transfer in the same currency and single currency SHA USD-USD = 250k
    Given Overseas transfer in the same currency and single currency SHA USD-USD
      |Deposit amount|Transfer out amount|Charge Option|
      |190000        |180000             |SHA          |
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
    Then Verify cut off time date
    When Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|