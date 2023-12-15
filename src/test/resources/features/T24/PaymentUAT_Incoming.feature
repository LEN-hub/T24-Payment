@PaymentUat_InComing
Feature: Payment InComing

  #更改得最新incoming案例
  @Incoming_Payment_999_CA
  Scenario:Incoming payment-999 CA
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL233410LBMLG00|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the page
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|
    And I close driver

  @Incoming_Payment_999_MCA
  Scenario:Incoming payment-999 MCA
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL233410LBMLG00|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the page
    When I enter the account ID
    Then I find account CASGD
      |Arrangement|Currency   |
      |11021162884|AED        |
    And I close driver


  @Incoming_Payment_235_CA
  Scenario:Incoming payment-235_CA
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205HFBG00LG|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205HFBG00LG|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the page
    When I enter the account IDCA
    Then I find account
      |Arrangement|
      |11010006762|
    And I close driver


  @Incoming_Payment_235Multi_Currency
  Scenario:Incoming payment-235Multi_Currency
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23136MDHJDDKF|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23136MDHJDDKF|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the page
    When I enter the account ID
    Then I find account CASGD
      |Arrangement|Currency   |
      |11021162884|AED        |
    And I close driver



#旧得incoming案例


  @Incoming_Payment_999
  Scenario:Incoming payment-999
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
    |FTNumber        |
    |SGL233410LBMLG00|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11020931884    |
    When I click Find Butt
    Then Assert enter Account Details Page

  @Incoming_Payment_999Multi_Currency
  Scenario:Incoming payment-999Multi_Currency
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL231320CGHJKGD|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click Find Multi Currency
    When I input Arrangement
      |Arrangement    |
      |11020614528    |
    When I click Find Butt
    Then Assert enter Account Details Page
    Then I click USD Overview
    Then Assert enter Account Details Page
    Then Close the current
    Then I click SGD Overview
    Then Assert enter Account Details Page
    And I close driver



  @Incoming_Payment_235
  Scenario:Incoming payment-235
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205HFBG00LG|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-SIT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23205HFBG00LG|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click find account
    When I input Arrangement
      |Arrangement    |
      |11010003267    |
    When I click Find Butt
    Then Assert enter Account Details Page
    And I close driver

  @Incoming_Payment_235Multi_Currency
  Scenario:Incoming payment-235Multi_Currency
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23136MDHJDDKF|
    When I change status code SGD
    Then I close driver
    Given Use "T24-automation-UAT-login-Auth2" to login to T24 environment
    When I entered the Pending Authorise Payments page
    Then I input FTNumber and click Find Authorise
    And I close driver
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I enter the Payments Enquiry - Transaction wise page
    Then I input FTNumber and click Find On Incoming
      |FTNumber        |
      |SGL23136MDHJDDKF|
    When I Assert enter View Page to USD Loan
    Then I Assert enter View Details Page
    When I close all tabs and jump to the home page
    Then I click Find Multi Currency
    When I input Arrangement
      |Arrangement    |
      |11010002716    |
    When I click Find Butt
    Then Assert enter Account Details Page