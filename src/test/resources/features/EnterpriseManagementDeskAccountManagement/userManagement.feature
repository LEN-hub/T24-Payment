@userManagement
Feature: userManagement

  @ModifyingAccountRights

  Scenario:Process for querying the User Management
    Given logon "netSilverEnv_sun" on enterprise net silver
    When I click on the Enterprise Administration Desk as well as user administration
    When I click modify info menu
