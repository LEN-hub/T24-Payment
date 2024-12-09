@Auto_Test1
Feature: Auto_Test1
#  @Incoming_Payment_999Multi_Currency_001
#  Scenario:Incoming payment-999Multi_Currency_001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming "1"
##    Then I input FTNumber and click Find On Incoming
##      |FTNumber        |
##      |SGL231320CGHJKGD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Then I click Find Multi Currency
#    When I input ArrangementMCA "1"
##    When I input Arrangement
##      |Arrangement    |
##      |11020614528    |
#    And I close driver
#
#  @Incoming_Payment_999Multi_Currency_002
#  Scenario:Incoming payment-999Multi_Currency_002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming "2"
##    Then I input FTNumber and click Find On Incoming
##      |FTNumber        |
##      |SGL231320CGHJKGD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Then I click Find Multi Currency
#    When I input ArrangementMCA "2"
##    When I input Arrangement
##      |Arrangement    |
##      |11020614528    |
#    And I close driver
#
#
#  @Incoming_Payment_999Multi_Currency_003
#  Scenario:Incoming payment-999Multi_Currency_003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming "3"
##    Then I input FTNumber and click Find On Incoming
##      |FTNumber        |
##      |SGL231320CGHJKGD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Then I click Find Multi Currency
#    When I input ArrangementMCA "3"
##    When I input Arrangement
##      |Arrangement    |
##      |11020614528    |
#    And I close driver
#
#  @Incoming_Payment_999Multi_Currency_004
#  Scenario:Incoming payment-999Multi_Currency_004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming "4"
##    Then I input FTNumber and click Find On Incoming
##      |FTNumber        |
##      |SGL231320CGHJKGD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Then I click Find Multi Currency
#    When I input ArrangementMCA "4"
##    When I input Arrangement
##      |Arrangement    |
##      |11020614528    |
#    And I close driver
#
#
#  @Incoming_Payment_999Multi_Currency_005
#  Scenario:Incoming payment-999Multi_Currency_005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming "5"
##    Then I input FTNumber and click Find On Incoming
##      |FTNumber        |
##      |SGL231320CGHJKGD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    Then I click Find Multi Currency
#    When I input ArrangementMCA "5"
##    When I input Arrangement
##      |Arrangement    |
##      |11020614528    |
#    And I close driver
#



 # GLDBCR-1521 TEST
#FX-CUSTOMER  MCA账户--------------------------------------------------------------------------------------------------
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "3"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "3"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "3"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "4"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "4"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "4"
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "5"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "5"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "5"
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "6"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "6"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "6"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "7"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "7"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "7"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "8"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "8"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "8"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_009
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_009
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "9"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "9"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "9"
#    And I close driver
#
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_001
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "1"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "1"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "1"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_002
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "2"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "2"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "2"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "3"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "3"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "3"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "4"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "4"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "4"
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "5"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "5"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "5"
#    And I close driver

#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "6"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "6"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "6"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "7"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "7"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "7"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "8"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "8"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "8"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_009
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_009
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "9"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "9"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDMCA
#    Then I find debit and credit accountB "9"
#    And I close driver





#FX CUSTOMER CA账户-----------------------------------------------------------------------------------------------------

#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_001
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "1"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "1"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "1"
#    And I close driver


#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_002
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "2"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "2"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "2"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "3"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "3"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "3"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "4"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "4"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "4"
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "5"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "5"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "5"
#    And I close driver
#
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "6"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "6"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "6"
#    And I close driver
#
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "7"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "7"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "7"
#    And I close driver
#
#  @Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_Customer_999_Approved_008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose Customer and Input incomplete information on Forex Spot Deal Page "8"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "8"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the account IDCA
#    Then I find debit and credit account "8"
#    And I close driver

#FX interbank ---------------------------------------------------------------------------------------------------------

#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_001
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "1"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "1"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver


#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_002
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "2"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "2"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_003
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "3"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "3"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_004
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "4"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "4"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_005
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "5"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "5"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_006
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "6"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "6"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_007
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "7"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "7"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#
#
#
#  @Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_008
#  Scenario:Payment_FX_Capture_Forex_Spot_Deal_InterBank_235-677_Approved_008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Capture Forex Spot Deal
#    When I Choose InterBank and Input incomplete information on Forex Spot Deal Page "8"
#    Then I get FXNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized FX Transactions page
#    Then I input FX Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I type in the content and click the search "8"
#    Then I input FX Number and click Find
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FXPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans FX
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page BN
#    And I close driver
#





  #MM-----------------------------------------------------------------------------------------------------------------


  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_001
  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_001
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Fixed Maturity Placement Contracts
    Then I Assertion enter Fixed Maturity Placement Contracts Page
    When I Input incomplete information on Placement Contracts Page "1"
    Then I get MMNumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Unauthorized MM Transactions page
    Then I input MM Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the MM Payment Entry page
    Then I input MM Number and click Find
    When I enter the Payments Enquiry - Transaction wise status page
    Then I input MMPINumber and click Find
    When I Assert enter View Page Trans
    When I change status code Trans
    When I click Accept Overrides
    Then Assert Result whether Successful
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    When I enter the Currency Rates List
    Then I close all tabs and jump to the home
    And I close driver


  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_002
  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_002
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Fixed Maturity Placement Contracts
    Then I Assertion enter Fixed Maturity Placement Contracts Page
    When I Input incomplete information on Placement Contracts Page "2"
    Then I get MMNumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Unauthorized MM Transactions page
    Then I input MM Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the MM Payment Entry page
    Then I input MM Number and click Find
    When I enter the Payments Enquiry - Transaction wise status page
    Then I input MMPINumber and click Find
    When I Assert enter View Page Trans
    When I change status code Trans
    When I click Accept Overrides
    Then Assert Result whether Successful
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    When I enter the Currency Rates List
    Then I close all tabs and jump to the home
    And I close driver

  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_003
  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_003
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Fixed Maturity Placement Contracts
    Then I Assertion enter Fixed Maturity Placement Contracts Page
    When I Input incomplete information on Placement Contracts Page "3"
    Then I get MMNumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Unauthorized MM Transactions page
    Then I input MM Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the MM Payment Entry page
    Then I input MM Number and click Find
    When I enter the Payments Enquiry - Transaction wise status page
    Then I input MMPINumber and click Find
    When I Assert enter View Page Trans
    When I change status code Trans
    When I click Accept Overrides
    Then Assert Result whether Successful
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    When I enter the Currency Rates List
    Then I close all tabs and jump to the home
    And I close driver

  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_004
  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_004
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Fixed Maturity Placement Contracts
    Then I Assertion enter Fixed Maturity Placement Contracts Page
    When I Input incomplete information on Placement Contracts Page "4"
    Then I get MMNumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Unauthorized MM Transactions page
    Then I input MM Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the MM Payment Entry page
    Then I input MM Number and click Find
    When I enter the Payments Enquiry - Transaction wise status page
    Then I input MMPINumber and click Find
    When I Assert enter View Page Trans
    When I change status code Trans
    When I click Accept Overrides
    Then Assert Result whether Successful
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    When I enter the Currency Rates List
    Then I close all tabs and jump to the home
    And I close driver
