@paymentUat_MM_FX
  Feature:Treasury - Money Market and Forex



    @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved
    Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved
      Given Use "T24-automation-UAT-login" to login to T24 environment
      When I click Fixed Maturity Placement Contracts
      Then I Assertion enter Fixed Maturity Placement Contracts Page
      When I Input incomplete information on Placement Contracts Page "1"
      Then I get MMNumber
      Then I click pre-submit button
      When I click Accept Overrides
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Unauthorized MM Transactions page
      Then I input MM Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I enter the MM Payment Entry page
      Then I input MM Number and click Find
      When I enter the Payments Enquiry - Transaction wise status page
      Then I input MMPINumber and click Find
      When I Assert enter View Page Trans
      When I change status code Trans
      When I click Accept Overrides
      Then Assert Result whether Successful
      Then I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Pending Authorise Payments page
      Then I input OE Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FTNumber and click Find
      When I Assert enter View Page
      Then I Assert enter View Details Page
      When I close all tabs and jump to the home page
      When I enter the Currency Rates List
      Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "1"
#    Then I find account
#      |Arrangement|
#      |11010006762|
      And I close driver

    @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved
    Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved
      Given Use "T24-automation-UAT-login" to login to T24 environment
      When I click Capture Forex Spot Deal
      When I Choose Customer and Input incomplete information on Forex Spot Deal Page "1"
      Then I get FXNumber
      Then I click pre-submit button
      When I click Accept Overrides
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Unauthorized FX Transactions page
      Then I input FX Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I type in the content and click the search "1"
      Then I input FX Number and click Find
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FXPINumber and click Find
      When I Assert enter View Page
      Then I Assert enter View Details Page
      Then I close all tabs and jump to the home
      When I enter the account IDCA
      Then I find debit and credit account "1"
      And I close driver

    @Payment_FX_Capture_Forex_Spot_Deal_Customer_235-677_Approved
    Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_235-677_Approved
      Given Use "T24-automation-UAT-login" to login to T24 environment
      When I click Capture Forex Spot Deal
      When I Choose Customer and Input incomplete information on Forex Spot Deal Page "1"
      Then I get FXNumber
      Then I click pre-submit button
      When I click Accept Overrides
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Unauthorized FX Transactions page
      Then I input FX Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I type in the content and click the search "1"
      Then I input FX Number and click Find
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FXPINumber and click Find
      When I Assert enter View Page Trans
      When I change status code Trans FX
      When I click Accept Overrides
      Then Assert Result whether Successful
      Then I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Pending Authorise Payments page
      Then I input OE Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FTNumber and click Find
      When I Assert enter View Page
      Then I Assert enter View Details Page
#      When I close all tabs and jump to the home page
#      When I enter the Currency Rates List
      Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "1"
#    Then I find account
#      |Arrangement|
#      |11010006762|
      And I close driver


    @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved
    Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved
      Given Use "T24-automation-UAT-login" to login to T24 environment
      When I click Capture Forex Spot Deal
      When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "1"
      Then I get FXNumber
      Then I click pre-submit button
      When I click Accept Overrides
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Unauthorized FX Transactions page
      Then I input FX Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I type in the content and click the search "1"
      Then I input FX Number and click Find
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FXPINumber and click Find
      When I Assert enter View Page Trans
      When I change status code Trans FX
      When I click Accept Overrides
      Then Assert Result whether Successful
      Then I close driver
      Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
      When I entered the Pending Authorise Payments page
      Then I input OE Number and click Find Authorise
      Then Assert Result whether Successful
      And I close driver
      Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
      When I enter the Payments Enquiry - Transaction wise page
      Then I input FTNumber and click Find
      When I Assert enter View Page
      Then I Assert enter View Details Page
      When I close all tabs and jump to the home page
#      When I enter the Currency Rates List
#      Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "1"
#    Then I find account
#      |Arrangement|
#      |11010006762|
      And I close driver