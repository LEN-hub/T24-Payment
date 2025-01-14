@Payment_SameCurrency_Single_SHA_USD_USD
Feature: Payment Same Currency and Single SHA Automation Test Case Execution USD-USD

  @PaymentSIT_SingleCurrency_SameCurrency_SHA_USD_USD<250k
  Scenario:Overseas transfer in the same currency and single currency Automation Test Case Execution SHA USD-USD < 250k
    Given Overseas transfer in the same currency and single currency USD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |10            |5                  |SHA          |USD                         |
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
#    Then Verify cut off time date
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_SameCurrency_SHA_USD_USD=250k
  Scenario:Overseas transfer in the same currency and single currency SHA Automation Test Case Execution USD-USD = 250k
    Given Overseas transfer in the same currency and single currency USD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |100000        |180000             |SHA          |USD                         |
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
#    Then Verify cut off time date
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_SameCurrency_SHA_USD_USD>250k
  Scenario:Overseas transfer in the same currency and single currency SHA Automation Test Case Execution USD-USD > 250k
    Given Overseas transfer in the same currency and single currency USD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |100000        |190000             |SHA          |USD                         |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then Verify the Charge Options field
      |Charge Option|
      |SHA          |
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify fees
    Then Verify T24 transaction status

