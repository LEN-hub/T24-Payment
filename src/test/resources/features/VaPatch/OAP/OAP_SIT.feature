@VaPatch_OAP_SIT
Feature: VaPatch_OAP_SIT

  @OAP-003_SIT
  Scenario:Cross-currency transfer SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I will complete the inter-bank transfer on the page
      |From Account    |To Account   |
      |1101 0002 414   |1101 0000 489|
    Then I check to see if the page jumps
    When I verify the page information and click the Next button
    Then My account has been transferred successfully

  @OAP-004_SIT
  Scenario:Login CNP Short message resend SIT
    Given logon "ISO_SIT" on ISO
    When enter the CNP resend Short message SIT

  @OAP-005_SIT
  Scenario:High risk of overseas transfer SIT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on overseas transfer payment and select the account
    When I select the payment account, enter the payment currency and the payment amount and the cost commitment
      |Account Number|Payment Mode for Charges                 |
      |1101 0001 434 |The expenses shall be borne by each party|
    And I choose the payment currency
      |Currency   |
      |USD        |
    When I enter the payee information
      |Payee's Account Number|Payee's Name|
      |667812798             |lucky       |
#    When I click on the receiving bank drop down box
    When I choose the receiving bank
      |Beneficiary Bank|
      |DBS SINGAPORE   |
    When I choose the recipient country
      |Payee's Address |Payee's Country|Comments For Payee|
      |countries       |UNITED STATES  |ok                |
    When I choose the nature of payment
      |Purpose of Transfer|
      |Commission         |
    When I choose to submit the transfer information