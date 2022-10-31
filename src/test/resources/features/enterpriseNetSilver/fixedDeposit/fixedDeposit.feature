@fixedDeposit
Feature: fixedDeposit
  #转存方式1代表不转存，2代表本金续存，3代表本息续存
  #未授权
  #定期存款_新币_六个月_不转存
  @fixedDeposit01
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
    |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
    |1101 0000 179       |11020004223 |250000 |6 Months|1                    |


  #定期存款_美元_六个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|1                    |

  #定期存款_新币_六个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|2                    |

  #定期存款_美元_六个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|2                    |

  #定期存款_新币_六个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|3                    |

  #定期存款_美元_六个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|3                    |

    #定期存款_新币_九个月_不转存
  @fixedDeposit07
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|1                    |

  #定期存款_美元_九个月_不转存
  @fixedDeposit08
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|1                    |

  #定期存款_新币_九个月_本金续存
  @fixedDeposit09
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|2                    |

  #定期存款_美元_九个月_本金续存
  @fixedDeposit10
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|2                    |

  #定期存款_新币_九个月_本息续存
  @fixedDeposit11
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|3                    |

  #定期存款_美元_九个月_本息续存
  @fixedDeposit12
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|3                    |

  #定期存款_新币_十二个月_不转存
  @fixedDeposit13
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|1                    |

  #定期存款_美元_十二个月_不转存
  @fixedDeposit14
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|1                    |

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit15
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|2                    |

  #定期存款_美元_十二个月_本金续存
  @fixedDeposit16
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|2                    |

  #定期存款_新币_十二个月_本息续存
  @fixedDeposit17
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|3                    |

  #定期存款_美元_十二个月_本息续存
  @fixedDeposit18
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|3                    |

  #定期存款_新币_十八个月_不转存
  @fixedDeposit19
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|1                    |

  #定期存款_美元_十八个月_不转存
  @fixedDeposit20
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|1                    |

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit21
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|2                    |

  #定期存款_美元_十八个月_本金续存
  @fixedDeposit22
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|2                    |

  #定期存款_新币_十八个月_本息续存
  @fixedDeposit23
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|3                    |

  #定期存款_美元_十八个月_本息续存
  @fixedDeposit24
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|3                    |



    #授权
    #定期存款_新币_六个月_不转存
  @fixedDeposit01_authorization
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver



  #定期存款_美元_六个月_不转存
  @fixedDeposit02_authorization
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|1                    |

  #定期存款_新币_六个月_本金续存
  @fixedDeposit03_authorization
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|2                    |

  #定期存款_美元_六个月_本金续存
  @fixedDeposit04_authorization
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|2                    |

  #定期存款_新币_六个月_本息续存
  @fixedDeposit05_authorization
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|3                    |

  #定期存款_美元_六个月_本息续存
  @fixedDeposit06_authorization
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|3                    |

    #定期存款_新币_九个月_不转存
  @fixedDeposit07_authorization
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|1                    |

  #定期存款_美元_九个月_不转存
  @fixedDeposit08_authorization
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|1                    |

  #定期存款_新币_九个月_本金续存
  @fixedDeposit09_authorization
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|2                    |

  #定期存款_美元_九个月_本金续存
  @fixedDeposit10_authorization
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|2                    |

  #定期存款_新币_九个月_本息续存
  @fixedDeposit11_authorization
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|3                    |

  #定期存款_美元_九个月_本息续存
  @fixedDeposit12_authorization
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|3                    |

  #定期存款_新币_十二个月_不转存
  @fixedDeposit13_authorization
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|1                    |

  #定期存款_美元_十二个月_不转存
  @fixedDeposit14_authorization
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|1                    |

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit15_authorization
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|2                    |

  #定期存款_美元_十二个月_本金续存
  @fixedDeposit16_authorization
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|2                    |

  #定期存款_新币_十二个月_本息续存
  @fixedDeposit17_authorization
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|3                    |

  #定期存款_美元_十二个月_本息续存
  @fixedDeposit18_authorization
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|3                    |

  #定期存款_新币_十八个月_不转存
  @fixedDeposit19_authorization
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|1                    |

  #定期存款_美元_十八个月_不转存
  @fixedDeposit20_authorization
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|1                    |

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit21_authorization
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|2                    |

  #定期存款_美元_十八个月_本金续存
  @fixedDeposit22_authorization
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|2                    |

  #定期存款_新币_十八个月_本息续存
  @fixedDeposit23_authorization
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|3                    |

  #定期存款_美元_十八个月_本息续存
  @fixedDeposit24_authorization
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|3                    |