#
#  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_CNY
#  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_CNY
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Fixed Maturity Placement Contracts
#    Then I Assertion enter Fixed Maturity Placement Contracts Page
#    When I Input incomplete information on Placement Contracts Page "5"
#    Then I get MMNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized MM Transactions page
#    Then I input MM Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the MM Payment Entry page
#    Then I input MM Number and click Find
#    When I enter the Payments Enquiry - Transaction wise status page
#    Then I input MMPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    And I close driver
#
#  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_AED
#  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_AED
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Fixed Maturity Placement Contracts
#    Then I Assertion enter Fixed Maturity Placement Contracts Page
#    When I Input incomplete information on Placement Contracts Page "6"
#    Then I get MMNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized MM Transactions page
#    Then I input MM Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the MM Payment Entry page
#    Then I input MM Number and click Find
#    When I enter the Payments Enquiry - Transaction wise status page
#    Then I input MMPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    And I close driver
#
#
#  @Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_AUD
#  Scenario:Payment_MM_Fixed_Maturity_Placement_Contracts_235-677_Approved_AUD
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Fixed Maturity Placement Contracts
#    Then I Assertion enter Fixed Maturity Placement Contracts Page
#    When I Input incomplete information on Placement Contracts Page "7"
#    Then I get MMNumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Unauthorized MM Transactions page
#    Then I input MM Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the MM Payment Entry page
#    Then I input MM Number and click Find
#    When I enter the Payments Enquiry - Transaction wise status page
#    Then I input MMPINumber and click Find
#    When I Assert enter View Page Trans
#    When I change status code Trans
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    And I close driver
#

#LOAN----------------------------------------------------------------------------------------------------------------

#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold
#  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page "1"
##    When I input information on the Loan Disbursement SGMEPS Page
##      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
##      |18000000040         |SGD           |SGD             |1             |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page "1"
##    Then I input information on the SGMEPS Beneficiary Details Page
##      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
##      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page


#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount>threshold
#  Scenario:AA Disbursement (SGMEPS) SGD-SGDAmount>250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page "1"
##      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
##      |18500002905         |SGD           |SGD             |250007        |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page "1"
##      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
##      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code SGD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page
#
#
#
#
#
#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold
#  Scenario:AA Disbursement External USD-USD Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page "1"
##    When I input information on the Loan Disbursement External Page
##      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
##      |17100007089         |USD           |USD             |100           |HK                    |
#    Then I input information on the Beneficiary Details Page "1"
##    Then I input information on the Beneficiary Details Page
##      |Beneficiary Account No|Beneficiary Name|
##      |3242343               |kang            |
#    When I enter Routing Details Page and added information "1"
##    When I enter Routing Details Page and added information
##      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
##      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#
#
#  @Payment_Loan_Disbursement_External_USD-USD_Amount>threshold
#  Scenario:AA Disbursement External USD-USD Amount>250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page "1"
##      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
##      |18500002891         |USD           |USD             |250007        |
#    Then I input information on the Beneficiary Details Page "1"
##      |Beneficiary Account No|Beneficiary Name|
##      |3242343               |kang            |
#    When I enter Routing Details Page and added information "1"
##      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
##      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page

#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K
#  Scenario: AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page "1"
##      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
##      |18500002891         |USD           |9              |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<250K
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page "1"
##    When I Input incomplete information on AA Disbursement Internal page
##      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
##      |18000000563         |SGD           |3000            |SGD             |11010004255     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page
#


#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>250K
#  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0004-1，4
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page "1"
##      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
##      |18500002891         |USD           |250007          |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page




#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount>250K3
#  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0003-1，4
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page "1"
##      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
##      |18500003189         |SGD           |280006          |SGD             |11010002716     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#OE CUSTOMER---------------------------------------------------------------------------------------------------------
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA001_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA001_SGD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "1"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "1"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "1"
##    Then I find account
##      |Arrangement|
##      |11010006762|
#    And I close driver



#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA002_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA002_SGD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "2"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "2"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "2"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA003_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA003_SGD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "3"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "3"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "3"
##    Then I find account
##      |Arrangement|
##      |11010006762|
#    And I close driver


  #GLDBCR-1296 customer CA


#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA001_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA001_SGD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "1"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "1"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "1"
##    Then I find account
##      |Arrangement|
##      |11010006762|
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA002_USD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA002_USD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "2"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "2"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "2"
##    Then I find account
##      |Arrangement|
##      |11010006762|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA003_HKD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA003_HKD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "3"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "3"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
##    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "3"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#
##
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA004_CNY
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA004_CNY
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "4"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "4"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "4"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA005_EUR
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA005_EUR
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "5"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "5"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "5"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver


#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA006_AUD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA006_AUD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "6"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "6"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "6"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA007_AED
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA007_AED
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "7"
##    When I Input incomplete information on ISO Customer Transfer Page
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |906                 |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "7"
##    Then I input Street Name on the ISO Customer Transfer Page
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth3" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "7"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA008_GBP
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA008_GBP
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "8"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "8"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth3" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "8"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA009_JPY
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA009_JPY
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "9"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "9"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth3" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "9"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA010_NOK
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA010_NOK
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "10"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "10"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth3" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "10"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver





# # Customer MCA
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA001_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA001_SGD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "1"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "1"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "1"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA002_USD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA002_USD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "2"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "2"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "2"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#


#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA003_HKD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA003_HKD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "3"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "3"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "3"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#
##
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA004_CNY
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA004_CNY
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "4"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "4"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "4"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA005_EUR
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA005_EUR
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "5"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "5"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "5"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA006_AUD
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA006_AUD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "6"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "6"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "6"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA007_AED
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA007_AED
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "7"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "7"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "7"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA008_GBP
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA008_GBP
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "8"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "8"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "8"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA009_JPY
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA009_JPY
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "9"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "9"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "9"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA010_NOK
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA010_NOK
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page "10"
##      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
##      |EBILAEA0            |AED                 |90                  |11010006762         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page "10"
##      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
##      |liyukang   |testabc   |SG              |12345    |11010006762          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD "10"
##    Then I find account CASGD
##      |Arrangement|Currency   |
##      |11021162884|AED        |
#    And I close driver

##bank执行---------------------------------------------------------------------------------------------------------

#  @Payment_OE_Outgoing_ISO_Bank_Transfer_SGD
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_SGD
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "1"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "1"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver

#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_NOK
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_NOK
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "2"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "2"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_HKD
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_HKD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "3"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "3"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver

#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_EUR
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_EUR
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "4"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "4"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_CNY
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_CNY
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "5"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "5"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_AUD
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_AUD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "6"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "6"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_AED
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_AED
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "7"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "7"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_GBP
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_GBP
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "8"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "8"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_JPY
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_JPY
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "9"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "9"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_USD
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_USD
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "10"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "10"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
##    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver


#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_SGDNOSTRO
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_SGDNOSTRO
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page "10"
##      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
##      |EBILAEA0            |AED                 |901               |11010006762         |4656465         |CITISGS0    |New&(2)',.e  |
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "10"
##      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
##      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
##    Then I close all tabs and jump to the home
##    When I enter the account IDCA
##    Then I find account ISO Bank "1"
###    Then I find account ISO Bank
###      |Arrangement|
###      |11010006762|
#    And I close driver

#incoming  CA MCA

#  @Payment_OE_Outgoing_ISO_Bank_Transfer_GBP
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_GBP
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
##    When I Input incomplete information on Outgoing ISO Bank Transfer Page "8"
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |SMBCJPJ0            |JPY                 |901               |11021214167         |4656465         |            |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
##    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page "8"
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account ISO Bank "1"
##    Then I find account ISO Bank
##      |Arrangement|
##      |11010006762|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA0021
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA0021
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
##    When I Input incomplete information on ISO Customer Transfer Page "2"
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |SMBCJPJ0            |JPY                 |906                 |11021214167         |JPY                   |56456465        |LEI           |SHAR         |
##    Then I input Street Name on the ISO Customer Transfer Page "2"
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11021214167          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account "2"
##    Then I find account
##      |Arrangement|
##      |11010006762|
#    And I close driver

