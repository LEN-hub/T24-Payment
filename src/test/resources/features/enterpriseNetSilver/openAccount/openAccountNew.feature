@openAccountNew
Feature: openAccountNew
  @testcodeNew
    #正常开户新流程——单币种账户——新币
  Scenario:openAccountNew Singapore enterprise
    Given open "netSilverEnv_ycjpt" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated      |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover ≤ SGD 1 Million |Manufacturing    |01/01/2010|200606164M |


