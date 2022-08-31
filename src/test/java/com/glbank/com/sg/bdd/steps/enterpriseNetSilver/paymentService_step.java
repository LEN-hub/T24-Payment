package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.paymentService_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class paymentService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private paymentService_page paymentService_page;
    private String selectAccBth;
    public static String date = GenerateDate.todayDate();
    public String debitAccountName;
    public String debitAccountCurrency;
    public String debitAccountNumber;
    public String debitCompanyName;
    public String creditAccountName;
    public String creditAccountCurrency;
    public String creditAccountNumber;
    public String creditCompanyName;
    public String transactionAmount;
    public String purposeOfTransfer;
    public String referenceID;
    public String nowDate = BDDUtil.getTimeNowThroughCalendar();
    public String loginOtp;
    public String fxDetailBankName;
    public String fxDetailPayeeName;
    public String fxDetailAccountCurrency;
    public String fxDetailPayeeAccountNum;
    public String fxDetailExchangeRate;
    public String fxDetailTransactionAmount;
    public String fxDetailBeneficiaryBankBIC;
    public String fxDetailPayeeAddress;
    public String fxDetailPayeeCountry;
    public String fxDetailEstimatedProcessingFee;
    public String fxDetailPaymentModeForCharges;
    public String fxDetailPurposeOfTransfer;

    @Step
    public void transferAndRemittanceMenu(){
        if (paymentService_page.popWindowsTitle.isVisible()){
            paymentService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.transferAndRemittanceMenu).perform();
    }

    @Step
    public void sdgTransferToUsd(String rollOutAccount,String intoAccount){
        paymentService_page.transferMoney.click();
        paymentService_page.rollOutCurrencySelectWindows.click();
        List<WebElementFacade> currency = paymentService_page.rollOutAccountSGD;
        for (int i = 0; i< currency.size();i++){
            if (rollOutAccount.contains(currency.get(i).getText().substring(0,currency.get(i).getText().indexOf("/")).trim())){
                currency.get(i).click();
                break;
            }
        }
//        bddUtil.scrollWindowToElement(paymentService_page.rollOutAccountSGD).click();
        paymentService_page.secondPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> secondCurrency = paymentService_page.secondCurrencySelectSGD;
        for(int j = 0; j < secondCurrency.size(); j++){
            if (intoAccount.contains(secondCurrency.get(j).getText().substring(0,secondCurrency.get(j).getText().indexOf("/")).trim())){
                secondCurrency.get(j).click();
                break;
            }
        }
//        paymentService_page.secondCurrencySelectUSD.click();
        bddUtil.scrollWindowToElement(paymentService_page.clickNextBtn);
        paymentService_page.enterMoney.sendKeys(GenerateDate.today()+"."+randomTwoNum());
        paymentService_page.transferPurpose.click();
        paymentService_page.selectTransferPurpose.click();
        paymentService_page.clickNextBtn.click();
    }

    @Step
    public void accountTitleVerify(){
        if (paymentService_page.tipsTitle.isVisible()){
            paymentService_page.clickTipsContinueBtn.click();
        }
    }

    @Step
    public void clickSubmitBtn(){
//        if (paymentService_page.disabledSubmitBtn.isVisible()){
//            paymentService_page.clickRefreshBtn.click();
//        }
        bddUtil.scrollWindowToElement(paymentService_page.submitBtn).click();
    }

    @Step
    public void successTitleToFXLocalPayment() throws Exception {
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.serialNumber.isDisplayed();
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage();
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        debitCompanyName = paymentService_page.debitCompanyName.getText();
        FileUtils.FileString4("t24","ChannelDebitCompanyName:" + debitCompanyName);
        creditAccountName = paymentService_page.creditAccountName.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountName:" + creditAccountName);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        creditCompanyName = paymentService_page.creditCompanyName.getText();
        FileUtils.FileString4("t24","ChannelCreditCompanyName:" + creditCompanyName);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
    }

    @Step
    public void successTitle() throws Exception {
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.serialNumber.isDisplayed();
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment();
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        debitCompanyName = paymentService_page.debitCompanyName.getText();
        FileUtils.FileString4("t24","ChannelDebitCompanyName:" + debitCompanyName);
        creditAccountName = paymentService_page.creditAccountName.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountName:" + creditAccountName);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        creditCompanyName = paymentService_page.creditCompanyName.getText();
        FileUtils.FileString4("t24","ChannelCreditCompanyName:" + creditCompanyName);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
    }

    @Step
    public void domesticTransfer(String bankName, String accountName, String paymentAccount,  String tradeAmountSelect,String paymentInformation){
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
        paymentService_page.collectingBankPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectBank = paymentService_page.selectSGD;
        for (int j = 0; j< selectBank.size(); j++){
            if (bankName.equals(selectBank.get(j).getText())){
                bddUtil.scrollWindowToElement(selectBank.get(j)).click();
                break;
            }
        }
        paymentService_page.accountName.sendKeys(accountName);
        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        paymentService_page.transferAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    @Step
    public void otherDomesticTransfer(String bankName,String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect,String paymentInformation){
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
        paymentService_page.collectingBankPopWindows.click();
        List<WebElementFacade> selectTitle = paymentService_page.selectTitle;
        for (int j = 0; j < selectTitle.size(); j++){
            if (bankName.equals(selectTitle.get(j).getText())){
                selectTitle.get(j).click();
                break;
            }
        }
//        paymentService_page.overseasTrasferAccount.click();
        paymentService_page.accountName.sendKeys(accountName);
        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        paymentService_page.transferAmount.sendKeys(transferAmount);
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    @Step
    public void rollOutDate(String selectDate,String trasferOutDate){
        paymentService_page.dateInputBox.clear();
        paymentService_page.dateInputBox.sendKeys(trasferOutDate);
        paymentService_page.textTitle.click();
        paymentService_page.cycleTransferCheckBox.click();
        paymentService_page.popWindowsSelect.click();
        List<WebElementFacade> selectdate = paymentService_page.selectDate;
        for (int i = 0; i < selectdate.size(); i++){
            if (selectDate.equals(selectdate.get(i).getText())){
                selectdate.get(i).click();
                break;
            }
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
//        a:for (int j = 0; j < rollOutDate.size(); j++){
//            if (sdf.format(new Date()).charAt(8) == '0' || sdf.format(new Date()).charAt(8) == '1' || sdf.format(new Date()).charAt(8) == '2' || sdf.format(new Date()).charAt(8) == '3'){
//                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
//                    rollOutDate.get(j).click();
//                    break;
//                }
//            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
//                paymentService_page.nextMonth.click();
//                for (int x = 0;x < rollOutDate.size(); x++){
//                    if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(x).getText())){
//                        rollOutDate.get(x).click();
//                        break a;
//                    }
//                }
//            }
//        }
    }

    @Step
    public void rollOutDateTwentyNine(String selectDate){
        paymentService_page.dateInputBox.click();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
        a:for (int j = 0; j < rollOutDate.size(); j++){
            if (sdf.format(new Date()).charAt(8) == '0' || sdf.format(new Date()).charAt(8) == '1' || sdf.format(new Date()).charAt(8) == '2' || sdf.format(new Date()).charAt(8) == '3'){
                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
                    if (!sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                        rollOutDate.get(j).click();
                        break a;
                    }else if(sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                        paymentService_page.nextMonth.click();
                        for (int x = 0;x < rollOutDate.size(); x++){
                            if (sdf.format(getNextWeekMonday(new Date())).charAt(8) == '0') {
                                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())) {
                                    rollOutDate.get(x).click();
                                    break a;
                                }
                            }
                        }
                    }
                }
            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
                paymentService_page.nextMonth.click();
                for (int n = 0;n < rollOutDate.size(); n++){
                    if (sdf.format(new Date()).charAt(8) == '0') {
                        if (sdf.format(getNextWeekMonday(new Date())).substring(8, 10).equals(rollOutDate.get(j).getText())) {
                            rollOutDate.get(n).click();
                            break a;
                        }
                    }
                }
            }
        }
        paymentService_page.cycleTransferCheckBox.click();
        paymentService_page.popWindowsSelect.click();
        List<WebElementFacade> selectdate = paymentService_page.selectDate;
        for (int i = 0; i < selectdate.size(); i++){
            if (selectDate.equals(selectdate.get(i).getText())){
                selectdate.get(i).click();
                break;
            }
        }
    }

    public void enterPeriods(String periods){
        paymentService_page.appointmentPeriods.sendKeys(periods);
    }

    public void clickNextBtn(){
        paymentService_page.nextBtn.click();
    }

    @Step
    public void checkCollectionName(){
        if (paymentService_page.popwindowsTitleTransferInformation.isVisible()){
            paymentService_page.continueButtonClick.click();
        }
        bddUtil.sleep(3);
//        Assert.assertEquals(accountName,paymentService_page.checkCollectionName.getText());
//        Assert.assertEquals(paymentAccount,paymentService_page.checkPaymentAccount.getText());
//        Assert.assertEquals(transferAmount,paymentService_page.checkTransferAmount.getText());
//        Assert.assertEquals(tradeAmountSelect,paymentService_page.checkTradeAmountSelect.getText());
        paymentService_page.confirmBtn.click();
    }

    @Step
    public void confirmInformationNextBtn(){
        paymentService_page.confirmInformationNextBtn.click();
    }

    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

    public static Date getNextWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 7);
        return cal.getTime();
    }

    @Step
    public void transferSuccessTitle(){
        paymentService_page.transferSuccessTitle.isDisplayed();
        paymentService_page.checkDetailsBtn.click();
    }

    @Step
    public void checkAccountDetails(String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect){
        Assert.assertEquals(accountName,paymentService_page.getAccountName.getText());
        Assert.assertEquals(paymentAccount,paymentService_page.getAccountNumber.getText());
//        Assert.assertEquals(transferAmount,paymentService_page.getAccountMount.getText());
        Assert.assertEquals(tradeAmountSelect,paymentService_page.getAccountUse.getText());
    }

    @Step
    public void getPopWindowsTitle(){
        if (paymentService_page.getPopWindowsTitle.isVisible()){
            paymentService_page.continueBtn.click();
        }
    }

