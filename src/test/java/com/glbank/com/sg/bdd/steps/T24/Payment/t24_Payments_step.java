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
import cucumber.api.DataTable;
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
    public Double doubleTransactionAmount;

    public String getStatus;


    public void switchToFirstFrame() {
        getDriver().switchTo().frame(t24_payments_page.switchToFirstFrame);
    }

    @Step
    public void inputBox(String cmd) {
        t24_payments_page.inputBox.clear();
        t24_payments_page.inputBox.sendKeys(cmd);
        t24_payments_page.searchBtn.click();
    }

    @Step
    public void jumpNewWindows(String title) {
        bddUtil.switchToNewWindow();
        System.out.println(getDriver().getTitle());
        if (getDriver().getTitle().equals(title)) {
            System.out.println("页面跳转成功");
        }
    }

    @Step
    public void serialNumberQueryingInformation(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        Assert.assertEquals("PROCESSED", t24_payments_page.checkT24Status.getText());
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        FileUtils.FileString4("t24", nowDate + "\n" + "ID:" + t24Id);
        FileUtils.FileString4("t24", "TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }

    @Step
    public void serialNumberQueryingInformationDifferentCurrency(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        Assert.assertEquals("PROCESSED", t24_payments_page.checkT24Status.getText());
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        FileUtils.FileString4("t24", nowDate + "\n" + "ID:" + t24Id);
        FileUtils.FileString4("t24", "TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }

    @Step
    public void serialNumberQueryingInformationOnLocalPayment(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        Assert.assertEquals("PROCESSED", t24_payments_page.checkT24Status.getText());
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        FileUtils.FileString4("t24", nowDate + "\n" + "ID:" + t24Id);
        FileUtils.FileString4("t24", "TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }


    @Step
    public void serialNumberQueryingInformationMxMessage(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        Assert.assertEquals("PROCESSED", t24_payments_page.checkT24Status.getText());
        getDriver().manage().window().maximize();
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        FileUtils.FileString4("t24", nowDate + "\n" + "ID:" + t24Id);
        FileUtils.FileString4("t24", "TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }

    public void serialNumberQueryingInformationToLocalPayment(String WordPath) throws Exception {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        Assert.assertEquals("PROCESSED", t24_payments_page.checkT24Status.getText());
        t24Id = t24_payments_page.t24Id.getText();
        t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        FileUtils.FileString4("t24", nowDate + "\n" + "ID:" + t24Id);
        FileUtils.FileString4("t24", "TransactionReference:" + t24TransactionReference);
        bddUtil.closeWindow();
    }

    @Step
    public void switchToDefaultContent() {
        getDriver().switchTo().defaultContent();
    }

    @Step
    public void clickUserMenu() {
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
    }

    @Step
    public void switchToSecondFrame() {
        getDriver().switchTo().frame(t24_payments_page.switchToSecondFrame);
    }

    @Step
    public void clickPaymentsMenu() {
        bddUtil.sleep(2);
        t24_payments_page.clickPayments.click();
    }

    @Step
    public void clickProductsMenu() {
        bddUtil.sleep(2);
        if (!t24_payments_page.clickProducts.isVisible()) {
            t24_payments_page.clickUserMenu.click();
        }
        t24_payments_page.clickProducts.click();
    }

    @Step
    public void clickFindAccountMenu() {
        t24_payments_page.clickFindAccount.click();
    }

    @Step
    public void clickFindMCY() {
        t24_payments_page.clickFindMCY.click();
    }

    @Step
    public void clickPaymentHubMenu() {
        t24_payments_page.clickPaymentHubMenu.click();
    }

    @Step
    public void clickPaymentInquiriesMenu() {
        t24_payments_page.clickPaymentInquiriesMenu.click();
    }

    @Step
    public void clickPaymentTransactionWiseMenu() {
        t24_payments_page.clickPaymentTransactionWiseMenu.click();
    }

    @Step
    public void findFileSendersReference() {
        bddUtil.scrollWindowToElement(t24_payments_page.findFileSendersReference);
        t24_payments_page.inputDate.clear();
        t24_payments_page.fileSendersReferenceInput.clear();
//        t24_payments_page.fileSendersReferenceInput.sendKeys("PI230440MV9HWBC5");
        t24_payments_page.fileSendersReferenceInput.sendKeys(t24TransactionReference);
        t24_payments_page.getClickFindBtn.click();
    }

    @Step
    public void clickFindBtn() {
        bddUtil.scrollWindowToElement(t24_payments_page.findFileSendersReference);
        t24_payments_page.inputDate.clear();
        t24_payments_page.fileSendersReferenceInput.clear();
        t24_payments_page.fileSendersReferenceInput.sendKeys(paymentService_step.serialNumber);
//        t24_payments_page.fileSendersReferenceInput.sendKeys("PI230330CY0BPY1M");
        t24_payments_page.getClickFindBtn.click();
        getDriver().manage().window().maximize();
    }

    @Step
    public void checkDeductionAmount() {
        bddUtil.sleep(2);
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
        if (t24_payments_page.getFeeAmt.isVisible()) {
            doubleSum = Double.valueOf(t24_payments_page.getFeeAmt.getText());
        }
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }

    @Step
    public void interfaceReturnInformationQuery() {
        if (t24_payments_page.getStatus.getText().equals("677") || t24_payments_page.getStatus.getText().equals("687") || t24_payments_page.getStatus.getText().equals("999") || t24_payments_page.getStatus.getText().equals("404")) {
            System.out.println("交易成功！");
        } else {
            System.out.println("交易失败！");
        }
    }

    @Step
    public void closeAllTabJumpToHomePage() {
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        switchToSecondFrame();
    }

    @Step
    public void closeTabJumpToHomePage() {
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
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
    public void clickViewAndCheckInformation() {
        clickViewIcon();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
    }

    @Step
    public void checkCurrency() {
        Assert.assertEquals(t24_payments_page.getCreditAccountCurrency.getText(), paymentService_step.transferCurrency);
    }

    @Step
    public void checkAmount() {
        if (t24_payments_page.getTransactionAmount.getText().contains(".")) {
            doubleTransactionAmount = Double.parseDouble(t24_payments_page.getTransactionAmount.getText().replace(",", ""));
        }
        if (t24_payments_page.getTransactionAmount.getText().replace(",", "").contains(".00")) {
            Assert.assertEquals(t24_payments_page.getTransactionAmount.getText().replace(",", ""), paymentService_step.transferAmount + ".00");
        } else if (t24_payments_page.getDebitCustomerRate.isVisible()) {
            if (paymentServiceStep.transferCurrency.equals("USD")) {
                Double doubleFirst = Double.parseDouble(t24_payments_page.getDebitCustomerRate.getText());
                Double doubleSecond = Double.parseDouble(paymentService_step.transferAmount);
                String multiplication = String.format("%.2f", (doubleSecond / doubleFirst));
                Assert.assertEquals(t24_payments_page.getTransactionAmount.getText().replace(",", ""), multiplication);
            } else if ((paymentServiceStep.transferCurrency.equals("SGD"))) {
                Double doubleFirst = Double.parseDouble(t24_payments_page.getDebitCustomerRate.getText());
                Double doubleSecond = Double.parseDouble(paymentService_step.transferAmount);
                String multiplication = String.format("%.2f", (doubleSecond * doubleFirst));
                Assert.assertEquals(t24_payments_page.getTransactionAmount.getText().replace(",", ""), multiplication);
            }

        } else {
            Assert.assertEquals(t24_payments_page.getTransactionAmount.getText().replace(",", ""), paymentService_step.transferAmount);
        }

    }

    @Step
    public void checkDebitAccountNum(String envName) {
        Assert.assertEquals(t24_payments_page.getDebitAccountNum.getText(), CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".USD_AC_SingleCurrency"));
    }

    @Step
    public void checkFee() {
        t24_payments_page.getClickChargeInformation.click();
        if (t24_payments_page.getDebitChargeAmount.isVisible()) {
            Assert.assertEquals(t24_payments_page.getDebitChargeAmount.getText(), String.format("%.2f", doubleSum));
        } else if (t24_payments_page.getCreditChargeAmount.isVisible()) {
            Assert.assertEquals(t24_payments_page.getCreditChargeAmount.getText(), String.format("%.2f", doubleSum));
        }
    }

    @Step
    public void getFtNumber(String WordPath) {
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24", "t24FtNumber:" + t24FtNumber);
        if (t24_payments_page.checkStatus.getText().equals("999") || t24_payments_page.checkStatus.getText().equals("677") || t24_payments_page.checkStatus.getText().equals("687")) {
            getDriver().manage().window().maximize();
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            clickViewIcon();
        }
    }

    @Step
    public void getFtNumberDifferentCurrency(String WordPath) {
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24", "t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        if (t24_payments_page.checkStatus.getText().equals("999") || t24_payments_page.checkStatus.getText().equals("677") || t24_payments_page.checkStatus.getText().equals("687")) {
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            clickViewIcon();
        }
    }

    @Step
    public void getFtNumberOnLocalPayment(String WordPath) {
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24", "t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        if (t24_payments_page.checkStatus.getText().equals("999") || t24_payments_page.checkStatus.getText().equals("677") || t24_payments_page.checkStatus.getText().equals("687")) {
            bddUtil.screenShort();
            WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
            clickViewIcon();
        }
    }

    @Step
    public void getFtNumberOnMxMessage(String WordPath) {
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24", "t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
        if (t24_payments_page.checkStatus.getText().equals("999") || t24_payments_page.checkStatus.getText().equals("677") || t24_payments_page.checkStatus.getText().equals("687")) {
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            clickViewIcon();
        }
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
    public void clickViewIcon() {
        t24_payments_page.clickViewIcon.click();
    }

    public static Object convertDate(String Date) {
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
    public void iVerifyThatTheCutOffTimeDateIsCorrect() {
        t24_payments_page.clickdebitCreditInfoMenu.click();
        Assert.assertEquals(DateUtil.format(new Date(), "yyyy-MM-dd"), convertDate(t24_payments_page.getProcessingDate.getText()));
        Calendar instance = Calendar.getInstance();
        // 获取今天星期几
        int i = instance.get(Calendar.DAY_OF_WEEK) - 1;
        int Friday = Calendar.FRIDAY - 1;
        int Saturday = Calendar.SATURDAY - 1;
        int Sunday = Calendar.SUNDAY - 1;
        System.out.println(Friday);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHss");
        String format = dateFormat.format(date);
        System.out.println(format);
        int time = Integer.parseInt(format);
        if (i == Friday) {
            if (time > Integer.parseInt(String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData", "cut_off_time_after")))) {
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 3), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 3), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
            } else if (time < Integer.parseInt(String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData", "cut_off_time_after")))) {
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 0), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 0), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
            }
        } else if (i == Saturday) {
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 2), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 2), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
        } else if (i == Sunday) {
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 1), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
            Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 1), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
        } else {
            if (time > Integer.parseInt(String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData", "cut_off_time_after")))) {
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 1), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 1), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
            } else if (time < Integer.parseInt(String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData", "cut_off_time_after")))) {
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 0), "yyyy-MM-dd"), convertDate(t24_payments_page.getDebitValueDate.getText()));
                Assert.assertEquals(DateUtil.format(DateUtil.offsetDay(new Date(), 0), "yyyy-MM-dd"), convertDate(t24_payments_page.getCreditValueDate.getText()));
            }
        }
    }

    @Step
    public void channelAndT24DataFieldMappingSameCurrency(String WordPath) {
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        Assert.assertEquals(convertDate(t24_payments_page.getProcessingDate.getText()), DateUtil.format(new Date(), "yyyy-MM-dd"));
        Calendar instance = Calendar.getInstance();
        // 获取今天星期几
        int i = instance.get(Calendar.DAY_OF_WEEK) - 1;
        int Friday = Calendar.FRIDAY - 1;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHss");
        String format = dateFormat.format(date);
        System.out.println(format);
        int time = Integer.parseInt(format);
//        if (i == Friday){
//            if (time>1600){
//                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"));
//                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),3),"yyyy-MM-dd"));
//            }else if (time<1600){
//                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
//                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
//            }
//        }else {
//            if (time>1600){
//                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"));
//                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),1),"yyyy-MM-dd"));
//            }else if (time<1600){
//                Assert.assertEquals(convertDate(t24_payments_page.getDebitValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
//                Assert.assertEquals(convertDate(t24_payments_page.getCreditValueDate.getText()),DateUtil.format(DateUtil.offsetDay(new Date(),0),"yyyy-MM-dd"));
//            }
//        }
        getStatus = t24_payments_page.getStatus.getText();
        FileUtils.FileString4("t24", "getStatus:" + getStatus);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24", "getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24", "getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24", "getTransactionCurrency:" + getTransactionCurrency);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24", "getTransactionCurrency:" + getTransactionCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24", "getTransactionAmount:" + getTransactionAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24", "getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + getDebitAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24", "getDebitAccountCurrency:" + getDebitAccountCurrency);
//        getDebitAmount = t24_payments_page.getDebitAmount.getText();
//        FileUtils.FileString4("t24","getDebitAmount:" + getDebitAmount);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24", "getOrderingAccount:" + getOrderingAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24", "getOrderingName:" + getOrderingName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24", "getOrderingAddress:" + getOrderingAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24", "getOrderingTown:" + getOrderingTown);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24", "getCreditAccountNum:" + getCreditAccountNum);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24", "getCreditAccountCurrency:" + getCreditAccountCurrency);
//        getCreditAmount = t24_payments_page.getCreditAmount.getText();
//        FileUtils.FileString4("t24","getCreditAmount:" + getCreditAmount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAccount:" + getBeneficiaryAccount);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24", "getBeneficiaryName:" + getBeneficiaryName);
//        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
//        FileUtils.FileString4("t24","getBeneficiaryAddress:" + getBeneficiaryAddress);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")) {
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        } else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")) {
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        } else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")) {
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
//        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24","ChannelDetailTransactionAmount"));
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24", "ChannelDetailPayeeName"));
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        switchToFirstFrame();
    }

    @Step
    public void channelAndT24DataFieldMappingOwnPayment(String WordPath) {
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        getStatus = t24_payments_page.getStatus.getText();
        FileUtils.FileString4("t24", "getStatus:" + getStatus);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24", "getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24", "getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24", "getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24", "getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24", "getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24", "getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24", "getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24", "getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24", "getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24", "getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24", "getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24", "getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24", "getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24", "getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24", "getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24", "getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24", "getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24", "getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24", "getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24", "ChannelCreditAccountCurrency"));
        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24", "ChannelCreditAccountNumber"));
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            Assert.assertEquals(getDebitCustomerRate, readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        } else if (!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            System.out.println("数据对比失败！");
        }
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24", "ChannelTransactionAmount"));
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
    public void channelAndT24DataFieldMappingFxPayment(String WordPath) {
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        getStatus = t24_payments_page.getStatus.getText();
        FileUtils.FileString4("t24", "getStatus:" + getStatus);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24", "getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24", "getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24", "getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24", "getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24", "getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24", "getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24", "getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24", "getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24", "getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24", "getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24", "getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24", "getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24", "getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24", "getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24", "getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24", "getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24", "getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24", "getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24", "getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24", "ChannelDetailTransactionAmount"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")) {
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        } else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")) {
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        } else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")) {
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24", "ChannelDetailTransactionAmount"));
        bddUtil.scrollWindowToElement(t24_payments_page.getDebitCustomerRate);
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            Assert.assertEquals(getDebitCustomerRate, readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        } else if (!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            System.out.println("数据对比失败！");
        }
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24", "ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24", "ChannelDetailPayeeName"));
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
    public void channelAndT24DataFieldMappingFxPaymentDifferentCurrency(String WordPath) {
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        getStatus = t24_payments_page.getStatus.getText();
        FileUtils.FileString4("t24", "getStatus:" + getStatus);
        getTransactionReferenceNum = t24_payments_page.getTransactionReferenceNum.getText();
        FileUtils.FileString4("t24", "getTransactionReferenceNum:" + getTransactionReferenceNum);
        getSenderReferenceNum = t24_payments_page.getSenderReferenceNum.getText();
        FileUtils.FileString4("t24", "getSenderReferenceNum:" + getSenderReferenceNum);
        getTransactionCurrency = t24_payments_page.getTransactionCurrency.getText();
        FileUtils.FileString4("t24", "getTransactionCurrency:" + getTransactionCurrency);
        getInstructedCurrency = t24_payments_page.getInstructedCurrency.getText();
        FileUtils.FileString4("t24", "getInstructedCurrency:" + getInstructedCurrency);
        getTransactionAmount = t24_payments_page.getTransactionAmount.getText();
        FileUtils.FileString4("t24", "getTransactionAmount:" + getTransactionAmount);
        getInstructedAmount = t24_payments_page.getInstructedAmount.getText();
        FileUtils.FileString4("t24", "getInstructedAmount:" + getInstructedAmount);
        getChargeOption = t24_payments_page.getChargeOption.getText();
        FileUtils.FileString4("t24", "getChargeOption:" + getChargeOption);
        getDebitAccountNum = t24_payments_page.getDebitAccountNum.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + getDebitAccountNum);
        getCreditAccountNum = t24_payments_page.getCreditAccountNum.getText();
        FileUtils.FileString4("t24", "getCreditAccountNum:" + getCreditAccountNum);
        getDebitAccountCurrency = t24_payments_page.getDebitAccountCurrency.getText();
        FileUtils.FileString4("t24", "getDebitAccountCurrency:" + getDebitAccountCurrency);
        getCreditAccountCurrency = t24_payments_page.getCreditAccountCurrency.getText();
        FileUtils.FileString4("t24", "getCreditAccountCurrency:" + getCreditAccountCurrency);
        getDebitAmount = t24_payments_page.getDebitAmount.getText();
        FileUtils.FileString4("t24", "getDebitAmount:" + getDebitAmount);
        getCreditAmount = t24_payments_page.getCreditAmount.getText();
        FileUtils.FileString4("t24", "getCreditAmount:" + getCreditAmount);
        getDebitCustomerRate = t24_payments_page.getDebitCustomerRate.getText();
        FileUtils.FileString4("t24", "getDebitCustomerRate:" + getDebitCustomerRate);
        getDebitTreasuryRate = t24_payments_page.getDebitTreasuryRate.getText();
        FileUtils.FileString4("t24", "getDebitTreasuryRate:" + getDebitTreasuryRate);
        getOrderingAccount = t24_payments_page.getOrderingAccount.getText();
        FileUtils.FileString4("t24", "getOrderingAccount:" + getOrderingAccount);
        getBeneficiaryAccount = t24_payments_page.getBeneficiaryAccount.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAccount:" + getBeneficiaryAccount);
        getOrderingName = t24_payments_page.getOrderingName.getText();
        FileUtils.FileString4("t24", "getOrderingName:" + getOrderingName);
        getBeneficiaryName = t24_payments_page.getBeneficiaryName.getText();
        FileUtils.FileString4("t24", "getBeneficiaryName:" + getBeneficiaryName);
        getOrderingAddress = t24_payments_page.getOrderingAddress.getText();
        FileUtils.FileString4("t24", "getOrderingAddress:" + getOrderingAddress);
        getBeneficiaryAddress = t24_payments_page.getBeneficiaryAddress.getText();
        FileUtils.FileString4("t24", "getBeneficiaryAddress:" + getBeneficiaryAddress);
        getOrderingTown = t24_payments_page.getOrderingTown.getText();
        FileUtils.FileString4("t24", "getOrderingTown:" + getOrderingTown);
        Assert.assertEquals(getTransactionCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
        Assert.assertEquals(getInstructedCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getInstructedAmount, readtxtFile("autopay/t24", "ChannelDetailTransactionAmount"));
        if (getChargeOption.equals("SHA") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "The expenses shall be borne by each party")) {
            System.out.println("数据对比结果：Charge Option为SHA，字段对比成功");
        } else if (getChargeOption.equals("OUR") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the remitter")) {
            System.out.println("数据对比结果：Charge Option为OUR，字段对比成功");
        } else if (getChargeOption.equals("BEN") && Objects.equals(readtxtFile("autopay/t24", "ChannelDetailPaymentModeForCharges"), "All expenses shall be borne by the payee")) {
            System.out.println("数据对比结果：Charge Option为BEN，字段对比成功");
        }
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getCreditAccountNum, readtxtFile("autopay/t24","ChannelDetailPayeeAccountNum"));
        Assert.assertEquals(getDebitAccountCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
        Assert.assertEquals(getCreditAccountCurrency, readtxtFile("autopay/t24", "ChannelDetailAccountCurrency"));
        Assert.assertEquals(getDebitAmount, readtxtFile("autopay/t24", "ChannelDetailTransactionAmount"));
        bddUtil.scrollWindowToElement(t24_payments_page.getDebitCustomerRate);
        if (getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            Assert.assertEquals(getDebitCustomerRate, readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13));
        } else if (!getDebitCustomerRate.equals(readtxtFile("autopay/t24", "ChannelDetailExchangeRate").toString().substring(13))) {
            System.out.println("数据对比失败！");
        }
