@MCYEnvAuth
Feature: receipt and payment service

#本人互转
  @MCY01Auth
   #USD->SGD
  Scenario:I have successfully changed us dollars into Singapore dollars and T24(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 256|USD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
      |WordPath   |
      |USD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
#    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |WordPath   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |WordPath   |
      |Pending and Processed Payments - UAT GLDB|USD-SGD MCY|
    Then I do field mapping for Channel and T24 in Own FX Payment
      |WordPath   |
      |USD-SGD MCY|
    When I compare the amount is normal To Local Payment
      |WordPath   |
      |USD-SGD MCY|
    When I compare the data generated by Outgoing Message is correct On Local Payment
      |Name                         |
      |Internal Transfer USD-SGD MCY|
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |WordPath   |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|USD-SGD MCY|

  @MCY02
  #SGD->USD
  Scenario:I have successfully transferred from Singapore currency to US dollar(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 434|SGD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully To Local Payment
      |WordPath   |
      |SGD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Local Payment
      |search content           |windows Title        |WordPath   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|SGD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page On Local Payment
      |windows Title                            |WordPath   |
      |Pending and Processed Payments - UAT GLDB|SGD-USD MCY|
    Then I do field mapping for Channel and T24 in Own FX Payment
      |WordPath   |
      |SGD-USD MCY|
    When I compare the amount is normal To Local Payment
      |WordPath   |
      |SGD-USD MCY|
    When I compare the data generated by Outgoing Message is correct On Local Payment
      |Name                         |
      |Internal Transfer SGD-USD MCY|
    When I type FOREX in the search box use to authorize the operationToLocalPayment
      |search content|user Authorize                 |WordPath   |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|SGD-USD MCY|
  @MCY03
   #SGD->SGD
  Scenario:I mutual transfer with currency mutual transfer (Singapore dollar) transaction process(MCY)
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 426|SGD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath   |
      |SGD-SGD MCY|
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
#    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|SGD-SGD MCY|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath   |
      |FUNDS.TRANSFER|SGD-SGD MCY|
    Then I will map the page data
      |WordPath   |
      |SGD-SGD MCY|
  @MCY04
    #USD->USD
  Scenario:Oneself mutual turn with currency mutual turn (US dollar) trade flow(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |currency|
      |1102 0571 063   |1101 0001 442|USD     |
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully
      |WordPath   |
      |USD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button To Local Payment
      |search content           |windows Title        |WordPath   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|USD-USD MCY|
    When I jump to the home page and enter FUNDS.TRANSFER for data mapping
      |search content|WordPath   |
      |FUNDS.TRANSFER|USD-USD MCY|
    Then I will map the page data
      |WordPath   |
      |USD-USD MCY|
  @MCY05
    #境内转账-行内转账时间选择每周一(SGD->SGD)
  Scenario:Transfer time within the line is selected every Monday (SGD->SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank                      |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account  |Payment Type|PayNow Type|PayNow Content|
      |GREEN LINK DIGITAL BANK PTE LTD   |TSC1643346550706|11010001426           |Business Expenses   |1102 0571 063 |MEPS        |UEN        |UEN123321001  |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on same Currency Payment
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                 |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Payment SGD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                 |
      |Pending and Processed Payments - UAT GLDB|Local Payment SGD-SGD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath                 |
      |Local Payment SGD-SGD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath             |Name                     |
      |Local Payment SGD-SGD|Local Payment SGD-SGD MCY|

    #境外转账
  @MCY06
  Scenario:Positive process of overseas transfer Bic Is DBS(USD--USD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency   |
      |USD        |
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
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment MX Message
      |WordPath              |
      |Bic is DBS USD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath              |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath              |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS USD-USD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath              |
      |Bic is DBS USD-USD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath              |
      |Bic is DBS USD-USD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath              |Name                  |
      |Bic is DBS USD-USD MCY|Bic is DBS USD-USD MCY|

      #境外转账
  @MCY07
  Scenario:Positive process of overseas transfer Bic Is DBS(SGD--USD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |USD     |
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
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment
      |WordPath              |
      |Bic is DBS SGD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath              |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath              |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-USD MCY|
    Then I do field mapping for Channel and T24 in FX Payment
      |WordPath              |
      |Bic is DBS SGD-USD MCY|
    When I compare the amount is normal
      |WordPath              |
      |Bic is DBS SGD-USD MCY|
    When I compare the data generated by Outgoing Message is correct
      |WordPath              |Name                  |
      |Bic is DBS SGD-USD MCY|Bic is DBS SGD-USD MCY|
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |WordPath              |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|Bic is DBS SGD-USD MCY|


  @MCY08
  Scenario:Positive process of overseas transfer Bic Is DBS(USD--SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
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
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment Different Currency MX Message
      |WordPath              |
      |Bic is DBS USD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |WordPath              |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |WordPath              |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS USD-SGD MCY|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
      |WordPath              |
      |Bic is DBS USD-SGD MCY|
    When I compare the amount is normal for Different Currency
      |WordPath              |
      |Bic is DBS USD-SGD MCY|
    When I compare the data generated by Outgoing Message is correct for Different Currency
      |WordPath              |Name                  |
      |Bic is DBS USD-SGD MCY|Bic is DBS USD-SGD MCY|
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |WordPath              |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|Bic is DBS USD-SGD MCY|

  @MCY09
  Scenario:Positive process of overseas transfer Bic Is DBS(SGD--SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
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
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment MX Message
      |WordPath              |
      |Bic is DBS SGD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath              |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath              |
      |Pending and Processed Payments - UAT GLDB|Bic is DBS SGD-SGD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath              |
      |Bic is DBS SGD-SGD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath              |
      |Bic is DBS SGD-SGD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath              |Name                  |
      |Bic is DBS SGD-SGD MCY|Bic is DBS SGD-SGD MCY|

       #境外转账
  @MCY10
  Scenario:Positive process of overseas transfer Bic Is Bank of China(USD--USD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency   |
      |USD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment MX Message
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is Bank of China USD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                        |
      |Pending and Processed Payments - UAT GLDB|Bic is Bank of China USD-USD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath                        |
      |Bic is Bank of China USD-USD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath                        |Name                            |
      |Bic is Bank of China USD-USD MCY|Bic is Bank of China USD-USD MCY|
      #境外转账
  @MCY11
  Scenario:Positive process of overseas transfer Bic Is Bank of China(SGD--USD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment
      |WordPath                        |
      |Bic is Bank of China SGD-USD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath                        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is Bank of China SGD-USD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath                        |
      |Pending and Processed Payments - UAT GLDB|Bic is Bank of China SGD-USD MCY|
    Then I do field mapping for Channel and T24 in FX Payment
      |WordPath                        |
      |Bic is Bank of China SGD-USD MCY|
    When I compare the amount is normal
      |WordPath                        |
      |Bic is Bank of China SGD-USD MCY|
    When I compare the data generated by Outgoing Message is correct
      |WordPath                        |Name                            |
      |Bic is Bank of China SGD-USD MCY|Bic is Bank of China SGD-USD MCY|
    When I type FOREX in the search box use to authorize the operation
      |search content|user Authorize                 |WordPath                        |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|Bic is Bank of China SGD-USD MCY|


  @MCY12
  Scenario:Positive process of overseas transfer Bic Is Bank of China(USD--SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|USD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment Different Currency MX Message
      |WordPath                        |
      |Bic is Bank of China USD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |WordPath                        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is Bank of China USD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |WordPath                        |
      |Pending and Processed Payments - UAT GLDB|Bic is Bank of China USD-SGD MCY|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
      |WordPath                        |
      |Bic is Bank of China USD-SGD MCY|
    When I compare the amount is normal for Different Currency
      |WordPath                        |
      |Bic is Bank of China USD-SGD MCY|
    When I compare the data generated by Outgoing Message is correct for Different Currency
      |WordPath                        |Name                            |
      |Bic is Bank of China USD-SGD MCY|Bic is Bank of China USD-SGD MCY|
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |WordPath                        |
      |FOREX         |netSilverEnv_Kevin_T24_UAT_Auth|Bic is Bank of China USD-SGD MCY|

  @MCY13
  Scenario:Positive process of overseas transfer Bic Is Bank of China(SGD--SGD)(MCY)
    Given logon second "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |Currency|
      |1102 0571 063 |The expenses shall be borne by each party|SGD     |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
    When I choose the receiving bank
      |Beneficiary Bank|
      |BKCHSGS0CUS     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then I will compare all the data on FX Payment MX Message
      |WordPath                        |
      |Bic is Bank of China SGD-SGD MCY|
    Given logon second "netSilverEnv_Kevin_Payment_Auth" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Given Use "netSilverEnv_Kevin_T24_UAT" to log in to T24 environment
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                        |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is Bank of China SGD-SGD MCY|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                        |
      |Pending and Processed Payments - UAT GLDB|Bic is Bank of China SGD-SGD MCY|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath                        |
      |Bic is Bank of China SGD-SGD MCY|
    When I compare the amount is normal on Mx Message
      |WordPath                        |
      |Bic is Bank of China SGD-SGD MCY|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath                        |Name                            |
      |Bic is Bank of China SGD-SGD MCY|Bic is Bank of China SGD-SGD MCY|

