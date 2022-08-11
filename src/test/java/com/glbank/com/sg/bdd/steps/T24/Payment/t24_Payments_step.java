package com.glbank.com.sg.bdd.steps.T24.Payment;

import com.glbank.com.sg.bdd.pages.T24.Payment.t24_Payments_page;
import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.paymentService_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import java.util.List;
import java.util.Objects;

import static com.glbank.com.sg.bdd.utils.FileUtils.readtxtFile;

public class t24_Payments_step extends ScenarioSteps {

    private t24_Payments_page logonPage;
    private BDDUtil bddUtil;
    private FileUtils fileUtils;
    private paymentService_step paymentServiceStep;
    public String t24Id;
    public String t24TransactionReference;
    public String t24FtNumber;
    public String getTransactionReferenceNum;
    public String getSenderReferenceNum;
    public String getTransactionCurrency;
    public String getInstructedCurrency;
    public String getTransactionAmount;
    public String getInstructedAmount;
    public String getChargeOption;
    public String getDebitAccountNum;
    public String getCreditAccountNum;
    public String getDebitAccountCurrency;
    public String getCreditAccountCurrency;
    public String getDebitAmount;
    public String getCreditAmount;
    public String getDebitCustomerRate;
    public String getDebitTreasuryRate;
    public String getOrderingAccount;
    public String getBeneficiaryAccount;
    public String getOrderingName;
    public String getBeneficiaryName;
    public String getOrderingAddress;
    public String getBeneficiaryAddress;
    public String getOrderingTown;
    public String nowDate = BDDUtil.getTimeNowThroughCalendar();
    public String currencyBought;
    public String amountBought;
    public String currencySold;
    public String amountSold;
    public String spotRate;
    public String spotLcyAmount;
    public String ourAccountRec;
    public String ourAccountPay;
    public String treasuryRate;
    public String lTranRef;
    public String fundsTransferDebitAccountNum;
    public String fundsTransferDebitCurrency;
    public String fundsTransferCreditCurrency;
    public String fundTransferCreditAccNo;
    public String fundsTransferCreditAmount;
    public String fundsTransferAmountDebited;
    public String fundsTransferAmoyntCredited;

