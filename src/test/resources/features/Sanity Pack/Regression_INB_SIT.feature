@Regression_INB_SIT

Feature: Regression_INB_SIT

  @sanity_pack_My_Transactions_Query_Success_SIT1
    #My Transactions查询交易成功
  Scenario: My Transactions query transaction succeeded1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Successful presentation of transaction history

  @sanity_pack_View_eStatement_SIT1
#eStatements可以正常查看
  Scenario:Successfully displayed eStatement data1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eStatements Btn
    When I click select box
      |select       |
      |11010000608  |
    And I click search button
    Then I should see Account List

  @sanity_pack_Download_Eadvice_Data_SIT1
    #成功下载eadvice数据
  Scenario:EAdivce can be downloaded normally1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When I click View eAdvices Btn
    When I click select button on the View eAdvices page
    When I click first data to download on the view eAdvices page

  @sanity_pack_Manage_Alert/Notification_Query_Normally_SIT1
    #Manage alert/notification可以正常查询
  Scenario: Manage alert/notification can query normally1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Successfully demonstrated Bank Announcement

  @sanity_pack_Change_Password_Login_Success_SIT1
   #Change Password后可以正常登录
  Scenario:You can log in normally after changing password1
    Given logon "INB-automation-SIT-change-password" in SIT environment and change password
    When Click My Settings and select Manage security settings to modify the password
    When Vkey authorization for Payment transactions in the SIT environment
    When I click Confirm Button on the change password page
#    When Vkey authorization for Payment transactions in the SIT environment
    Then Password modified successfully check the status
    Given logon "INB-automation-SIT-change-password" in SIT environment and change password

  @sanity_pack_Templete_Download_Normally_SIT1
    #templete可以正常下载
  Scenario: Templete can be downloaded normally1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click My Downloads Btn
    When Templete can be downloaded normally

  @sanity_pack_Add_Single_Currency_SIT1
    #新增单个币种正流程
  Scenario:Add single currency is a positive process1
    Given logon "INB-automation-SIT-login2" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA             |
      |Current Account|
    And I choose the currency to open the account SGD
    When I select account permissions
    When Vkey authorization for Payment transactions in the SIT environment


  @sanity_pack_Add_MCA_Currency_SIT1
    #  MCA账户,默认选择SGD，SGD+USD开立
  Scenario:Add multi-currency positive process1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration Desk and select Account Management
    When I click account Opening
      |CA                     |
      |'Multi-Currency Account|
    And  I choose the currency to open USD
    When I select account permissions
    When Vkey authorization for Payment transactions in the SIT environment


  @sanity_pack_Check_Account_List_Local_Fund_Transfer_SIT1
  #check 账户列表Local fund transfer 可用
  Scenario: Account list SGD query positive process1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Query of account list information succeeded

  @sanity_pack_Check_Account_List_Local_Fund_Transfer_Available_SIT1
  #check 账户列表Local fund transfer 可用
  Scenario: Check account list Local fund transfer is available1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Check account list Local fund transfer is available

  @sanity_pack_Fixed_Deposits_Overview_Jump_Place_Fixed_Deposit_SIT1
  #Fixed Deposits overview跳转Place Fixed Deposit
  Scenario:Fixed Deposits overview jump Place Fixed Deposit1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When click Fixed Deposits First menu
    Then Fixed Deposits overview jump Place Fixed Deposit

  @sanity_pack_Fixed_Deposits_View_Details_SIT1
      #Fixed Deposits view details查看详情
  Scenario:Fixed Deposits view details view details1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When click Fixed Deposits First menu
    When Fixed Deposits view details view details


  @sanity_pack_Payment_Add_New_Payee_SIT1
    #Payment add a new payee
  Scenario:Add a new payee click modify to modify successfully1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Select Payments and click manage payments
    When Add a new payee in Payees
      |payee bank           |
      |BANK OF CHINA LIMITED|
    When Vkey authorization for Payment transactions in the SIT environment
    Then Add successfully and click modify to modify successfully
    When Vkey authorization for Payment transactions in the SIT environment


  @sanity_pack_Payment_Payees_Delete_SIT1
    #Payment payees delete
  Scenario:Add a new payee click delete to delete successfully1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Select Payments and click manage payments
    When Add a new payee in Payees
      |payee bank           |
      |BANK OF CHINA LIMITED|
    When Vkey authorization for Payment transactions in the SIT environment
    When Delete new payees data
    When Vkey authorization for Payment transactions in the SIT environment

  @sanity_pack_PayNow_Signing_Process_SIT1
      #PayNow签约
  Scenario:PayNow Signing Process1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I execute manage PayNow Profile transaction on the page
    When Vkey authorization for Payment transactions in the SIT environment

  @sanity_pack_PayNow_Signing_Off_SIT1
   #PayNow解约
  Scenario:PayNow Signing Off1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I sign and cancel the transaction on the page
    When Vkey authorization for Payment transactions in the SIT environment

  @sanity_pack_Modify_Mobile_Number_SIT1
    #修改用户手机号、用户权限，账号权限，用户对网银功能的权限
  Scenario:Modify the user's mobile phone number1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When I click on the Enterprise Administration as well user administration
    When I click modify info menu
      |emailAddress         |
      |bg@263.net           |
#    When Vkey authorization for Payment transactions in the SIT environment


  @sanity_pack_View_Operation_Log_SIT1
    #可查看到当前用户和该客户号下其他用户的操作日志
  Scenario: You can view the operation logs of the current user and other users under this customer number1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When You can view the operation logs of the current user and other users under this customer number
      |transaction type|
      |Login           |


  @sanity_pack_Download_XLS_CSV_XLSX_SIT1
    #选择Extract audit logs,分别点击download下的xls格式、csv格式、xlsx格式
  Scenario: Audit logs in three formats were downloaded successfully1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When Audit logs in three formats were downloaded successfully
      |transaction type|
      |Login           |

  @sanity_pack_Jump_To_SCF_SIT1
    #jump to SCF
  Scenario: jump to SCF1
    Given logon "INB-automation-SIT-login" in SIT environment and bypass Vkey
    When jump to SCF