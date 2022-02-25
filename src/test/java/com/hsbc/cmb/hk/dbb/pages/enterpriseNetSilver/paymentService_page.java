package com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class paymentService_page extends PageObject {

    @FindBy(xpath = "//div[@class='el-message-box__title']/span")
    public WebElementFacade popWindowsTitle;

    @FindBy(xpath = "//div[@class='el-message-box__btns']/button[2]")
    public WebElementFacade popWindowsOk;

    @FindBy(xpath = "//ul[@class='el-menu--horizontal el-menu']/li[5]//span")
    public WebElementFacade transferAndRemittanceMenu;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[2]")
    public WebElementFacade transferMoney;

    @FindBy(xpath = "//nav[@id='banklist']//a[text()='ABCD']")
    public WebElementFacade selectTitle;

    @FindBy(xpath = "//div[@class='bank_list']/div[1]//div[@class='name'][1]")
    public WebElementFacade overseasTrasferAccount;

    @FindBy(xpath = "//div[@class='list']/div[1]/p[3]")
    public WebElementFacade domesticTransfer;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::form/child::div[2]/child::div[2]/child::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade collectingBankPopWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//ul/li")
    public List<WebElementFacade> selectSGD;

    @FindBy(xpath = "//div[@class='mandatory']/following-sibling::form/child::div[2]/child::div[2]/child::div[2]//input")
    public WebElementFacade accountName;

    @FindBy(xpath = "//label[@for='payeeAcctNo']/following-sibling::div//input")
    public WebElementFacade paymentAccount;

    @FindBy(xpath = "//label[@for='tradeAmont']/following-sibling::div//input")
    public WebElementFacade transferAmount;

    @FindBy(xpath = "//label[@for='tradeAmont']/parent::div/following-sibling::div[1]//span[@class='el-input__suffix-inner']/i")
    public WebElementFacade tradeAmountPopWindows;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start']//ul/li")
    public List<WebElementFacade> tradeAmountSelectFirst;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[6]//div[@class='btn_box']")
    public WebElementFacade nextBtn;

    @FindBy(xpath = "//label[@for='payerAcctObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade rollOutCurrency;

    @FindBy(xpath = "//label[@for='payerAcctObj']/following-sibling::div[1]//span[@class='el-input__suffix-inner']")
    public WebElementFacade rollOutCurrencySelectWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li/span")
    public List<WebElementFacade> rollOutAccountSGD;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[2]//span[@class='el-input__suffix-inner']")
    public WebElementFacade secondPopWindows;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li/span")
    public List<WebElementFacade> secondCurrencySelectSGD;

    @FindBy(xpath = "//label[@for='tradeAmont']/following-sibling::div//input")
    public WebElementFacade enterMoney;

    @FindBy(xpath = "//label[@for='tradePurpose']/following-sibling::div//span[@class='el-input__suffix-inner']")
    public WebElementFacade transferPurpose;

    @FindBy(xpath = "//div[@x-placement='bottom-start' or @x-placement='top-start']//li[1]/span")
    public WebElementFacade selectTransferPurpose;

    @FindBy(xpath = "//form[@class='el-form el-form--label-left']/div[6]//div[@class='ui-button-inner']")
    public WebElementFacade clickNextBtn;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]")
    public WebElementFacade accountTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//span[@class='el-dialog__title']")
    public WebElementFacade tipsTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__body']//span[@class='dialog-footer']/div[2]//div[@class='btn_box']")
    public WebElementFacade clickTipsContinueBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='el-col el-col-24']/div[2]//div[@class='btn_box']")
    public WebElementFacade submitBtn;

    @FindBy(xpath = "//div[@class='result-info']")
    public WebElementFacade successTitle;

    @FindBy(xpath = "//div[@class='num']")
    public WebElementFacade serialNumber;

    @FindBy(xpath = "//div[@class='status']")
    public WebElementFacade statusSuccess;

    @FindBy(xpath = "//div[@class='el-col el-col-17']/div[2]/div")
    public WebElementFacade checkDetails;

    @FindBy(xpath = "//div[@class='body']/parent::div/preceding-sibling::div/span")
    public WebElementFacade popwindowsTitleTransferInformation;

    @FindBy(xpath = "//div[@class='body']//span[@class='dialog-footer']/div[2]//div[@class='btn_box']")
    public WebElementFacade continueButtonClick;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[2]/div[2]/div[2]/div[1]/div[1]/div[@class='con-content']")
    public WebElementFacade checkCollectionName;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[2]/div[2]/div[2]/div[1]/div[2]/div[@class='con-content']")
    public WebElementFacade checkPaymentAccount;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[3]/div[2]/div[2]/div[1]/div[1]/div[@class='con-content']")
    public WebElementFacade checkTransferAmount;

    @FindBy(xpath = "//div[@class='detail_page-container']/div[3]/div[2]/div[2]/div[3]/div[2]/div[@class='con-content']")
    public WebElementFacade checkTradeAmountSelect;

    @FindBy(xpath = "//div[@class='detail_page-container']/following-sibling::div//div[@class='ui-button primary common']//div[@class='btn_box']")
    public WebElementFacade confirmBtn;

    @FindBy(xpath = "//div[@class='demo-tips']/div[4]//div[@class='btn_box']")
    public WebElementFacade confirmInformationNextBtn;

    @FindBy(xpath = "//div[@x-placement='top-start' or @x-placement='bottom-start' ]//table[@class='el-date-table']/tbody/tr/td[@class!='normal disabled'  and @class != 'prev-month' and @class != 'prev-month disabled' and @class !='next-month']//span")
    public List<WebElementFacade> rollOutDate;

    @FindBy(xpath = "//label[@for='appointmentDdate']/following-sibling::div//input")
    public WebElementFacade dataInputBox;

    @FindBy(xpath = "//form/div[3]/div[2]//div[@class='el-form-item__content']//span[@class='el-checkbox__inner']")
    public WebElementFacade cycleTransferCheckBox;

    @FindBy(xpath = "//button[@aria-label='下个月']")
    public WebElementFacade nextMonth;

    @FindBy(xpath = "//label[@for='contractPeriodTypObj']/following-sibling::div//i")
    public WebElementFacade popWindowsSelect;

    @FindBy(xpath = "//span[text()='Weekly']/parent::li/parent::ul/li")
    public List<WebElementFacade> selectDate;

    @FindBy(xpath = "//label[@for='contractPeriodTypObj']/parent::div/following-sibling::div[1]//input")
    public WebElementFacade appointmentPeriods;

    @FindBy(xpath = "//div[@class='result-info']")
    public WebElementFacade transferSuccessTitle;

    @FindBy(xpath = "//div[@class='result-container']/div[2]//div[@class='ui-button secondary common'][2]//div[@class='btn_box']")
    public WebElementFacade checkDetailsBtn;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][2]//div[@class='el-col el-col-8'][1]/div[@class='con-content']")
    public WebElementFacade getAccountName;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][2]//div[@class='el-col el-col-8'][2]/div[@class='con-content']")
    public WebElementFacade getAccountNumber;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][3]//div[@class='el-row'][1]/div[@class='el-col el-col-8'][1]/div[@class='con-content']")
    public WebElementFacade getAccountMount;

    @FindBy(xpath = "//div[@class='ui-container-full__body']//div[@class='detail_page-block'][3]//div[@class='el-row'][3]/div[@class='el-col el-col-8'][2]/div[@class='con-content']")
    public WebElementFacade getAccountUse;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__header']/span")
    public WebElementFacade getPopWindowsTitle;

    @FindBy(xpath = "//div[@class='el-dialog__wrapper has-icon-small']//div[@class='el-dialog__body']/div[2]//div[@class='ui-button dialog_btn primary common']//div[@class='btn_box']")
    public WebElementFacade continueBtn;

