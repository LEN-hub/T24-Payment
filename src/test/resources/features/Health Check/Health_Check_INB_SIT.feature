@Health_Check_INB_SIT

Feature: Health Check INB SIT Test Case

  @INB_To_T24_SIT
  Scenario: INB to t24
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    Then view meps account

  @INB_To_SCF_SIT
  Scenario: INB to SCF
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When jump to SCF

  @INB_To_DFT_SIT
  Scenario:INB to DFT
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When click Download after the file is generated successfully

  @INB_To_IMS_SIT
  Scenario: INB to IMS
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
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


#  Scenario: INB to CNP
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    Then Domestic transfer Fast transfer succeeded and the transaction email was received
#      |from account  |to account |date      |bank name            |transfer type|recurring transfer|date type|
#      |1101 0002 414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Fast         |No                |Weekly   |
#    Then Check whether you can receive mail in the mailbox
#      |email name|
#      |2022005   |

  @INB_To_CNP_SIT
  Scenario: INB to CNP
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I fill in the transfer information of domestic transfer bank
      |Payee's Bank           |Payee's Account Number|Purpose of Transfer |From Account  |Payment Type|PayNow Type|PayNow Content|
      |BANK OF CHINA LIMITED  |11552636365           |Business Expenses   |1101 0002 414 |FAST        |VPA        |UEN123321001  |
    When I click next button on the domestic transfer bank page
    Then I verify the information on the next page
    When I click Next to go to the verification page
    When If the transfer failure window pops up I will click the continue button
    When Vkey authorization for Payment transactions in the SIT environment
    Then Check whether you can receive mail in the mailbox
      |email name|
      |2022005   |

  @INB_To_MSP_SIT
  Scenario: INB to MSP
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    Then Domestic transfer MEPS transfer succeeded and the transaction email was received
      |from account|
      |11010002449 |

  @INB_To_EST_SIT
  Scenario:INB to EST
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When click Download after the file is generated successfully

  @INB_To_ESO_SIT
  Scenario: INB to ESO
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    Then I check whether the INB page display is normal


  @INB_To_ISO_SIT
  Scenario: INB to ISO
    Given logon "ISSO-automation-SIT-login" on tube by inputting system online bank
    Then check ISO page information

  @INB_To_CPS_SIT
  Scenario:INB to CPS
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
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