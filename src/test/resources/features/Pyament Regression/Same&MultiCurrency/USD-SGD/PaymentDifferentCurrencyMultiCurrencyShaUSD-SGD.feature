@Payment_DifferentCurrency_Multi_SHA_USD_SGD
Feature: Payment Different Currency and Multi Sha Automation Test Case Execution USD_SGD

  @PaymentSIT_MultiCurrency_DifferentCurrency_SHA_USD_SGD<250k
  Scenario:Overseas transfer in the Different currency and Multi currency SHA Automation Test Case Execution USD-SGD < 250k
    Given Overseas transfer in the Different currency and Multi currency USD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |10            |0.01               |SHA          |SGD                         |
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

  @PaymentSIT_MultiCurrency_DifferentCurrency_SHA_USD_SGD=250k
  Scenario:Overseas transfer in the Different currency and Multi currency SHA Automation Test Case Execution USD-SGD = 250k
    Given Overseas transfer in the Different currency and Multi currency USD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |100000        |180000             |SHA          |SGD                         |
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

  @PaymentSIT_MultiCurrency_DifferentCurrency_SHA_USD_SGD>250k
  Scenario:Overseas transfer in the Different currency and Multi currency SHA Automation Test Case Execution USD-SGD > 250k
    Given Overseas transfer in the Different currency and Multi currency USD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |100000        |190000             |SHA          |SGD                         |
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