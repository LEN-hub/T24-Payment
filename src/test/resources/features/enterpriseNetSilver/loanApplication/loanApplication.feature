@accountService
Feature: loan application

  Scenario:Select "≤1,000,000" for "Corporate Turnover (SGD)", select "Current Assets Loan" for the loan type, select the guarantor: Director, select the duration of the financial report: six months, enter the application amount: 10,000 Singapore dollars, "Micro Current "Overdraft" product loan application successful
    Given logon "netSilverEnvTian" on enterprise net silver
    When I hover over the loan business
    When I continue to fill in the information
      |amount|
      |1000  |
    Then I should direct to the Loan information entry page



