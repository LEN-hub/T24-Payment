@userManagement
Feature: userManagements

  @ChangingMobilePhoneNumber

  Scenario:Process for querying the User Management
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu

  @newUsers

  Scenario:Process for querying the New users
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration as well user administration