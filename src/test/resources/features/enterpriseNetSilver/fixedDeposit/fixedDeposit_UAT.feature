@fixedDeposit_UAT
Feature: fixedDeposit_UAT
  #转存方式1代表不转存，2代表本金续存，3代表本息续存
  #未授权
   #定期存款_新币_一个月_不转存
  @fixedDeposit01_UAT
  Scenario:fixedDeposit_SGD_OneMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |1 Month |1                    |


  #定期存款_美元_一个月_不转存
  @fixedDeposit02_UAT
  Scenario:fixedDeposit_USD_OneMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |1 Month |1                    |

  #定期存款_新币_一个月_本金续存
  @fixedDeposit03_UAT
  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |1 Month |2                    |

  #定期存款_美元_一个月_本金续存
  @fixedDeposit04_UAT
  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |1 Month |2                    |

  #定期存款_新币_一个月_本息续存
  @fixedDeposit05_UAT
  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |1 Month |3                    |

  #定期存款_美元_一个月_本息续存
  @fixedDeposit06_UAT
  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |1 Month |3                    |

     #定期存款_新币_三个月_不转存
  @fixedDeposit07_UAT
  Scenario:fixedDeposit_SGD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |3 Months|1                    |


  #定期存款_美元_三个月_不转存
  @fixedDeposit08_UAT
  Scenario:fixedDeposit_USD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |3 Months|1                    |

  #定期存款_新币_三个月_本金续存
  @fixedDeposit09_UAT
  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |3 Months|2                    |

  #定期存款_美元_三个月_本金续存
  @fixedDeposit10_UAT
  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |3 Months|2                    |

  #定期存款_新币_三个月_本息续存
  @fixedDeposit11_UAT
  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |3 Months|3                    |

  #定期存款_美元_三个月_本息续存
  @fixedDeposit12_UAT
  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |3 Months|3                    |


  #定期存款_新币_六个月_不转存
  @fixedDeposit13_UAT
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
    |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
    |1101 0000 179       |11020004223 |250000 |6 Months|1                    |


  #定期存款_美元_六个月_不转存
  @fixedDeposit14_UAT
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|1                    |

  #定期存款_新币_六个月_本金续存
  @fixedDeposit15_UAT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|2                    |

  #定期存款_美元_六个月_本金续存
  @fixedDeposit16_UAT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|2                    |

  #定期存款_新币_六个月_本息续存
  @fixedDeposit17_UAT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|3                    |

  #定期存款_美元_六个月_本息续存
  @fixedDeposit18_UAT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|3                    |

    #定期存款_新币_九个月_不转存
  @fixedDeposit19_UAT
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|1                    |

  #定期存款_美元_九个月_不转存
  @fixedDeposit20_UAT
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|1                    |

  #定期存款_新币_九个月_本金续存
  @fixedDeposit21_UAT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|2                    |

  #定期存款_美元_九个月_本金续存
  @fixedDeposit22_UAT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|2                    |

  #定期存款_新币_九个月_本息续存
  @fixedDeposit23_UAT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|3                    |

  #定期存款_美元_九个月_本息续存
  @fixedDeposit24_UAT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|3                    |

  #定期存款_新币_十二个月_不转存
  @fixedDeposit25_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|1                    |

  #定期存款_美元_十二个月_不转存
  @fixedDeposit26_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|1                    |

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit27_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|2                    |

  #定期存款_美元_十二个月_本金续存
  @fixedDeposit28_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|2                    |

  #定期存款_新币_十二个月_本息续存
  @fixedDeposit29_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|3                    |

  #定期存款_美元_十二个月_本息续存
  @fixedDeposit30_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|3                    |

  #定期存款_新币_十八个月_不转存
  @fixedDeposit31_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|1                    |

  #定期存款_美元_十八个月_不转存
  @fixedDeposit32_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|1                    |

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit33_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|2                    |

  #定期存款_美元_十八个月_本金续存
  @fixedDeposit34_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|2                    |

  #定期存款_新币_十八个月_本息续存
  @fixedDeposit35_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|3                    |

  #定期存款_美元_十八个月_本息续存
  @fixedDeposit36_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest_UAT
    Given logon "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|3                    |


    #授权
    #定期存款_新币_六个月_不转存
  @fixedDeposit01_authorization_UAT
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now



  #定期存款_美元_六个月_不转存
  @fixedDeposit02_authorization_UAT
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now



  #定期存款_新币_六个月_本金续存
  @fixedDeposit03_authorization_UAT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_六个月_本金续存
  @fixedDeposit04_authorization_UAT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_六个月_本息续存
  @fixedDeposit05_authorization_UAT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |6 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_六个月_本息续存
  @fixedDeposit06_authorization_UAT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |6 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


    #定期存款_新币_九个月_不转存
  @fixedDeposit07_authorization_UAT
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_九个月_不转存
  @fixedDeposit08_authorization_UAT
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_九个月_本金续存
  @fixedDeposit09_authorization_UAT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_九个月_本金续存
  @fixedDeposit10_authorization_UAT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_九个月_本息续存
  @fixedDeposit11_authorization_UAT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |9 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_九个月_本息续存
  @fixedDeposit12_authorization_UAT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |9 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十二个月_不转存
  @fixedDeposit13_authorization_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十二个月_不转存
  @fixedDeposit14_authorization_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十二个月_本金续存
  @fixedDeposit15_authorization_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十二个月_本金续存
  @fixedDeposit16_authorization_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十二个月_本息续存
  @fixedDeposit17_authorization_UAT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |12 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十二个月_本息续存
  @fixedDeposit18_authorization_UAT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |12 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十八个月_不转存
  @fixedDeposit19_authorization_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十八个月_不转存
  @fixedDeposit20_authorization_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|1                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十八个月_本金续存
  @fixedDeposit21_authorization_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十八个月_本金续存
  @fixedDeposit22_authorization_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|2                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_新币_十八个月_本息续存
  @fixedDeposit23_authorization_UAT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 179       |11020004223 |250000 |18 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now


  #定期存款_美元_十八个月_本息续存
  @fixedDeposit24_authorization_UAT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization_UAT
    Given logon second "netSilverEnv_Kevin" on enterprise net silver
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 187       |11020004223 |10000  |18 Months|3                    |
    When logon second "netSilverEnv_Kevin2" on enterprise net silver
    When Click My Task to find data for authorization
    Then TC code is then required for Vkey authentication
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
