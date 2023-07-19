@Auto_Test
Feature: Auto_Test


  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount<threshold4
  Scenario:Regression-Outgoing_T24-0001
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |1024              |56456465           |LEI             |SHA          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount<threshold5
  Scenario:Regression-Outgoing_T24-0002
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |1025              |56456465           |LEI             |BEN          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_UAT_Amount<threshold6
  Scenario:Regression-Outgoing_T24-0003
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11010000489         |DBSSSGS0                |USD                   |USD                 |1026              |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page



  @Incoming_Payment_999_2
  Scenario:Regression-Incoming-0003
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23199HJMBBF0B|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010002716    |
    When I click Find Butt
    Then Assert enter Account Details Page

  @Incoming_Payment_999_3
  Scenario:Regression-Incoming-0013
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23199KJLG0DLC|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11020233869    |
    When I click Find Butt
    Then Assert enter Account Details Page


  @Payment_Own_Transfer_USD-USD_SIT1
  Scenario:Regression-Outgoing Channel-0004
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0000 489   |1101 0000 608|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath|
      |USD-USD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath|
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-USD |
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath|
      |FUNDS.TRANSFER|USD-USD |
    Then I will map the page data
      |WordPath|
      |USD-USD |
    When I check the deduction amount on the Find Account page On Local Payment
      |windows Title            |WordPath|
      |AA Arrangement - SIT GLDB|USD-USD |



  @Payment_Overseas_Transfer_SGD-USD_SIT2
  Scenario:Regression-Outgoing Channel0013
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 0000 470 |SHA                      |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0DOD     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
      |WordPath          |
      |Bic is DBS SGD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-USD|
    Then I do field mapping for Channel and T24 in FX Payment
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I compare the amount is normal
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I compare the data generated by Outgoing Message is correct
      |WordPath          |Name              |
      |Bic is DBS SGD-USD|Bic is DBS SGD-USD|
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |WordPath          |
      |FOREX         |T24-automation-SIT-login-Auth  |Bic is DBS SGD-USD|
    When I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MT
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS SGD-USD |