#SIT-1137

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before001
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |111                 |11010004964         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010004964          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010004964|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before002
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |222                 |11010004964         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010004964          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010004964|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before003
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |333                 |11010004964         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010004964          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010004964|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before004
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |BKCHSGS0            |SGD                 |4000000             |11020883472         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020883472          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|SGD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before005
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |5000000             |11020883472         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020883472          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|SGD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before006
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |6000000             |11020883472         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020883472          |LENDEB    |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|SGD        |
#    And I close driver
#



#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after007
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |160                 |11010005715         |USD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010005715          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005456|
#    And I close driver

#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after008
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000008             |11010005456         |USD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010005456          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005456|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after009
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_after009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000009             |11010005456         |USD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010005456          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005456|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after010
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |BKCHSGS0            |SGD                 |200                 |11010004964         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010004964          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|USD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after0011
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after0011
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000011              |11020883537         |USD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020883537          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|USD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after012
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_after012
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9000012             |11020883537         |USD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020883537          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|USD        |
#    And I close driver




#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before013
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before013
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000013             |11020938838         |EUR                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0014
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0014
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000014             |11020938838         |EUR                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before015
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before015
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000015             |11020938838         |EUR                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before016
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before016
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |916                 |11020938846         |HKD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0017
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0017
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |917                 |11020938846         |HKD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before018
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before018
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |918                 |11020938846         |HKD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before019
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before019
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000019             |11020938854         |CNY                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0020
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0020
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000020             |11020938854         |CNY                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before021
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before021
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000021             |11020938854         |CNY                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#



#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before022
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before022
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9000022             |11020939559         |AUD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939559          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AUD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0023
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0023
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9000023             |11020939559         |AUD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939559          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AUD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before024
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before024
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9000024             |11020939559         |AUD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939559          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AUD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before025
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before025
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9025                |11010006053         |AUD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006053          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006053|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before026
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before026
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9026                |11010006053         |AUD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006053          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006053|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before027
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before027
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9027                |11010006053         |AUD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006053          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006053|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before028
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before028
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9000028             |11020943602         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943602          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0029
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0029
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9000029             |11020943602         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943602          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before030
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before030
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9000030             |11020943602         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943602          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before031
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before031
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9031                |11010006614         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006614          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006614|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before032
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before032
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9032                |11010006614         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006614          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006614|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before033
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_before033
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9033                |11010006614         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006614          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006614|
#    And I close driver


#  @Payment_OE_Outgoing_ISO_Bank_Transfer_CA_034after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_CA_034after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |3000034           |11010004964         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010004964|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_035after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_035after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |3035              |11020883472         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|SGD        |
#    And I close driver
#
#


#  @Payment_OE_Outgoing_ISO_Bank_Transfer_CA_036after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_CA_036after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |9000036           |11010005456         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005456|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_037after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_037after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |9037              |11020883537         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|USD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_038after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_038after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |9000038           |11020938838         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_039after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_039after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |9039              |11020938846         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_040after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_040after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |9000040           |11020938854         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_041after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_041after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |ANZBAU30            |AUD                 |9041              |11020939559         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AUD        |
#    And I close driver
#
#
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_CA_042after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_CA_042after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |ANZBAU30            |AUD                 |9000042           |11010006053         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006053|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_043after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_MCA_043after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |EBILAEA0            |AED                 |9043              |11020943602         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|AED        |
#    And I close driver
#
#
#
#  @Payment_OE_Outgoing_ISO_Bank_Transfer_CA_044after
#  Scenario:Payment_OE_Outgoing_ISO_Bank_Transfer_CA_044after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |EBILAEA0            |AED                 |9000044           |11010006614         |4656465         |CITISGS0    |New&(2)',.e  |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Street Name2|Post Code2|Town Name3|Creditor Country3|Sender Reference|End To End Identification|
#      |jia&(1)',.1H|123       |FR        |SG               |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006614|
#    And I close driver




#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_047
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_047
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.47                |11010005715         |USD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010005715          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005715|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_047
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_047
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.47                |11010002627         |USD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010002627          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010002627|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_047
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_047
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.47                |11010003364         |USD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010003364          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010003364|
#    And I close driver


#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_048
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_048
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.48                |11020002182         |USD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020002182          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020002166|USD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_048
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_048
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.48                |11020943491         |USD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943491          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020943475|USD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_048
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_048
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |9.48                |11020287713         |USD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020287713          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020287691|USD        |
#    And I close driver



#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_049
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_049
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9.49                |11020936673         |EUR                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020936673          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020936622|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_049
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_049
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9.49                |11020931698         |EUR                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020931698          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927682|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_049
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_049
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9.49                |11020931647         |EUR                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020931647          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020236302|EUR        |
#    And I close driver


#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_050
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_050
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |9.50                |11020939036         |HKD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939036          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938897|HKD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_050
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_050
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |9.50                |11020938935         |HKD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938935          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938862|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_050
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_050
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |9.50                |11020937955         |HKD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020937955          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020937904|HKD        |
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_051
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_051
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9.51                |11020938943         |CNY                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938943          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938862|CNY        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_051
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_051
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9.51            |11020939044         |CNY                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939044          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938897|CNY        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_051
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_051
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9.51                |11020937947         |CNY                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020937947          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020937904|CNY        |
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_052
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_052
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.52                |11020943815         |AUD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943815          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927410|AUD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_052
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_052
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.52                |11020943831         |AUD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943831          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927399|AUD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_052
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_052
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.52                |11020943866         |AUD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943866          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927372|AUD        |
#    And I close driver





#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_053
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_053
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.53                |11010006800         |AUD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006800          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006800|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_0053
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_0053
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.53                |11010006819         |AUD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006819          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006819|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_0053
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_0053
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |9.53                |11010006827         |AUD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006827          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006827|
#    And I close driver



#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_054
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_054
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.54                |11020943823         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943823          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927410|AED        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_054
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_054
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.54                |11020943858         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943858          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927399|AED        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_054
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_054
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.54                |11020943874         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020943874          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927372|AED        |
#    And I close driver





#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_055
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_055
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.55                |11010006770         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006770          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006770|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_0055
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_0055
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.55                |11010006835         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006835          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006835|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_0055
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_0055
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |9.55                |11010006843         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006843          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006843|
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_057
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_057
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |293.57              |11010005715         |USD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010005715          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010005715|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_057
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_057
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |293.57              |11010002627         |USD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010002627          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010002627|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_057
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_057
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |USD                 |293.57              |11010003364         |USD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010003364          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010003364|
#    And I close driver

#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_058
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_058
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |293.58              |11020939036         |HKD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939036          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938897|HKD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_058
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_058
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |293.58              |11020938935         |HKD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938935          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938862|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_058
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_058
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |293.58              |11020937955         |HKD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020937955          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020937904|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_059
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_059
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |293.59              |11020938943         |CNY                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938943          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938862|CNY        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_059
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_059
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |293.59              |11020939044         |CNY                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020939044          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020938897|CNY        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_059
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_059
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |293.59              |11020937947         |CNY                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020937947          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020937904|CNY        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_060
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_SHA_060
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |293.60              |11020936673         |EUR                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020936673          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020936622|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_060
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_OUR_060
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |293.60              |11020931698         |EUR                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020931698          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020927682|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_060
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_BEN_060
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |293.60              |11020931647         |EUR                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020931647          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020236302|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_061
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_061
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |293.61              |11010006800         |AUD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006800          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006800|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_061
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_061
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |293.61              |11010006819         |AUD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006819          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006819|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_061
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_061
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |ANZBAU30            |AUD                 |293.61              |11010006827         |AUD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006827          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006827|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_062
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_SHA_062
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |293.62              |11010006770         |AED                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006770          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006770|
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_062
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_OUR_062
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |293.62              |11010006835         |AED                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006835          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006835|
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_062
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_CA_BEN_062
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |EBILAEA0            |AED                 |293.62              |11010006843         |AED                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11010006843          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006843|
#    And I close driver





