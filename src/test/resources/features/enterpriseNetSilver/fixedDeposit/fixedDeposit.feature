@fixedDeposit
Feature: fixedDeposit
  #转存方式1代表不转存，2代表本金续存，3代表本息续存

  #定期存款_新币_六个月_不转存
  @reporttest123
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
    |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
    |1101 0001 590       |11020005351 |250000 |对公整存整取六个月存款|1                    |


  #定期存款_美元_六个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取六个月存款|1                    |

  #定期存款_新币_六个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取六个月存款|2                    |

  #定期存款_美元_六个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取六个月存款|2                    |

  #定期存款_新币_六个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取六个月存款|3                    |

  #定期存款_美元_六个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取六个月存款|3                    |

    #定期存款_新币_九个月_不转存
  @report
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取九个月存款|1                    |

  #定期存款_美元_九个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取九个月存款|1                    |

  #定期存款_新币_九个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取九个月存款|2                    |

  #定期存款_美元_九个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取九个月存款|2                    |

  #定期存款_新币_九个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取九个月存款|3                    |

  #定期存款_美元_九个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period            |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取九个月存款|3                    |

  #定期存款_新币_十二个月_不转存
  @report
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十二个月存款|1                    |

  #定期存款_美元_十二个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十二个月存款|1                    |

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十二个月存款|2                    |

  #定期存款_美元_十二个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十二个月存款|2                    |

  #定期存款_新币_十二个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十二个月存款|3                    |

  #定期存款_美元_十二个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十二个月存款|3                    |

  #定期存款_新币_十八个月_不转存
  @report
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十八个月存款|1                    |

  #定期存款_美元_十八个月_不转存
  @fixedDeposit02
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十八个月存款|1                    |

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit03
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十八个月存款|2                    |

  #定期存款_美元_十八个月_本金续存
  @fixedDeposit04
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十八个月存款|2                    |

  #定期存款_新币_十八个月_本息续存
  @fixedDeposit05
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0001 590       |11020005351 |250000 |对公整存整取十八个月存款|3                    |

  #定期存款_美元_十八个月_本息续存
  @fixedDeposit06
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest
    Given logon "netSilverEnv_ycjpt" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period             |Transfer accounts way|
      |1101 0002 198       |11010002317 |10000  |对公整存整取十八个月存款|3                    |