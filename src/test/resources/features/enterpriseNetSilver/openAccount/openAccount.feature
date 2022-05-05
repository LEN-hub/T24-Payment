@openAccount
Feature: openAccount
  @testcode123
    #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
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

    #单币种账户——新币
  Scenario:openAccount Current Account CA_SGD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_SGD
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

    #单币种账户——美元
  Scenario:openAccount Current Account CA_USD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_USD
    And Provide Essential Information
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #单币种账户——欧元
  Scenario:openAccount Current Account CA_EUR
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_EUR
    And Provide Essential Information
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
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

      #多币种账户 新币+港币
  Scenario:openAccount Current Account MCA_SGD_HKD
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about MCA_SGD_HKD
    And Provide Essential Information
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
      | subIndustry       |
      | Finance Companies |
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
      | subIndustry                               |
      | Trust, Funds & Similar Financial Entities |
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
      | subIndustry                          |
      | Insurance & Reinsurance Underwriting |
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
      | subIndustry              |
      | Provident & Pension Fund |
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
      | subIndustry                                  |
      | Securities & Commodities Contracts Brokerage |
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
      | subIndustry                        |
      | Other Financial Service Activities |
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID