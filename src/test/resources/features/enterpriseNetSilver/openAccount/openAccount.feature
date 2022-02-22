@openAccount
Feature: openAccount

  Scenario:openAccount Singapore enterprise
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information
    Then Enter Connected People's Details