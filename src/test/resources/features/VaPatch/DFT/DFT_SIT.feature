@Sanity_Pack_SCF_SIT

Feature: Sanity Pack SCF SIT Test Case


  @UAT-DFT-013
  Scenario:Download statement the DFT SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eAdvices Btn
    When I click select button on the View eAdvices page
    When I click first data to download on the view eAdvices page