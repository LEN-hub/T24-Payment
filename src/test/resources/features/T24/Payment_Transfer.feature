@PaymentSIT
Feature: receipt and payment service

@PaymentSIT_SingleCurrency_SHA_SGD_SGD
Scenario:Overseas transfer in the same currency and single currency SHA SGD-SGD =250K
  Given Overseas transfer in the same currency and single currency SHA SGD-SGD
    |parameter             |
    |serviceChargeInquiry  |
  Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
  When I verify the T24 transaction status
    |windows Title                            |
    |Pending and Processed Payments - UAT GLDB|
  Then I verify that the data in the API request message is consistent with the page ChangOptions field
    |Charge Option|
    |SHA          |
  Then I verify that the cut off time date is consistent with the expected result
  Then I verify that the data in the API request message is consistent with the currency field of the page
  Then I verify that the data in the API request message is consistent with the page amount field
  Then I verify that the data in the API request message is consistent with the bit amount field on the page
    |envName             |
    |serviceChargeInquiry|
  Then I verify that the data in the API request message is consistent with the page feed field
  When I verify that the account deduction is correct through the calculation formula
    |windows Title            |Find Accounts|
    |AA Arrangement - SIT GLDB|11010002414  |

  @PaymentSIT_SingleCurrency_SHA_USD_USD
  Scenario:Overseas transfer in the same currency and single currency SHA USD-USD =0.01
    Given Overseas transfer in the same currency and single currency SHA USD-USD
      |parameter             |
      |serviceChargeInquiry  |
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I verify the T24 transaction status
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I verify that the expected result of the actual deduction amount is consistent
    Then I verify that the T24 transaction status is consistent with the expected result
    Then I verify that the data in the API request message is consistent with the page ChangOptions field
      |Charge Option|
      |SHA          |
    Then I verify that the cut off time date is consistent with the expected result
    Then I verify that the data in the API request message is consistent with the currency field of the page
    Then I verify that the data in the API request message is consistent with the page amount field
    Then I verify that the data in the API request message is consistent with the bit amount field on the page
      |envName             |
      |serviceChargeInquiry|
    Then I verify that the data in the API request message is consistent with the page feed field
    When I verify that the account deduction is correct through the calculation formula
      |windows Title            |Find Accounts|
      |AA Arrangement - SIT GLDB|11010000608  |