//境外转账（SGD--USD)

   @FindBy(xpath = "//div[@class='list']/div[1]/p[4]//span")
    public WebElementFacade overseasTransfer;  //点击境外转账

   @FindBy(xpath = "//div[@class='el-form-item is-success is-required el-form-item--medium']/div//i[@class='el-select__caret el-input__icon el-icon-arrow-up']")
    public WebElementFacade accountBox; //点击账户选择下拉框

   @FindBy(xpath = "//span[text()='11020006552']")
    public WebElementFacade selectAccount;  //选择账户

    //加feature语句

    @FindBy(xpath = "//div[@class='el-form-item is-success is-required el-form-item--medium']/following-sibling::div[3]//input")
    public WebElementFacade enterAmount; //输入金额 输入

    //加feature语句


    @FindBy(xpath = "//label[@for='tradeCurrencyTypeCd']/following-sibling::div//i")
    public WebElementFacade currencyBox; //汇币下拉框

    @FindBy(xpath = "//div[@class='el-dialog__wrapper pdf-dialog']/following-sibling::div[4]//li[14]/span")
    public WebElementFacade selectUsd; //选择美元

    //加feature语句


    @FindBy(xpath = "//label[@for='payeeAcctNo']/following-sibling::div//input")
    public WebElementFacade sendPaymentAccount;  //输入收款账户 输入

    @FindBy(xpath = "//label[@for='payeeNm']/following-sibling::div//input")
    public WebElementFacade NamePayee;  //收款人名称 输入