#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before013
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before013
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000013             |11020938838         |EUR                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0014
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0014
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000014             |11020938838         |EUR                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before015
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before015
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |EUR                 |9000015             |11020938838         |EUR                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938838          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|EUR        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before016
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before016
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |916                 |11020938846         |HKD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0017
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0017
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |917                 |11020938846         |HKD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before018
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before018
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |HKD                 |918                 |11020938846         |HKD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938846          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|HKD        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before019
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before019
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000019             |11020938854         |CNY                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0020
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before0020
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000020             |11020938854         |CNY                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#
#  @Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before021
#  Scenario:Payment_OE_Outgoing_ISO_Customer_Transfer_MCA_before021
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |CNY                 |9000021             |11020938854         |CNY                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|Post Code|Debit Account Number1|Debit Name|Street Name1|Post Code1|Town Name1|Debtor Country|
#      |liyukang   |testabc   |SG              |12345    |11020938854          |LEN&DEB   |honghai     |23456     |teste     |SG            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#    When I enter the Currency Rates List
#    Then I close all tabs and jump to the home
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020880570|CNY        |
#    And I close driver
#






#  @Incoming_Payment_999_007before
#  Scenario:Incoming payment_007before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349JBFBKDFD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#  @Incoming_Payment_999_008before
#  Scenario:Incoming paymen_008before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349LB0GFDMG|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#  @Incoming_Payment_999_009before
#  Scenario:Incoming paymen_009before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349JL0HLBJC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#  @Incoming_Payment_999_010before
#  Scenario:Incoming paymen_010before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349H0CMC0DB|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver

#
#
#  @Incoming_Payment_999_011before
#  Scenario:Incoming paymen_011before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349GCJB0B0C|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_012before
#  Scenario:Incoming paymen_012before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL233490GBLKHDK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver


#  @Incoming_Payment_999_013before
#  Scenario:Incoming paymen_013before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352KGLFKLFM|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#  @Incoming_Payment_999_014before
#  Scenario:Incoming paymen_014before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352000FCMLD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#  @Incoming_Payment_999_015before
#  Scenario:Incoming paymen_015before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL233520KFMJJB0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#  @Incoming_Payment_999_016before
#  Scenario:Incoming paymen_016before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352LBLLBMLL|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver
#
#  @Incoming_Payment_999_017before
#  Scenario:Incoming paymen_017before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352HFBKJHMF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver
#
#  @Incoming_Payment_999_018before
#  Scenario:Incoming paymen_018before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352GHBJBFML|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver

#  @Incoming_Payment_999_019before
#  Scenario:Incoming paymen_019before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349KHJLLGLH|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#  @Incoming_Payment_999_020before
#  Scenario:Incoming paymen_020before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349FHDLBKH0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#  @Incoming_Payment_999_021before
#  Scenario:Incoming paymen_021before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349CKF0BHMJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#  @Incoming_Payment_999_022before
#  Scenario:Incoming paymen_022before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349MJLLFJ0B|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#  @Incoming_Payment_999_023before
#  Scenario:Incoming paymen_023before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349HCJMKJMK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#  @Incoming_Payment_999_024before
#  Scenario:Incoming paymen_024before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349H0KM0LH0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#  @Incoming_Payment_999_025before
#  Scenario:Incoming paymen_025before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349F0DLG0LC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#  @Incoming_Payment_999_026before
#  Scenario:Incoming paymen_026before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349CFBBLGKL|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#  @Incoming_Payment_999_027before
#  Scenario:Incoming paymen_027before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349CHLDHBGF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#  @Incoming_Payment_999_028before
#  Scenario:Incoming paymen_028before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349HKG0FF0L|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#  @Incoming_Payment_999_029before
#  Scenario:Incoming paymen_029before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349LGGDDCFM|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#  @Incoming_Payment_999_030before
#  Scenario:Incoming paymen_030before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349LDFMBCKH|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#  @Incoming_Payment_999_031before
#  Scenario:Incoming paymen_031before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349BGLF0DGJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver
#
#  @Incoming_Payment_999_032before
#  Scenario:Incoming paymen_032before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349BCJHKJ0H|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver
#
#  @Incoming_Payment_999_033before
#  Scenario:Incoming paymen_033before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349CJFMJMBJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver
#
#
#  @Incoming_Payment_999_036before
#  Scenario:Incoming paymen_036before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349GCLDJDBD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#  @Incoming_Payment_999_037before
#  Scenario:Incoming paymen_037before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349FHMFLKKL|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#  @Incoming_Payment_999_038before
#  Scenario:Incoming paymen_038before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349FKL0JFKC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#  @Incoming_Payment_999_039before
#  Scenario:Incoming paymen_039before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349DLLJHB00|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#  @Incoming_Payment_999_040before
#  Scenario:Incoming paymen_040before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349JJGHCGBK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#  @Incoming_Payment_999_041before
#  Scenario:Incoming paymen_041before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349KJF00JDJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#  @Incoming_Payment_999_042before
#  Scenario:Incoming paymen_042before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349BBGJLDKF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver
#
#  @Incoming_Payment_999_043before
#  Scenario:Incoming paymen_043before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL233490MGMBBCF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#  @Incoming_Payment_999_044before
#  Scenario:Incoming paymen_044before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23349MHMFDCHK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver


#  @Incoming_Payment_999_059after
#  Scenario:Incoming paymen_059after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352KLMGGKMJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#  @Incoming_Payment_999_060after
#  Scenario:Incoming paymen_060after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352MJKGCC0K|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#
#
#  @Incoming_Payment_999_061after
#  Scenario:Incoming paymen_061after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352JKB0DM0M|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#
#  @Incoming_Payment_999_062after
#  Scenario:Incoming paymen_062after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352HMKHGDBF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#  @Incoming_Payment_999_063after
#  Scenario:Incoming paymen_063after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352LCBJHM0L|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_064after
#  Scenario:Incoming paymen_064after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352HJJCFCCK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_065before
#  Scenario:Incoming paymen_065before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353LJKMFJFC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#  @Incoming_Payment_999_066before
#  Scenario:Incoming paymen_066before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353GFG00LL0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#
#
#  @Incoming_Payment_999_067before
#  Scenario:Incoming paymen_067before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353GGFGJHD0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#
#  @Incoming_Payment_999_068before
#  Scenario:Incoming paymen_068before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353JBJ0BDFD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver
#
#  @Incoming_Payment_999_069before
#  Scenario:Incoming paymen_069before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353H0JD00DK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_070before
#  Scenario:Incoming paymen_070before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353JFDBCFMJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver

#  @Incoming_Payment_999_071after
#  Scenario:Incoming paymen_071after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352MDJHJJFC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#  @Incoming_Payment_999_072after
#  Scenario:Incoming paymen_072after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352KHDK0DJB|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#
#  @Incoming_Payment_999_073after
#  Scenario:Incoming paymen_073after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352LCHFKGMM|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#
#  @Incoming_Payment_999_074after
#  Scenario:Incoming paymen_074after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352MBCLH00F|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#
#
#  @Incoming_Payment_999_075after
#  Scenario:Incoming paymen_075after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352GLCLFBCC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_076after
#  Scenario:Incoming paymen_076after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23352JCGD0JFG|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver


