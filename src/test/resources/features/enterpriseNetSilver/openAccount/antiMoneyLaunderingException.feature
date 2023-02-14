@AntiMoneyLaunderingException
Feature:AntiMoneyLaunderingException

  #开户后触发反洗钱处理--开户申请完成10分钟后执行
  Scenario:Anti money laundering exception handle
    Given I login Corporate management business platform
      | url                                             | username | password |
      | http://10.24.9.100:8080/mweb/emptyTrs.do#/login | 2000018  | 1234     |
    Then Anti money laundering exception handle

  #2.ESSO系统Health Check
  @ESSO_Health_Check_SIT
  Scenario:ESSO System Health Check SIT
    Given logon "environments_SCF_SIT" test code
    When client login success
      |Email Name|
      |3t7ezhh7  |