//        Assert.assertEquals(getOrderingAccount, readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
//        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24","ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24", "ChannelDetailPayeeName"));
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
    public void checkAccountingEntries(String WordPath) {
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
    public void checkAccountingEntriesDifferentCurrency(String WordPath) {
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
    public void checkAccountingEntriesToLocalPayment(String WordPath) {
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
    public void checkAccountingEntriesOnMxMessage(String WordPath) {
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
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
    }

    //获取Outgoing Message
    @Step
    public void checkOutgoingMessageDifferentCurrency(String WordPath, String name) {
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()) {
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        } else if (t24_payments_page.mtMsgType.isVisible()) {
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            FileUtils.FileString(name + "MT Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MT Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MT Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MT Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MT Message", "message Type:" + t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name + "MT Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MT Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum, t24_payments_page.check20Field.getText().substring(4));
            Assert.assertEquals(getTransactionCurrency + getTransactionAmount.replace('.', ','), t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum, t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount, t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption, t24_payments_page.check71AField.getText().substring(5));
        } else if (t24_payments_page.msgType.isVisible()) {
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            FileUtils.FileString(name + "MX Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MX Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MX Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MX Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MX Message", "message Type:" + t24_payments_page.msgType.getText());
            FileUtils.FileString(name + "MX Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
            if (t24_payments_page.clickNextPage.isVisible()) {
                t24_payments_page.clickNextPage.click();
                bddUtil.sleep(2);
                bddUtil.screenShort();
                WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size() - 2; i++) {
                    FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                    if (i == trList2.size() - 2) {
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
    public void checkOutgoingMessage(String WordPath, String name) {
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()) {
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
        } else if (t24_payments_page.mtMsgType.isVisible()) {
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            FileUtils.FileString(name + "MT Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MT Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MT Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MT Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MT Message", "message Type:" + t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name + "MT Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MT Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum, t24_payments_page.check20Field.getText().substring(4));
//            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum, t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount, t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption, t24_payments_page.check71AField.getText().substring(5));
        } else if (t24_payments_page.msgType.isVisible()) {
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            FileUtils.FileString(name + "MX Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MX Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MX Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MX Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MX Message", "message Type:" + t24_payments_page.msgType.getText());
            FileUtils.FileString(name + "MX Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            WordUtils.photoStorageToFxPaymentMT(WordPath);
            if (t24_payments_page.clickNextPage.isVisible()) {
                t24_payments_page.clickNextPage.click();
                bddUtil.sleep(2);
                bddUtil.screenShort();
                WordUtils.photoStorageToFxPaymentMT(WordPath);
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size() - 2; i++) {
                    FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                    if (i == trList2.size() - 2) {
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
    public void checkOutgoingMessageOnLocalPayment(String name) {
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()) {
            System.out.println("Outgoing没有生成数据！");
        } else if (t24_payments_page.mtMsgType.isVisible()) {
            FileUtils.FileString(name + "MT Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MT Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MT Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MT Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MT Message", "message Type:" + t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name + "MT Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MT Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum, t24_payments_page.check20Field.getText().substring(4));
            Assert.assertEquals(getTransactionCurrency + getTransactionAmount.replace('.', ','), t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum, t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount, t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption, t24_payments_page.check71AField.getText().substring(5));
        } else if (t24_payments_page.msgType.isVisible()) {
            FileUtils.FileString(name + "MX Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MX Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MX Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MX Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MX Message", "message Type:" + t24_payments_page.msgType.getText());
            FileUtils.FileString(name + "MX Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            if (t24_payments_page.clickNextPage.isVisible()) {
                t24_payments_page.clickNextPage.click();
                List<WebElementFacade> trList2 = t24_payments_page.trList;
                for (int i = 1; i <= trList2.size() - 2; i++) {
                    FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                    if (i == trList2.size() - 2) {
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
    public void checkOutgoingMessageOnMxMessage(String WordPath, String name) {
        t24_payments_page.clickInBox.click();
        t24_payments_page.selectOutgoingMessage.click();
        t24_payments_page.clickSelectDrilldown.click();
        switchToDefaultContent();
        switchToSecondFrame();
        if (t24_payments_page.notApplicableView.isVisible()) {
            System.out.println("Outgoing没有生成数据！");
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
        } else if (t24_payments_page.mtMsgType.isVisible()) {
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            FileUtils.FileString(name + "MT Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MT Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MT Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MT Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MT Message", "message Type:" + t24_payments_page.mtMsgType.getText());
            FileUtils.FileString(name + "MT Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MT Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            Assert.assertEquals(getTransactionReferenceNum, t24_payments_page.check20Field.getText().substring(4));
//            Assert.assertEquals(getTransactionCurrency+getTransactionAmount.replace('.',','),t24_payments_page.check32AField.getText().substring(11));
//            Assert.assertEquals(getInstructedCurrency+getInstructedAmount.replace('.',','),t24_payments_page.check33BField.getText().substring(5));
//            Assert.assertEquals(getDebitCustomerRate.replace('.',','),t24_payments_page.check36Field.getText().substring(4));
            Assert.assertEquals(getDebitAccountNum, t24_payments_page.check50KField.getText().substring(6));
            Assert.assertEquals(getBeneficiaryAccount, t24_payments_page.check59Field.getText().substring(5));
            Assert.assertEquals(getChargeOption, t24_payments_page.check71AField.getText().substring(5));
        } else if (t24_payments_page.msgType.isVisible()) {
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            FileUtils.FileString(name + "MX Message", "company ID:" + t24_payments_page.companyId.getText());
            FileUtils.FileString(name + "MX Message", "FT Number:" + t24_payments_page.getGetFtNumber.getText());
            FileUtils.FileString(name + "MX Message", "Send Ref:" + t24_payments_page.sendRef.getText());
            FileUtils.FileString(name + "MX Message", "Send Date Time:" + t24_payments_page.sendDateTime.getText());
            FileUtils.FileString(name + "MX Message", "message Type:" + t24_payments_page.msgType.getText());
            FileUtils.FileString(name + "MX Message", "message Content:" + t24_payments_page.msgContent.getText());
            List<WebElementFacade> trList = t24_payments_page.trList;
            for (int i = 2; i < trList.size() - 2; i++) {
                FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList.size() - 2) {
                    break;
                }
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent35);
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            bddUtil.scrollWindowToElement(t24_payments_page.msgContent70);
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            t24_payments_page.clickNextPage.click();
            bddUtil.sleep(2);
            bddUtil.screenShort();
            if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
                WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
            } else {
                WordUtils.photoStorageToFXPaymentMX(WordPath);
            }
            List<WebElementFacade> trList2 = t24_payments_page.trList;
            for (int i = 1; i <= trList2.size() - 2; i++) {
                FileUtils.FileString(name + "MX Message", getDriver().findElement(By.xpath("//table[@id='datadisplay']//tr[@id='r" + i + "']/td[6]")).getText());
                if (i == trList2.size() - 2) {
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
    public void searchForex(String forex) {
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
    public void forexAuthorize(String forex, String userAuth, String WordPath) {
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()) {
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
            if (sumPage.size() == 0) {
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            } else {
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
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()) {
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()) {
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenu(forex, WordPath);
            bddUtil.quitDriver();
        } else {
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
    public void forexAuthorizeDifferentCurrency(String forex, String userAuth, String WordPath) {
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()) {
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
            if (sumPage.size() == 0) {
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            } else {
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
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()) {
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()) {
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenuDifferentCurrency(forex, WordPath);
            bddUtil.quitDriver();
        } else {
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
    public void forexAuthorizeToLocalPayment(String forex, String userAuth, String WordPath) {
        searchForex(forex);
        if (t24_payments_page.forexPageNoData.isVisible()) {
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
            if (sumPage.size() == 0) {
                for (int i = 0; i < amount.size(); i++) {
                    if (amount.get(i).getText().equals(getTransactionAmount)) {
                        detailsInformation.get(i).click();
                        break;
                    }
                }
            } else {
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
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    amend.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.validateDeal.click();
            if (t24_payments_page.clickErrorMessage.isVisible()) {
                t24_payments_page.clickErrorMessage.click();
                bddUtil.sleep(5);
                t24_payments_page.clickDownBox.click();
                t24_payments_page.selectData.click();
            }
            t24_payments_page.commitTheDeal.click();
            if (t24_payments_page.clickAcceptOverrides.isVisible()) {
                t24_payments_page.clickAcceptOverrides.click();
            }
            switchToDefaultContent();
            switchToFirstFrame();
            List<WebElementFacade> authoriseBtn = t24_payments_page.authoriseBtn;
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
            switchToDefaultContent();
            switchToSecondFrame();
            t24_payments_page.clickAuthorisesADeal.click();
            getDriver().quit();
            useToLogInToTSITEnvironment(userAuth);
            selectUnauthorizedForexDealsMenuToLocalPayment(forex, WordPath);
        } else {
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
    public void checkT24AndPo() {
        bddUtil.sleep(5);
        currencyBought = t24_payments_page.currencyBought.getText();
        FileUtils.FileString4("t24", "currencyBought:" + currencyBought);
        amountBought = t24_payments_page.amountBought.getText();
        FileUtils.FileString4("t24", "amountBought:" + amountBought);
        currencySold = t24_payments_page.currencySold.getText();
        FileUtils.FileString4("t24", "currencySold:" + currencySold);
        amountSold = t24_payments_page.amountSold.getText();
        FileUtils.FileString4("t24", "amountSold:" + amountSold);
        spotRate = t24_payments_page.spotRate.getText();
        FileUtils.FileString4("t24", "spotRate:" + spotRate);
//        spotLcyAmount = t24_payments_page.spotLcyAmount.getText();
//        FileUtils.FileString4("t24","spotLcyAmount:" + spotLcyAmount);
        ourAccountRec = t24_payments_page.ourAccountRec.getText();
        FileUtils.FileString4("t24", "ourAccountRec:" + ourAccountRec);
        ourAccountPay = t24_payments_page.ourAccountPay.getText();
        FileUtils.FileString4("t24", "ourAccountPay:" + ourAccountPay);
        treasuryRate = t24_payments_page.treasuryRate.getText();
        FileUtils.FileString4("t24", "treasuryRate:" + treasuryRate);
        lTranRef = t24_payments_page.lTranRef.getText();
        FileUtils.FileString4("t24", "lTranRef:" + lTranRef);
        Assert.assertEquals(getTransactionCurrency, currencyBought);
        Assert.assertEquals(getTransactionAmount, amountBought);
        Assert.assertEquals(getInstructedCurrency, currencySold);
        if (getDebitTreasuryRate.equals(spotRate)) {
            Assert.assertEquals(getDebitTreasuryRate, spotRate);
            bddUtil.scrollWindowToElement(t24_payments_page.treasuryRate);
            Assert.assertEquals(getDebitTreasuryRate, treasuryRate);
        } else {
            FileUtils.FileString4("t24", "Rate对比:[" + getDebitTreasuryRate + "," + spotRate + "],[" + getDebitTreasuryRate + "," + treasuryRate + "]");
        }

//        Assert.assertEquals(getTransactionAmount,spotLcyAmount);
//        Assert.assertEquals(getCreditAccountNum,ourAccountRec);
//        Assert.assertEquals(getDebitAccountNum,ourAccountPay);
//        Assert.assertEquals(getTransactionReferenceNum,lTranRef);
    }

    @Step
    public void selectUnauthorizedForexDealsMenu(String forex, String WordPath) {
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
        if (sumPage.size() == 0) {
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        } else {
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

    public void checkRateInternalTransfer(String WordPath) {
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
        Assert.assertEquals(getDebitTreasuryRate, t24_payments_page.getPriceRate.getText());
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
    }

    public void checkRateOverseaDifferentCurrencyMT(String WordPath) {
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
        Assert.assertEquals(getDebitTreasuryRate, t24_payments_page.getPriceRate.getText());
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
    }

    public void checkRateOverseaDifferentCurrencyMX(String WordPath) {
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
        Assert.assertEquals(getDebitTreasuryRate, t24_payments_page.getPriceRate.getText());
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
    }

    @Step
    public void selectUnauthorizedForexDealsMenuDifferentCurrency(String forex, String WordPath) {
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
        if (sumPage.size() == 0) {
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        } else {
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
    public void selectUnauthorizedForexDealsMenuToLocalPayment(String forex, String WordPath) {
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
        if (sumPage.size() == 0) {
            for (int i = 0; i < amount.size(); i++) {
                if (amount.get(i).getText().equals(getTransactionAmount)) {
                    authoriseBtn.get(i).click();
                    break;
                }
            }
        } else {
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
    public void fundsTransfer(String cmd, String WordPath) {
        inputBox(cmd);
        jumpNewWindows(cmd);
        getDriver().manage().window().maximize();
        t24_payments_page.clickFundsTransfer.sendKeys(t24TransactionReference);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        t24_payments_page.clickViewContractBtn.click();
    }

    @Step
    public void iWillMapThePageData(String WordPath) {
        bddUtil.sleep(2);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        FileUtils.FileString4("t24", "getStatus:null");
        fundsTransferDebitAccountNum = t24_payments_page.fundsTransferDebitAccountNum.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + fundsTransferDebitAccountNum);
        fundsTransferDebitCurrency = t24_payments_page.fundsTransferDebitCurrency.getText();
        FileUtils.FileString4("t24", "getDebitAccountCurrency:" + fundsTransferDebitCurrency);
        fundsTransferCreditCurrency = t24_payments_page.fundsTransferCreditCurrency.getText();
        FileUtils.FileString4("t24", "getCreditAccountCurrency:" + fundsTransferCreditCurrency);
        fundTransferCreditAccNo = t24_payments_page.fundTransferCreditAccNo.getText();
        FileUtils.FileString4("t24", "getCreditAccountNum:" + fundTransferCreditAccNo);
        fundsTransferAmountDebited = t24_payments_page.fundsTransferAmountDebited.getText();
        FileUtils.FileString4("t24", "getDebitAmount:" + fundsTransferAmountDebited);
        fundsTransferAmoyntCredited = t24_payments_page.fundsTransferAmoyntCredited.getText();
        FileUtils.FileString4("t24", "getCreditAmount:" + fundsTransferAmoyntCredited);
        bddUtil.scrollWindowToElement(t24_payments_page.fundsTransferAmoyntCredited);
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
//        Assert.assertEquals(fundsTransferDebitAccountNum,readtxtFile("autopay/t24","ChannelDebitAccountNumber"));
        Assert.assertEquals(fundsTransferDebitCurrency, readtxtFile("autopay/t24", "ChannelDebitAccountCurrency"));
//      Assert.assertEquals(fundsTransferCreditCurrency,readtxtFile("autopay/t24","ChannelCreditAccountCurrency"));
        Assert.assertEquals(fundTransferCreditAccNo, readtxtFile("autopay/t24", "ChannelCreditAccountNumber"));
    }

    @Step
    public void findInputArrangement() {
        t24_payments_page.inputArrangement.clear();
        t24_payments_page.inputArrangement.sendKeys(paymentService_step.transferAccount);
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
    }

    @Step
    public void findInputArrangementLocalFundPaymentUI(String WordPath) {
        t24_payments_page.inputArrangement.clear();
        t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getDebitAccountNum"));
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
    }

    @Step
    public void findInputArrangementPaymentUI(String WordPath) {
        t24_payments_page.inputArrangement.clear();
        if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getDebitAccountNum"));
        } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getDebitAccountNum"));
        }
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
        bddUtil.screenShort();
        if (WordPath.equals("SGD-USD") || WordPath.equals("USD-SGD") || WordPath.equals("Internal Transfer USD-SGD MCY") || WordPath.equals("Internal Transfer SGD-USD MCY")) {
            WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")) {
            WordUtils.photoStorageToLocalPayment(WordPath);
        }
        if (readtxtFile("autopay/t24", "getStatus").equals("999")) {
            if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD")) {
                closeAllTabJumpToHomePage();
                clickFindAccountMenu();
                switchToDefaultContent();
                bddUtil.switchToNewWindow();
                t24_payments_page.inputArrangement.clear();
                t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getCreditAccountNum"));
                t24_payments_page.getClickFindBtn.click();
                t24_payments_page.clickOverViewBtn.click();
                bddUtil.switchToNewWindow();
                getDriver().manage().window().maximize();
                bddUtil.sleep(5);
                Double debitAmount = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getDebitAmount")));
                Double debitCustomerRate = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getDebitCustomerRate")));
                String price = null;
                if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD")) {
                    price = String.format("%.2f", (debitAmount * debitCustomerRate));
                } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD")) {
                    price = String.format("%.2f", (debitAmount / debitCustomerRate));
                }
                BigDecimal num3 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
                BigDecimal num4 = new BigDecimal(t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                Assert.assertEquals(price, t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                String testResult = String.valueOf(num3.add(num4));
                System.out.println(testResult);
                String getDifference1 = creatCustomers_step.solve(testResult);
                if (getDifference1.equals(t24_payments_page.getDifference.getText())) {
                    System.out.println("金额比对成功！");
                }
                bddUtil.screenShort();
                if (WordPath.equals("SGD-USD") || WordPath.equals("USD-SGD") || WordPath.equals("Internal Transfer USD-SGD MCY") || WordPath.equals("Internal Transfer SGD-USD MCY")) {
                    WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
                } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")) {
                    WordUtils.photoStorageToLocalPayment(WordPath);
                }
            } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
                closeAllTabJumpToHomePage();
                clickFindAccountMenu();
                switchToDefaultContent();
                bddUtil.switchToNewWindow();
                t24_payments_page.inputArrangement.clear();
                t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getCreditAccountNum"));
                t24_payments_page.getClickFindBtn.click();
                t24_payments_page.clickOverViewBtn.click();
                bddUtil.switchToNewWindow();
                getDriver().manage().window().maximize();
                bddUtil.sleep(5);
                Double debitAmount = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getCreditAmount")));
                BigDecimal num3 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
                BigDecimal num4 = new BigDecimal(t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                Assert.assertEquals(debitAmount, t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                String testResult = String.valueOf(num3.add(num4));
                System.out.println(testResult);
                String getDifference1 = creatCustomers_step.solve(testResult);
                if (getDifference1.equals(t24_payments_page.getDifference.getText())) {
                    System.out.println("金额比对成功！");
                }
                bddUtil.screenShort();
                if (WordPath.equals("SGD-USD") || WordPath.equals("USD-SGD") || WordPath.equals("Internal Transfer USD-SGD MCY") || WordPath.equals("Internal Transfer SGD-USD MCY")) {
                    WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
                } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")) {
                    WordUtils.photoStorageToLocalPayment(WordPath);
                }
            }
        }
    }

    @Step
    public void findInputArrangementOverseasPaymentUI(String WordPath) {
        t24_payments_page.inputArrangement.clear();
        if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getDebitAccountNum"));
        } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getDebitAccountNum"));
        }
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
        bddUtil.screenShort();
        final boolean b = WordPath.equals("Bic is DBS USD-SGD") || WordPath.equals("Bic is Bank of China USD-SGD") || WordPath.equals("Bic is DBS USD-SGD MCY");
        final boolean b1 = WordPath.equals("Bic is DBS SGD-SGD") || WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China SGD-SGD") || WordPath.equals("Bic is Bank of China USD-USD") || WordPath.equals("Bic is DBS USD-USD MCY") || WordPath.equals("Bic is DBS SGD-SGD MCY");
        final boolean b2 = WordPath.equals("Bic is DBS SGD-USD") || WordPath.equals("Bic is Bank of China SGD-USD") || WordPath.equals("Bic is DBS SGD-USD MCY");
        if (b) {
            WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        } else if (b1) {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        } else if (b2) {
            WordUtils.photoStorageToFxPaymentMT(WordPath);
        }
        if (readtxtFile("autopay/t24", "getStatus").equals("999")) {
            if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD")) {
                closeAllTabJumpToHomePage();
                clickFindAccountMenu();
                switchToDefaultContent();
                bddUtil.switchToNewWindow();
                t24_payments_page.inputArrangement.clear();
                t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getCreditAccountNum"));
                t24_payments_page.getClickFindBtn.click();
                t24_payments_page.clickOverViewBtn.click();
                bddUtil.switchToNewWindow();
                getDriver().manage().window().maximize();
                bddUtil.sleep(5);
                Double debitAmount = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getDebitAmount")));
                Double debitCustomerRate = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getDebitCustomerRate")));
                String price = null;
                if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD")) {
                    price = String.format("%.2f", (debitAmount * debitCustomerRate));
                } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD")) {
                    price = String.format("%.2f", (debitAmount / debitCustomerRate));
                }
                BigDecimal num3 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
                BigDecimal num4 = new BigDecimal(t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                Assert.assertEquals(price, t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                String testResult = String.valueOf(num3.add(num4));
                System.out.println(testResult);
                String getDifference1 = creatCustomers_step.solve(testResult);
                if (getDifference1.equals(t24_payments_page.getDifference.getText())) {
                    System.out.println("金额比对成功！");
                }
                bddUtil.screenShort();
                if (b) {
                    WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
                } else if (b1) {
                    WordUtils.photoStorageToFXPaymentMX(WordPath);
                } else if (b2) {
                    WordUtils.photoStorageToFxPaymentMT(WordPath);
                }
            } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
                closeAllTabJumpToHomePage();
                clickFindAccountMenu();
                switchToDefaultContent();
                bddUtil.switchToNewWindow();
                t24_payments_page.inputArrangement.clear();
                t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "getCreditAccountNum"));
                t24_payments_page.getClickFindBtn.click();
                t24_payments_page.clickOverViewBtn.click();
                bddUtil.switchToNewWindow();
                getDriver().manage().window().maximize();
                bddUtil.sleep(5);
                Double debitAmount = Double.parseDouble(String.valueOf(readtxtFile("autopay/t24", "getCreditAmount")));
                BigDecimal num3 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
                BigDecimal num4 = new BigDecimal(t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                Assert.assertEquals(debitAmount, t24_payments_page.firstCreditAmount.getText().replace(",", ""));
                String testResult = String.valueOf(num3.add(num4));
                System.out.println(testResult);
                String getDifference1 = creatCustomers_step.solve(testResult);
                if (getDifference1.equals(t24_payments_page.getDifference.getText())) {
                    System.out.println("金额比对成功！");
                }
                bddUtil.screenShort();
                if (b) {
                    WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
                } else if (b1) {
                    WordUtils.photoStorageToFXPaymentMX(WordPath);
                } else if (b2) {
                    WordUtils.photoStorageToFxPaymentMT(WordPath);
                }
            }
        }
    }

    @Step
    public void findMCYInputArrangement() {
        t24_payments_page.inputArrangement.clear();
        t24_payments_page.inputArrangement.sendKeys(paymentService_step.transferAccount.substring(0, 11));
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        if (paymentServiceStep.transferCurrency.equals("SGD")) {
            t24_payments_page.clickMultiCurrencySGDOverview.click();
        } else if (paymentServiceStep.transferCurrency.equals("USD")) {
            t24_payments_page.getClickMultiCurrencyUSDOverview.click();
        }
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
    }

    //    输入T24ID查询客户状态
    @Step
    public void inputCustomerID() {
        String T24ID = FileUtils.LastReadFileInput3("SCF-T24ID");
        switchToFirstFrame();
        t24_payments_page.inputBox.clear();
        t24_payments_page.inputBox.sendKeys("CUSTOMER");
        t24_payments_page.searchBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        t24_payments_page.customerIdInput.sendKeys(T24ID);
        bddUtil.sleep(1);
        t24_payments_page.selectT24ID.click();
        bddUtil.sleep(10);
    }

    @Step
    public void checkCustomerType() throws Exception {
        if (t24_payments_page.customerType.getText().equals("Active")) {
            System.out.println("账户信息正确。");
        } else {
            throw new Exception("账户状态不对。");
        }
    }

    //  进入客户详细信息页面
    @Step
    public void EnterCustomerTails() {
        bddUtil.sleep(2);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        bddUtil.sleep(1);
        t24_payments_page.clickProducts.click();
        bddUtil.sleep(1);
        t24_payments_page.FindCustomer.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        t24_payments_page.CustomerIDInput.clear();
        t24_payments_page.CustomerIDInput.sendKeys(FileUtils.LastReadFileInput3("SCF-T24ID"));
        bddUtil.sleep(1);
        t24_payments_page.FindBtn.click();
        getDriver().findElements(By.xpath("//a[@title='Select Drilldown']")).get(0).click();
        t24_payments_page.viewCustomer.click();
        bddUtil.sleep(1);
        t24_payments_page.loansBtn.click();
        bddUtil.sleep(4);
//       把AccountID存进AccountID.txt里面
        FileUtils.FileString4("AccountID", t24_payments_page.AccountID.getText());
    }

    @Step
    public void enterDrillDown() {
        t24_payments_page.SelectDrilldown.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void checkLoanAmount() throws Exception {
        if (t24_payments_page.LoanAmount.get(0).getText().equals(FileUtils.LastReadFileInput3("LoanAmount"))) {
            System.out.println("放款金额校验成功");
        } else {
            throw new Exception("放款金额对比失败");
        }
    }

    @Step
    public void checkRepaymentStatus() throws Exception {
        String RepaymentID = FileUtils.LastReadFileInput3("AccountID");
        if (t24_payments_page.repaymentID.getText().equals(RepaymentID)) {
            System.out.println("还款成功");
        } else {
            throw new Exception("还款失败");
        }
    }

    @Step
    public void clickISOCustomerTransfer() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.ISOPaymentTransfer.click();
        t24_payments_page.OutgoingIsoCustomerTransfer.click();
        bddUtil.sleep(3);
    }

    @Step
    public void clickOutGoingCustomerTransfer() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.ISOPaymentTransfer.click();
        t24_payments_page.OutgoingCustomerTransfer.click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickOutgoingISOTransfer() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.ISOPaymentTransfer.click();
        t24_payments_page.OutgoingIsoBankTransfer.click();
        bddUtil.sleep(2);
    }


    @Step
    public void enterCustomerTransferPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void enterISOCustomerTransferPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void enterISOBankTransferPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void enterDisbursementExternalPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void enterDisbursementSGMEPSPage(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    //    Outgoing SGD-SGD输入信息
    @Step
    public void inputInformationOnCustomerTransferPage(String InstructedAgentBic, String TransactionCurrency, String TransactionAmount, String DebitAccountNumber, String DebitAccountCurrency, String CreditorAccount, String CreditorName) {
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBic);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitAccountCurrency.sendKeys(DebitAccountCurrency);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        bddUtil.sleep(2);
    }

    //    Outgoing USD-USD输入信息

    @Step
    public void inputInformationOnOutgoingCustomerTransferPage(String DebitAccountNumber, String ReceiverInstitutionBIC, String DebitAccountCurrency, String TransactionCurrency, String TransactionAmount, String BeneficiaryAccount, String BeneficiaryName) {
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.InstructedAgentBic.sendKeys(ReceiverInstitutionBIC);
        t24_payments_page.DebitAccountCurrency.sendKeys(DebitAccountCurrency);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.CreditorAccount.sendKeys(BeneficiaryAccount);
        t24_payments_page.CreditorName.sendKeys(BeneficiaryName);
        bddUtil.sleep(2);
    }


    //    输入streetName 、Town Name 、 Creditor Country
    @Step
    public void inputStreetName(String StreetName, String TownName, String CreditorCountry) {
        t24_payments_page.StreetName.sendKeys(StreetName);
        t24_payments_page.TownName.sendKeys(TownName);
        t24_payments_page.CreditorCountry.sendKeys(CreditorCountry);
        bddUtil.sleep(2);
    }

    @Step
    public void inputInformationOnOutgoingISOBankTransfer(String InstructedAgentBIC, String TransactionCurrency, String TransactionAmount, String DebitAccountNumber, String CreditorAccount, String CreditorBic, String CreditorName) {
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBIC);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorBic.sendKeys(CreditorBic);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        bddUtil.sleep(2);
    }

    @Step
    public void inputInformationOnOutgoingISOBankTransferUSD(String InstructedAgentBIC, String TransactionCurrency, String TransactionAmount, String DebitAccountNumber,String CreditorBic){
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBIC);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.CreditorBic.sendKeys(CreditorBic);
        bddUtil.sleep(2);
    }

    @Step
    public void inputSendersReference(String SenderReference, String EndToEndIdentification) {
        t24_payments_page.SenderReference.sendKeys(SenderReference);
        t24_payments_page.EndToEndIdentification.sendKeys(EndToEndIdentification);
        bddUtil.sleep(2);
    }

    @Step
    public void clickPreSubmit() {
        bddUtil.sleep(1);
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(4);
        t24_payments_page.Commit.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickAcceptOver() {
        if (t24_payments_page.clickAcceptOverrides.isVisible()) {
            t24_payments_page.clickAcceptOverrides.click();
        }
        bddUtil.sleep(3);
    }

    //    进入一级授权页面
    @Step
    public void enterPendingAuthorise() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.PendingAuthorisePayments.click();
        bddUtil.sleep(2);
    }

    //  进入Exceptions-Payment Enquiry-Transaction wise页面，点击查询
    @Step
    public void enterPaymentsEnquiryTransactionWisePage() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.clickPaymentInquiriesMenu.click();
        t24_payments_page.TransactionWise.click();
        bddUtil.sleep(2);
    }

    //    根据OENumber Number进行查询 审批
    @Step
    public void inputOEbitAccNumber() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
//        点击放大镜
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(t24_payments_page.inputOENumber).sendKeys(FileUtils.LastReadFileInput3("OENumber"));
//        bddUtil.scrollWindowToElement(t24_payments_page.inputDebitAccNumber).sendKeys(DebitAccNumber);
        bddUtil.sleep(2);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        String FTNumber = t24_payments_page.getGetFtNumber.getText();
        FileUtils.FileString4("FTNumber", FTNumber);
        t24_payments_page.Auth.click();
        bddUtil.sleep(5);
        switchToDefaultContent();
//        进入第二个 frame
        switchToSecondFrame();
        t24_payments_page.AuthorisesADeal.click();
        bddUtil.sleep(3);
    }

    //    根据FTNumber Number进行查询 审批
    @Step
    public void inputFTNumberAuthorise() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
//        点击放大镜
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(t24_payments_page.inputFTNumber).sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
//        bddUtil.scrollWindowToElement(t24_payments_page.inputDebitAccNumber).sendKeys(DebitAccNumber);
        bddUtil.sleep(2);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        String FTNumber = t24_payments_page.getGetFtNumber.getText();
        FileUtils.FileString4("FTNumber", FTNumber);
        t24_payments_page.Auth.click();
        bddUtil.sleep(5);
        switchToDefaultContent();
//        进入第二个 frame
        switchToSecondFrame();
        t24_payments_page.AuthorisesADeal.click();
        bddUtil.sleep(3);
    }


    //    根据PI Number进行查询
    @Step
    public void inputPINumber() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        //    拼接PI号  根据对应的PI号 去授权
        String PINumber = FileUtils.LastReadFileInput3("LoanPINumber");
        getDriver().findElement(By.xpath("//td[text()='"+PINumber+"']/following-sibling::td[18]/a")).click();
        bddUtil.sleep(4);
        t24_payments_page.AuthorisesADeal.click();
        bddUtil.sleep(3);
    }


    //    获取当前交易的OE值
    @Step
    public void getOENumber() {
        String oeNumber = t24_payments_page.OENumber.getText();
        FileUtils.FileString4("OENumber", oeNumber);
    }

    @Step
    public void getLoanPINumber() {
        String PINumber = t24_payments_page.OENumber.getText();
        FileUtils.FileString4("LoanPINumber", PINumber);
    }

    //   输入FTNumber进行查询
    @Step
    public void inputFTNumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        bddUtil.sleep(1);
        t24_payments_page.inputFTNumber.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(3);
    }

    //   输入LoanPINumber进行查询
    @Step
    public void inputLoanPINumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        t24_payments_page.inputFileSendersReference.sendKeys(FileUtils.LastReadFileInput3("LoanPINumber"));
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(3);
    }

//    改变状态为235的数据,USD要点击2个按钮，SGD不点击
    @Step
    public void changeStatusCodeSGD(){
        String FTNumber = t24_payments_page.getFTNumber.getText();
        FileUtils.FileString4("FTNumber",FTNumber);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToSecondFrame();
        bddUtil.sleep(1);
//        在首页进行 状态更改。
        t24_payments_page.PendingRepairPayments.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(1);
        t24_payments_page.inputFTNumber.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
//        t24_payments_page.inputFTNumber.sendKeys("SGL22164BDLF0JDF");
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        t24_payments_page.Modify.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        t24_payments_page.getClickChargeInformation.click();
        String value = t24_payments_page.WaiveCreditCharges.getAttribute("value");
        String value1 = t24_payments_page.RepairFee.getAttribute("value");
//        if (value.equals("on")){
//            t24_payments_page.WaiveCreditCharges.click();
//        }else {
//            System.out.println("数据正常");
//        }
//        if (value1.equals("on")){
//            t24_payments_page.RepairFee.click();
//        }else {
//            System.out.println("数据正常");
//        }
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(4);
        t24_payments_page.Commit.click();
        bddUtil.sleep(4);
    }

    //    改变状态为235的数据,USD要点击2个按钮，SGD不点击
    @Step
    public void changeStatusCodeUSD(){
        String FTNumber = t24_payments_page.getFTNumber.getText();
        FileUtils.FileString4("FTNumber",FTNumber);
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToSecondFrame();
        bddUtil.sleep(1);
//        在首页进行 状态更改。
        t24_payments_page.PendingRepairPayments.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(1);
        t24_payments_page.inputFTNumber.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
//        t24_payments_page.inputFTNumber.sendKeys("SGL22164BDLF0JDF");
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        t24_payments_page.Modify.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        t24_payments_page.getClickChargeInformation.click();
        String value = t24_payments_page.WaiveCreditCharges.getAttribute("value");
        String value1 = t24_payments_page.RepairFee.getAttribute("value");
        if (value.equals("on")){
            t24_payments_page.WaiveCreditCharges.click();
        }else {
            System.out.println("数据正常");
        }
        if (value1.equals("on")){
            t24_payments_page.RepairFee.click();
        }else {
            System.out.println("数据正常");
        }
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(4);
        t24_payments_page.Commit.click();
        bddUtil.sleep(4);
    }

    //    检验状态是不是677，并且进入详情页面
    @Step
    public void enterView() throws Exception {
        String statusCode = t24_payments_page.statusCode.getText();
        if (statusCode.equals("677") | statusCode.equals("999")) {
            System.out.println("状态码正常");
        } else {
            throw new Exception("状态码异常:"+statusCode);
        }
        bddUtil.sleep(2);
        t24_payments_page.View.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    @Step
    public void clickChargeInformation() {
        t24_payments_page.ChargeInformation.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickRoutingformation() {
        t24_payments_page.Routingformation.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickAdditionalInfo() {
        t24_payments_page.AdditionalInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickAdditionalInfoUSD() {
        t24_payments_page.AdditionalInfoUSD.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickAdditionalInfoSGMEPS(){
        t24_payments_page.AdditionalInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickErrorInformation() {
        t24_payments_page.ErrorInformation.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickExtendedDebtorInfo() {
        t24_payments_page.ExtendedDebtorInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickExtendedCreditorInfo() {
        t24_payments_page.ExtendedCreditorInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickUltimateDebtorInfo() {
        t24_payments_page.UltimateDebtorInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickUltimateCreditorInfo() {
        t24_payments_page.UltimateCreditorInfo.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickRegulatoryReporting() {
        t24_payments_page.RegulatoryReporting.click();
//        为了页面能展示左边的数据，下面也同理。
        bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
        bddUtil.sleep(4);
    }

    @Step
    public void clickRegulatoryReportingSGMEPS() {
        t24_payments_page.RegulatoryReporting.click();
//        为了页面能展示左边的数据，下面也同理。
        bddUtil.scrollWindowToElement(t24_payments_page.SGMEPSTitle);
        bddUtil.sleep(4);
    }

    @Step
    public void clickStructuredRemittanceInfo() {
        t24_payments_page.StructuredRemittanceInfo.click();
        bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
        bddUtil.sleep(4);
    }

    @Step
    public void clickStructuredRemittanceInfoSGMEPS() {
        t24_payments_page.StructuredRemittanceInfo.click();
        bddUtil.scrollWindowToElement(t24_payments_page.SGMEPSTitle);
        bddUtil.sleep(4);
    }

    @Step
    public void clickPrevInstrAgents() {
        t24_payments_page.PrevInstrAgents.click();
        bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
        bddUtil.sleep(4);
    }

    @Step
    public void clickPrevInstrAgentsSGMEPS() {
        t24_payments_page.PrevInstrAgents.click();
        bddUtil.scrollWindowToElement(t24_payments_page.SGMEPSTitle);
        bddUtil.sleep(4);
    }

    //    OE Outgoing Bank Transfer的按钮
    @Step
    public void clickPrevInstrAgentsOEBank() {
        t24_payments_page.PrevInstrAgents.click();
        bddUtil.sleep(4);
    }


    @Step
    public void clickChangedFields() {
        t24_payments_page.ChangedFields.click();
        bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
        bddUtil.sleep(4);
    }

    @Step
    public void clickChangedFieldsSGMEPS() {
        t24_payments_page.ChangedFields.click();
        bddUtil.scrollWindowToElement(t24_payments_page.SGMEPSTitle);
        bddUtil.sleep(4);
    }

    @Step
    public void clickChangedFieldsLoan() {
        t24_payments_page.ChangedFields.click();
        bddUtil.sleep(4);
    }

    //    OE Outgoing Bank Transfer的按钮
    @Step
    public void clickChangedFieldsOEBank() {
        t24_payments_page.ChangedFields.click();
        bddUtil.sleep(4);
    }

    @Step
    public void clickAudit() {
        t24_payments_page.Audit.click();
        bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
        bddUtil.sleep(4);
    }

    @Step
    public void clickAuditSGMEPS() {
        t24_payments_page.Audit.click();
        bddUtil.scrollWindowToElement(t24_payments_page.SGMEPSTitle);
        bddUtil.sleep(4);
    }

    @Step
    public void clickAuditLoan() {
        t24_payments_page.Audit.click();
        bddUtil.sleep(4);
    }

    //    OE Outgoing Bank Transfer的按钮
    @Step
    public void clickAuditOEBank() {
        t24_payments_page.Audit.click();
        bddUtil.sleep(4);
    }

    //    切入到 ViewDetails页面
    @Step
    public void clickViewDetail() {
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        switchToFirstFrame();
        t24_payments_page.ViewDetails.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    //    选择Accounting Entries查看详情
    @Step
    public void selectAccountingEntries() {
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.AccountingEntries.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(5);
    }

    //    选择Outgoing message查看详情
    @Step
    public void selectOutgoingMessage() {
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.OutgoingMessage.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(5);
//       退出第一个frame，进入第二个frame
        switchToDefaultContent();
        switchToSecondFrame();
    }

    //    将XML报文写入Payment_xml文件
    @Step
    public void writeXML() {
        //        int size = t24_payments_page.xmlText.size();
//        for (int i = 0; i < size; i++) {
//            String xmlText = t24_payments_page.xmlText.get(i).getText();
//            FileUtils.writeXML("Payment_XML",xmlText);
//            System.out.println("第"+i+"行报文已经写入成功");
//        }
//        bddUtil.sleep(1);
////        判断XML报文 是否还有第二页
//        t24_payments_page.xmlNext.isVisible();
//        if (t24_payments_page.xmlNext.isVisible()){
//            t24_payments_page.xmlNext.click();
//
//        }
        for (int j = 0; j < 5; j++) {
            int size = t24_payments_page.xmlText.size();
            if (t24_payments_page.xmlNext.isVisible()) {
                for (int i = 0; i < size; i++) {
                    String xmlText = t24_payments_page.xmlText.get(i).getText();
                    FileUtils.writeXML("Payment_XML", xmlText);
                    System.out.println("第" + i + "行报文已经写入成功");
                }
                t24_payments_page.xmlNext.click();
            } else {
                for (int i = 0; i < size; i++) {
                    String xmlText = t24_payments_page.xmlText.get(i).getText();
                    FileUtils.writeXML("Payment_XML", xmlText);
                    System.out.println("第" + i + "行报文已经写入成功");
                }
//                 return;
                break;
            }
            bddUtil.sleep(2);
        }
    }

    //    点击核心的Products按钮，然后点击Loan Transactions按钮
    @Step
    public void clickProductsLoanTransactionsBtn() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickProducts.click();
        t24_payments_page.LoanTransactions.click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickDisbursementExternal() {
        t24_payments_page.DisbursementExternal.click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickDisbursementSGMEPS(){
        t24_payments_page.DisbursementSGMEPS.click();
        bddUtil.sleep(1);
    }

    //    补充LoanDisbursement External	页面的信息
    @Step
    public void inputLoanDisbursementExternal(String LoanDebitAccountNumber, String LoanDebitCurrency, String LoanPaymentCurrency, String LoanPaymentAmount) {
        t24_payments_page.DebitAccountNumberLoan.sendKeys(LoanDebitAccountNumber);
        t24_payments_page.LoanDebitCurrency.sendKeys(LoanDebitCurrency);
        t24_payments_page.LoanPaymentCurrency.sendKeys(LoanPaymentCurrency);
        t24_payments_page.LoanPaymentAmount.sendKeys(LoanPaymentAmount);
        bddUtil.sleep(1);
    }

    //    补充LoanDisbursement SGMEPS	页面的信息
    @Step
    public void inputLoanDisbursementSGMEPS(String DebitAccountNumber_SGMEPS,String DebitCurrency_SGMEPS,String PaymentCurrency_SGMEPS,String PaymentAmount_SGMEPS,String BeneficiaryAccountNo_SGMEPS,String BeneficiaryBankBIC_SGMEPS,String BeneficiaryName_SGMEPS){
        bddUtil.sleep(1);
        t24_payments_page.newDeal.click();
        bddUtil.sleep(2);
        t24_payments_page.DebitAccountNumber_SGMEPS.sendKeys(DebitAccountNumber_SGMEPS);
        t24_payments_page.DebitCurrency_SGMEPS.sendKeys(DebitCurrency_SGMEPS);
        t24_payments_page.PaymentCurrency_SGMEPS.sendKeys(PaymentCurrency_SGMEPS);
        t24_payments_page.PaymentAmount_SGMEPS.sendKeys(PaymentAmount_SGMEPS);
        t24_payments_page.BeneficiaryAccountNo_SGMEPS.sendKeys(BeneficiaryAccountNo_SGMEPS);
        t24_payments_page.BeneficiaryBankBIC_SGMEPS.sendKeys(BeneficiaryBankBIC_SGMEPS);
        t24_payments_page.BeneficiaryName_SGMEPS.sendKeys(BeneficiaryName_SGMEPS);
        bddUtil.scrollWindowToElement(t24_payments_page.PaymentOrderProductTitle);
        bddUtil.sleep(3);
    }

    //    补充Beneficiary Details Page的详细信息
    @Step
    public void inputBeneficiaryDetailsPage(String BeneficiaryAccountNo, String BeneficiaryName) {
        t24_payments_page.BeneficiaryAccountNo.sendKeys(BeneficiaryAccountNo);
        t24_payments_page.BeneficiaryName.sendKeys(BeneficiaryName);
        bddUtil.sleep(1);
    }

    @Step
    public void inputBeneficiaryDetailsOnSGMEPS(String BeneficiaryStreetName,String BeneficiaryPostCode,String BeneficiaryTownName,String BeneficiaryCountry,String BeneficiaryResidenceCountry){
        t24_payments_page.BeneficiaryStreetName_SGMEPS.sendKeys(BeneficiaryStreetName);
        t24_payments_page.BeneficiaryPostCode_SGMEPS.sendKeys(BeneficiaryPostCode);
        t24_payments_page.BeneficiaryTownName_SGMEPS.sendKeys(BeneficiaryTownName);
        t24_payments_page.BeneficiaryCountry_SGMEPS.sendKeys(BeneficiaryCountry);
        t24_payments_page.BeneficiaryResidenceCountry_SGMEPS.sendKeys(BeneficiaryResidenceCountry);
        bddUtil.scrollWindowToElement(t24_payments_page.BeneficiaryBICTitle);
        bddUtil.sleep(3);

    }

    //    进入RoutingDetails页面
    @Step
    public void clickRoutingDetails() {
        t24_payments_page.LoanRoutingDetails.click();
        bddUtil.sleep(1);
    }

//    RoutingDetails页面 补充信息
    @Step
    public void inputInformationOnRoutingDetail(String AccountWithBankBIC,String AccountWithTownName,String AccountWithBankCountry){
        bddUtil.scrollWindowToElement(t24_payments_page.inputLoanAccountWithBankBIC).sendKeys(AccountWithBankBIC);
        t24_payments_page.inputLoanAccountWithTownName.sendKeys(AccountWithTownName);
        t24_payments_page.inputLoanAccountWithBankCountry.sendKeys(AccountWithBankCountry);
        bddUtil.sleep(2);
    }

//    审批Loan交易页面
    @Step
    public void clickAuthoriseArrangements(){
        t24_payments_page.AuthoriseArrangements.click();
        bddUtil.sleep(1);
    }

    public void ClickLoanTransactions() {
        bddUtil.sleep(2);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickProducts.click();
        t24_payments_page.clickLoanTransactions.click();
        bddUtil.sleep(3);
        t24_payments_page.clickDisbursementInternal.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    public void inputInformationOnAADisbursementInternalPage(String DebitAccountNumber, String DebitCurrency, String PaymentAmount, String PaymentCurrency, String CreditorAccount) {
        t24_payments_page.InternalDebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitCurrency.sendKeys(DebitCurrency);
        t24_payments_page.PaymentAmount.sendKeys(PaymentAmount);
        t24_payments_page.PaymentCurrency.sendKeys(PaymentCurrency);
        t24_payments_page.InternalCreditorAccount.sendKeys(CreditorAccount);
        bddUtil.sleep(2);
    }

}
