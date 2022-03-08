@openAccount
Feature: openAccount

  @report
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