#  @Incoming_Payment_999_087before
#  Scenario:Incoming paymen_087before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353FMDBDMGC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#  @Incoming_Payment_999_088before
#  Scenario:Incoming paymen_088before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353KHLCHDCD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#
#
#  @Incoming_Payment_999_089before
#  Scenario:Incoming paymen_089before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353LFFDMGGK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006622|
#    And I close driver
#
#
#  @Incoming_Payment_999_090before
#  Scenario:Incoming paymen_090before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353MBBCJ0CK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver
#
#  @Incoming_Payment_999_091before
#  Scenario:Incoming paymen_091before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353GFMFJLDM|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver
#
#
#  @Incoming_Payment_999_092before
#  Scenario:Incoming paymen_092before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL233530GHKBMDC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver

#
#  @Incoming_Payment_999_077after
#  Scenario:Incoming paymen_077after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353LK0BMLDB|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#
#  @Incoming_Payment_999_078after
#  Scenario:Incoming paymen_078after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353BFBGCGLF|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver
#
#
#  @Incoming_Payment_999_079after
#  Scenario:Incoming paymen_079after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353CFJM0FHJ|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver


#  @Incoming_Payment_999_080after
#  Scenario:Incoming paymen_080after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL233530JDGFBFC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010000608|
#    And I close driver
#
#
#  @Incoming_Payment_999_081after
#  Scenario:Incoming paymen_081after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353HMGLGDJB|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|USD        |
#    And I close driver
#
#
#  @Incoming_Payment_999_082after
#  Scenario:Incoming paymen_082after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353CJCJDCLH|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|EUR        |
#    And I close driver
#
#
#  @Incoming_Payment_999_083after
#  Scenario:Incoming paymen_083after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353GFLGCFDK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|HKD        |
#    And I close driver
#
#  @Incoming_Payment_999_084after
#  Scenario:Incoming paymen_084after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353KDHBGCML|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|CNY        |
#    And I close driver

#  @Incoming_Payment_999_085before
#  Scenario:Incoming paymen_085before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353LBM0KMFL|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#
#  @Incoming_Payment_999_086before
#  Scenario:Incoming paymen_086before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353HGBLKJ0C|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AUD        |
#    And I close driver

#  @Incoming_Payment_999_093after
#  Scenario:Incoming paymen_093after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353DHMGCK0L|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account IDCA
#    Then I find account
#      |Arrangement|
#      |11010006002|
#    And I close driver
#
#
#  @Incoming_Payment_999_094after
#  Scenario:Incoming paymen_094after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23353JGJDFBJK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the page
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency   |
#      |11020931868|AED        |
#    And I close driver





#UAT GLDBCR-26



 # SIT GLDBCR-1040

#  @Ordering_Customer_Name>35char_INB_Overseas_Test001_SGD-SGD
#  Scenario:Ordering Customer Name>35char INB Overseas Test001 SGD-SGD
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges|
#      |1101 0003 321 |SHA                     |
#    And I choose the payment currency
#      |Currency|
#      |SGD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0DOD     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |

