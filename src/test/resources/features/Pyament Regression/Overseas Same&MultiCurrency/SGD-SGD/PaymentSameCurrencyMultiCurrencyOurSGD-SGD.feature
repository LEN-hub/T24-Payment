@Payment_SameCurrency_Multi_OUR_SGD_SGD
Feature: Payment Same Currency and Multi Our Automation Test Case Execution SGD-SGD

  @PaymentSIT_MultiCurrency_SameCurrency_OUR_SGD_SGD=250k
  Scenario:Overseas transfer in the same currency and Multi currency OUR Automation Test Case Execution SGD-SGD = 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |250000        |250000             |OUR          |SGD                         |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then Verify the actual deduction amount
    Then Verify the Charge Options field
      |Charge Option|
      |OUR          |
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify fees
    Then Verify T24 transaction status
    Then Verify cut off time date
    Then Verify of successful deduction of MYC transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|


  @PaymentSIT_MultiCurrency_SameCurrency_OUR_SGD_SGD<250k
  Scenario:Overseas transfer in the same currency and Multi currency OUR Automation Test Case Execution SGD-SGD < 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |1000          |1000               |OUR          |SGD                         |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then Verify the actual deduction amount
    Then Verify the Charge Options field
      |Charge Option|
      |OUR          |
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify fees
    Then Verify T24 transaction status
    Then Verify cut off time date
    Then Verify of successful deduction of MYC transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_MultiCurrency_SameCurrency_OUR_SGD_SGD>250k
  Scenario:Overseas transfer in the same currency and Multi currency OUR Automation Test Case Execution SGD-SGD > 250k
    Given Overseas transfer in the same currency and Multi currency SGD-SGD
      |Deposit amount  |Transfer out amount |Charge Option|Transfer in account currency|
      |250000          |250001              |OUR          |SGD                         |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then Verify the Charge Options field
      |Charge Option|
      |OUR          |
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify fees
    Then Verify T24 transaction status