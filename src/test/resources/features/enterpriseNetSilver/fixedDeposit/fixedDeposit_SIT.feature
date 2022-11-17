@fixedDeposit_SIT
Feature: fixedDeposit_SIT
  #转存方式1代表不转存，2代表本金续存，3代表本息续存
  #未授权
   #定期存款_新币_一个月_不转存
#  @fixedDeposit01_SIT
#  Scenario:fixedDeposit_SGD_OneMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |1 Month |1                    |
#
#
#  #定期存款_美元_一个月_不转存
#  @fixedDeposit02_SIT
#  Scenario:fixedDeposit_USD_OneMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |1 Month |1                    |
#
#  #定期存款_新币_一个月_本金续存
#  @fixedDeposit03_SIT
#  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |1 Month |2                    |
#
#  #定期存款_美元_一个月_本金续存
#  @fixedDeposit04_SIT
#  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |1 Month |2                    |
#
#  #定期存款_新币_一个月_本息续存
#  @fixedDeposit05_SIT
#  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |1 Month |3                    |
#
#  #定期存款_美元_一个月_本息续存
#  @fixedDeposit06_SIT
#  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |1 Month |3                    |
#
#     #定期存款_新币_三个月_不转存
#  @fixedDeposit07_SIT
#  Scenario:fixedDeposit_SGD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |3 Months|1                    |
#
#
#  #定期存款_美元_三个月_不转存
#  @fixedDeposit08_SIT
#  Scenario:fixedDeposit_USD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |3 Months|1                    |
#
#  #定期存款_新币_三个月_本金续存
#  @fixedDeposit09_SIT
#  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |3 Months|2                    |
#
#  #定期存款_美元_三个月_本金续存
#  @fixedDeposit10_SIT
#  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |3 Months|2                    |
#
#  #定期存款_新币_三个月_本息续存
#  @fixedDeposit11_SIT
#  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |3 Months|3                    |
#
#  #定期存款_美元_三个月_本息续存
#  @fixedDeposit12_SIT
#  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |3 Months|3                    |
#
#
#  #定期存款_新币_六个月_不转存
#  @fixedDeposit13_SIT
#  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |6 Months|1                    |
#
#
#  #定期存款_美元_六个月_不转存
#  @fixedDeposit14_SIT
#  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |6 Months|1                    |
#
#  #定期存款_新币_六个月_本金续存
#  @fixedDeposit15_SIT
#  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |6 Months|2                    |
#
#  #定期存款_美元_六个月_本金续存
#  @fixedDeposit16_SIT
#  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |6 Months|2                    |
#
#  #定期存款_新币_六个月_本息续存
#  @fixedDeposit17_SIT
#  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |6 Months|3                    |
#
#  #定期存款_美元_六个月_本息续存
#  @fixedDeposit18_SIT
#  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |6 Months|3                    |
#
#    #定期存款_新币_九个月_不转存
#  @fixedDeposit19_SIT
#  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |9 Months|1                    |
#
#  #定期存款_美元_九个月_不转存
#  @fixedDeposit20_SIT
#  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |9 Months|1                    |
#
#  #定期存款_新币_九个月_本金续存
#  @fixedDeposit21_SIT
#  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |9 Months|2                    |
#
#  #定期存款_美元_九个月_本金续存
#  @fixedDeposit22_SIT
#  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |9 Months|2                    |
#
#  #定期存款_新币_九个月_本息续存
#  @fixedDeposit23_SIT
#  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |9 Months|3                    |
#
#  #定期存款_美元_九个月_本息续存
#  @fixedDeposit24_SIT
#  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |9 Months|3                    |
#
#  #定期存款_新币_十二个月_不转存
#  @fixedDeposit25_SIT
#  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |12 Months|1                    |
#
#  #定期存款_美元_十二个月_不转存
#  @fixedDeposit26_SIT
#  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |12 Months|1                    |
#
#  #定期存款_新币_十二个月_本金续存
#  @fixedDeposit27_SIT
#  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |12 Months|2                    |
#
#  #定期存款_美元_十二个月_本金续存
#  @fixedDeposit28_SIT
#  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |12 Months|2                    |
#
#  #定期存款_新币_十二个月_本息续存
#  @fixedDeposit29_SIT
#  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |12 Months|3                    |
#
#  #定期存款_美元_十二个月_本息续存
#  @fixedDeposit30_SIT
#  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |12 Months|3                    |
#
#  #定期存款_新币_十八个月_不转存
#  @fixedDeposit31_SIT
#  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |18 Months|1                    |
#
#  #定期存款_美元_十八个月_不转存
#  @fixedDeposit32_SIT
#  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |18 Months|1                    |
#
#  #定期存款_新币_十八个月_本金续存
#  @fixedDeposit33_SIT
#  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |18 Months|2                    |
#
#  #定期存款_美元_十八个月_本金续存
#  @fixedDeposit34_SIT
#  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |18 Months|2                    |
#
#  #定期存款_新币_十八个月_本息续存
#  @fixedDeposit35_SIT
#  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the SGD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 470       |11010000438 |250000 |18 Months|3                    |
#
#  #定期存款_美元_十八个月_本息续存
#  @fixedDeposit36_SIT
#  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest_SIT
#    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
#    When click Fixed Deposits menu
#    Then I fill in the information about the USD transfer on the time deposit page
#      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
#      |1101 0000 489       |11010000608 |10000  |18 Months|3                    |


    #授权
    #定期存款_新币_一个月_不转存
  @fixedDeposit01_authorization_SIT
  Scenario:fixedDeposit_SGD_OneMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |1 Month |1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_一个月_不转存
  @fixedDeposit02_authorization_SIT
  Scenario:fixedDeposit_USD_OneMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |1 Month |1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_一个月_本金续存
  @fixedDeposit03_authorization_SIT
  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |1 Month |2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_一个月_本金续存
  @fixedDeposit04_authorization_SIT
  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |1 Month |2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_一个月_本息续存
  @fixedDeposit05_authorization_SIT
  Scenario:fixedDeposit_SGD_OneMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |1 Month |3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_一个月_本息续存
  @fixedDeposit06_authorization_SIT
  Scenario:fixedDeposit_USD_OneMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |1 Month |3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

   #定期存款_新币_三个月_不转存
  @fixedDeposit07_authorization_SIT
  Scenario:fixedDeposit_SGD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |3 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_三个月_不转存
  @fixedDeposit08_authorization_SIT
  Scenario:fixedDeposit_USD_ThreeMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |3 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_三个月_本金续存
  @fixedDeposit09_authorization_SIT
  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |3 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_三个月_本金续存
  @fixedDeposit10_authorization_SIT
  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |3 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_三个月_本息续存
  @fixedDeposit11_authorization_SIT
  Scenario:fixedDeposit_SGD_ThreeMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |3 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_三个月_本息续存
  @fixedDeposit12_authorization_SIT
  Scenario:fixedDeposit_USD_ThreeMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |3 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

   #定期存款_新币_六个月_不转存
  @fixedDeposit13_authorization_SIT
  Scenario:fixedDeposit_SGD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |6 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_六个月_不转存
  @fixedDeposit14_authorization_SIT
  Scenario:fixedDeposit_USD_SixMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |6 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_六个月_本金续存
  @fixedDeposit15_authorization_SIT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |6 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_六个月_本金续存
  @fixedDeposit16_authorization_SIT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |6 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_六个月_本息续存
  @fixedDeposit17_authorization_SIT
  Scenario:fixedDeposit_SGD_SixMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |6 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_六个月_本息续存
  @fixedDeposit18_authorization_SIT
  Scenario:fixedDeposit_USD_SixMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |6 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


    #定期存款_新币_九个月_不转存
  @fixedDeposit19_authorization_SIT
  Scenario:fixedDeposit_SGD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |9 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_九个月_不转存
  @fixedDeposit20_authorization_SIT
  Scenario:fixedDeposit_USD_NineMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |9 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_新币_九个月_本金续存
  @fixedDeposit21_authorization_SIT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |9 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_九个月_本金续存
  @fixedDeposit22_authorization_SIT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |9 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_九个月_本息续存
  @fixedDeposit23_authorization_SIT
  Scenario:fixedDeposit_SGD_NineMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |9 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_九个月_本息续存
  @fixedDeposit24_authorization_SIT
  Scenario:fixedDeposit_USD_NineMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period  |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |9 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_新币_十二个月_不转存
  @fixedDeposit25_authorization_SIT
  Scenario:fixedDeposit_SGD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |12 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_十二个月_不转存
  @fixedDeposit26_authorization_SIT
  Scenario:fixedDeposit_USD_TwelveMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |12 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_新币_十二个月_本金续存
  @fixedDeposit27_authorization_SIT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |12 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_十二个月_本金续存
  @fixedDeposit28_authorization_SIT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |12 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_十二个月_本息续存
  @fixedDeposit29_authorization_SIT
  Scenario:fixedDeposit_SGD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |12 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_十二个月_本息续存
  @fixedDeposit30_authorization_SIT
  Scenario:fixedDeposit_USD_TwelveMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |12 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_十八个月_不转存
  @fixedDeposit31_authorization_SIT
  Scenario:fixedDeposit_SGD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |18 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_美元_十八个月_不转存
  @fixedDeposit32_authorization_SIT
  Scenario:fixedDeposit_USD_EighteenMonth_DoNotRenewOrWithdrawAutomatically_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |18 Months|1                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization

  #定期存款_新币_十八个月_本金续存
  @fixedDeposit33_authorization_SIT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |18 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_十八个月_本金续存
  @fixedDeposit34_authorization_SIT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndWithdrawInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |18 Months|2                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_新币_十八个月_本息续存
  @fixedDeposit35_authorization_SIT
  Scenario:fixedDeposit_SGD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the SGD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 438       |11010000438 |250000 |18 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization


  #定期存款_美元_十八个月_本息续存
  @fixedDeposit36_authorization_SIT
  Scenario:fixedDeposit_USD_EighteenMonth_RenewPrincipalAmountAndInterest_authorization_SIT
    Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
    When click Fixed Deposits menu
    Then I fill in the information about the USD transfer on the time deposit page
      |Transfer accounts   |Into account|Amount |Period   |Transfer accounts way|
      |1101 0000 489       |11010000608 |10000  |18 Months|3                    |
    When logon "netSilverEnv_Kevin_SIT2" in SIT environment and bypass Vkey
    When Click My Task to find data for authorization