//    @FindBy(xpath = "//label[@for='payeeBankNm']/following-sibling::div//i")
//    public WebElementFacade CollectingBankBox;  //收款银行下拉框
//
//    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']/table//tbody/tr[3]//span[@class='el-radio__inner']")
//    public WebElementFacade CollectingBank;  //选择收款银行
//
//    @FindBy(xpath = "//div[@class='el-table__body-wrapper is-scrolling-none']/ancestor::div[@class='body']/following-sibling::div/span/div[2]//div[@class='btn_box']")
//    public WebElementFacade clickYes; //点击确认

    @FindBy(xpath = "//label[@for='payeeAddr']/following-sibling::div//input")
    public WebElementFacade payeeAdd;  //收款人地址 输入

    @FindBy(xpath = "//label[@for='payeeCountriesEnCd']/following-sibling::div//i")
    public WebElementFacade payeeCountriesEnCdBox;  //收款国家下拉框

    @FindBy(xpath = "//span[text()='UNITED STATES']")
    public WebElementFacade usd; //美国

    @FindBy(xpath = "//label[@for='remittancePostscriptContent']/following-sibling::div/div/textarea")
    public WebElementFacade remittancePostscriptContent;//汇款留言 输入

    //加feature语句


    @FindBy(xpath = "//label[@for='costFeeAssumeCd']/following-sibling::div//i")
    public WebElementFacade expenseBox; // 费用承担下拉框

    @FindBy(xpath = "//span[text()='所有费用由汇款人承担' or @text()='All expenses shall be borne by the remitter' ]")
    public WebElementFacade expense; //费用承担

    //

    @FindBy(xpath = "//label[@for='paymentAttributeCd']/following-sibling::div//i")
    public WebElementFacade paymentAttributeCd;  //付汇性质下拉框

    @FindBy(xpath = "//span[text()='Business Expenses']")
    public WebElementFacade selectPaymentAttributeCd;  //随机选择付汇性质

    @FindBy(xpath = "//div[@class='el-col el-col-18']/div[3]/div/div")
    public  WebElementFacade clickNextBox;  //下一步

//USD--SGD
    @FindBy(xpath = "//label[@for='currencyTypeCd']/following-sibling::div//i")
    public WebElementFacade clickCurrencyBox;  //点击币种下拉框

    @FindBy(xpath = "//div[@x-placement='bottom-start']//span[text()='USD' or @x-placement='top-start']//span[text()='USD']")
    public WebElementFacade selectUSD;  //选择USD

    @FindBy(xpath = "//div[@x-placement='bottom-start']//span[text()='SGD' or @x-placement='top-start']//span[text()='SGD']")
    public WebElementFacade selectSgd;//收款币种选择SGD

    @FindBy(xpath = "//span[text()='费用各自承担' or @text()='All expenses shall be borne by the remitter' ]")
    public WebElementFacade expenseBth;



//div[@id='app']/following-sibling::div[@x-placement='bottom-start' or @x-placement='top-start' ]//span

//div[@x-placement='bottom-start']//span[text()='USD' or @x-placement='top-start']//span[text()='USD']














}
