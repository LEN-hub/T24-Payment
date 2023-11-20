@PaymentUat_OE
Feature: Outgoing Customer Transfer

  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_SIT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
    |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name |Charge Option|
    |DBSSSGS0            |SGD                 |100                 |11021083925         |SGD                   |56456465        |LEI           |DEBT         |
    Then I input Street Name on the ISO Customer Transfer Page
    |Street Name|Town Name |Creditor Country|
    |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020236302|

  @AAPayment_Loan_Disbursement_Internal_USD-USD_Amount>250K
  Scenario: Regression-Outgoing- T24-LOAN Disbursement-0004-1，4
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Loan Transactions
    When I Input incomplete information on AA Disbursement Internal page
      |Debit Account Number|Debit Currency|Payment Amount  |Payment Currency|Creditor Account|
      |18000000490         |USD           |2500004         |USD             |11010002015     |
    Then I get LoanPINumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click Loan Transactions Button
    Then I click Authorise/Delete Arrangements (PO) Button
    Then I input PI Number and click Find
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I change status code USD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input LoanPINumber and click Find
    When I Assert enter View Page to USD Loan Internal
    Then I Assert enter View Details Page



  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_SIT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Customer_Transfer_USD-USD_SIT_Amount<threshold
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|Charge Option|
      |11021207527         |DBSSSGS0                |EUR                   |EUR                 |3000              |56456465           |LEI             |OUR          |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |xian               |xian            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
    |Arrangement|
    |11020936649|




  @Payment_OE_Outgoing_Bank_Transfer_CNY-CNY_UAT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(CNY-CNY)_UAT Amount<250K
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Account|Creditor Bic|Creditor Name|
      |DBSSSGS0            |CNY                 |101               |11020936681         |4656465         |CITISGS0    |rew          |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
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
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the account ID
    Then I find account
      |Arrangement|
      |11020936649|

  @Payment_OE_Outgoing_Bank_Transfer_USD-USD_UAT_Amount<threshold
  Scenario:Payment_OE_Outgoing_Bank_Transfer_(USD-USD)_UAT Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Bank Transfer
    Then I enter Outgoing ISO Bank Transfer Page
    When I Input incomplete information USD on Outgoing ISO Bank Transfer Page
      |Instructed Agent BIC|Transaction Currency|Transaction Amount|Debit Account Number|Creditor Bic|
      |CITIUS30            |USD                 |10001             |USD142000001        |DBSSSGS0    |
    When I Input Sender's Reference on Outgoing ISO Bank Transfer Page
      |Sender Reference|End To End Identification|
      |                |                         |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to OE Outgoing_Bank_Transfer
    Then I Assert enter View Details Page


     #特殊案例
  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Best & Good etc|
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name|Town Name |Creditor Country|
      |liyukang   |testabc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Best & Good etc |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kang           |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name       |Town Name         |Creditor Country|
      |Best & Good etc   |Best & Good etc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |Best & Good etc    |Best & Good etc |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Name>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name       |Town Name         |Creditor Country|
      |SINGAPORE         |WANGKUNG          |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Name>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name  |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kang           |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name                                               |Town Name                                                 |Creditor Country|
      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name|
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kang            |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address                                        |Beneficiary Town                                        |
      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page


    #修改Debitor相关信息再执行脚本
  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name                                                     |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff           |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name                                               |Town Name                                                 |Creditor Country|
      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name>35
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name                                                   |
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff            |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address                                        |Beneficiary Town                                        |
      |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff    |Kangewqeqewqeqeqweqweqeqewwqeqwewqewqweewqeqweeqwdsdaff |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_SGD-SGD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(SGD--SGD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing ISO Customer Transfer
    Then I Assertion enter Outgoing ISO Customer Transfer Page
    When I Input incomplete information on ISO Customer Transfer Page
      |Instructed Agent Bic|Transaction Currency|Transaction Amount  |Debit Account Number|Debit Account Currency|Creditor Account|Creditor Name             |
      |DBSSSGS0            |SGD                 |200                 |11010001981         |SGD                   |56456465        |Best & Good etc           |
    Then I input Street Name on the ISO Customer Transfer Page
      |Street Name       |Town Name         |Creditor Country|
      |Best & Good etc   |Best & Good etc   |SG              |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page
    Then I Assert enter View Details Page

  @Payment_OE_Outgoing_Customer_Transfer_USD-USD_Special_Creditor_Address_Debitor_Address_Debitor_name_Creditor_name
  Scenario:Payment_OE_Outgoing_Customer_Transfer_UAT(USD-USD) Amount<250K
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click Outgoing Customer Transfer
    Then I enter Outgoing Customer Transfer Page
    When I Input incomplete information on Outgoing Customer Transfer Page
      |Debit Account Number|Receiver Institution BIC|Debit Account Currency|Transaction Currency|Transaction Amount|Beneficiary Account|Beneficiary Name           |
      |11010003267         |DBSSSGS0                |USD                   |USD                 |100               |56456465           |Best & Good etc            |
    Then I Input Beneficiary Address and Beneficiary Town
      |Beneficiary Address|Beneficiary Town|
      |Best & Good etc    |Best & Good etc |
    Then I get OENumber
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input OE Number and click Find Authorise
    Then Assert Result whether Successful
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find
    When I Assert enter View Page to USD
    Then I Assert enter View Details Page
