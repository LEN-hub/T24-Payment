@Payment_In_House_Fund_Transfer_Same_Currency_SGD-SGD
Feature: Payment In House Fund Transfer and Single Automation Test Case Execution SGD-SGD

@PaymentSIT_In_House_Single_Currency_SGD_SGD
Scenario:In house fund transfer same & Single currency SGD-SGD
    Given In house fund transfer same & Single currency SGD-SGD
    |Transfer amount|Transfer currency|Deposit amount|Charge Option|
    |100            |SGD              |100           |SHA          |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When Enter the verification page
    |windows Title                            |
    |Pending and Processed Payments - UAT GLDB|
    Then Verify the actual deduction amount
    Then Verify trade information
    Then Verify Bene currency
    Then Verify transfer amount
    Then Verify T24 transaction status
    Then Verify of successful deduction of transfer-out account
    |windows Title            |
    |AA Arrangement - SIT GLDB|