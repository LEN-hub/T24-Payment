@Auto_Test1
Feature: Auto_Test1

  


  @Regression-Incoming-0015-After
  Scenario:Regression-Incoming-0015-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235CBCGC0JM|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page








  @Regression-Incoming-0018-After
  Scenario:Regression-Incoming-0018-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235FLC0CJLJ|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page






  @T24-LOANDisbursement-0002-After
  Scenario:T24-LOAN Disbursement-0002-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions Button
    Then I click AA Disbursement External Button
    Then I enter input the Disbursement External Page
    Then Assert enter Disbursement External Page
    When I input information on the Loan Disbursement External Page
      |Debit Account Number|Debit Currency|Payment Currency|Payment Amount|Beneficiary Country Code|
      |18000000490         |USD           |USD             |13            |HK                      |
    Then I input information on the Beneficiary Details Page
      |Beneficiary Account No|Beneficiary Name|
      |3242343               |kang            |
    When I enter Routing Details Page and added information
      |Account with Bank BIC |Account With Town Name|Account with Bank Country|
      |CITISGS0              |SINGAPORE             |SG                       |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page



#
#  @Regression-Incoming-0002-After
#  Scenario:Regression-Incoming-0002-After
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23235LMKMCGLD|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#
#
  @Regression-Incoming-0007-After
  Scenario:Regression-Incoming-0007-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235BGLBCLHD|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page


  @Regression-Incoming-0008-After
  Scenario:Regression-Incoming-0008-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235GLDMKKBH|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page

#
#  @Regression-Incoming-0009-After
#  Scenario:Regression-Incoming-0009-After
#    Given Use "T24-automation-SIT-login" to login to T24 environment
#    When I enter the Payments Enquiry - Transaction wise page
#    Then I input FTNumber and click Find On Incoming
#      |FTNumber        |
#      |SGL23235LGB0FK0K|
#    When I Assert enter View Page to USD Loan
#    Then I Assert enter View Details Page
#    When I close all tabs and jump to the home page
#





  @Regression-Incoming-0013-After
  Scenario:Regression-Incoming-0010-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235HD0DJLBK|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page





  @Regression-Incoming-0021-After
  Scenario:Regression-Incoming-0021-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235LCLBKFJF|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page







  @Regression-Incoming-0024-After
  Scenario:Regression-Incoming-0024-After
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23235KJKCDMFF|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page






