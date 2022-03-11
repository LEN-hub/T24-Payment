@AntiMoneyLaunderingException
Feature:AntiMoneyLaunderingException

  #开户后触发反洗钱处理--开户申请完成10分钟后执行
  Scenario:Anti money laundering exception handle
    Given Closing the Browser driver
    When I login Corporate management business platform
      | url                                             | username | password |
      | http://10.24.9.100:8080/mweb/emptyTrs.do#/login | 2000018  | 1234     |
    Then Anti money laundering exception handle
