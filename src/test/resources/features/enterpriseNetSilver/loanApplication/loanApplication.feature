@accountService
Feature: loan application

  Scenario:Select "≤1,000,000" for "Corporate Turnover (SGD)", select "Current Assets Loan" for the loan type, select the guarantor: Director, select the duration of the financial report: six months, enter the application amount: 10,000 Singapore dollars, "Micro Current "Overdraft" product loan application successful
    Given logon "netSilverEnvLoan_Tian" on enterprise net silver
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
      |fileAddress                                                            |
      |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
    When I click next button on the upLoadFile page


    @text1
    Scenario:Select “>1,000,000 and ≤ 20,000,000” for “Corporate Turnover (SGD)”, “Current Asset Loan” for the loan type, select collateral: real estate, select guarantor: personal guarantee-director; input the loan amount: 200,000; "Overdraft" product loan application successful
      Given logon "netSilverEnvLoan_Tian" on enterprise net silver
      When I hover over the loan business
      When I choose a turnover of one million to two million
        |amount|
        |200000|
      When I select real estate mortgage
        |houseAddress|zipCode|constructionArea|
        |test123     |123456 |140             |
      When I select personal guarantor
        |name   |birthday  |idCard   |phoneNum   |email           |experience|
        |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
      When I fill out other financial commitments on real estate mortgage
        |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
        |test123                  |12      |1              |0                   |1   |
      When I upload the five required documents
        |fileAddress                                                            |
        |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
      When I click next button on the upLoadFile page

    @text2
    Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Current Asset Loan” for the loan type, select the collateral: real estate, select the guarantor: personal guarantee - two directors, input the loan amount: 200,000; 30-Day Accounts Receivable Financing Product Loan Application Successful (Loan Currency Selection: USD)
      Given logon "netSilverEnvLoan_Tian" on enterprise net silver
      When I hover over the loan business
      When I choose collection financing
        |amount|
        |200000|
      When I select real estate mortgage
        |houseAddress|zipCode|constructionArea|
        |test123     |123456 |140             |
      When I select personal guarantor
        |name   |birthday  |idCard   |phoneNum   |email           |experience|
        |WANG WU|1988-02-02|S1472581A|13087544979|126161178@qq.com|4         |
      When I fill out other financial commitments on real estate mortgage
        |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
        |test123                  |12      |1              |0                   |1   |
      When I provide primary buyer information
        |name   |RelationshipYears  |annualSales  |creditPeriod |
        |WANG WU|3                  |12           |12           |
      When I provide primary supplier information
        |name   |RelationshipYears  |annualSales  |creditPeriod |
        |WANG WU|3                  |12           |12           |
      When I upload the five required documents
        |fileAddress                                                            |
        |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
      When I click next button on the upLoadFile page

  @text3
  Scenario:Select “>1,000,000 and ≤20,000,000” for “Corporate Turnover (SGD)”, select “Fixed Assets Loan” for the loan type, select the guarantor: Corporate Guarantee - a corporate shareholder, input the loan amount: 1.2 million; 1-year new auto financing product successful loan application
    Given logon "netSilverEnvLoan_Tian" on enterprise net silver
    When I hover over the loan business
    When I choose fixed asset loan
      |amount |
      |1200000|
    When I choose corporate guarantor
      |registeredName          |RegistrationNumber |registrationDate|address|city    |zipCode|
      |China Technology Group  |123123             |2010-02-14      |china  |beijing |713548 |
    When I fill out other financial commitments on company guarantee page
      |financialInstitutionName |loanAmt |outstandingAmt |monthlyInstallments |rate|
      |test123                  |12      |1              |0                   |1   |
    When I enter vehicle details
      |brand      |price |
      |Lamborghini|1200000 |
    When I upload the five required documents
      |fileAddress                                                            |
      |E:\DBB_GL_AutoTestting-dev\src\test\resources\testData\autopay\test.jpg|
    When I click next button on the upLoadFile page





