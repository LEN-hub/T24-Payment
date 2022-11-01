@openAccount
Feature: openAccount_track2
  @testcode123
    #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt_sit" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
    |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
    |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|198103248W |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID

    #单币种账户——新币
  Scenario:openAccount Current Account CA_SGD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #单币种账户——美元
  Scenario:openAccount Current Account CA_USD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_USD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID

    #单币种账户——欧元
  Scenario:openAccount Current Account CA_EUR
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_EUR
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #单币种账户——人民币
  Scenario:openAccount Current Account CA_CNY
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_CNY
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details CNY
    Then get Organisation ID

    #单币种账户——港币
  Scenario:openAccount Current Account CA_HKD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_HKD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #开户——单管理员模式
  Scenario:openAccount Current Account CA_SGD About OneAdministrators
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles About One
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

   #开户——双管理员模式
  Scenario:openAccount Current Account CA_SGD About TwoAdministrators
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

  #多币种开户 新币+人民币
  Scenario:openAccount Current Account MCA_SGD_CNY
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_CNY
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details CNY
    Then get Organisation ID

  #多币种账户 新币+美元+人民币+港币+欧元
  Scenario:openAccount Current Account MCA_SGD_USD_CNY_HKD_EUR
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_CNY_HKD_EUR
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details CNY
    Then get Organisation ID

      #多币种账户 新币+美元
  Scenario:openAccount Current Account MCA_SGD_USD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|199400107H |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
#    Then get Organisation ID

      #多币种账户 新币+港币
  Scenario:openAccount Current Account MCA_SGD_HKD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_HKD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+欧元
  Scenario:openAccount Current Account MCA_SGD_EUR
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_EUR
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+美元+人民币
  Scenario:openAccount Current Account MCA_SGD_USD_CNY
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_CNY
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details CNY
    Then get Organisation ID

      #多币种账户 新币+美元+港币
  Scenario:openAccount Current Account MCA_SGD_USD_HKD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_HKD
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+美元+欧元
  Scenario:openAccount Current Account MCA_SGD_USD_EUR
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_EUR
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #主行业为Financial & Insurance Activities，子行业为Finance Companies
  Scenario:openAccount Singapore enterprise About SubIndustry is Finance Companies
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry       |Entity Consolidated      |
      | Finance Companies |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #主行业为Financial & Insurance Activities，子行业为Trust, Funds & Similar Financial Entities
  Scenario:openAccount Singapore enterprise About SubIndustry is Trust, Funds & Similar Financial Entities
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry                               |Entity Consolidated      |
      | Trust, Funds & Similar Financial Entities |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

       #主行业为Financial & Insurance Activities，子行业为Insurance & Reinsurance Underwriting
  Scenario:openAccount Singapore enterprise About SubIndustry is Insurance & Reinsurance Underwriting
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry                          |Entity Consolidated      |
      | Insurance & Reinsurance Underwriting |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

     #主行业为Financial & Insurance Activities，子行业为Provident & Pension Fund
  Scenario:openAccount Singapore enterprise About SubIndustry is Provident & Pension Fund
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry              |Entity Consolidated      |
      | Provident & Pension Fund |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

   #主行业为Financial & Insurance Activities，子行业为Securities & Commodities Contracts Brokerage
  Scenario:openAccount Singapore enterprise About SubIndustry is Securities & Commodities Contracts Brokerage
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry                                  |Entity Consolidated      |
      | Securities & Commodities Contracts Brokerage |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

       #主行业为Financial & Insurance Activities，子行业为Other Financial Service Activities
  Scenario:openAccount Singapore enterprise About SubIndustry is Other Financial Service Activities
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information About SubIndustry
      | subIndustry                        |Entity Consolidated      |
      | Other Financial Service Activities |Turnover ≤ SGD 1 Million |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

#    在线开户+小额透支贷款
@testLoan0291
#  单币种 新币+贷款
  Scenario: The new bank customer initiated the "new auto financing" product loan application successfully
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|200808897E |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
#    Then get Organisation ID

    #单币种账户——美元+贷款
  Scenario:openAccount Current Account CA_USD and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_USD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID


  #单币种账户——欧元+贷款
  Scenario:openAccount Current Account CA_EUR and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_EUR and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

   #单币种账户——人民币+贷款
  Scenario:openAccount Current Account CA_CNY and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_CNY and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

  #单币种账户——港币+贷款
  Scenario:openAccount Current Account CA_HKD and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_HKD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

 #多币种开户 新币+人民币+贷款
  Scenario:openAccount Current Account MCA_SGD_CNY and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_CNY
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

 #多币种账户 新币+美元+人民币+港币+欧元+贷款
  Scenario:openAccount Current Account MCA_SGD_USD_CNY_HKD_EUR and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_CNY_HKD_EUR and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

        #多币种账户 新币+美元+贷款
  Scenario:openAccount Current Account MCA_SGD_USD and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

        #多币种账户 新币+港币+贷款
  Scenario:openAccount Current Account MCA_SGD_HKD and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_HKD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

         #多币种账户 新币+欧元+贷款
  Scenario:openAccount Current Account MCA_SGD_EUR and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_EUR and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID


        #多币种账户 新币+美元+人民币+贷款
  Scenario:openAccount Current Account MCA_SGD_USD_CNY and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_CNY and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+美元+港币+贷款
  Scenario:openAccount Current Account MCA_SGD_USD_HKD and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_HKD and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+美元+欧元+贷款
  Scenario:openAccount Current Account MCA_SGD_USD_EUR and loan
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_USD_EUR and loan
    And Provide Essential Information
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    When I click the continue button to go to the loan page
      |loan Amount |
      |100000      |
    Then Upload Supporting Documents on loan page
    And Review Details
    Then get Organisation ID