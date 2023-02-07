@PaymentSIT
Feature: receipt and payment service

@PaymentSIT_SingleCurrency_SHA_SGD_SGD
Scenario:Overseas transfer in the same currency and single currency SHA SGD-SGD =250K
#  Given Overseas transfer in the same currency and single currency SHA SGD-SGD
#    |parameter             |
#    |serviceChargeInquiry  |
  Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
  When I expand the User Menu menu on the page
  When I expand the User Payments menu on the page
  When I expand the Payment Hub menu on the page
  When I expand the Payment Inquiries and Exceptions menu on the page
  When I expand the Payments Enquiry Transaction wise menu on the page
  When I query the transaction status in the core
    |windows Title                            |
    |Pending and Processed Payments - UAT GLDB|
  Then I check ChangOptions on the page
    |Charge Option|
    |SHA          |
  Then I check the transfer-out currency on the page
  Then I check transfer amount on the page
  Then I check debit amount on the page
    |envName             |
    |serviceChargeInquiry|
  Then I check Fee on the page
  When I close all tabs and jump to the home page
  When I expand the Products menu on the page
  When I expand the Find Account menu on the page
  When I jump to a newly opened page for Find Account menu
    |windows Title            |Find Accounts|
    |AA Arrangement - SIT GLDB|11010002414  |

  @PaymentSIT_SingleCurrency_SHA_USD_USD
  Scenario:Overseas transfer in the same currency and single currency SHA USD-USD =0.01
    Given Overseas transfer in the same currency and single currency SHA USD-USD
      |parameter             |
      |serviceChargeInquiry  |
    Given Use "netSilverEnv_Kevin_T24_SIT" to log in to T24 environment
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I query the transaction status in the core
      |windows Title                            |
      |Pending and Processed Payments - UAT GLDB|
    Then I check ChangOptions on the page
      |Charge Option|
      |SHA          |
    Then I check the transfer-out currency on the page
    Then I check transfer amount on the page
    Then I check debit amount on the page
     |envName             |
     |serviceChargeInquiry|
    Then I check Fee on the page
    When I close all tabs and jump to the home page
    When I expand the Products menu on the page
    When I expand the Find Account menu on the page
    When I jump to a newly opened page for Find Account menu
      |windows Title            |Find Accounts|
      |AA Arrangement - SIT GLDB|11010000608  |