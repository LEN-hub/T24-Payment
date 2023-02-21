@Payment_SameCurrency_Multi_SHA_SGD_SGD
Feature: Payment Same Currency and Multi SHA Automation Test Case Execution SGD-SGD

  @PaymentSIT_MultiCurrency_SameCurrency_SHA_SGD_SGD=250k
  Scenario:Overseas transfer in the same currency and Multi currency SHA Automation Test Case Execution SGD-SGD = 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |250000        |250000             |SHA          |SGD                         |
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
    Then Verify of successful deduction of MYC transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|


  @PaymentSIT_MultiCurrency_SameCurrency_SHA_SGD_SGD<250k
  Scenario:Overseas transfer in the same currency and Multi currency SHA Automation Test Case Execution SGD-SGD < 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |1000          |1000               |SHA          |SGD                         |
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
    Then Verify of successful deduction of MYC transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_MultiCurrency_SameCurrency_SHA_SGD_SGD>250k
  Scenario:Overseas transfer in the same currency and Multi currency SHA Automation Test Case Execution SGD-SGD > 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount  |Transfer out amount |Charge Option|Transfer in account currency|
      |250000          |250001              |SHA          |SGD                         |
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
