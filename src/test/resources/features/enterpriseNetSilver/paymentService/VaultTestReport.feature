@paymentService_AccountManager
Feature: receipt and payment service

Scenario:Transfer time within the line is selected every Monday Time Selection Weekly(SGD->SGD)(SIT_MCY)
Given logon "netSilverEnv_Kevin_SIT" in SIT environment and bypass Vkey
When I fill in the transfer information of domestic transfer bank
|Payee's Bank                     |Payee's Name    |Payee's Account Number|Purpose of Transfer |From Account |
|GREEN LINK DIGITAL BANK PTE LTD  |TSC1643346550706|11010002414           |Business Expenses   |1102 0327 162|
When I select a time period on the page
|date      |cycle |
|24/11/2025|Weekly|
When I click next button on the domestic transfer bank page
Then I verify the information on the next page
When If the transfer failure window pops up I will click the continue button
Then I will compare all the data on same Currency Payment
|WordPath                 |
|Local Payment SGD-SGD MCY|