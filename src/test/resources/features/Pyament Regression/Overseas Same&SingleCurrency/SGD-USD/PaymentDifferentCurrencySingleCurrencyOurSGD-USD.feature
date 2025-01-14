@Payment_DifferentCurrency_Single_OUR_SGD_USD
Feature: Payment Different Currency and Single Our Automation Test Case Execution SGD-USD

  @PaymentSIT_SingleCurrency_DifferentCurrency_OUR_SGD_USD=250k
  Scenario:Overseas transfer in the Different currency and Single currency OUR Automation Test Case Execution SGD-USD = 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |250000        |250000             |OUR          |USD                         |
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
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|


  @PaymentSIT_SingleCurrency_DifferentCurrency_OUR_SGD_USD<250k
  Scenario:Overseas transfer in the Different currency and Single currency OUR Automation Test Case Execution SGD-USD < 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
      |1000          |1000               |OUR          |USD                         |
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
    Then Verify of successful deduction of transfer-out account
      |windows Title            |
      |AA Arrangement - SIT GLDB|

  @PaymentSIT_SingleCurrency_DifferentCurrency_OUR_SGD_USD>250k
  Scenario:Overseas transfer in the Different currency and Single currency OUR Automation Test Case Execution SGD-USD > 250k
    Given Overseas transfer in the Different currency and Single currency SGD-USD
      |Deposit amount  |Transfer out amount |Charge Option|Transfer in account currency|
      |250000          |250001              |OUR          |USD                         |
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