    public void switchToFirstFrame(){
        getDriver().switchTo().frame(logonPage.switchToFirstFrame);
    }
    @Step
    public void inputBox(String cmd){
        logonPage.inputBox.clear();
        logonPage.inputBox.sendKeys(cmd);
        logonPage.searchBtn.click();
    }
    @Step
    public void jumpNewWindows(String title){
        bddUtil.switchToNewWindow();
        System.out.println(getDriver().getTitle());
        if (getDriver().getTitle().equals(title)){
            System.out.println("页面跳转成功");
        }
    }
    @Step
    public void serialNumberQueryingInformation() throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        logonPage.clickCleraSelectionBtn.click();
        logonPage.inputChannelId.clear();
        logonPage.inputChannelId.sendKeys(readtxtFile("t24","ChannelReferenceID"));
        logonPage.clickFindBtn.click();
        getDriver().manage().window().maximize();
        t24Id = logonPage.t24Id.getText();
        t24TransactionReference = logonPage.t24TransactionReference.getText();
        FileUtils.FileString4("t24",nowDate+"\n"+"ID:" + t24Id);
        FileUtils.FileString4("t24","TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }
    @Step
    public void switchToDefaultContent(){
        getDriver().switchTo().defaultContent();
    }
    @Step
    public void clickUserMenu(){
        switchToSecondFrame();
        logonPage.clickUserMenu.click();
    }
    @Step
    public void switchToSecondFrame(){
        getDriver().switchTo().frame(logonPage.switchToSecondFrame);
    }
    @Step
    public void clickPaymentsMenu(){
        logonPage.clickPayments.click();
    }
    @Step
    public void clickPaymentHubMenu(){
        logonPage.clickPaymentHubMenu.click();
    }
    @Step
    public void clickPaymentInquiriesMenu(){
        logonPage.clickPaymentInquiriesMenu.click();
    }
    @Step
    public void clickPaymentTransactionWiseMenu(){
        logonPage.clickPaymentTransactionWiseMenu.click();
    }
    @Step
    public void findFileSendersReference(){
        bddUtil.scrollWindowToElement(logonPage.findFileSendersReference);
        logonPage.fileSendersReferenceInput.clear();
        logonPage.fileSendersReferenceInput.sendKeys(t24TransactionReference);
        logonPage.getClickFindBtn.click();
    }
    @Step
    public void getFtNumber(){
        bddUtil.sleep(2);
        t24FtNumber = logonPage.getFtNumber.getText();
        FileUtils.FileString4("t24","t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        clickViewIcon();
    }
    @Step
    public void clickViewIcon(){
        logonPage.clickViewIcon.click();
    }
    @Step
    public void poCheckData(){
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        getTransactionReferenceNum = logonPage.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24","getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = logonPage.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24","getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = logonPage.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = logonPage.getInstructedCurrency.getText();
        FileUtils.FileString4("t24","getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = logonPage.getTransactionAmount.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = logonPage.getInstructedAmount.getText();
        FileUtils.FileString4("t24","getInstructedAmount:" + getInstructedAmount);
        getChargeOption = logonPage.getChargeOption.getText();
        FileUtils.FileString4("t24","getChargeOption:" + getChargeOption);
        getDebitAccountNum = logonPage.getDebitAccountNum.getText();
        FileUtils.FileString4("t24","getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = logonPage.getCreditAccountNum.getText();
        FileUtils.FileString4("t24","getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = logonPage.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24","getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = logonPage.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24","getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = logonPage.getDebitAmount.getText();
        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getCreditAmount = logonPage.getCreditAmount.getText();
        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = logonPage.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24","getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = logonPage.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24","getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = logonPage.getOrderingAccount.getText();
        FileUtils.FileString4("t24","getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = logonPage.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24","getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = logonPage.getOrderingName.getText();
        FileUtils.FileString4("t24","getOrderingName:" + getOrderingName);
        getBeneficiaryName = logonPage.getBeneficiaryName.getText();
        FileUtils.FileString4("t24","getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = logonPage.getOrderingAddress.getText();
        FileUtils.FileString4("t24","getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = logonPage.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = logonPage.getOrderingTown.getText();
        FileUtils.FileString4("t24","getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("t24","fxDetailAccountCurrency"));
        Assert.assertEquals(getInstructedCurrency, readtxtFile("t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getInstructedAmount, readtxtFile("t24","fxDetailTransactionAmount"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("t24", "fxDetailPaymentModeForCharges"), "The expenses shall be borne by each party")){
            System.out.println("Charge Option字段对比成功");
        }else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("t24", "fxDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")){
            System.out.println("Charge Option字段对比成功");
        }else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("t24", "fxDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")){
            System.out.println("Charge Option字段对比成功");
        }
        Assert.assertEquals(getDebitAccountNum, readtxtFile("t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getCreditAccountNum, readtxtFile("t24","fxDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("t24","fxDetailAccountCurrency"));
        Assert.assertEquals(getDebitAmount, readtxtFile("t24","fxDetailTransactionAmount"));
        Assert.assertEquals(getDebitCustomerRate,readtxtFile("t24", "fxDetailExchangeRate").toString().substring(13));
        Assert.assertEquals(getOrderingAccount, readtxtFile("t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getOrderingName, readtxtFile("t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("t24","fxDetailPayeeName"));
        logonPage.getClickChargeInformation.click();
        logonPage.getRoutingInformation.click();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }
    //获取AccountEntries
    @Step
    public void checkAccountingEntries(){
        logonPage.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        logonPage.clickInBox.click();
        logonPage.selectAccountingEntries.click();
        logonPage.clickSelectDrilldown.click();
    }
    //获取Outgoing Message
    @Step
    public void checkOutgoingMessage(){
        logonPage.clickInBox.click();
        logonPage.selectOutgoingMessage.click();
        logonPage.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (logonPage.notApplicableView.isVisible()){
            System.out.println("Outgoing没有生成数据！");
        }else if (logonPage.check20Field.isVisible()){
            Assert.assertEquals(getTransactionReferenceNum,logonPage.check20Field.getText().substring(4));
            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),logonPage.check32AField.getText().substring(11));
            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),logonPage.check33BField.getText().substring(5));
            Assert.assertEquals(getDebitCustomerRate.replace('.',','),logonPage.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum,logonPage.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount,logonPage.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption,logonPage.check71AField.getText().substring(5));
        }
        switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
    }
    //在Forex页面操作
    @Step
    public void searchForex(String forex){
        logonPage.inputBox.clear();
        logonPage.inputBox.sendKeys(forex);
        logonPage.searchBtn.click();
        bddUtil.switchToNewWindow();
        logonPage.forexSearchBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.scrollWindowToElement(logonPage.findLTranRef);
        logonPage.findLTranRefInputBox.clear();
        logonPage.findLTranRefInputBox.sendKeys(getTransactionReferenceNum);
        logonPage.getClickFindBtn.click();
        if (logonPage.forexPageNoData.isVisible()){
            bddUtil.closeWindow();
            bddUtil.switchToNewWindow();
            bddUtil.closeWindow();
            switchToSecondFrame();
            logonPage.clickTreasuryMenu.click();
            logonPage.clickForexMenu.click();
            logonPage.clickUnauthorizedForexDealsMenu.click();
            bddUtil.switchToNewWindow();
            switchToFirstFrame();
            getDriver().manage().window().maximize();
            List<WebElementFacade> amount = logonPage.AmountBought;
            List<WebElementFacade> detailsInformation = logonPage.detailInformation;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    detailsInformation.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            checkT24AndPo();
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> amend = logonPage.amendBtn;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            logonPage.validateDeal.click();
            logonPage.commitTheDeal.click();
            logonPage.clickAcceptOverrides.click();
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = logonPage.authoriseBtn;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            logonPage.clickAuthorisesADeal.click();
            getDriver().quit();
        }else {
            logonPage.clickForexDefaultListIcon.click();
        }
    }
    @Step
    public void checkT24AndPo(){
        currencyBought = logonPage.currencyBought.getText();
        FileUtils.FileString4("t24","currencyBought:" + currencyBought);
        amountBought = logonPage.amountBought.getText();
        FileUtils.FileString4("t24","amountBought:" + amountBought);
        currencySold = logonPage.currencySold.getText();
        FileUtils.FileString4("t24","currencySold:" + currencySold);
        amountSold = logonPage.amountSold.getText();
        FileUtils.FileString4("t24","amountSold:" + amountSold);
        spotRate = logonPage.spotRate.getText();
        FileUtils.FileString4("t24","spotRate:" + spotRate);
        spotLcyAmount = logonPage.spotLcyAmount.getText();
        FileUtils.FileString4("t24","spotLcyAmount:" + spotLcyAmount);
        ourAccountRec = logonPage.ourAccountRec.getText();
        FileUtils.FileString4("t24","ourAccountRec:" + ourAccountRec);
        ourAccountPay = logonPage.ourAccountPay.getText();
        FileUtils.FileString4("t24","ourAccountPay:" + ourAccountPay);
        treasuryRate = logonPage.treasuryRate.getText();
        FileUtils.FileString4("t24","treasuryRate:" + treasuryRate);
        lTranRef = logonPage.lTranRef.getText();
        FileUtils.FileString4("t24","lTranRef:" + lTranRef);
        Assert.assertEquals(getTransactionCurrency,currencyBought);
        Assert.assertEquals(getTransactionAmount,amountBought);
        Assert.assertEquals(getInstructedCurrency,currencySold);
        Assert.assertEquals(getDebitTreasuryRate,spotRate);
//        Assert.assertEquals(getTransactionAmount,spotLcyAmount);
//        Assert.assertEquals(getCreditAccountNum,ourAccountRec);
//        Assert.assertEquals(getDebitAccountNum,ourAccountPay);
        bddUtil.scrollWindowToElement(logonPage.treasuryRate);
        Assert.assertEquals(getDebitTreasuryRate,treasuryRate);
//        Assert.assertEquals(getTransactionReferenceNum,lTranRef);
    }
    @Step
    public void selectUnauthorizedForexDealsMenu() {
      switchToSecondFrame();
      logonPage.clickUserMenu.click();
      logonPage.clickTreasuryMenu.click();
      logonPage.clickForexMenu.click();
      logonPage.clickUnauthorizedForexDealsMenu.click();
      bddUtil.switchToNewWindow();
      switchToDefaultContent();
      switchToFirstFrame();
        getDriver().manage().window().maximize();
        List<WebElementFacade> amount = logonPage.AmountBought;
        List<WebElementFacade> amend = logonPage.amendBtn;
        for (int i = 0; i <amount.size();i++){
            if (amount.get(i).getText().equals(getTransactionAmount)){
                amend.get(i).click();
                break;
            }
        }
        switchToDefaultContent();
        switchToSecondFrame();
        logonPage.validateDeal.click();
        logonPage.commitTheDeal.click();
        logonPage.clickAcceptOverrides.click();
        switchToDefaultContent();
        switchToFirstFrame();
        List<WebElementFacade> authoriseBtn = logonPage.authoriseBtn;
        for (int i = 0; i <amount.size();i++){
            if (amount.get(i).getText().equals(getTransactionAmount)){
                authoriseBtn.get(i).click();
                break;
            }
        }
        switchToDefaultContent();
        switchToSecondFrame();
        logonPage.clickAuthorisesADeal.click();
    }
    @Step
    public void fundsTransfer(String cmd){
        inputBox(cmd);
        jumpNewWindows(cmd);
        logonPage.clickFundsTransfer.sendKeys(t24TransactionReference);
        logonPage.clickViewContractBtn.click();
    }
    @Step
    public void iWillMapThePageData(){
        fundsTransferDebitAccountNum = logonPage.fundsTransferDebitAccountNum.getText();
        FileUtils.FileString4("t24","fundsTransferDebitAccountNum:" + fundsTransferDebitAccountNum);
        fundsTransferDebitCurrency = logonPage.fundsTransferDebitCurrency.getText();
        FileUtils.FileString4("t24","fundsTransferDebitCurrency:" + fundsTransferDebitCurrency);
        fundsTransferCreditCurrency = logonPage.fundsTransferCreditCurrency.getText();
        FileUtils.FileString4("t24","fundsTransferCreditCurrency:" + fundsTransferCreditCurrency);
        fundTransferCreditAccNo = logonPage.fundTransferCreditAccNo.getText();
        FileUtils.FileString4("t24","fundTransferCreditAccNo:" + fundTransferCreditAccNo);
        fundsTransferAmountDebited = logonPage.fundsTransferAmountDebited.getText();
        FileUtils.FileString4("t24","fundsTransferAmountDebited:" + fundsTransferAmountDebited);
        fundsTransferAmoyntCredited = logonPage.fundsTransferAmoyntCredited.getText();
        FileUtils.FileString4("t24","fundsTransferAmoyntCredited:" + fundsTransferAmoyntCredited);
        Assert.assertEquals(fundsTransferDebitAccountNum,readtxtFile("t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(fundsTransferDebitCurrency,readtxtFile("t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(fundsTransferCreditCurrency,readtxtFile("t24","ChannelCreditAccountCurrency"));
        Assert.assertEquals(fundTransferCreditAccNo,readtxtFile("t24","ChannelCreditAccountNumber"));
    }
}