//境外转账（SGD--USD）

    public void overseasTransfer(){paymentService_page.overseasTransfer.click();}

    public void selectPaymentAccount(String selectAccount){
        paymentService_page.accountBox.click();
        bddUtil.sleep(3);
        List<WebElementFacade> Acc = paymentService_page.selectAccount;
        for (int i = 0; i < Acc.size(); i++){
            if (selectAccount.equals(Acc.get(i).getText())){
                Acc.get(i).click();
                break;
            }
        }
        bddUtil.sleep(3);
    }
//    public void clickCurrency(String payeeCurrency){
//        paymentService_page.clickCurrencyBox.click();
//        List<WebElementFacade> payee = paymentService_page.payeeCurrency;
//        for (int i = 0; i <payee.size(); i++){
//            if (payeeCurrency.equals(payee.get(i).getText())){
//                payee.get(i).click();
//                break;
//            }
//        }
//        bddUtil.sleep(5);}

    public String randomTwoNum(){
        Random random = new Random();
        int num = random.nextInt(99);
        String Amount = String.format("%02d",num);
        return Amount;
    }


    public void enterAmount(){
        paymentService_page.enterAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
    }

    public void selectAccBth(String selectAccBth){
            paymentService_page.currencyBox.click();
            bddUtil.sleep(3);
        List<WebElementFacade> selectAcc = paymentService_page.selectAccBth;
        for (int i = 0; i < selectAcc.size(); i++){
            if (selectAccBth.equals(selectAcc.get(i).getText())){
                selectAcc.get(i).click();
                break;
            }
        }
    }

    public void sendPaymentAccount(String sendPaymentAccount){paymentService_page.sendPaymentAccount.sendKeys(sendPaymentAccount);}

    public void namePayee(String NamePayee){paymentService_page.NamePayee.sendKeys(NamePayee);}

    public void collectingBox(){
        paymentService_page.collectingBankBox.click();
        bddUtil.sleep(3);
    }

    public void collectingBankBox(String collectingBank) {
        paymentService_page.selectBank.click();
        paymentService_page.searchBox.sendKeys(collectingBank);
        paymentService_page.serachButton.click();
        paymentService_page.radioSelect.click();
        paymentService_page.getConfirmBtn.click();
//        List<WebElementFacade> bank = paymentService_page.collectingBank;
//        for (int i = 0; i < bank.size(); i++) {
//            if (collectingBank.equals(bank.get(i).getText())) {
//                bank.get(i).click();
//                break;
//            }
//        }
    }

    public void payeeAdd(String payeeAdd){
        paymentService_page.payeeAdd.sendKeys(payeeAdd);}

    public void payeeCountriesEnCd(String payeeCountries) {
        paymentService_page.payeeCountriesEnCdBox.click();
        bddUtil.sleep(5);
        List<WebElementFacade> countries = paymentService_page.payeeCountries;
        for (int i = 0; i < countries.size(); i++) {
            if (payeeCountries.equals(countries.get(i).getText())) {
                countries.get(i).click();
                break;
            }
        }
    }
    public void remittancePostscriptContent(String remittancePostscriptContent){
        paymentService_page.remittancePostscriptContent.sendKeys(remittancePostscriptContent);}

    public void expense(String expense ,String expenseEnglish) {
        paymentService_page.expenseBox.click();
        bddUtil.sleep(5);
        List<WebElementFacade> bears = paymentService_page.expense;
        for (int i = 0; i < bears.size(); i++) {
              if (expense.equals(bears.get(i).getText())) {
                    bears.get(i).click();
                    break;
                }
            }
        }

    public void paymentAttributeCd(String selectPaymentAttributeCd){
        paymentService_page.paymentAttributeCdBox.click();
        bddUtil.sleep(3);
        List<WebElementFacade> AttributeCd = paymentService_page.selectPaymentAttributeCd;
        for (int i = 0; i < AttributeCd.size(); i++) {
            if (selectPaymentAttributeCd.equals(AttributeCd.get(i).getText())) {
                AttributeCd.get(i).click();
                break;
            }
        }
    }

    public void clickNextBox(){paymentService_page.clickNextBox.click();}

    public void staging() {
        accountTitleVerify();
        paymentService_page.staging.click();
    }

    public void selectSumB(){
        paymentService_page.selectSumB.click();
    }

    @Step
    public void vkeyAuthorizationSIT(){
        paymentService_page.clickNextButton.click();
        bddUtil.sleep(3);
        if (paymentService_page.clickNextButton.isVisible()){
            paymentService_page.clickNextButton.click();
        }
        paymentService_page.clickSendVerificationBtn.click();
        bddUtil.sleep(1);
        loginOtp = getDriver().switchTo().alert().getText().substring(7, 13);
        System.out.println(loginOtp);
        getDriver().switchTo().alert().accept();
        paymentService_page.inputVerificationCode.sendKeys(loginOtp);
        paymentService_page.clickOkBtn.click();
    }
    @Step
    public void getInnerPaymentDataOnChannelPage() throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ", "");
        FileUtils.FileString4("t24", nowDate + "\n" + "ChannelReferenceID:" + referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX();
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24", "ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24", "ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24", "ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
    }
    @Step
    public void getFxPaymentDataOnChannelPage() throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT();
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24","ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        fxDetailPayeeAccountNum = paymentService_page.fxDetailPayeeAccountNum.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAccountNum:" + fxDetailPayeeAccountNum);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        fxDetailTransactionAmount = paymentService_page.fxDetailTransactionAmount.getText();
        FileUtils.FileString4("t24","ChannelDetailTransactionAmount:" + fxDetailTransactionAmount);
        bddUtil.scrollWindowToElement(paymentService_page.fxDetailBeneficiaryBankBIC);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT();
        fxDetailBeneficiaryBankBIC = paymentService_page.fxDetailBeneficiaryBankBIC.getText();
        FileUtils.FileString4("t24","ChannelDetailBeneficiaryBankBIC:" + fxDetailBeneficiaryBankBIC);
        fxDetailPayeeAddress = paymentService_page.fxDetailPayeeAddress.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAddress:" + fxDetailPayeeAddress);
        fxDetailEstimatedProcessingFee = paymentService_page.fxDetailEstimatedProcessingFee.getText();
        FileUtils.FileString4("t24","ChannelDetailEstimatedProcessingFee:" + fxDetailEstimatedProcessingFee);
        fxDetailPaymentModeForCharges = paymentService_page.fxDetailPaymentModeForCharges.getText();
        FileUtils.FileString4("t24","ChannelDetailPaymentModeForCharges:" + fxDetailPaymentModeForCharges);
        fxDetailPurposeOfTransfer = paymentService_page.fxDetailPurposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelDetailPurposeOfTransfer:" + fxDetailPurposeOfTransfer);
    }
    @Step
    public void getFxPaymentMXDataOnChannelPage() throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX();
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24","ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        fxDetailPayeeAccountNum = paymentService_page.fxDetailPayeeAccountNum.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAccountNum:" + fxDetailPayeeAccountNum);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        fxDetailTransactionAmount = paymentService_page.fxDetailTransactionAmount.getText();
        FileUtils.FileString4("t24","ChannelDetailTransactionAmount:" + fxDetailTransactionAmount);
        bddUtil.scrollWindowToElement(paymentService_page.fxDetailBeneficiaryBankBIC);
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX();
        fxDetailBeneficiaryBankBIC = paymentService_page.fxDetailBeneficiaryBankBIC.getText();
        FileUtils.FileString4("t24","ChannelDetailBeneficiaryBankBIC:" + fxDetailBeneficiaryBankBIC);
        fxDetailPayeeAddress = paymentService_page.fxDetailPayeeAddress.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAddress:" + fxDetailPayeeAddress);
        fxDetailEstimatedProcessingFee = paymentService_page.fxDetailEstimatedProcessingFee.getText();
        FileUtils.FileString4("t24","ChannelDetailEstimatedProcessingFee:" + fxDetailEstimatedProcessingFee);
        fxDetailPaymentModeForCharges = paymentService_page.fxDetailPaymentModeForCharges.getText();
        FileUtils.FileString4("t24","ChannelDetailPaymentModeForCharges:" + fxDetailPaymentModeForCharges);
        fxDetailPurposeOfTransfer = paymentService_page.fxDetailPurposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelDetailPurposeOfTransfer:" + fxDetailPurposeOfTransfer);
    }
    @Step
    public void InspectionStatus(String selectAccount,String sendPaymentAccount) {
        if (paymentService_page.BankProcess.getText().equals("银行处理中") || paymentService_page.BankProcess.getText().equals("bank in processing")) {
            CommonUtil.waiting(3000);
            paymentService_page.checkDetail.click();
        }
        CommonUtil.waiting(3000);
        Assert.assertEquals(selectAccount, paymentService_page.checkSelectAccount.getText());
        Assert.assertEquals(sendPaymentAccount, paymentService_page.checkSendPaymentAccount.getText());
    }


    public void saveTemplate() {paymentService_page.saveTemplate.click();}

    public void templateName(String templateName) {paymentService_page.templateName.sendKeys(templateName);}

    public void saveB() {paymentService_page.save.click();}

    public void theMenu() {
        Actions action = new Actions(getDriver());
        action.moveToElement(paymentService_page.theMenu).perform();
    }

    public void templateImport() {
        paymentService_page.templateImport.click();
        CommonUtil.waiting(5000);
    }

 //贸易融资
    public void transportMethod(String transportMethod){
        paymentService_page.transportMethodBox.click();
        CommonUtil.waiting(3000);
        List<WebElementFacade> Transportation = paymentService_page.transportMethod;
        for (int i = 0; i < Transportation.size(); i++) {
             if (transportMethod.equals(Transportation.get(i).getText())) {
                 Transportation.get(i).click();
                 break;
         }
     }
 }

    public void shipNm(String shipNm){paymentService_page.shipNm.sendKeys(shipNm);}

    public void shipNo(String shipNo){paymentService_page.shipNo.sendKeys(shipNo);}

    public void shipmentAddR(String shipmentAddR){paymentService_page.shipmentAddR.sendKeys(shipmentAddR);}

    public void trafficAddR(String trafficAddR){paymentService_page.trafficAddR.sendKeys(trafficAddR);}

    public void goodInvolved(String goodInvolved){paymentService_page.goodInvolved.sendKeys(goodInvolved);}

    public void invoice() {
        paymentService_page.invoice.click();
        CommonUtil.waiting(5000);
        bddUtil.fileUpload();
        CommonUtil.waiting(3000);
    }

    public void billLading() {
        paymentService_page.billLading.click();
        CommonUtil.waiting(5000);
        bddUtil.fileUpload();
        CommonUtil.waiting(3000);
    }

    public void SINGAPORE(){
        paymentService_page.SINGAPORE.click();
    }

    public void beginValidation() {
        if (paymentService_page.popTitle.isVisible()) {
            paymentService_page.begin.click();
        }

    }
}
