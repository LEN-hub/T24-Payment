@paymentService_AccountManager
Feature: receipt and payment service
  #PayNow修改
  @Paynow03
  Scenario:PayNow Signing Modify
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When I carry out the signing and modification process on the page
      |AccountNu    |
      |1101 0002 449|
