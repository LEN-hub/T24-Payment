@openAccountNew
Feature: openAccount_track3
  @OpenAccount_Track3_Single_SGD
    #正常开户新流程——单币种账户——新币
  Scenario:openAccountNew Singapore enterprise Track3
    Given open "INB-automation-SIT-login" enterprise net silver page
    When click open Account New page
    Then New Fill in information "netSilverEnv_OpenAccount" on Getting Started page
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|2009117799 |
    Given logon "environments_5" on tube by inputting system online bank
    When I into the rear tube Supplementary account opening information
#    Given logon "environments_6" on tube by inputting system online bank
#    When I enter the back tube for authorization
#    When I enter the mailbox

  @OpenAccount_Track3_Single_USD
    #正常开户新流程——单币种账户——新币
  Scenario:openAccountNew Singapore enterprise
    Given open "netSilverEnv_Kevin_SIT" enterprise net silver page
    When click open Account New page
    Then Fill in information "netSilverEnv_OpenAccount" on Getting Started page about CA_USD
    And Provide Essential Information New
      |Entity's Type                                  |Entity Consolidated       |Entity's Industry|date      |chekk      |
      |Public Listed Company (Not Listed in Singapore)|Turnover <= SGD 1 Million |Manufacturing    |01/01/2010|200911779N |
    Given logon "environments_5" on tube by inputting system online bank
    When I into the rear tube Supplementary account opening information
      |chekk      |
      |200911779N |
    Given logon "environments_6" on tube by inputting system online bank
    When I enter the back tube for authorization
    When I enter the mailbox