@Kang-账户充钱
Feature: Amount


  @Zhang_Hu_Chong_Qian
  Scenario:T24_Amount
    Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
    When I click User Menu
    Then I click payments
    When I click payment hup
    Then I click Account Transfer
    When I Input Transfer Information
      |Debit Account|Debit Amount   |Debit Currency|Credit Account|Credit Currency|Ordering Bank          |
      |SGD14200001  |3270           |SGD           |11010005766   |SGD            |DBS SINGAPORE TEST     |
    Then I click pre-submit button
    When I click Accept Overrides
    Then Assert Result whether Successful
    Given Use "T24-automation-SIT-login" to login to T24 environment
    When I click User Menu
    Then I click payments
    When I click payment hup
    Then I click Authorise/Delete FT transactions
    Then I click search but
    Then I input Credit Account No
      |Credit Account No|
      |11010005766      |
    When I click find
    Then I click Authorize But



    @Chuang_Jian_Limit
    Scenario:T24_Limit
      Given Use "T24-automation-SIT-login" to login to T24 environment
      When I click User Menu
      Then I click Risk Management
      Then I click Limits
      Then I click Limit Menu
      Then I click Create Unsecured Limit
      When I click New Deal
      Then I get LimitID
      Then I input Limit Details
        |customer_number|limit_product|serial_no|currency|internal_amount|
        |200510      	|2800         |11       |SGD     |3000000        |
      When I click Other Details
      Then I input Other Details
        |AllowedCcy|
        |SGD       |
      When I click Loan Details
        |Loan_Interest_Rate|Loan_Tenor|Settlement_Account|
        |11.2      	       |3         |11010001981       |
      Then I click pre-submit button
      Given Use "T24-automation-SIT-login-Auth" to login to T24 environment
      When I click User Menu
      Then I click Risk Management
      Then I click Limits
      Then I click Limit Menu
      Then I click Authorise/Delete/Reject Limit
      Then I click search butt
      Then I input LimitID And click Find
      Then I click Authorize Butt
      Given Use "T24-automation-SIT-login" to login to T24 environment
      Then I input LIMIT and find
      Then I FIND






  @Chuang_Jian_Loan
  Scenario:T24_Creat_Loan
    Given Use "T24-automation-UAT-login" to login to T24 environment
    When I click User Menu
    Then I click products
    Then I Click Product Catalog
    When I Click Lending
    Then I click Syndicated Loans
    Then I click New Arrangement
    When I input Customer and Currency
      |Customer|Currency1|
      |202234  |SGD      |
    When I click Submit1
    Then I get Arrangement
    Then I input limit
      |Limit_Id      |
      |LI24236RK441  |
    Then I input Commitment
      |Amount1|Term|Maturity_Date|
      |190000 |2Y  |             |
    When I input Principal Interest
      |Fixed|MinMaxRate|
      |1.7  |          |
#    Then I clcik CCY Reference and input
#      |Currency2|FixedFloating|RateIndex|
#      |         |             |         |
#    Then I input Penalty Interest
#      |MinMaxRate|Currency3|FixedFloating3|RateIndex3|
#      |          |         |              |          |
#    Then I input Facility Fees Amortised and STF Participation Fee
#      |rate      |FixedAmount|
#      |          |           |
#    Then I input Schedule
#      |StartTime |EndTime     |
#      |          |            |
    Then I input Settlement Instructions
      |Settlement1    |Settlement2 |Active1|Active2|
      |11021083925    |11010005081 |Yes    |Yes    |
    Then I get Active
    Then I click pre-submit button
    When I click Accept Overrides
    Given Use "T24-automation-UAT-login-Auth" to login to T24 environment
    When I click User Menu
    Then I click products
    Then I click Unauthorized AAA records
    Then I input Arrangement and Find
    Then I click improve butt
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click User Menu
#    Then I click products
#    Then I click Find Loan
#    Then I input Arrangementl and Find
#    Then I click Find Loan Overview
#    Given Use "T24-automation-UAT-login" to login to T24 environment
#    When I click User Menu
#    Then I click Account
#    Then I input Account and Find
#      |AccountNo      |
#      |SGD148050007   |












