@Health_Check_INB_UAT

Feature: Health Check INB UAT Test Case

  Scenario: INB to t24
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    Then view meps account

  Scenario: INB to SCF
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When jump to SCF

  Scenario:INB to DFT
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When click Download after the file is generated successfully

  Scenario: INB to IMS
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I hover over the loan business
    When I continue to fill in the information
      |amount|
      |10000 |
    When I select personal guarantor
      |name   |birthday  |idCard   |phoneNum   |email           |experience|
      |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
    When I declare my financial situation
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I announce my financial report two
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I fill out other financial commitments
      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
      |test123                  |12      |1              |0                   |1   |
    When I upload the three required documents


  Scenario: INB to CNP
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Account Number|Purpose of Transfer |From Account  |Payment Type|PayNow Type|PayNow Content|
      |BANK OF CHINA LIMITED  |11010001426           |Business Expenses   |1101 0003 453 |FAST        |VPA        |UEN123321001  |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When I get the TC code and click Next
    When I typed TC Code and click Authenticate Now
    Then Check whether you can receive mail in the mailbox
      |email name|
      |2022005   |

  Scenario: INB to MSP
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    Then Domestic transfer MEPS transfer succeeded and the transaction email was received
      |from account|
      |11010002449 |

  Scenario:INB to EST
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When click Download after the file is generated successfully

  Scenario: INB to ESO
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    Then I check whether the INB page display is normal

  Scenario: INB to ISO
    Given logon "ISSO-automation-SIT-login" on tube by inputting system online bank
    Then check ISO page information


  Scenario:INB to CPS
    Given logon "netSilverEnv_Kevin_Payment" on enterprise net silver
    When I hover over the loan business
    When I continue to fill in the information
      |amount|
      |10000 |
    When I select personal guarantor
      |name   |birthday  |idCard   |phoneNum   |email           |experience|
      |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
    When I declare my financial situation
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I announce my financial report two
      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
      |2020-12-08 |12       |11          |25          |12        |
    When I fill out other financial commitments
      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
      |test123                  |12      |1              |0                   |1   |
    When I upload the three required documents
    When I click next button on the upLoadFile page