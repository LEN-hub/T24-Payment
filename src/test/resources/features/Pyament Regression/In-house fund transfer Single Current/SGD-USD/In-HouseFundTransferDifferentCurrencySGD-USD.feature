@Payment_In_House_Fund_Transfer_Different_Currency_SGD-USD
Feature: Payment In House Fund Transfer and Single Automation Test Case Execution SGD-USD

  @PaymentSIT_In_House_Single_Currency_SGD_USD
Scenario:In house fund transfer same & Single currency SGD-USD
  Given In house fund transfer same & Single currency SGD-USD
  |Deposit amount|Transfer out amount|Charge Option|Transfer in account currency|
  |100           |100                |SHA          |USD                         |
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
  Then Verify of successful deduction of transfer-out account
  |windows Title            |
  |AA Arrangement - SIT GLDB|