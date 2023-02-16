package com.glbank.com.sg.bdd.steps.T24.Payment;

import cn.hutool.core.date.DateUtil;
import com.glbank.com.sg.bdd.pages.T24.Payment.t24_Payments_page;
import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.paymentService_step;
import com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.WordUtils;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.glbank.com.sg.bdd.utils.FileUtils.readtxtFile;
import static org.junit.Assert.assertEquals;

public class t24_Payments_step extends ScenarioSteps {

    private t24_Payments_page t24_payments_page;
    private BDDUtil bddUtil;
    private FileUtils fileUtils;
    private paymentService_step paymentServiceStep;
    @Steps
    private T24_Logon_step logon_steps;
    public static String envTag;

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
    public Double doubleSum;
    public int intSum;
    public Double doubleTransactionAmount;
    public int intTransactionAmount;


    public void switchToFirstFrame(){
        getDriver().switchTo().frame(t24_payments_page.switchToFirstFrame);
    }
    @Step
    public void inputBox(String cmd){
        t24_payments_page.inputBox.clear();
        t24_payments_page.inputBox.sendKeys(cmd);
        t24_payments_page.searchBtn.click();
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
    public void serialNumberQueryingInformation(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("aotopay/t24","ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        FileUtils.FileString4("t24",nowDate+"\n"+"ID:" + t24Id);
        FileUtils.FileString4("t24","TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }
    @Step
    public void serialNumberQueryingInformationDifferentCurrency(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24","ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        FileUtils.FileString4("t24",nowDate+"\n"+"ID:" + t24Id);
        FileUtils.FileString4("t24","TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }

    @Step
    public void serialNumberQueryingInformationOnLocalPayment(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys("230215000000027");
//        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24","ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        Assert.assertEquals("PROCESSED",t24_payments_page.checkT24Status.getText());
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        FileUtils.FileString4("t24",nowDate+"\n"+"ID:" + t24Id);
        FileUtils.FileString4("t24","TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }


    @Step
    public void serialNumberQueryingInformationMxMessage(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24","ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        FileUtils.FileString4("t24",nowDate+"\n"+"ID:" + t24Id);
        FileUtils.FileString4("t24","TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }
    public void serialNumberQueryingInformationToLocalPayment(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24","ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
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
        t24_payments_page.clickUserMenu.click();
    }
    @Step
    public void switchToSecondFrame(){
        getDriver().switchTo().frame(t24_payments_page.switchToSecondFrame);
    }
    @Step
    public void clickPaymentsMenu(){
        bddUtil.sleep(2);
        t24_payments_page.clickPayments.click();
    }

    @Step
    public void clickProductsMenu(){
        bddUtil.sleep(2);
        t24_payments_page.clickProducts.click();
    }

    @Step
    public void clickFindAccountMenu(){
        t24_payments_page.clickFindAccount.click();
    }
    @Step
    public void clickPaymentHubMenu(){
        t24_payments_page.clickPaymentHubMenu.click();
    }
    @Step
    public void clickPaymentInquiriesMenu(){
        t24_payments_page.clickPaymentInquiriesMenu.click();
    }
    @Step
    public void clickPaymentTransactionWiseMenu(){
        t24_payments_page.clickPaymentTransactionWiseMenu.click();
    }
    @Step
    public void findFileSendersReference(){
        bddUtil.scrollWindowToElement(t24_payments_page.findFileSendersReference);
        t24_payments_page.inputDate.clear();
        t24_payments_page.fileSendersReferenceInput.clear();
//        t24_payments_page.fileSendersReferenceInput.sendKeys("PI230440MV9HWBC5");
        t24_payments_page.fileSendersReferenceInput.sendKeys(t24TransactionReference);
        t24_payments_page.getClickFindBtn.click();
    }
    @Step
    public void clickFindBtn(){
        bddUtil.scrollWindowToElement(t24_payments_page.findFileSendersReference);
        t24_payments_page.inputDate.clear();
        t24_payments_page.fileSendersReferenceInput.clear();
        t24_payments_page.fileSendersReferenceInput.sendKeys(paymentService_step.serialNumber);
//        t24_payments_page.fileSendersReferenceInput.sendKeys("PI230330CY0BPY1M");
        t24_payments_page.getClickFindBtn.click();
        getDriver().manage().window().maximize();
    }

    @Step
    public void checkDeductionAmount(){
        t24_payments_page.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectFeesApplied.click();
        t24_payments_page.clickSelectDrilldown.click();
        bddUtil.sleep(2);
        switchToDefaultContent();
        switchToSecondFrame();
        System.out.println(t24_payments_page.getAmount.getText());
        if (t24_payments_page.getAmount.getText().contains(".")){
            doubleSum = Double.valueOf(t24_payments_page.getAmount.getText());
        }else {
            intSum = Integer.parseInt(t24_payments_page.getAmount.getText());
        }
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }

    @Step
    public void interfaceReturnInformationQuery(){
        if (t24_payments_page.getStatus.getText().equals("677") || t24_payments_page.getStatus.getText().equals("687") || t24_payments_page.getStatus.getText().equals("999") || t24_payments_page.getStatus.getText().equals("404")){
            System.out.println("交易成功！");
        }else {
            System.out.println("交易失败！");
        }
    }

    @Step
    public void closeAllTabJumpToHomePage(){
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        switchToSecondFrame();
    }

    @Step
    public void transactionDetailsCheckUSD_USD(String chargeOption) {
        clickViewIcon();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        Assert.assertEquals(t24_payments_page.getChargeOption.getText(), chargeOption);
    }

    @Step
    public void checkCurrency() {
        Assert.assertEquals(t24_payments_page.getCreditAccountCurrency.getText(),"USD");
    }
    @Step
    public void checkAmount() {
        if (t24_payments_page.getTransactionAmount.getText().contains(".")){
            doubleTransactionAmount = Double.valueOf(t24_payments_page.getTransactionAmount.getText());
        }else {
            intTransactionAmount = Integer.parseInt(t24_payments_page.getTransactionAmount.getText());
        }
        Assert.assertEquals(t24_payments_page.getTransactionAmount.getText(),"250000.00");
    }
    @Step
    public void checkDebitAccountNum(String envName){
        Assert.assertEquals(t24_payments_page.getDebitAccountNum.getText(),CommonUtil.getEnvironmentSpecificConfiguration("environments."+envName+".USD_AC_SingleCurrency"));
    }

    @Step
    public void checkFee(){
        t24_payments_page.getClickChargeInformation.click();
        if (t24_payments_page.getDebitChargeAmount.isVisible()){
            Assert.assertEquals(t24_payments_page.getDebitChargeAmount.getText(),"10.00");
        }
    }
    @Step
    public void getFtNumber(String WordPath){
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24","t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        clickViewIcon();
    }
    @Step
    public void getFtNumberDifferentCurrency(String WordPath ){
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24","t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        clickViewIcon();
    }
    @Step
    public void getFtNumberOnLocalPayment(String WordPath){
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24","t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        clickViewIcon();
    }
    @Step
    public void getFtNumberOnMxMessage(String WordPath){
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24","t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        clickViewIcon();
    }
    public void useToLogInToTSITEnvironment(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_steps.open_url(envName);
            logon_steps.logonUserName(envName);
            logon_steps.logonPassword(envName);
            logon_steps.clickLogonBtn();
        }
    }
    @Step
    public void clickViewIcon(){
        t24_payments_page.clickViewIcon.click();
    }

    public static Object convertDate(String Date){
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parse = null;
        try {
            parse = sdf1.parse(Date);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf2.format(parse));
        return sdf2.format(parse);
    }

    @Step
    public void iVerifyThatTheCutOffTimeDateIsCorrect(){
        t24_payments_page.clickdebitCreditInfoMenu.click();
        Assert.assertEquals(DateUtil.format(new Date(),"yyyy-MM-dd"),convertDate(t24_payments_page.getProcessingDate.getText()));
        Calendar instance = Calendar.getInstance();
        // 获取今天星期几
        int i = instance.get(Calendar.DAY_OF_WEEK) - 1;
        int Friday = Calendar.FRIDAY - 1;
        int Saturday = Calendar.SATURDAY - 1;
        int Sunday = Calendar.SUNDAY -1;
        System.out.println(Friday);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHss");
        String format = dateFormat.format(date);
        System.out.println(format);
        int time = Integer.parseInt(format);
        if (i == Friday){
            if (time>1600){
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
            }else if (time<1600){
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
            }
        }else if (i == Saturday) {
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),2),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),2),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
        }else if (i == Sunday) {
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
        }else {
            if (time>1600){
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
            }else if (time<1600){
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"),convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"),convertDate(t24_payments_page.getCreditValueDate.getText()));
            }
        }

    }
    @Step
    public void channelAndT24DataFieldMappingSameCurrency(String WordPath){
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        Assert.assertEquals(convertDate(t24_payments_page.getProcessingDate.getText()),DateUtil.format(new Date(),"yyyy-MM-dd"));
        Calendar instance = Calendar.getInstance();
        // 获取今天星期几
        int i = instance.get(Calendar.DAY_OF_WEEK) - 1;
        int Friday = Calendar.FRIDAY - 1;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHss");
        String format = dateFormat.format(date);
        System.out.println(format);
        int time = Integer.parseInt(format);
        if (i == Friday){
            if (time>1600){
                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"));
                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"));
            }else if (time<1600){
                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
            }
        }else {
            if (time>1600){
                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"));
                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"));
            }else if (time<1600){
                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
            }
        }
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24","getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24","getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + getTransactionAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24","getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24","getDebitAccountNum:" + getDebitAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24","getDebitAccountCurrency:" + getDebitAccountCurrency);
//        getDebitAmount = t24_payments_page.getDebitAmount.getText();
//        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24","getOrderingAccount:" + getOrderingAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24","getOrderingName:" + getOrderingName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24","getOrderingAddress:" + getOrderingAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24","getOrderingTown:" + getOrderingTown);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24","getCreditAccountNum:" + getCreditAccountNum);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24","getCreditAccountCurrency:" + getCreditAccountCurrency);
//        getCreditAmount = t24_payments_page.getCreditAmount.getText();
//        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24","getBeneficiaryAccount:" + getBeneficiaryAccount);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24","getBeneficiaryName:" + getBeneficiaryName);
//        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
//        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")){
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        }else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")){
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        }else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")){
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
//        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24","ChannelDetailPayeeName"));
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }
    @Step
    public void channelAndT24DataFieldMappingOwnPayment(String WordPath){
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24","getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24","getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24","getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24","getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24","getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24","getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24","getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24","getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24","getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24","getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24","getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24","getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24","getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24","getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24","getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24","getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24","getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24","ChannelCreditAccountCurrency"));
        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelCreditAccountNumber"));
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            Assert.assertEquals(getDebitCustomerRate,readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        }else if(!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            System.out.println("数据对比失败！");
        }
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24","ChannelTransactionAmount"));
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }
    @Step
    public void channelAndT24DataFieldMappingFxPayment(String WordPath){
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24","getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24","getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24","getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24","getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24","getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24","getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24","getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24","getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24","getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24","getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24","getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24","getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24","getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24","getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24","getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24","getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24","getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")){
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        }else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")){
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        }else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")){
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
        bddUtil.scrollWindowToElement(t24_payments_page.getDebitCustomerRate);
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            Assert.assertEquals(getDebitCustomerRate,readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        }else if(!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            System.out.println("数据对比失败！");
        }
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24","ChannelDetailPayeeName"));
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }
    @Step
    public void channelAndT24DataFieldMappingFxPaymentDifferentCurrency(String WordPath){
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24","getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24","getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24","getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24","getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24","getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24","getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24","getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24","getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24","getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24","getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24","getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24","getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24","getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24","getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24","getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24","getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24","getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24","getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")){
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        }else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")){
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        }else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")){
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24","ChannelDetailAccountCurrency"));
        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
        bddUtil.scrollWindowToElement(t24_payments_page.getDebitCustomerRate);
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            Assert.assertEquals(getDebitCustomerRate,readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        }else if(!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))){
            System.out.println("数据对比失败！");
        }
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24","ChannelDetailPayeeName"));
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }
    //获取AccountEntries
    @Step
    public void checkAccountingEntries(String WordPath){
        t24_payments_page.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectAccountingEntries.click();
        t24_payments_page.clickSelectDrilldown.click();
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
    }
    //获取AccountEntries
    @Step
    public void checkAccountingEntriesDifferentCurrency(String WordPath){
        t24_payments_page.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectAccountingEntries.click();
        t24_payments_page.clickSelectDrilldown.click();
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
    }

    //获取AccountEntries
    @Step
    public void checkAccountingEntriesToLocalPayment(String WordPath){
        t24_payments_page.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectAccountingEntries.click();
        t24_payments_page.clickSelectDrilldown.click();
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
    }


    @Step
    public void checkAccountingEntriesOnMxMessage(String WordPath){
        t24_payments_page.getClickViewDetail.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectAccountingEntries.click();
        t24_payments_page.clickSelectDrilldown.click();
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
    }
    //获取Outgoing Message
    @Step
    public void checkOutgoingMessageDifferentCurrency(String WordPath,String name){
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()){
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        }else if (t24_payments_page.mtMsgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            FileUtils.FileString(name+"MT Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MT Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MT Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MT Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MT Message","message Type:"+t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name+"MT Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MT Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum,t24_payments_page.check20Field.getText().substring(4));
            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum,t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount,t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption,t24_payments_page.check71AField.getText().substring(5));
        }else if (t24_payments_page.msgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            FileUtils.FileString(name+"MX Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MX Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MX Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MX Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MX Message","message Type:"+t24_payments_page.msgType.getText());
            FileUtils.FileString(name+"MX Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            if (t24_payments_page.clickNextPage.isVisible()){
                t24_payments_page.clickNextPage.click();
                bddUtil.sleep(2);
                bddUtil.screenShort();
                WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size()-2; i++){
                    FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                    if (i == trList2.size()-2){
                        break;
                    }
                }
            }
        }

        switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
    }
    //获取Outgoing Message
    @Step
    public void checkOutgoingMessage(String WordPath,String name){
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()){
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
        }else if (t24_payments_page.mtMsgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            FileUtils.FileString(name+"MT Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MT Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MT Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MT Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MT Message","message Type:"+t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name+"MT Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MT Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum,t24_payments_page.check20Field.getText().substring(4));
//            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum,t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount,t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption,t24_payments_page.check71AField.getText().substring(5));
        }else if (t24_payments_page.msgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            FileUtils.FileString(name+"MX Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MX Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MX Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MX Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MX Message","message Type:"+t24_payments_page.msgType.getText());
            FileUtils.FileString(name+"MX Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            if (t24_payments_page.clickNextPage.isVisible()){
                t24_payments_page.clickNextPage.click();
                bddUtil.sleep(2);
                bddUtil.screenShort();
                WordUtils.photoStorageToFxPaymentMT(WordPath);
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size()-2; i++){
                    FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                    if (i == trList2.size()-2){
                        break;
                    }
                }
            }
            }

        switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
    }
    @Step
    public void checkOutgoingMessageOnLocalPayment(String name){
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()){
            System.out.println("Outgoing没有生成数据！");
        }else if (t24_payments_page.mtMsgType.isVisible()){
            FileUtils.FileString(name+"MT Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MT Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MT Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MT Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MT Message","message Type:"+t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name+"MT Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MT Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum,t24_payments_page.check20Field.getText().substring(4));
            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum,t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount,t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption,t24_payments_page.check71AField.getText().substring(5));
        }else if (t24_payments_page.msgType.isVisible()){
            FileUtils.FileString(name+"MX Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MX Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MX Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MX Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MX Message","message Type:"+t24_payments_page.msgType.getText());
            FileUtils.FileString(name+"MX Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            if (t24_payments_page.clickNextPage.isVisible()){
                t24_payments_page.clickNextPage.click();
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size()-2; i++){
                    FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                    if (i == trList2.size()-2){
                        break;
                    }
                }
            }
        }
        switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
    }

    @Step
    public void checkOutgoingMessageOnMxMessage(String WordPath,String name){
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()){
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }else if (t24_payments_page.mtMsgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
            FileUtils.FileString(name+"MT Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MT Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MT Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MT Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MT Message","message Type:"+t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name+"MT Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MT Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum,t24_payments_page.check20Field.getText().substring(4));
//            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum,t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount,t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption,t24_payments_page.check71AField.getText().substring(5));
        }else if (t24_payments_page.msgType.isVisible()){
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
            FileUtils.FileString(name+"MX Message","company ID:"+t24_payments_page.companyId.getText());
            FileUtils.FileString(name+"MX Message","FT Number:"+t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name+"MX Message","Send Ref:"+t24_payments_page.sendRef.getText());
            FileUtils.FileString(name+"MX Message","Send Date Time:"+t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name+"MX Message","message Type:"+t24_payments_page.msgType.getText());
            FileUtils.FileString(name+"MX Message","message Content:"+t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i<trList.size()-2; i++){
                FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList.size()-2){
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
            t24_payments_page.clickNextPage.click();
            bddUtil.sleep(2);
            bddUtil.screenShort();
            WordUtils.photoStorageToFXPaymentMX(WordPath);
            List<WebElementFacade> trList2 = t24_payments_page.trList;
            for (int i = 1; i <= trList2.size()-2; i++){
                FileUtils.FileString(name+"MX Message",getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r"+i+"']/td[6]")).getText());
                if (i == trList2.size()-2){
                    break;
                }
            }
        }
        switchToDefaultContent();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
    }
    //在Forex页面操作
    @Step
    public void searchForex(String forex){
        switchToFirstFrame();
        t24_payments_page.inputBox.clear();
        t24_payments_page.inputBox.sendKeys(forex);
        t24_payments_page.searchBtn.click();
        bddUtil.switchToNewWindow();
        t24_payments_page.forexSearchBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.scrollWindowToElement(t24_payments_page.findLTranRef);
        t24_payments_page.findLTranRefInputBox.clear();
        t24_payments_page.findLTranRefInputBox.sendKeys(getTransactionReferenceNum);
        t24_payments_page.getClickFindBtn.click();
    }
    @Step
    public void forexAuthorize(String forex,String userAuth,String WordPath){
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()){
            bddUtil.closeWindow();
            bddUtil.switchToNewWindow();
            bddUtil.closeWindow();
            switchToSecondFrame();
            t24_payments_page.clickTreasuryMenu.click();
            t24_payments_page.clickForexMenu.click();
            t24_payments_page.clickUnauthorizedForexDealsMenu.click();
            bddUtil.switchToNewWindow();
            switchToFirstFrame();
            getDriver().manage().window().maximize();
            List<WebElementFacade> amount = t24_payments_page.AmountBought;
            List<WebElementFacade> detailsInformation = t24_payments_page.detailInformation;
            List<WebElementFacade> sumPage = t24_payments_page.sumPage;
            if (sumPage.size()==0){
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            }else {
                t24_payments_page.getClickNextPage.click();
                for (int j = 0; j < amount.size(); j++) {
                    if (amount.get(j).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(j).click();
                        break;
                    }
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            checkT24AndPo();
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> amend = t24_payments_page.amendBtn;
            for (int i = 0; i <amount.size();i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()){
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()){
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenu(forex,WordPath);
            bddUtil.quitDriver();
        }else {
            t24_payments_page.clickForexDefaultListIcon.click();
            getDriver().manage().window().maximize();
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
        }
    }

    @Step
    public void forexAuthorizeDifferentCurrency(String forex,String userAuth,String WordPath){
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()){
            bddUtil.closeWindow();
            bddUtil.switchToNewWindow();
            bddUtil.closeWindow();
            switchToSecondFrame();
            t24_payments_page.clickTreasuryMenu.click();
            t24_payments_page.clickForexMenu.click();
            t24_payments_page.clickUnauthorizedForexDealsMenu.click();
            bddUtil.switchToNewWindow();
            switchToFirstFrame();
            getDriver().manage().window().maximize();
            List<WebElementFacade> amount = t24_payments_page.AmountBought;
            List<WebElementFacade> detailsInformation = t24_payments_page.detailInformation;
            List<WebElementFacade> sumPage = t24_payments_page.sumPage;
            if (sumPage.size()==0){
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            }else {
                t24_payments_page.getClickNextPage.click();
                for (int j = 0; j < amount.size(); j++) {
                    if (amount.get(j).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(j).click();
                        break;
                    }
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            checkT24AndPo();
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> amend = t24_payments_page.amendBtn;
            for (int i = 0; i <amount.size();i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()){
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()){
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenuDifferentCurrency(forex,WordPath);
            bddUtil.quitDriver();
        }else {
            t24_payments_page.clickForexDefaultListIcon.click();
            getDriver().manage().window().maximize();
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        }
    }
    @Step
    public void forexAuthorizeToLocalPayment(String forex,String userAuth,String WordPath){
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()){
            bddUtil.closeWindow();
            bddUtil.switchToNewWindow();
            bddUtil.closeWindow();
            switchToSecondFrame();
            t24_payments_page.clickTreasuryMenu.click();
            t24_payments_page.clickForexMenu.click();
            t24_payments_page.clickUnauthorizedForexDealsMenu.click();
            bddUtil.switchToNewWindow();
            switchToFirstFrame();
            getDriver().manage().window().maximize();
            List<WebElementFacade> amount = t24_payments_page.AmountBought;
            List<WebElementFacade> detailsInformation = t24_payments_page.detailInformation;
            List<WebElementFacade> sumPage = t24_payments_page.sumPage;
            if (sumPage.size()==0){
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            }else {
                t24_payments_page.getClickNextPage.click();
                for (int j = 0; j < amount.size(); j++) {
                    if (amount.get(j).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(j).click();
                        break;
                    }
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            checkT24AndPo();
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> amend = t24_payments_page.amendBtn;
            for (int i = 0; i <amount.size();i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()){
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()){
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i <amount.size();i++){
                if (amount.get(i).getText().equals(getTransactionAmount)){
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenuToLocalPayment(forex,WordPath);
        }else {
            t24_payments_page.clickForexDefaultListIcon.click();
            getDriver().manage().window().maximize();
            bddUtil.screenShort();
            WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
            bddUtil.screenShort();
            WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        }
    }
    @Step
    public void checkT24AndPo(){
        bddUtil.sleep(5);
        currencyBought = t24_payments_page.currencyBought.getText();
        FileUtils.FileString4("t24","currencyBought:" + currencyBought);
        amountBought = t24_payments_page.amountBought.getText();
        FileUtils.FileString4("t24","amountBought:" + amountBought);
        currencySold = t24_payments_page.currencySold.getText();
        FileUtils.FileString4("t24","currencySold:" + currencySold);
        amountSold = t24_payments_page.amountSold.getText();
        FileUtils.FileString4("t24","amountSold:" + amountSold);
        spotRate = t24_payments_page.spotRate.getText();
        FileUtils.FileString4("t24","spotRate:" + spotRate);
//        spotLcyAmount = t24_payments_page.spotLcyAmount.getText();
//        FileUtils.FileString4("t24","spotLcyAmount:" + spotLcyAmount);
        ourAccountRec = t24_payments_page.ourAccountRec.getText();
        FileUtils.FileString4("t24","ourAccountRec:" + ourAccountRec);
        ourAccountPay = t24_payments_page.ourAccountPay.getText();
        FileUtils.FileString4("t24","ourAccountPay:" + ourAccountPay);
        treasuryRate = t24_payments_page.treasuryRate.getText();
        FileUtils.FileString4("t24","treasuryRate:" + treasuryRate);
        lTranRef = t24_payments_page.lTranRef.getText();
        FileUtils.FileString4("t24","lTranRef:" + lTranRef);
        Assert.assertEquals(getTransactionCurrency,currencyBought);
        Assert.assertEquals(getTransactionAmount,amountBought);
        Assert.assertEquals(getInstructedCurrency,currencySold);
        if (getDebitTreasuryRate.equals(spotRate)){
            Assert.assertEquals(getDebitTreasuryRate,spotRate);
            bddUtil.scrollWindowToElement(t24_payments_page.treasuryRate);
            Assert.assertEquals(getDebitTreasuryRate,treasuryRate);
        }else{
            FileUtils.FileString4("t24","Rate对比:["+getDebitTreasuryRate+","+spotRate+"],["+getDebitTreasuryRate+","+treasuryRate+"]");
        }

//        Assert.assertEquals(getTransactionAmount,spotLcyAmount);
//        Assert.assertEquals(getCreditAccountNum,ourAccountRec);
//        Assert.assertEquals(getDebitAccountNum,ourAccountPay);
//        Assert.assertEquals(getTransactionReferenceNum,lTranRef);
    }
    @Step
    public void selectUnauthorizedForexDealsMenu(String forex,String WordPath) {
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickForexMenu.click();
        t24_payments_page.clickUnauthorizedForexDealsMenu.click();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
        getDriver().manage().window().maximize();
        List<WebElementFacade> amount = t24_payments_page.AmountBought;
//        List<WebElementFacade> amend = t24_payments_page.amendBtn;
//        while (true){
//            for (int i = 0; i <amount.size();i++){
//                try {
//                    if (amount.get(i).getText().equals(getTransactionAmount)){
//                        amend.get(i).click();
//                        return;
//                    }
//                }catch (Exception e){
//                    break;
//                }
//            }
//            t24_payments_page.getClickNextPage.click();
//            bddUtil.sleep(2);
//            for (int j = 0; j <amount.size();j++){
//                if (amount.get(j).getText().equals(getTransactionAmount)){
//                    amend.get(j).click();
//                    break;
//                }
//            }
//            break;
//        }
//        switchToDefaultContent();
//        switchToSecondFrame();
//        t24_payments_page.validateDeal.click();
//        t24_payments_page.commitTheDeal.click();
//        t24_payments_page.clickAcceptOverrides.click();
//        switchToDefaultContent();
//        switchToFirstFrame();
        List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
        List<WebElementFacade> sumPage = t24_payments_page.sumPage;
        if (sumPage.size()==0){
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        }else {
            t24_payments_page.getClickNextPage.click();
            for (int j = 0; j < amount.size(); j++) {
                if (amount.get(j).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(j).click();
                    break;
                }
            }
        }
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAuthorisesADeal.click();
        bddUtil.closeWindow();
        searchForex(forex);
        t24_payments_page.searchIcon.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
    }
    public void checkRateInternalTransfer(String WordPath){
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAdminMenu.click();
        t24_payments_page.clickPaymentsBtn.click();
        t24_payments_page.clickPaymentOrderRFQRateAuditMenu.click();
        bddUtil.switchToNewWindow();
        t24_payments_page.sendTransactionID.sendKeys(t24TransactionReference);
        t24_payments_page.clickSearchBtn.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
    }

    public void checkRateOverseaDifferentCurrencyMT(String WordPath){
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAdminMenu.click();
        t24_payments_page.clickPaymentsBtn.click();
        t24_payments_page.clickPaymentOrderRFQRateAuditMenu.click();
        bddUtil.switchToNewWindow();
        t24_payments_page.sendTransactionID.sendKeys(t24TransactionReference);
        t24_payments_page.clickSearchBtn.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
    }

    public void checkRateOverseaDifferentCurrencyMX(String WordPath){
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAdminMenu.click();
        t24_payments_page.clickPaymentsBtn.click();
        t24_payments_page.clickPaymentOrderRFQRateAuditMenu.click();
        bddUtil.switchToNewWindow();
        t24_payments_page.sendTransactionID.sendKeys(t24TransactionReference);
        t24_payments_page.clickSearchBtn.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
    }
    @Step
    public void selectUnauthorizedForexDealsMenuDifferentCurrency(String forex,String WordPath) {
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickForexMenu.click();
        t24_payments_page.clickUnauthorizedForexDealsMenu.click();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
        getDriver().manage().window().maximize();
        List<WebElementFacade> amount = t24_payments_page.AmountBought;
//        List<WebElementFacade> amend = t24_payments_page.amendBtn;
//        while (true){
//            for (int i = 0; i <amount.size();i++){
//                try {
//                    if (amount.get(i).getText().equals(getTransactionAmount)){
//                        amend.get(i).click();
//                        return;
//                    }
//                }catch (Exception e){
//                    break;
//                }
//            }
//            t24_payments_page.getClickNextPage.click();
//            bddUtil.sleep(2);
//            for (int j = 0; j <amount.size();j++){
//                if (amount.get(j).getText().equals(getTransactionAmount)){
//                    amend.get(j).click();
//                    break;
//                }
//            }
//            break;
//        }
//        switchToDefaultContent();
//        switchToSecondFrame();
//        t24_payments_page.validateDeal.click();
//        t24_payments_page.commitTheDeal.click();
//        t24_payments_page.clickAcceptOverrides.click();
//        switchToDefaultContent();
//        switchToFirstFrame();
        List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
        List<WebElementFacade> sumPage = t24_payments_page.sumPage;
        if (sumPage.size()==0){
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        }else {
            t24_payments_page.getClickNextPage.click();
            for (int j = 0; j < amount.size(); j++) {
                if (amount.get(j).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(j).click();
                    break;
                }
            }
        }
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAuthorisesADeal.click();
        bddUtil.closeWindow();
        searchForex(forex);
        t24_payments_page.searchIcon.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
    }
    @Step
    public void selectUnauthorizedForexDealsMenuToLocalPayment(String forex,String WordPath) {
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickForexMenu.click();
        t24_payments_page.clickUnauthorizedForexDealsMenu.click();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
        getDriver().manage().window().maximize();
        List<WebElementFacade> amount = t24_payments_page.AmountBought;
        List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
        List<WebElementFacade> sumPage = t24_payments_page.sumPage;
        if (sumPage.size()==0){
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        }else {
            t24_payments_page.getClickNextPage.click();
            for (int j = 0; j < amount.size(); j++) {
                if (amount.get(j).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(j).click();
                    break;
                }
            }
        }
        switchToDefaultContent();
        switchToSecondFrame();
        t24_payments_page.clickAuthorisesADeal.click();
        bddUtil.closeWindow();
        searchForex(forex);
        t24_payments_page.searchIcon.click();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        bddUtil.scrollWindowToElement(t24_payments_page.deptCode);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
    }
    @Step
    public void fundsTransfer(String cmd,String WordPath){
        inputBox(cmd);
        jumpNewWindows(cmd);
        getDriver().manage().window().maximize();
        t24_payments_page.clickFundsTransfer.sendKeys(t24TransactionReference);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        t24_payments_page.clickViewContractBtn.click();
    }
    @Step
    public void iWillMapThePageData(String WordPath){
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        fundsTransferDebitAccountNum = t24_payments_page.fundsTransferDebitAccountNum.getText();
        FileUtils.FileString4("t24","fundsTransferDebitAccountNum:" + fundsTransferDebitAccountNum);
        fundsTransferDebitCurrency = t24_payments_page.fundsTransferDebitCurrency.getText();
        FileUtils.FileString4("t24","fundsTransferDebitCurrency:" + fundsTransferDebitCurrency);
        fundsTransferCreditCurrency = t24_payments_page.fundsTransferCreditCurrency.getText();
        FileUtils.FileString4("t24","fundsTransferCreditCurrency:" + fundsTransferCreditCurrency);
        fundTransferCreditAccNo = t24_payments_page.fundTransferCreditAccNo.getText();
        FileUtils.FileString4("t24","fundTransferCreditAccNo:" + fundTransferCreditAccNo);
        fundsTransferAmountDebited = t24_payments_page.fundsTransferAmountDebited.getText();
        FileUtils.FileString4("t24","fundsTransferAmountDebited:" + fundsTransferAmountDebited);
        fundsTransferAmoyntCredited = t24_payments_page.fundsTransferAmoyntCredited.getText();
        FileUtils.FileString4("t24","fundsTransferAmoyntCredited:" + fundsTransferAmoyntCredited);
        bddUtil.scrollWindowToElement(t24_payments_page.fundsTransferAmoyntCredited);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
//        Assert.assertEquals(fundsTransferDebitAccountNum,readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(fundsTransferDebitCurrency,readtxtFile("autopay/t24","ChannelDebitAccountCurrency"));
//      Assert.assertEquals(fundsTransferCreditCurrency,readtxtFile("autopay/t24","ChannelCreditAccountCurrency"));
        Assert.assertEquals(fundTransferCreditAccNo,readtxtFile("autopay/t24","ChannelCreditAccountNumber"));
    }
    @Step
    public void findInputArrangement(String envName){
        t24_payments_page.inputArrangement.clear();
        t24_payments_page.inputArrangement.sendKeys(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency"));
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal b1 = new BigDecimal(doubleSum);
        BigDecimal b2 = new BigDecimal(doubleTransactionAmount);
        if (t24_payments_page.firstDebitAmount.getText().contains(".")){
            Assert.assertEquals(String.valueOf(b1.add(b2).setScale(2, RoundingMode.HALF_UP).doubleValue()),t24_payments_page.firstDebitAmount.getText());
        }else {
            Assert.assertEquals(String.valueOf(intSum+intTransactionAmount),t24_payments_page.firstDebitAmount.getText());
        }
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",",""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",",""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())){
            System.out.println("金额比对成功！");
        }
    }
}
