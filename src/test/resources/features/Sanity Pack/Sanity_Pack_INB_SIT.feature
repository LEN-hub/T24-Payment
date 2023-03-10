@Sanity_Pack_INB_SIT

Feature: Sanity Pack INB SIT Test Case

 #境外转账
  @FxPaymentSGDToUSDSIT
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->USD)_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges|
      |1101 0002 414 |SHA                     |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0LAO     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment
      |WordPath           |
      |Bic is DBS SGD-USD |
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button
      |search content           |windows Title        |WordPath           |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-USD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page
      |windows Title                            |WordPath           |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS SGD-USD |
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
      |search content|user Authorize                 |Name              |
      |FOREX         |T24-automation-SIT-login-Auth  |Bic is DBS SGD-USD|
    When I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MX
      |WordPath          |
      |Bic is DBS SGD-USD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS SGD-USD |

  @FxPaymentUSDToSGD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 0000 489 |SHA                      |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0LAO     |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information
    When Vkey authorization for Payment transactions in the SIT environment
    Then I will compare all the data on FX Payment Different Currency MX Message
      |WordPath          |
      |Bic is DBS USD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Different Currency
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS USD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page for Different Currency
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS USD-SGD|
    Then I do field mapping for Channel and T24 in FX Payment for Different Currency
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I compare the amount is normal for Different Currency
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I compare the data generated by Outgoing Message is correct for Different Currency
      |WordPath          |Name              |
      |Bic is DBS USD-SGD|Bic is DBS USD-SGD|
    When I type FOREX in the search box use to authorize the operation for Different Currency
      |search content|user Authorize                 |Name              |
      |FOREX         |T24-automation-SIT-login-Auth  |Bic is DBS USD-SGD|
    When I view the exchange rate in the Payment Order RFQ Rate Audit menu On Oversea Payment MX
      |WordPath          |
      |Bic is DBS USD-SGD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS USD-SGD |

  @FxPaymentSGDToSGD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(SGD->SGD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 0002 414 |SHA                      |
    And I choose the payment currency
      |Currency|
      |SGD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0LAO     |
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
      |Bic is DBS SGD-SGD|
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath          |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Bic is DBS SGD-SGD|
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath          |
      |Pending and Processed Payments - SIT GLDB|Bic is DBS SGD-SGD|
    Then I do field mapping for Channel and T24 in same currency
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the amount is normal on Mx Message
      |WordPath          |
      |Bic is DBS SGD-SGD|
    When I compare the data generated by Outgoing Message MX Message is correct
      |WordPath          |Name              |
      |Bic is DBS SGD-SGD|Bic is DBS SGD-SGD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS SGD-SGD |

  @FxPaymentUSDToUSD
  Scenario:FX Payment Data Mapping Positive process of overseas transfer Bic is DBS SINGAPORE(USD->USD)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges |
      |1101 0000 489 |SHA                      |
    And I choose the payment currency
      |Currency|
      |USD     |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBSSSGS0LAO     |
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
      |Bic is DBS SGD-SGD|Bic is DBS USD-USD|
    When I check the deduction amount on the Find Account page On overseas transfer Payment
      |windows Title            |WordPath           |
      |AA Arrangement - SIT GLDB|Bic is DBS USD-USD |

  Scenario:FAST transfer method, new currency to new currency positive process (unauthorized transfer)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date      |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Fast         |No                |Weekly   |


  Scenario:FAST transfer method, where the new currency is transferred to the new currency in a positive process (without authorization).
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date      |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Fast         |Yes               |Weekly   |

  Scenario:FAST transfer method, new currency to new currency positive process (without authorization)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date    |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|today   |BANK OF CHINA LIMITED|Fast         |No                |Weekly   |
    Then I get transaction details on the page
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Fund Payment SGD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                   |
      |Pending and Processed Payments - SIT GLDB|Local Fund Payment SGD-SGD |
    When I check the deduction amount on the Find Account page On smock test
      |windows Title            |WordPath                   |
      |AA Arrangement - SIT GLDB|Local Fund Payment SGD-SGD |

  Scenario:MEPS transfer method, new currency to new currency positive process (unauthorized transfer)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date      |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Meps         |No                |Weekly   |


  Scenario:MEPS transfer method, where the new currency is transferred to the new currency in a positive process (without authorization).
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date      |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Meps         |Yes               |Weekly   |

  Scenario:MEPS transfer method, new currency to new currency positive process (without authorization)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date    |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|today   |BANK OF CHINA LIMITED|Meps         |No                |Weekly   |
    Then I get transaction details on the page
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Fund Payment SGD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                   |
      |Pending and Processed Payments - SIT GLDB|Local Fund Payment SGD-SGD |
    When I check the deduction amount on the Find Account page On smock test
      |windows Title            |WordPath                   |
      |AA Arrangement - SIT GLDB|Local Fund Payment SGD-SGD |

  Scenario:UEN the process of converting new currency to new currency (without authorization)
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    Then Domestic transfer Fast transfer succeeded and the transaction email was received
      |from account|to account |date    |bank name            |transfer type|recurring transfer|date type|
      |11010002414 |11552636365|today   |BANK OF CHINA LIMITED|Meps         |No                |Weekly   |
    Then I get transaction details on the page
    Given to verify transaction in T24 using "T24-automation-SIT-login"
    When I type in the content and click the search button on Mx Message
      |search content           |windows Title        |WordPath                   |
      |ENQ ST.API.ITF.GLDB.2.0.0|ST.API.ITF.GLDB.2.0.0|Local Fund Payment SGD-SGD |
    When I expand the User Menu menu on the page
    When I expand the User Payments menu on the page
    When I expand the Payment Hub menu on the page
    When I expand the Payment Inquiries and Exceptions menu on the page
    When I expand the Payments Enquiry Transaction wise menu on the page
    When I jump to a newly opened page on Mx Message
      |windows Title                            |WordPath                   |
      |Pending and Processed Payments - SIT GLDB|Local Fund Payment SGD-SGD |
    When I check the deduction amount on the Find Account page On smock test
      |windows Title            |WordPath                   |
      |AA Arrangement - SIT GLDB|Local Fund Payment SGD-SGD |