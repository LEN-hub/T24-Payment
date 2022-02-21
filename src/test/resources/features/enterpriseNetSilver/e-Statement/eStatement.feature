@accountService
Feature: e-Statement

  @testEstatement
  Scenario:Download e-Statement file successfully
    Given logon "netSilverEnvTian" on enterprise net silver
    When I click My Downloads Btn
    When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
    When I click select box
      |select       |
      |11020001852  |
    And I click search button
    Then I should see Account List
    When I click on the first data to download
#    When I click My Downloads Btn
#    When I see My Downloads List



@text
Scenario:Download past e-statements successfully
  Given logon "netSilverEnvTian" on enterprise net silver
  When I click My Downloads Btn
  When I click View eStatements Btn
#    Then I should direct to the eStatements Overview page
  When I click select box
    |select       |
    |11020001852  |
  And I click search button
  Then I should see Account List
  When I click on the past data to download
#    When I click My Downloads Btn
#    When I see My Downloads List


@text
Scenario:Download the electronic notice and successfully generate the download task
  Given logon "netSilverEnvTian" on enterprise net silver
  When I click My Downloads Btn
  When I click View eAdvices Btn
  When I click select button on the View eAdvices page
  When I click first data to download on the view eAdvices page
#    When I click My Downloads Btn
#    When I see My Downloads List




