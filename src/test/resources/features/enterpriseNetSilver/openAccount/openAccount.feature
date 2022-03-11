@openAccount
Feature: openAccount

  @report
    #正常开户流程——单币种账户——新币
  Scenario:openAccount Singapore enterprise
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
    Then Enter Connected People's Details
    And Enter Connected Entities’ Details
    Then Create Company Administrators’ Profiles
    And Share Account’s Risk Profile
    Then Upload Supporting Documents
    And Review Details
    Then get Organisation ID

    #单币种账户——新币
  Scenario:openAccount Current Account CA_SGD
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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

    #单币种账户——美元
  Scenario:openAccount Current Account CA_USD
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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

  #多币种开户 新币+港元
  Scenario:openAccount Current Account MCA_SGD_CNY
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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
    Given Closing the Browser driver
    When open "netSilverEnv_ycjpt" enterprise net silver page
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