#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(SGD-SGD)Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2500001             |11010003321         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(USD-USD)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2500002           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(EUR-EUR)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2500003           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(HKD-HKD)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2500004           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_Name_001
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(CNY-CNY)_Amount>threshold-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2500005           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(SGD-SGD)Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |25001               |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(USD-USD)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |25002             |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(EUR-EUR)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |25003             |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(HKD-HKD)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |25004             |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_Name_002
#  Scenario:Payment_OE_pacs008_Special_Debitor_Name_SIT(CNY-CNY)_Amount>threshold-002
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |25005             |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##网银案例
#
#
#  @Payment_Overseas_Transfer_SGD-SGD_SIT
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
##    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
##    When I click on overseas transfer payment and select the account
##    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
##      |Account Number|Payment Mode for Charges|
##      |1101 0003 321 |SHA                     |
##    And I choose the payment currency
##      |Currency|
##      |SGD     |
##    When I enter the payee information
##      |Payee's Account Number|Payee's Name|
##      |667812798             |lucky       |
##    When I choose the receiving bank
##      |Beneficiary Bank|
##      |DBSSSGS0DOD     |
##    When I choose the recipient country
##      |Payee's Address |Payee's Country|Comments For Payee|
##      |countries & len |UNITED STATES  |ok                |
##    When I choose the nature of payment
##      |Purpose of Transfer|
##      |Commission         |
##    When I choose to submit the transfer information
##    When Vkey authorization for Payment transactions in the SIT environment
##    Then I will compare all the data on FX Payment MX Message
##      |WordPath          |
##      |Bic is DBS SGD-SGD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS SGD-SGD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |
#
#
#
#  @Payment_Overseas_Transfer_MCY_USD-USD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(USD-USD)(SIT_MCY)
##    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
##    When I click on overseas transfer payment and select the account
##    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
##      |Account Number|Payment Mode for Charges |Currency|
##      |1102 0938 757 |OUR                      |USD     |
##    And I choose the payment currency
##      |Currency   |
##      |USD        |
##    When I enter the payee information
##      |Payee's Account Number|Payee's Name|
##      |667812798             |lucky       |
###    When I click on the receiving bank drop down box
##    When I choose the receiving bank
##      |Beneficiary Bank|
##      |DBSSSGS0VEC     |
##    When I choose the recipient country
##      |Payee's Address |Payee's Country|Comments For Payee|
##      |countries       |UNITED STATES  |ok                |
##    When I choose the nature of payment
##      |Purpose of Transfer|
##      |Commission         |
##    When I choose to submit the transfer information
##    When Vkey authorization for Payment transactions in the SIT environment
##    Then I will compare all the data on FX Payment MX Message
##      |WordPath          |
##      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|
#
#
#
#  @Payment_Overseas_Transfer_MCY_HKD-HKD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(HKD-HKD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |HKD     |
#    And I choose the payment currency
#      |Currency   |
#      |HKD        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS HKD-HKD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS HKD-HKD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS HKD-HKD|Bic is DBS HKD-HKD|
#
#
#
#  @Payment_Overseas_Transfer_MCY_EUR-EUR_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(EUR-EUR)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |EUR     |
#    And I choose the payment currency
#      |Currency   |
#      |EUR        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS EUR-EUR|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS EUR-EUR|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS EUR-EUR|Bic is DBS EUR-EUR|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0024before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0024before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#
#
#
#
#
##第二次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(SGD-SGD)Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2600001             |11010003321         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(USD-USD)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2600002           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(EUR-EUR)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2600003           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(HKD-HKD)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2600004           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_003
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(CNY-CNY)_Amount>threshold-003
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2600005           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(SGD-SGD)Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2601                |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(USD-USD)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2602              |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(EUR-EUR)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2603              |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(HKD-HKD)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2604              |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_004
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_SIT(CNY-CNY)_Amount>threshold-004
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2605              |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第三次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(SGD-SGD)Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2700001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(USD-USD)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2700002           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(EUR-EUR)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2700003           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(HKD-HKD)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2700004           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_address_Name_005
#  Scenario:Payment_OE_pacs008_Special_Debitor_address_Name_SIT(CNY-CNY)_Amount>threshold-005
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2700005           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第四次跑，需要特殊的多币种账户，账户名称特殊，替换里面的账户
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(SGD-SGD)Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2710001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(USD-USD)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2710002           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(EUR-EUR)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2710003           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(HKD-HKD)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2710004           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Debitor_account_Name_006
#  Scenario:Payment_OE_pacs008_Special_Debitor_account_Name_SIT(CNY-CNY)_Amount>threshold-006
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2710005           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
##第5次跑
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(SGD-SGD)Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                           |
#      |DBSSSGS0            |SGD                 |2501                |11010003321         |SGD                   |56456465        |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(USD-USD)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                        |
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2502              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666|
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(EUR-EUR)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                         |
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2503              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(HKD-HKD)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                         |
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2504              |56456465           |Best & Good etc #/！%（）*1234567890ABCDEFJ999999999888888887777777666666 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Name_007
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(CNY-CNY)_Amount>threshold-007
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                    |
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2505              |56456465           |Best & Good etc 1Best & Good etc 999999999888888881234567890ABCDEFJ |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(SGD-SGD)Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2800001             |11020883472         |SGD                   |56456465        |Best & Good etc|
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(USD-USD)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020883537         |DBSSSGS0                |USD                   |USD                 |2800002           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(EUR-EUR)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938838         |DBSSSGS0                |EUR                   |EUR                 |2800003           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(HKD-HKD)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938846         |DBSSSGS0                |HKD                   |HKD                 |2800004           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Name_008
#  Scenario:Payment_OE_pacs008_Special_Creditor_Name_SIT(CNY-CNY)_Amount>threshold-008
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938854         |DBSSSGS0                |CNY                   |CNY                 |2800005           |56456465           |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#
## 第6次跑收款账户的地址
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(SGD-SGD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2601                |11020938765         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                                                      |Town Name                                                     |Creditor Country|
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888  |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#    #收款账户地址大于35会报错并强制为35以内
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(USD-USD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(EUR-EUR)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |1003              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(HKD-HKD)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |1004              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Address_009
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(CNY-CNY)_Amount<threshold-009
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |1005              |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                                              |Beneficiary Town                                             |
#      |Best & Good etc 12345678901234567890123456666666777777777777999999999222222111111|Best & Good etc 12345678901234567890123456666666777777788888 |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(SGD-SGD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |2900001             |11020938765         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name        |Town Name                |Creditor Country|
#      |Best & Good etc#*  |Best & Good etc 123456#* |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#    #收款账户地址大于35会报错并强制为35以内
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(USD-USD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938773         |DBSSSGS0                |USD                   |USD                 |2900002           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_EUR-EUR_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(EUR-EUR)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938781         |DBSSSGS0                |EUR                   |EUR                 |2900003           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_HKD-HKD_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(HKD-HKD)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938803         |DBSSSGS0                |HKD                   |HKD                 |2900004           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_CNY-CNY_Special_Creditor_Address_010
#  Scenario:Payment_OE_pacs008_Special_Creditor_Address_SIT(CNY-CNY)_Amount>threshold-010
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11020938811         |DBSSSGS0                |CNY                   |CNY                 |2900005           |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town        |
#      |Best & Good etc#*  |Best & Good etc 123456#*|
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#   #结束
#
#
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name       |Town Name         |Creditor Country|
#      |SINGAPORE         |WANGKUNG          |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kang           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                               |Town Name                                                 |Creditor Country|
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                        |Beneficiary Town                                        |
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#    #修改Debitor相关信息再执行脚本
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name                                               |Town Name                                                 |Creditor Country|
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address                                        |Beneficiary Town                                        |
#      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name             |
#      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Best & Good etc           |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name       |Town Name         |Creditor Country|
#      |Best & Good etc   |Best & Good etc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
#  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name           |
#      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Best & Good etc            |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |Best & Good etc    |Best & Good etc |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#








# UAT GLDBCR-1025

#  @Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_berore-001
#  Scenario:Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_berore-001
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |100                 |11010005898         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account CASGD
#      |Arrangement|Currency|
#      |11021162884|SGD     |






#  @Payment_OE_Outgoing_ISO_Customer_SGD-SGD_UAT_Amount>Threshold-001
#  Scenario:Payment_OE_Outgoing_ISO_Customer_UAT(SGD-SGD)_Amount>threshold-001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |9000001             |11021162892         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|






#  @Payment_Overseas_Transfer_MCY_USD-USD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(USD-USD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0927 720 |OUR                      |USD     |
#    And I choose the payment currency
#      |Currency   |
#      |USD        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|

#
#
#  @Payment_Overseas_Transfer_MCY_HKD-HKD_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(HKD-HKD)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |HKD     |
#    And I choose the payment currency
#      |Currency   |
#      |HKD        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS HKD-HKD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS HKD-HKD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS HKD-HKD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS HKD-HKD|Bic is DBS HKD-HKD|
#
#
#
#  @Payment_Overseas_Transfer_MCY_EUR-EUR_SIT
#  Scenario:Positive process of overseas transfer Bic Is DBS(EUR-EUR)(SIT_MCY)
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |EUR     |
#    And I choose the payment currency
#      |Currency   |
#      |EUR        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS EUR-EUR|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS EUR-EUR|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS EUR-EUR|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS EUR-EUR|Bic is DBS EUR-EUR|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0024before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0024before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0025before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)_0025before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0026before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY)0026before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |SHA                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0027before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY) 0027before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|
#
#  @Payment_Overseas_Transfer_MCY_CNY-CNY_SIT_0028before
#  Scenario:Positive process of overseas transfer Bic Is DBS(CNY-CNY)(SIT_MCY) 0028before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency   |
#      |CNY        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS CNY-CNY|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS CNY-CNY|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS CNY-CNY|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS CNY-CNY|Bic is DBS CNY-CNY|


#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold_001after
#  Scenario:AA Disbursement External USD-USD Amount<threshold_001after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
#      |18000000504         |USD           |USD             |1000          |HK                      |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_003after
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_003after
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003294         |SGD           |100000.00       |SGD             |11021162892     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_004after
#  Scenario: Regression-Outgoing-T24-LOAN Disbursement-004after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18000000490         |USD           |2500024         |USD             |11010002015     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#  @Payment_Overseas_Transfer_SGD-USD_SIT_0005before
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->USD)_0005before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges |
#      |1101 0000 470 |BEN                      |
#    And I choose the payment currency
#      |Currency|
#      |USD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0DOD     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-USD|
#    Then I do field mapping for Channel and T24 in FX Payment
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    When I compare the amount is normal
#      |WordPath          |
#      |Bic is DBS SGD-USD|
#    When I compare the data generated by Outgoing Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS SGD-USD|Bic is DBS SGD-USD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS SGD-USD |
#
#
#  @Payment_Overseas_Transfer_USD-USD_SIT_0007before
#  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->USD)_0007before
#    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
#      |Account Number|Payment Mode for Charges|
#      |1101 0005 332 |SHA                     |
#    And I choose the payment currency
#      |Currency   |
#      |USD        |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#    When I check the deduction amount on the Find Account page On overseas transfer Payment
#      |windows Title            |WordPath           |
#      |AA Arrangement - SIT GLDB|Bic is DBS USD-USD |






#  @Payment_OE_Outgoing_Customer_USD-USD_SIT-022before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT-022before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020327189         |DBSSSGS0                |USD                   |USD                 |1000              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936754|
#
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT-023before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT-023before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |2023              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
##    When I Assert enter View Page to USD
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT-024before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT-024before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |20024             |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
##    When I Assert enter View Page to USD
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT-025before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT-025before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |2025              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|

#
#  @Payment_OE_Outgoing_Bank_USD-USD_SIT-027before
#  Scenario:Payment_OE_Outgoing__Bank_USD-USD_SIT-027before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |9000027           |11020936770         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936754|
#
#  @Payment_OE_Outgoing_Bank_EUR-EUR_SIT-028before
#  Scenario:Payment_OE_Outgoing__Bank_EUR-EUR_SIT-028before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |900028            |11020936673         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936622|
#
#  @Payment_OE_Outgoing_Bank_HKD-HKD_SIT-029before
#  Scenario:Payment_OE_Outgoing__Bank_HKD-HKD_SIT-029before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |90029             |11020936665         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936606|
#
#  @Payment_OE_Outgoing_Bank_CNY-CNY_SIT-030before
#  Scenario:Payment_OE_Outgoing__Bank_CNY-CNY_SIT-030before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |90030             |11020936681         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936649|
#
#
#
#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT-021before
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_021before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |40                  |SGD140200001        |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_SGD-SGD_SIT-026before
#  Scenario:Payment_OE_Outgoing__Bank_SGD-SGD_SIT-026before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |5026              |11020936584         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
##    Then I Assert enter View Details Page
##    And I close driver
##    Given Use "T24-automation-SIT-login" to login to T24 environment
##    When I enter the account ID
##    Then I find account
##      |Arrangement|
##      |11020936576|


#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount>Threshold-002after
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount>threshold-002after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |6000002             |11020936584         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount>Threshold-003after
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount>threshold-003after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |6000003             |11020936584         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_SGD-SGD_SIT_Amount>Threshold-016after
#  Scenario:Payment_OE_Outgoing__Bank_SGD-SGD_SIT_Amount>Threshold-016after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000016           |11020936584         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|

#  @Payment_OE_Outgoing_Customer_SGD-SGD_SIT_Amount<Threshold-021before
#  Scenario:Payment_OE_Outgoing_Customer_SIT(SGD-SGD)_Amount<threshold-021before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |900021              |11020236310         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020236302|
#



#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-004before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-004before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000004           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-005before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-005before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000005           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>Threshold-006before
#  Scenario:Payment_OE_Outgoing_Customer_USD-USD_SIT_Amount>threshold-006before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936592         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-007before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-007before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6007              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-008before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-008before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6008              |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<Threshold-009before
#  Scenario:Payment_OE_Outgoing_Customer_EUR-EUR_SIT_Amount<threshold-009before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936673         |DBSSSGS0                |EUR                   |EUR                 |6009              |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-010before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-010before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000010           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-011before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-011before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000011           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>Threshold-012before
#  Scenario:Payment_OE_Outgoing_Customer_HKD-HKD_SIT_Amount>threshold-012before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936665         |DBSSSGS0                |HKD                   |HKD                 |6000012           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-013before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-013before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6013              |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-014before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-014before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6014              |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<Threshold-015before
#  Scenario:Payment_OE_Outgoing_Customer_CNY-CNY_SIT_Amount<threshold-015before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11020936681         |DBSSSGS0                |CNY                   |CNY                 |6015              |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|
#
#  @Payment_OE_Outgoing_Bank_USD-USD_SIT_Amount<Threshold-017before
#  Scenario:Payment_OE_Outgoing__Bank_USD-USD_SIT_Amount<Threshold-017before
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |6017              |11020936592         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936576|
#
#  @Payment_OE_Outgoing_Bank_EUR-EUR_SIT_Amount>Threshold-018after
#  Scenario:Payment_OE_Outgoing__Bank_EUR-EUR_SIT_Amount>Threshold-018after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |6000018           |11020936673         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936622|
#
#  @Payment_OE_Outgoing_Bank_HKD-HKD_SIT_Amount>Threshold-019after
#  Scenario:Payment_OE_Outgoing__Bank_HKD-HKD_SIT_Amount>Threshold-019after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |6000019           |11020936665         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936606|
#
#  @Payment_OE_Outgoing_Bank_CNY-CNY_SIT_Amount>Threshold-020after
#  Scenario:Payment_OE_Outgoing__Bank_CNY-CNY_SIT_Amount>Threshold-020after
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |6000020           |11020936681         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#    And I close driver
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the account ID
#    Then I find account
#      |Arrangement|
#      |11020936649|



#  @Incoming_Payment_999_0027_After
#  Scenario:Incoming_Payment_999_0027_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249DMHLGJGC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_235-999_0028_After
#  Scenario:Incoming_Payment_235-999_0028_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249LKCFLHCK|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0030_After
#  Scenario:Incoming_Payment_999_0030_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249CL0M00KC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0031_After
#  Scenario:Incoming_Payment_999_0031_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249BKJCBL0D|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Incoming_Payment_999_0032_After
#  Scenario:Incoming_Payment_999_0032_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23249MHKCMKCC|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#  @Payment_OE_008_After_Amount<threshold
#  Scenario:Payment_OE_008_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |608               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_012_After_Amount<threshold
#  Scenario:Payment_OE_012_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |612               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_016_After_Amount<threshold
#  Scenario:Payment_OE_016_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |616               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_020_After_Amount<threshold
#  Scenario:Payment_OE_020_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |620               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_027_After_Amount<threshold
#  Scenario:Payment_OE_027_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |627               |11021162906         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_028_After_Amount<threshold
#  Scenario:Payment_OE_028_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |628               |11021200646         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_029_After_Amount<threshold
#  Scenario:Payment_OE_029_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |629               |11021200662         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_030_After_Amount<threshold
#  Scenario:Payment_OE_030_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |630               |11021200638         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#


#
#  @Incoming_Payment_999_0029_After
#  Scenario:Incoming_Payment_999_0029_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23244GCKMMKL0|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
#  @Payment_OE_004_After_Amount>threshold
#  Scenario:Payment_OE_004_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000003             |11021162892         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_026_After_Amount>threshold
#  Scenario:Payment_OE_026_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000021           |11021162892         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page



#  @Payment_Loan_AA_Disbursement_External_USD-USD_Amount<threshold_after001
#  Scenario:AA_Disbursement_External_USD-USD_Amount<threshold_after001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
#      |18500002891         |USD           |USD             |100             |HK                    |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page

#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount>threshold_after_002
#  Scenario:AA_Disbursement_(SGMEPS)_SGD-SGD_Amount>threshold_after_002
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18500002905         |SGD           |SGD             |1000007        |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page
#      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
#      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code SGD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_after_003
#  Scenario: AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount<threshold_after_003
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003189         |SGD           |9000            |SGD             |11010001981     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page

#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_after004
#  Scenario: AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>threshold_after004
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500002891         |USD           |250007          |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page


#  @Payment_OE_001_After_Amount>threshold
#  Scenario:Payment_OE_001_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000001             |11021162892         |SGD                   |56456465        |LEI           |SHAR         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_002_After_Amount>threshold
#  Scenario:Payment_OE_002_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000002             |11021162892         |SGD                   |56456465        |LEI           |CRED         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_003_After_Amount>threshold
#  Scenario:Payment_OE_003_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Customer Transfer
#    Then I Assertion enter Outgoing ISO Customer Transfer Page
#    When I Input incomplete information on ISO Customer Transfer Page
#      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
#      |DBSSSGS0            |SGD                 |1000003             |11021162892         |SGD                   |56456465        |LEI           |DEBT         |
#    Then I input Street Name on the ISO Customer Transfer Page
#      |Street Name|Town Name |Creditor Country|
#      |liyukang   |testabc   |SG              |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page
#    Then I Assert enter View Details Page
#
#  @Payment_OE_005_After_Amount<threshold
#  Scenario:Payment_OE_005_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |205               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_006_Before_Amount>threshold
#  Scenario:Payment_OE_006_Before_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |6000006           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_007_After_Amount<threshold
#  Scenario:Payment_OE_007_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021162906         |DBSSSGS0                |USD                   |USD                 |607               |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_009_After_Amount>threshold
#  Scenario:Payment_OE_009_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000009           |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_010_After_Amount>threshold
#  Scenario:Payment_OE_010_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000010           |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_011_After_Amount>threshold
#  Scenario:Payment_OE_011_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200662         |DBSSSGS0                |EUR                   |EUR                 |6000011           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_013_After_Amount<threshold
#  Scenario:Payment_OE_013_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |613               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_014_After_Amount<threshold
#  Scenario:Payment_OE_014_After_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |614               |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page


#  @Payment_OE_015_Before_Amount>threshold
#  Scenario:Payment_OE_015_Before_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200646         |DBSSSGS0                |HKD                   |HKD                 |6000015           |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page


#  @Payment_OE_017_Before_Amount<threshold
#  Scenario:Payment_OE_017_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |617               |56456465           |LEI             |SHA          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#  @Payment_OE_018_Before_Amount<threshold
#  Scenario:Payment_OE_018_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |618               |56456465           |LEI             |BEN          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page
#
#
#  @Payment_OE_019_Before_Amount<threshold
#  Scenario:Payment_OE_019_Before_Amount<threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing Customer Transfer
#    Then I enter Outgoing Customer Transfer Page
#    When I Input incomplete information on Outgoing Customer Transfer Page
#      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
#      |11021200638         |DBSSSGS0                |CNY                   |CNY                 |619               |56456465           |LEI             |OUR          |
#    Then I Input Beneficiary Address and Beneficiary Town
#      |Beneficiary Address|Beneficiary Town|
#      |xian               |xian            |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD
#    Then I Assert enter View Details Page

#  @Payment_OE_021_After_Amount>threshold
#  Scenario:Payment_OE_021_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |SGD                 |6000021           |11021162892         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_022_After_Amount>threshold
#  Scenario:Payment_OE_022_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |USD                 |6000022           |11021162906         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_023_After_Amount>threshold
#  Scenario:Payment_OE_023_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |EUR                 |6000023           |11021200662         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_024_After_Amount>threshold
#  Scenario:Payment_OE_024_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |HKD                 |6000024           |11021200646         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page
#
#  @Payment_OE_025_After_Amount>threshold
#  Scenario:Payment_OE_025_After_Amount>threshold
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Outgoing ISO Bank Transfer
#    Then I enter Outgoing ISO Bank Transfer Page
#    When I Input incomplete information on Outgoing ISO Bank Transfer Page
#      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
#      |DBSSSGS0            |CNY                 |6000025           |11021200638         |4656465         |CITISGS0    |rew          |
#    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
#      |Sender Reference|End To End Identification|
#      |                |                         |
#    Then I get OENumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input OE Number and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to OE Outgoing_Bank_Transfer
#    Then I Assert enter View Details Page


#  @Payment_Loan_Disbursement_External_USD-USD_Amount>threshold_001_before
#  Scenario:AA_Disbursement_External_USD-USD_Amount>threshold_001
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA Disbursement External Button
#    Then I enter input the Disbursement External Page
#    Then Assert enter Disbursement External Page
#    When I input information on the Loan Disbursement External Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|
#      |18500002891         |USD           |USD             |10000001       |
#    Then I input information on the Beneficiary Details Page
#      |Beneficiary Account No|Beneficiary Name|
#      |3242343               |kang            |
#    When I enter Routing Details Page and added information
#      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
#      |CITISGS0              |SINGAPORE             |SG                       |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#
#  @Payment_Loan_Disbursement_SGMEPS_SGD-SGD_Amount<threshold_002_before
#  Scenario:AA_Disbursement_(SGMEPS)_SGD-SGDAmount<250K_002_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click AA AA Disbursement (SGMEPS) Button
#    Then I enter input the Disbursement SGMEPS Page
#    When I input information on the Loan Disbursement SGMEPS Page
#      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Account No|Beneficiary Bank BIC|Beneficiary Name|
#      |18000001608         |SGD           |SGD             |1002          |345665                |CITISGS0            |lei             |
#    Then I input information on the SGMEPS Beneficiary Details Page
#      |Beneficiary Street Name|Beneficiary Post Code|Beneficiary Town Name|Beneficiary Country|Beneficiary Residence Country|
#      |teselei                |1234                 |SINGRORE             |SG                  |SG                          |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan SGMEPS
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_SGD-SGD_Amount>threshold_003_before
#  Scenario: AA_Disbursement_Internal_SGD-SGD_Amount>threshold_003_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500003189         |SGD           |1000003         |SGD             |11010002716     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I change status code USD
#    Then I close driver
#    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
#    When I entered the Pending Authorise Payments page
#    Then I input FTNumber and click Find Authorise
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page
#
#  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount<250K_004_before
#  Scenario: AA_Disbursement_Internal_SGD-SGD_Amount>threshold_004_before
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click Loan Transactions
#    When I Input incomplete information on AA Disbursement Internal page
#      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
#      |18500002891         |USD           |1004            |USD             |11010002228     |
#    Then I get LoanPINumber
#    Then I click pre-submit button
#    When I click Accept Overrides
#    Then Assert Result whether Successful
#    And I close driver
#    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
#    When I click Loan Transactions Button
#    Then I click Authorise/Delete Arrangements (PO) Button
#    Then I input PI Number and click Find
#    And I close driver
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input LoanPINumber and click Find
#    When I Assert enter View Page to USD Loan Internal
#    Then I Assert enter View Details Page



#  @Incoming_Payment_999_0001_After
#  Scenario:Incoming_Payment_999_0001_After
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL232420LCGGMJD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page



#  @Regression-Outgoing-Channel0017-Before
#  Scenario:Regression-Outgoing-Channel0017-Before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentHKD
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |BEN                      |HKD     |
#    And I choose the payment currency
#      |Currency|
#      |HKD     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#
#
#  @Regression-Outgoing-Channel0024-Before
#  Scenario:Regression-Outgoing-Channel0024-Before
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I click on overseas transfer payment and select the account
#    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentCNY
#      |Account Number|Payment Mode for Charges |Currency|
#      |1102 0931 868 |OUR                      |CNY     |
#    And I choose the payment currency
#      |Currency|
#      |CNY     |
#    When I enter the payee information
#      |Payee's Account Number|Payee's Name|
#      |667812798             |lucky       |
##    When I click on the receiving bank drop down box
#    When I choose the receiving bank
#      |Beneficiary Bank|
#      |DBSSSGS0VEC     |
#    When I choose the recipient country
#      |Payee's Address |Payee's Country|Comments For Payee|
#      |countries       |UNITED STATES  |ok                |
#    When I choose the nature of payment
#      |Purpose of Transfer|
#      |Commission         |
#    When I choose to submit the transfer information
#    When Vkey authorization for Payment transactions in the SIT environment
#    Then I will compare all the data on FX Payment MX Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    Given to verify transaction in T24 using "T24-automation-SIT-login"
#    When I type in the content and click the search button on Mx Message
#      |search content           |windows Title        |WordPath          |
#      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
#    When I expand the User Menu menu on the page
#    When I expand the User Payments menu on the page
#    When I expand the Payment Hub menu on the page
#    When I expand the Payment Inquiries and Exceptions menu on the page
#    When I expand the Payments Enquiry Transaction wise menu on the page
#    When I jump to a newly opened page on Mx Message
#      |windows Title                            |WordPath          |
#      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
#    Then I do field mapping for Channel and T24 in same currency
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the amount is normal on Mx Message
#      |WordPath          |
#      |Bic is DBS USD-USD|
#    When I compare the data generated by Outgoing Message MX Message is correct
#      |WordPath          |Name              |
#      |Bic is DBS USD-USD|Bic is DBS USD-USD|
#







