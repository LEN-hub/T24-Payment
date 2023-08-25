@Auto_Test1
Feature: Auto_Test1


  @Regression-Outgoing-Channel0014-Before
  Scenario:Regression-Outgoing-Channel0014-Before
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentEUR
      |Account Number|Payment Mode for Charges |Currency|
      |1102 0931 868 |SHA                      |EUR     |
    And I choose the payment currency
      |Currency|
      |EUR     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0VEC     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS USD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message22
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS USD-USD|Bic is DBS USD-USD|




  @Regression-Outgoing-Channel0025-Before
  Scenario:Regression-Outgoing-Channel0025-Before
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentCNY
      |Account Number|Payment Mode for Charges |Currency|
      |1102 0931 868 |SHA                      |CNY     |
    And I choose the payment currency
      |Currency|
      |CNY     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0VEC     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS USD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message22
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS USD-USD|Bic is DBS USD-USD|




  @Regression-Outgoing-Channel0019-Before
  Scenario:Regression-Outgoing-Channel0019-Before
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitmentHKD
      |Account Number|Payment Mode for Charges |Currency|
      |1102 0931 868 |SHA                      |HKD     |
    And I choose the payment currency
      |Currency|
      |HKD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0VEC     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment MX Message
      |WordPath          |
      |Bic is DBS USD-USD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message22
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-USD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS USD-USD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS USD-USD|Bic is DBS USD-USD|











