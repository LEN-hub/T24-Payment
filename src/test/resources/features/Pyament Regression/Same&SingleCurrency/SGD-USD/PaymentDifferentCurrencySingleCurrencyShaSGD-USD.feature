@Payment_DifferentCurrency_Single_SHA_SGD_USD
Feature: Payment Different Currency and Single Sha Automation Test Case Execution SGD-USD

  @PaymentSIT_SingleCurrency_DifferentCurrency_SHA_SGD_USD=250k
  Scenario:Overseas transfer in the Different currency and Single currency SHA Automation Test Case Execution SGD-USD = 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |250000        |250000             |SHA          |USD                         |
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
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|


  @PaymentSIT_SingleCurrency_DifferentCurrency_SHA_SGD_USD<250k
  Scenario:Overseas transfer in the Different currency and Single currency SHA Automation Test Case Execution SGD-USD < 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |1000          |1000               |SHA          |USD                         |
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
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_DifferentCurrency_SHA_SGD_USD>250k
  Scenario:Overseas transfer in the Different currency and Single currency SHA Automation Test Case Execution SGD-USD > 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount  |Transfer out amount |Charge Option|Transfer in account currency|
      |250000          |250001              |SHA          |USD                         |
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