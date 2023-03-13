@Health_Check_INB_SIT

Feature: Health Check INB SIT Test Case

#  Scenario: INB to t24
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    Then view meps account
#
#  Scenario: INB to SCF
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When jump to SCF
#
#  Scenario:INB to DFT
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When click Download after the file is generated successfully

  Scenario: INB to IMS
    Given open "INB-automation-SIT-login" enterprise net silver page
    When click open Account New page
    Then Attachment uploaded successfully
      |accountType    |salutation|
      |Current Account|Mr        |

#
#  Scenario: INB to CNP
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    Then Domestic transfer Fast transfer succeeded and the transaction email was received
#      |from account|to account |date      |bank name            |transfer type|recurring transfer|date type|
#      |11010002414 |11552636365|15/03/2024|BANK OF CHINA LIMITED|Fast         |No                |Weekly   |
#    Then Check whether you can receive mail in the mailbox
#      |email name|
#      |2022005   |
#
#  Scenario: INB to MSP
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    Then Domestic transfer MEPS transfer succeeded and the transaction email was received
#      |from account|
#      |11010002449 |
#
#  Scenario:INB to EST
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When click Download after the file is generated successfully
#
#  Scenario: INB to ESO
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    Then I check whether the INB page display is normal
#
#  Scenario: INB to ISO
#    Given logon "ISSO-automation-SIT-login" on tube by inputting system online bank
#    Then check ISO page information
#
#
#  Scenario:INB to CPS
#    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
#    When I hover over the loan business
#    When I continue to fill in the information
#      |amount|
#      |10000 |
#    When I select personal guarantor
#      |name   |birthday  |idCard   |phoneNum   |email           |experience|
#      |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
#    When I declare my financial situation
#      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
#      |2020-12-08 |12       |11          |25          |12        |
#    When I announce my financial report two
#      |reportDate |netSales |preTaxSales |totalAssets |dibtAssets|
#      |2020-12-08 |12       |11          |25          |12        |
#    When I fill out other financial commitments
#      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
#      |test123                  |12      |1              |0                   |1   |
#    When I upload the three required documents
#    When I click next button on the upLoadFile page