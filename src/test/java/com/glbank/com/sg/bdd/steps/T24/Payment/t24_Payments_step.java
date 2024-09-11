package com.glbank.com.sg.bdd.steps.T24.Payment;

import cn.hutool.core.date.DateUtil;
import com.glbank.com.sg.bdd.pages.T24.Payment.t24_Payments_page;
import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.paymentService_step;
import com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.glbank.com.sg.bdd.utils.*;
import cucumber.api.DataTable;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public static String systemPath = System.getProperty("user.dir");
    String OEExcel = systemPath + "/src/test/resources/testData/T24Excel/OE.xlsx";
    String LoanExcel = systemPath + "/src/test/resources/testData/T24Excel/LOAN.xlsx";
    String InComingExcel = systemPath + "/src/test/resources/testData/T24Excel/InComing.xlsx";
    String TreasuryExcel = systemPath + "/src/test/resources/testData/T24Excel/Treasury.xlsx";

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
    public void checkFT()  {
        //清除数据
//        FileUtils.writeFile("t24");
        t24_payments_page.clickCleraSelectionBtn.click();
        t24_payments_page.inputChannelId.clear();
        t24_payments_page.inputChannelId.sendKeys(readtxtFile("autopay/t24", "ChannelReferenceID"));
        bddUtil.sleep(5);
        t24_payments_page.clickFindBtn.click();
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        String t24TransactionReference = t24_payments_page.t24TransactionReference.getText();
        FileUtils.FileString4("LoanPINumber", t24TransactionReference);
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
    public void clickFindMultiCurrencyS() {
        t24_payments_page.FindMultiCurrency.click();
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
        FileUtils.FileString4("t24", "FTNumber:" + t24FtNumber);
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
    public void closeAllTabJumpToHome() {
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        switchToSecondFrame();
        bddUtil.sleep(1);
    }

    @Step
    public void closeAllTabJumpToPage() {
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        switchToSecondFrame();
        bddUtil.sleep(1);
    }


    @Step
    public void closeAllTabJumpToHomePage() {
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        switchToSecondFrame();
       bddUtil.sleep(1);
    }

    @Step
    public void closeTabJumpToHomePage() {
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToSecondFrame();
    }

    @Step
    public void closetheCurrent() {
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
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

    @Step
    public void getFtNumberOnMxMessage22(String WordPath) {
        bddUtil.sleep(2);
        t24FtNumber = t24_payments_page.getFtNumber.getText();
        FileUtils.FileString4("t24", "t24FtNumber:" + t24FtNumber);
        getDriver().manage().window().maximize();
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
        bddUtil.sleep(3);
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
 //      t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
//        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
//        t24_payments_page.getAdditionalInformation.click();
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD") || WordPath.equals("Bic is Bank of China USD-USD")) {
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        t24_payments_page.getClickChargeInformation.click();
        bddUtil.sleep(3);
        t24_payments_page.getAudit.click();
        bddUtil.sleep(2);
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
//        Assert.assertEquals(getDebitAccountNum, readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
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
//      宇康说不用校验
//        Assert.assertEquals(getOrderingName, readtxtFile("autopay/t24", "ChannelDebitAccountName"));
        Assert.assertEquals(getBeneficiaryName, readtxtFile("autopay/t24", "ChannelDetailPayeeName"));
//        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
//        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
//        t24_payments_page.getAdditionalInformation.click();
        t24_payments_page.getAudit.click();
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
//        t24_payments_page.getClickChargeInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
//        t24_payments_page.getRoutingInformation.click();
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
//        t24_payments_page.getAdditionalInformation.click();
        t24_payments_page.getAudit.click();
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
//        bddUtil.closeWindow();
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
//        因为FOREX注释掉了,所以这些也得注释掉，等待forex非注释，下面就非注释。
      /*  bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();*/
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
//       因为商一句feature 注释掉了，所以下面5句代码也注释掉。
        /* bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();*/
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
//      因为上一句feature注掉了，所以下面5行业注掉了。
        /*      bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();*/
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
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
        } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
        }
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        String currency = readtxtFile("autopay/t24","ChannelDebitAccountCurrency").toString();
        if (currency.equals("SGD")){
            t24_payments_page.clickMultiCurrencySGDOverview.click();
            bddUtil.switchToNewWindow();
            getDriver().manage().window().maximize();
        }else {
            t24_payments_page.getClickMultiCurrencyUSDOverview.click();
            bddUtil.switchToNewWindow();
            getDriver().manage().window().maximize();
        }
        BigDecimal num1 = new BigDecimal(t24_payments_page.getMinuend.getText().replace(",", ""));
        BigDecimal num2 = new BigDecimal(t24_payments_page.firstDebitAmount.getText().replace(",", ""));
        String result = String.valueOf(num1.subtract(num2));
        System.out.println(result);
        String getDifference = creatCustomers_step.solve(result);
        if (getDifference.equals(t24_payments_page.getDifference.getText())) {
            System.out.println("金额比对成功！");
        }
        bddUtil.sleep(3);
        bddUtil.screenShort();
        if (WordPath.equals("SGD-USD") || WordPath.equals("USD-SGD") || WordPath.equals("Internal Transfer USD-SGD MCY") || WordPath.equals("Internal Transfer SGD-USD MCY")) {
            WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")) {
            WordUtils.photoStorageToLocalPayment(WordPath);
        }else {
            WordUtils.photoStorageToFXPaymentMX(WordPath);
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
                } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")|| WordPath.equals("USD-SGD MCY")) {
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
                } else if (WordPath.equals("SGD-SGD") || WordPath.equals("USD-USD") || WordPath.equals("SGD-SGD MCY") || WordPath.equals("USD-USD MCY")|| WordPath.equals("USD-SGD MCY")) {
                    WordUtils.photoStorageToLocalPayment(WordPath);
                }
            }
        }
    }

    @Step
    public void findInputArrangementOverseasPaymentUI(String WordPath) {
        t24_payments_page.inputArrangement.clear();
        if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
        } else if (readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("USD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("USD") || readtxtFile("autopay/t24", "getDebitAccountCurrency").equals("SGD") && readtxtFile("autopay/t24", "getCreditAccountCurrency").equals("SGD")) {
            t24_payments_page.inputArrangement.sendKeys(readtxtFile("autopay/t24", "ChannelDebitAccountNumber"));
        }
        t24_payments_page.getClickFindBtn.click();
        t24_payments_page.clickOverViewBtn.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
        String currency = readtxtFile("autopay/t24","ChannelDebitAccountCurrency").toString();
        if (currency.equals("SGD")){
            t24_payments_page.clickMultiCurrencySGDOverview.click();
            bddUtil.switchToNewWindow();
            getDriver().manage().window().maximize();
        }else {
            t24_payments_page.getClickMultiCurrencyUSDOverview.click();
            bddUtil.switchToNewWindow();
            getDriver().manage().window().maximize();
        }
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
    public void AssertionEnterISOCustomerTransferPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        Assert.assertEquals(t24_payments_page.OutgoingISOTransferTitle.getText(),"Order Entry Outgoing ISO Transfer (CTR)");
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
    public void AssertEnterLoanDisbursementPage(){
        String loanTitle = t24_payments_page.LoanDisbursementTitle.getText();
        Assert.assertEquals(loanTitle,"AA Loan Disbursement External");
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
    public void inputInformationOnCustomerTransferPage() {
        // 从Excel里读取数据
        String InstructedAgentBic = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Instructed Agent Bic", 1);
        String TransactionCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Transaction Currency", 1);
        String TransactionAmount = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Transaction Amount", 1);
        String DebitAccountNumber = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Number", 1);
        String DebitAccountCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Currency", 1);
        String CreditorAccount = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Account", 1);
        String CreditorName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Name", 1);
        String ChargeOption = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Charge Option", 1);
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBic);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitAccountCurrency.sendKeys(DebitAccountCurrency);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        t24_payments_page.ChargeOption.click();
       getDriver().findElement(By.xpath("//option[text()='"+ChargeOption+"']")).click();
        bddUtil.sleep(2);
        //新增的字段Output Channel选择，填写BIC
        String BIC = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "BIC", 1);
        String outputChannel = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "output Channel", 1);
        bddUtil.sleep(1);
        if (!outputChannel.equals("")){
            t24_payments_page.OutputChannel.sendKeys("NOSTRO");
        }
        if (!BIC.equals("")){
            t24_payments_page.getRoutingInformation.click();
            t24_payments_page.BICInput.sendKeys(BIC);
            bddUtil.sleep(1);
        }
    }

    //    Outgoing SGD-SGD输入信息
    @Step
    public void inputInformationOnCustomerTransferPageTest(int a) {
        // 从Excel里读取数据
        String InstructedAgentBic = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Instructed Agent Bic", a);
        String TransactionCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Transaction Currency", a);
        String TransactionAmount = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Transaction Amount", a);
        String DebitAccountNumber = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Number", a);
        String DebitAccountCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Currency", a);
        String CreditorAccount = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Account", a);
        String CreditorName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Name", a);
        String ChargeOption = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Charge Option", a);
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBic);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitAccountCurrency.sendKeys(DebitAccountCurrency);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        t24_payments_page.ChargeOption.click();
        getDriver().findElement(By.xpath("//option[text()='"+ChargeOption+"']")).click();
        bddUtil.sleep(2);

    }

    //    Outgoing USD-USD输入信息

    @Step
    public void inputInformationOnOutgoingCustomerTransferPage(String DebitAccountNumber, String ReceiverInstitutionBIC, String DebitAccountCurrency, String TransactionCurrency, String TransactionAmount, String BeneficiaryAccount, String BeneficiaryName, String ChargeOption) {
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.InstructedAgentBic.sendKeys(ReceiverInstitutionBIC);
        t24_payments_page.DebitAccountCurrency.sendKeys(DebitAccountCurrency);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.CreditorAccount.sendKeys(BeneficiaryAccount);
        t24_payments_page.CreditorName.sendKeys(BeneficiaryName);
//        t24_payments_page.ChargeOption.click();
        // getDriver().findElement(By.xpath("//option[text()='"+ChargeOption+"']")).click();
        bddUtil.sleep(2);
    }

//    Outgoing USD-USD输入Beneficiary Address和 	Beneficiary Town
    @Step
    public void inputBeneficiaryAddress(String BeneficiaryAddress,String BeneficiaryAddressTwo){
        bddUtil.scrollWindowToElement(t24_payments_page.BeneficiaryAddress).sendKeys(BeneficiaryAddress);
        t24_payments_page.BeneficiaryAddressTwo.sendKeys(BeneficiaryAddressTwo);
        bddUtil.sleep(3);
    }



    //    输入streetName 、Town Name 、 Creditor Country
    @Step
    public void clickDetails() {
        t24_payments_page.clickimposeinformation.click();
    }


    @Step
    public void inputStreetName() {
        String StreetName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Street Name", 1);
        String TownName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Town Name", 1);
        String CreditorCountry = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Country", 1);
        String PostCode = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Post Code", 1);
        String DebitAccountNumber1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Number1", 1);
        String DebitName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Name", 1);
        String StreetName1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Street Name1", 1);
        String PostCode1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Post Code1", 1);
        String TownName1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Town Name1", 1);
        String DebtorCountry = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debtor Country", 1);
        t24_payments_page.StreetName.sendKeys(StreetName);
        t24_payments_page.TownName.sendKeys(TownName);
        t24_payments_page.CreditorCountry.sendKeys(CreditorCountry);
        t24_payments_page.PostCode.sendKeys(PostCode);
        t24_payments_page.DebitAccountNumber1.sendKeys(DebitAccountNumber1);
        t24_payments_page.DebitName.sendKeys(DebitName);
        t24_payments_page.StreetName1.sendKeys(StreetName1);
        t24_payments_page.PostCode1.sendKeys(PostCode1);
        t24_payments_page.TownName1.sendKeys(TownName1);
        t24_payments_page.DebtorCountry.sendKeys(DebtorCountry);
        bddUtil.sleep(2);
    }

    @Step
    public void inputStreetNameTest(int a) {
        String StreetName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Street Name", a);
        String TownName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Town Name", a);
        String CreditorCountry = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Creditor Country", a);
        String PostCode = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Post Code", a);
        String DebitAccountNumber1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Number1", a);
        String DebitName = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Name", a);
        String StreetName1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Street Name1", a);
        String PostCode1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Post Code1", a);
        String TownName1 = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Town Name1", a);
        String DebtorCountry = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debtor Country", a);
        t24_payments_page.StreetName.sendKeys(StreetName);
        t24_payments_page.TownName.sendKeys(TownName);
        t24_payments_page.CreditorCountry.sendKeys(CreditorCountry);
        t24_payments_page.PostCode.sendKeys(PostCode);
        t24_payments_page.DebitAccountNumber1.sendKeys(DebitAccountNumber1);
        t24_payments_page.DebitName.sendKeys(DebitName);
        t24_payments_page.StreetName1.sendKeys(StreetName1);
        t24_payments_page.PostCode1.sendKeys(PostCode1);
        t24_payments_page.TownName1.sendKeys(TownName1);
        t24_payments_page.DebtorCountry.sendKeys(DebtorCountry);
        bddUtil.sleep(2);
        //新增的字段Output Channel选择，填写BIC
        String BIC = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "BIC", a);
        String outputChannel = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "output Channel", a);
        bddUtil.sleep(1);
        if (!outputChannel.equals("")){
            t24_payments_page.OutputChannel.sendKeys("NOSTRO");
        }
        if (!BIC.equals("")){
            t24_payments_page.getRoutingInformation.click();
            t24_payments_page.BICInput.sendKeys(BIC);
            bddUtil.sleep(1);
        }
    }

    @Step
    public void inputInformationOnOutgoingISOBankTransfer() {
        //从Excel读取数据
        String InstructedAgentBIC = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Instructed Agent BIC", 1);
        String TransactionCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Currency", 1);
        String TransactionAmount = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Amount", 1);
        String DebitAccountNumber = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Debit Account Number", 1);
        String CreditorAccount = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Account", 1);
        String CreditorBic = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Bic", 1);
        String CreditorName = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Name", 1);
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBIC);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorBic.sendKeys(CreditorBic);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        bddUtil.sleep(2);
        //新增的字段Output Channel选择，填写BIC
        String BIC = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "BIC", 1);
        String outputChannel = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "output Channel", 1);
        if (!outputChannel.equals("")){
            t24_payments_page.OutputChannel.sendKeys("NOSTRO");
        }
        bddUtil.sleep(1);
        if (!BIC.equals("")){
            t24_payments_page.BICInput.sendKeys(BIC);
            bddUtil.sleep(1);
        }
    }

    @Step
    public void inputInformationOnOutgoingISOBankTransferTest(int a) {
        //从Excel读取数据
        String InstructedAgentBIC = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Instructed Agent BIC", a);
        String TransactionCurrency = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Currency", a);
        String TransactionAmount = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Amount", a);
        String DebitAccountNumber = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Debit Account Number", a);
        String CreditorAccount = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Account", a);
        String CreditorBic = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Bic", a);
        String CreditorName = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Name", a);
        t24_payments_page.InstructedAgentBic.sendKeys(InstructedAgentBIC);
        t24_payments_page.TransactionCurrency.sendKeys(TransactionCurrency);
        t24_payments_page.TransactionAmount.sendKeys(TransactionAmount);
        t24_payments_page.DebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.CreditorAccount.sendKeys(CreditorAccount);
        t24_payments_page.CreditorBic.sendKeys(CreditorBic);
        t24_payments_page.CreditorName.sendKeys(CreditorName);
        bddUtil.sleep(2);
        //新增的字段Output Channel选择，填写BIC
        String BIC = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "BIC", a);
        String outputChannel = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "output Channel", a);
        if (!outputChannel.equals("")){
            t24_payments_page.OutputChannel.sendKeys("NOSTRO");
        }
        bddUtil.sleep(1);
        if (!BIC.equals("")){
            t24_payments_page.getRoutingInformation.click();
            t24_payments_page.BICInput.sendKeys(BIC);
            bddUtil.sleep(1);
        }
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
    public void inputSendersReference() {
        //从Excel里读取数据
        String StreetName2 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Street Name2", 1);
        String PostCode2 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Post Code2", 1);
        String TownName3 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Town Name3", 1);
        String CreditorCountry3 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Country3", 1);
        String SenderReference = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Sender Reference", 1);
        String EndToEndIdentification = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "End To End Identification", 1);
        t24_payments_page.StreetName2.sendKeys(StreetName2);
        t24_payments_page.PostCode2.sendKeys(PostCode2);
        t24_payments_page.TownName3.sendKeys(TownName3);
        t24_payments_page.CreditorCountry3.sendKeys(CreditorCountry3);
        t24_payments_page.SenderReference.sendKeys(SenderReference);
        t24_payments_page.EndToEndIdentification.sendKeys(EndToEndIdentification);
        bddUtil.sleep(2);
    }

    @Step
    public void inputSendersReferenceTest(int a) {
        t24_payments_page.getback.click();
        //从Excel里读取数据
        String StreetName2 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Street Name2", a);
        String PostCode2 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Post Code2", a);
        String TownName3 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Town Name3", a);
        String CreditorCountry3 = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Creditor Country3", a);
        String SenderReference = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Sender Reference", a);
        String EndToEndIdentification = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "End To End Identification", a);
        t24_payments_page.StreetName2.sendKeys(StreetName2);
        t24_payments_page.PostCode2.sendKeys(PostCode2);
        t24_payments_page.TownName3.sendKeys(TownName3);
        t24_payments_page.CreditorCountry3.sendKeys(CreditorCountry3);
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

    @Step
    public void assertResultSuccessful(){
        String message = t24_payments_page.message.getText().substring(0,12);
        Assert.assertEquals(message,"Txn Complete");
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

//    在Incoming页面用表格 的方式 输入FTNumber
    @Step
    public void inputFTNumberClickFindOnIncoming(String FTNumber) {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(1);
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        switchToFirstFrame();
        bddUtil.sleep(1);
        t24_payments_page.inputFTNumber.sendKeys(FTNumber);
        bddUtil.sleep(1);
        t24_payments_page.Find.click();
        bddUtil.sleep(1);
}

    @Step
    public void inputFTNumberClickFindOnIncomingTest(int a) {
        String FTNumber = ExcelUtils.readExcel(InComingExcel, "Incoming", "FTNumber", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(1);
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        switchToFirstFrame();
        bddUtil.sleep(1);
        t24_payments_page.inputFTNumber.sendKeys(FTNumber);
        bddUtil.sleep(1);
        t24_payments_page.Find.click();
        bddUtil.sleep(1);
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
        t24_payments_page.ChargeInformation2.click();
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
        bddUtil.sleep(30);
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
        if (statusCode.equals("677") | statusCode.equals("999")| statusCode.equals("660")) {
            System.out.println("状态码正常");
        } else {
            throw new Exception("状态码异常:"+statusCode);
        }
        bddUtil.sleep(2);
        t24_payments_page.View.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void assertEnterViewPage(){
        String ViewPageTitle = t24_payments_page.ViewPageTitle.getText();
//      判断 标题是Repair ie Screen OR View Screen
        Assert.assertTrue(StringUtils.equalsAny(ViewPageTitle, "Repair View Screen", "View Screen"));
    }

    @Step
    public void assertLoanEnterViewPage(){
        String LoanViewPageTitle = t24_payments_page.LoanViewPageTitle.getText();
//      判断 标题是Repair ie Screen OR View Screen
        Assert.assertTrue(StringUtils.equalsAny(LoanViewPageTitle, "Repair View Screen", "View Screen"));
        bddUtil.sleep(1);
    }

    @Step
    public void clickChargeInformation() {
        t24_payments_page.ChargeInformation.click();
        bddUtil.sleep(3);
    }


    @Step
    public void clickChargeInformation2() {
        t24_payments_page.ChargeInformation.click();
        bddUtil.sleep(3);
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
  //      bddUtil.scrollWindowToElement(t24_payments_page.BalanceReservation);
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
        bddUtil.sleep(2);
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
        bddUtil.sleep(2);
    }

    //    选择Accounting Entries查看详情
    @Step
    public void selectAccountingEntries() {
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.AccountingEntries.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(3);
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

    @Step
    public void AssertEnterViewDetailsPage(){
        String EnterViewDetailsTitle = t24_payments_page.ViewDetailsPageTitle.getText();
        bddUtil.sleep(2);
        Assert.assertEquals(EnterViewDetailsTitle,"Options");
    }

    //    选择Audit trail查看详情
    @Step
    public void selectAuditTrail() {
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.AuditTrail.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(3);
//       退出第一个frame，进入第二个frame
        switchToDefaultContent();
        switchToSecondFrame();
        String src = getDriver().findElement(By.xpath("//img[@title='Next Page']")).getAttribute("src");
        System.out.println("未置灰" + src);
//        判断是否是最后一页
        for (int i = 0; i < 5; i++) {
            if (t24_payments_page.xmlNext.isVisible()) {
               t24_payments_page.xmlNext.click();
                bddUtil.sleep(1);
            } else {
                break;
            }
        }
//        判断是否是最后一页
        String src2 = getDriver().findElement(By.xpath("//img[@title='Next Page']")).getAttribute("src");
        System.out.println("置灰" + src2);
//        if (src.equals("../plaf/images/default/tools/right dis.gif")){
//           }else{
//        break；
//    }

//       退出第二个frame，进入第一个frame
        switchToDefaultContent();
        switchToFirstFrame();
    }

//    选择进入Posting  Lines页面
     @Step
     public void selectPostingLines(){
         t24_payments_page.selectOptions.click();
         bddUtil.sleep(2);
         t24_payments_page.PostingLines.click();
         bddUtil.sleep(2);
         t24_payments_page.iconLink.click();
         bddUtil.sleep(3);
     }

    //    选择进入Received Message页面
    @Step
    public void selectReceivedMessage(){
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.ReceivedMessage.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(3);
    }

    //    选择进入Fees Applied页面
    @Step
    public void selectFeesApplied(){
        t24_payments_page.selectOptions.click();
        bddUtil.sleep(2);
        t24_payments_page.FeesApplied.click();
        bddUtil.sleep(2);
        t24_payments_page.iconLink.click();
        bddUtil.sleep(5);
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
        //       退出第二个frame，进入第一个frame
        switchToDefaultContent();
        switchToFirstFrame();
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
    public void inputLoanDisbursementExternal() {
        //Excel作为数据驱动
        String LoanDebitAccountNumber = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Debit Account Number", 1);
        String LoanDebitCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Debit Currency", 1);
        String LoanPaymentCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Payment Currency", 1);
        String LoanPaymentAmount = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Payment Amount", 1);
        String LoanBeneficiaryCountryCode = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Country Code", 1);
        t24_payments_page.DebitAccountNumberLoan.sendKeys(LoanDebitAccountNumber);
        t24_payments_page.LoanDebitCurrency.sendKeys(LoanDebitCurrency);
        t24_payments_page.LoanPaymentCurrency.sendKeys(LoanPaymentCurrency);
        t24_payments_page.LoanPaymentAmount.sendKeys(LoanPaymentAmount);
//        t24_payments_page.LoanBeneficiaryCountryCode.sendKeys(LoanBeneficiaryCountryCode);
        bddUtil.sleep(1);
    }

    @Step
    public void inputLoanDisbursementExternalTest(int a) {
        //Excel作为数据驱动
        String LoanDebitAccountNumber = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Debit Account Number", a);
        String LoanDebitCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Debit Currency", a);
        String LoanPaymentCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Payment Currency", a);
        String LoanPaymentAmount = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Payment Amount", a);
        String LoanBeneficiaryCountryCode = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Country Code", a);
        t24_payments_page.DebitAccountNumberLoan.sendKeys(LoanDebitAccountNumber);
        t24_payments_page.LoanDebitCurrency.sendKeys(LoanDebitCurrency);
        t24_payments_page.LoanPaymentCurrency.sendKeys(LoanPaymentCurrency);
        t24_payments_page.LoanPaymentAmount.sendKeys(LoanPaymentAmount);
//        t24_payments_page.LoanBeneficiaryCountryCode.sendKeys(LoanBeneficiaryCountryCode);
        bddUtil.sleep(1);
    }

    //    补充LoanDisbursement SGMEPS	页面的信息
    @Step
    public void inputLoanDisbursementSGMEPS(){
        //从Excel里读取数据
        String DebitAccountNumber_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Debit Account Number", 1);
        String DebitCurrency_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Debit Currency", 1);
        String PaymentCurrency_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Payment Currency", 1);
        String PaymentAmount_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Payment Amount", 1);
        String BeneficiaryAccountNo_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Account No", 1);
        String BeneficiaryBankBIC_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Bank BIC", 1);
        String BeneficiaryName_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Name", 1);
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

    @Step
    public void inputLoanDisbursementSGMEPSTest(int a){
        //从Excel里读取数据
        String DebitAccountNumber_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Debit Account Number", a);
        String DebitCurrency_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Debit Currency", a);
        String PaymentCurrency_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Payment Currency", a);
        String PaymentAmount_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Payment Amount", a);
        String BeneficiaryAccountNo_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Account No", a);
        String BeneficiaryBankBIC_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Bank BIC", a);
        String BeneficiaryName_SGMEPS = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Name", a);
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
    public void inputBeneficiaryDetailsPage() {
        //从Excel里读取数据
        String BeneficiaryAccountNo = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Account No", 1);
        String BeneficiaryName = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Name", 1);
        t24_payments_page.BeneficiaryAccountNo.sendKeys(BeneficiaryAccountNo);
        t24_payments_page.BeneficiaryName.sendKeys(BeneficiaryName);
        bddUtil.sleep(1);
    }

    @Step
    public void inputBeneficiaryDetailsPageTest(int a) {
        //从Excel里读取数据
        String BeneficiaryAccountNo = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Account No", a);
        String BeneficiaryName = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Beneficiary Name", a);
        t24_payments_page.BeneficiaryAccountNo.sendKeys(BeneficiaryAccountNo);
        t24_payments_page.BeneficiaryName.sendKeys(BeneficiaryName);
        bddUtil.sleep(1);
    }

    @Step
    public void inputBeneficiaryDetailsOnSGMEPS(){
        //从Excel里读取数据
        String BeneficiaryStreetName = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Street Name", 1);
        String BeneficiaryPostCode = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Post Code", 1);
        String BeneficiaryTownName = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Town Name", 1);
        String BeneficiaryCountry = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Country", 1);
        String BeneficiaryResidenceCountry = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Residence Country", 1);
        t24_payments_page.BeneficiaryStreetName_SGMEPS.sendKeys(BeneficiaryStreetName);
        t24_payments_page.BeneficiaryPostCode_SGMEPS.sendKeys(BeneficiaryPostCode);
        t24_payments_page.BeneficiaryTownName_SGMEPS.sendKeys(BeneficiaryTownName);
        t24_payments_page.BeneficiaryCountry_SGMEPS.sendKeys(BeneficiaryCountry);
        t24_payments_page.BeneficiaryResidenceCountry_SGMEPS.sendKeys(BeneficiaryResidenceCountry);
        bddUtil.scrollWindowToElement(t24_payments_page.BeneficiaryBICTitle);
        bddUtil.sleep(3);

    }

    @Step
    public void inputBeneficiaryDetailsOnSGMEPSTest(int a){
        //从Excel里读取数据
        String BeneficiaryStreetName = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Street Name", a);
        String BeneficiaryPostCode = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Post Code", a);
        String BeneficiaryTownName = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Town Name", a);
        String BeneficiaryCountry = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Country", a);
        String BeneficiaryResidenceCountry = ExcelUtils.readExcel(LoanExcel, "Loan_SGMEPS", "Beneficiary Residence Country", a);
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
    public void inputInformationOnRoutingDetail(){
        //从Excel里读取数据
        String AccountWithBankBIC = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account with Bank BIC", 1);
        String AccountWithTownName = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account With Town Name", 1);
        String AccountWithBankCountry = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account with Bank Country", 1);
        bddUtil.scrollWindowToElement(t24_payments_page.inputLoanAccountWithBankBIC).sendKeys(AccountWithBankBIC);
        t24_payments_page.inputLoanAccountWithTownName.sendKeys(AccountWithTownName);
        t24_payments_page.inputLoanAccountWithBankCountry.sendKeys(AccountWithBankCountry);
        bddUtil.sleep(2);
    }

    @Step
    public void inputInformationOnRoutingDetailTest(int a){
        //从Excel里读取数据
        String AccountWithBankBIC = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account with Bank BIC", a);
        String AccountWithTownName = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account With Town Name", a);
        String AccountWithBankCountry = ExcelUtils.readExcel(LoanExcel, "Loan_External", "Account with Bank Country", a);
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

    @Step
    public void inputInformationOnAADisbursementInternalPage() {
        //从Excel里读取数据
        String DebitAccountNumber = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Debit Account Number", 1);
        String DebitCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Debit Currency", 1);
        String PaymentAmount = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Payment Amount", 1);
        String PaymentCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Payment Currency", 1);
        String CreditorAccount = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Creditor Account", 1);
        t24_payments_page.InternalDebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitCurrency.sendKeys(DebitCurrency);
        t24_payments_page.PaymentAmount.sendKeys(PaymentAmount);
        t24_payments_page.PaymentCurrency.sendKeys(PaymentCurrency);
        t24_payments_page.InternalCreditorAccount.sendKeys(CreditorAccount);
        bddUtil.sleep(2);
    }

    @Step
    public void inputInformationOnAADisbursementInternalPageTest(int a) {
        //从Excel里读取数据
        String DebitAccountNumber = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Debit Account Number", a);
        String DebitCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Debit Currency", a);
        String PaymentAmount = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Payment Amount", a);
        String PaymentCurrency = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Payment Currency", a);
        String CreditorAccount = ExcelUtils.readExcel(LoanExcel, "Loan_Internal", "Creditor Account", a);
        t24_payments_page.InternalDebitAccountNumber.sendKeys(DebitAccountNumber);
        t24_payments_page.DebitCurrency.sendKeys(DebitCurrency);
        t24_payments_page.PaymentAmount.sendKeys(PaymentAmount);
        t24_payments_page.PaymentCurrency.sendKeys(PaymentCurrency);
        t24_payments_page.InternalCreditorAccount.sendKeys(CreditorAccount);
        bddUtil.sleep(2);
    }

    @Step
    public void ClickFindAccount() {
        bddUtil.sleep(2);
        t24_payments_page.clickProducts.click();
        bddUtil.sleep(2);
        t24_payments_page.clickFindAccount.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    @Step
    public void clickFindMultiCurrency(){
        bddUtil.sleep(2);
        t24_payments_page.clickProducts.click();
        bddUtil.sleep(2);
        t24_payments_page.FindMultiCurrency.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    public void InputArrangement(String arrangement) {
        bddUtil.sleep(2);
        t24_payments_page.InputArrangement.clear();
        t24_payments_page.InputArrangement.sendKeys(arrangement);
    }

    @Step
    public void InputArrangementTest(int a) {
        String arrangement = ExcelUtils.readExcel(InComingExcel, "Incoming", "Arrangement", a);
        bddUtil.sleep(2);
        t24_payments_page.InputArrangement.clear();
        t24_payments_page.InputArrangement.sendKeys(arrangement);
    }

    public void ClickFindButt() {
        bddUtil.sleep(1);
        t24_payments_page.clickFindButt1.click();
        t24_payments_page.clickFindButt2.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    @Step
    public void AssertEnterAccountDetailsPage(){
        String text = t24_payments_page.AccountDetailsTitle.getText();
        Assert.assertEquals(text,"Account Details");
    }

    @Step
    public void clickUSDOverView(){
        t24_payments_page.USDOverView.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }

    @Step
    public void clickSGDOverView(){
        t24_payments_page.SGDOverView.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(5);
    }


    @Step
    public void clickAccountTransfer() {
        t24_payments_page.clickAccountTransfer.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    public void InputTransferInformation(String debit_account, String debit_amount, String debit_currency, String credit_account, String credit_currency, String ordering_bank) {
        t24_payments_page.debit_account.sendKeys(debit_account);
        t24_payments_page.debit_amount.sendKeys(debit_amount);
        t24_payments_page.debit_currency.sendKeys(debit_currency);
        t24_payments_page.credit_account.sendKeys(credit_account);
        t24_payments_page.credit_currency.sendKeys(credit_currency);
        t24_payments_page.ordering_bank.sendKeys(ordering_bank);
    }

    public void clickAuthoriseDeleteFTTransactions() {
        t24_payments_page.clickAuthoriseDeleteFTTransactions.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    public void clickSearchBut() {
        switchToFirstFrame();
        t24_payments_page.clickSerchBut.click();
        bddUtil.sleep(1);
    }

    public void InputCreditAccountNo(String credit_account_no) {
        t24_payments_page.credit_account_no.sendKeys(credit_account_no);
    }

    public void clickFind() {
        t24_payments_page.clicFind.click();
    }

    public void clickAuthorizeBut1() {
        t24_payments_page.clickAuthorizeBut1.click();
        bddUtil.sleep(2);
        switchToDefaultContent();
//        进入第二个 frame
        switchToSecondFrame();
        t24_payments_page.clickAuthorizeBut2.click();
    }


    public void ClickRiskManagement() {
        t24_payments_page.ClickRiskManagement.click();
    }

    public void clickLimits() {
        t24_payments_page.clickLimits.click();
    }

    public void ClickLimitMenu() {
        t24_payments_page.ClickLimitMenu.click();
    }

    public void ClickCreateUnsecuredLimit() {
        t24_payments_page.ClickCreateUnsecuredLimit.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);

    }

    public void ClickNewDeal() {
        t24_payments_page.ClickNewDeal.click();
    }

    public void InputLimitDetails(String customer_number, String limit_product, String serial_no, String currency, String internal_amount) {
        t24_payments_page.customer_number.sendKeys(customer_number);
        t24_payments_page.limit_product.sendKeys(limit_product);
        t24_payments_page.serial_no.sendKeys(serial_no);
        t24_payments_page.currency.sendKeys(currency);
        t24_payments_page.internal_amount.sendKeys(internal_amount);
        t24_payments_page.AvailableMarker.click();
        bddUtil.sleep(3);
    }

    public void ClickOtherDetails() {
        t24_payments_page.ClickOtherDetails.click();
        bddUtil.sleep(1);
    }

    public void iInputOtherDetails(String AllowedCcy) {
        t24_payments_page.AllowedCcy.sendKeys(AllowedCcy);
    }

    public void iClickLoanDetails(String loan_interest_rate, String loan_tenor, String settlement_account) {
        t24_payments_page.LoanDetails.click();
        bddUtil.sleep(3);
        t24_payments_page.Loan_Interest_Type.click();
        t24_payments_page.loan_interest_rate.sendKeys(loan_interest_rate);
        t24_payments_page.loan_tenor.sendKeys(loan_tenor);
        t24_payments_page.settlement_account.sendKeys(settlement_account);
        t24_payments_page.Loan_Tenor_Unit.click();
        bddUtil.sleep(5);
    }

    public void ClickAuthoriseDeleteRejectLimit() {
        t24_payments_page.ClickAuthoriseDeleteRejectLimit.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }



    public void GetLimitID() {
        String LimitID = t24_payments_page.LimitID.getText();
        FileUtils.FileString4("LoanPINumber", LimitID);

    }

    public void InputLimitIDAndClickFind() {
        bddUtil.sleep(3);
        //    拼接PI号  根据对应的Limit号 去授权
        String LimitID = FileUtils.LastReadFileInput3("LoanPINumber");
        t24_payments_page.Limit_ID.sendKeys(LimitID);
        t24_payments_page.Find.click();
        bddUtil.sleep(4);
    }

    public void ClickAuthorizeButt() {
        t24_payments_page.clickAuthorizeBut1.click();
        bddUtil.sleep(2);
        t24_payments_page.clickAuthorizeBut2.click();
    }

    public void ClickSearchButt() {
        t24_payments_page.clickSerchBut.click();
        bddUtil.sleep(1);
    }

    public void ClickProductCatalog() {
        t24_payments_page.ClickProductCatalog.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    public void ClickProducts() {
        t24_payments_page.clickProducts.click();
    }

    public void ClickLending() {
//        switchToThirdFrame();
        getDriver().switchTo().frame(t24_payments_page.switchToThirdFrame);
        t24_payments_page.ClickLending.click();
    }

    public void ClickSyndicatedLoans() {
        t24_payments_page.ClickSyndicatedLoans.click();
    }

    public void ClickNewArrangement() {
        switchToDefaultContent();
        getDriver().switchTo().frame(t24_payments_page.switchToFourFrame);
        t24_payments_page.ClickNewArrangement.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
    }

    public void iInputCustomerAndCurrency(String customer, String currency1) {
        t24_payments_page.customer.sendKeys(customer);
        t24_payments_page.currency1.sendKeys(currency1);
        bddUtil.sleep(10);
    }

    public void ClickSubmit() {
        bddUtil.sleep(1);
        t24_payments_page.preSubmit.click();
    }

    public void iInputLimit(String limit_id) {
        bddUtil.sleep(1);
        t24_payments_page.InputLimit.sendKeys(limit_id);
        bddUtil.sleep(1);
    }

    public void iInputCommitment(String amount1, String term, String maturity_date) {
        t24_payments_page.amount1.sendKeys(amount1);
        t24_payments_page.term.sendKeys(term);
        t24_payments_page.maturity_date.sendKeys(maturity_date);
        bddUtil.sleep(1);
    }

    public void InputPrincipalInterest(String fixed,String MinMaxRate) {
        t24_payments_page.Fixed.sendKeys(fixed);
        bddUtil.sleep(1);
        //    拼接PI号  根据对应的AA号
        String Arrangement = FileUtils.LastReadFileInput3("LoanPINumber");
        t24_payments_page.LinkedArrangement.sendKeys(Arrangement);
//        t24_payments_page.Add.click();
//        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[7]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[14]/select/option[2]")).click();
//        t24_payments_page.single.click();
//        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[7]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[16]/select/option[4]")).click();
//        t24_payments_page.MinMaxRate.sendKeys(MinMaxRate);
    }

    public void GetArrangement() {
        String Arrangement = t24_payments_page.Arrangement.getText();
        FileUtils.FileString4("LoanPINumber", Arrangement);
    }

    public void ClcikCCYReferenceAndInput(String currency2, String fixedFloating, String rateIndex) {
        t24_payments_page.CCYReference.click();
        bddUtil.sleep(1);
        t24_payments_page.currency2.sendKeys(currency2);
        t24_payments_page.fixedFloating.sendKeys(fixedFloating);
        t24_payments_page.rateIndex.sendKeys(rateIndex);
        bddUtil.sleep(5);
    }

    public void InputPenaltyInterest(String MinMaxRate2,String Currency3,String FixedFloating3,String RateIndex3) {
        String Arrangement = FileUtils.LastReadFileInput3("LoanPINumber");
        t24_payments_page.LinkedArrangement2.sendKeys(Arrangement);
        t24_payments_page.spread.click();
        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[10]/select/option[1]")).click();
        t24_payments_page.Add2.click();
        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[8]/div/div[3]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[1]/td[14]/select/option[2]")).click();
        t24_payments_page.single2.click();
        t24_payments_page.MinMaxRate2.sendKeys(MinMaxRate2);
        t24_payments_page.LinkedProperty.clear();
        t24_payments_page.LinkedProperty.sendKeys("PRINCIPALINT");
        bddUtil.sleep(2);
        t24_payments_page.CCYReference2.click();
        t24_payments_page.Currency3.sendKeys(Currency3);
        t24_payments_page.FixedFloating3.sendKeys(FixedFloating3);
        t24_payments_page.RateIndex3.sendKeys(RateIndex3);
    }

    public void InputSettlementInstructions(String settlement1, String settlement2,String Active1,String Active2) {
        t24_payments_page.Active1.click();
        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[20]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[2]/select/option[3]")).click();
        t24_payments_page.Active2.click();
        getDriver().findElement(By.xpath("/html/body/div[5]/fieldset[20]/div/div/form[1]/div[3]/table/tbody/tr[3]/td/table[1]/tbody/tr[8]/td[2]/select/option[3]")).click();
        t24_payments_page.settlement1.sendKeys(settlement1);
        t24_payments_page.settlement2.sendKeys(settlement2);
        bddUtil.sleep(2);
//        t24_payments_page.PayIn.click();
//        t24_payments_page.Rule.clear();
//        t24_payments_page.Rule.sendKeys("FULL");
    }

    public void ClickUnauthorizedAAARecords() {
        t24_payments_page.ClickUnauthorizedAAARecords.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
    }

    public void InputArrangementAndFind() {
        t24_payments_page.Limit_ID.clear();
        String Active = FileUtils.LastReadFileInput3("LoanPINumber");
        t24_payments_page.Limit_ID.sendKeys(Active);
        bddUtil.sleep(1);
        t24_payments_page.Find.click();
    }

    public void ClickImproveButt() {
        t24_payments_page.clickAuthorizeBut1.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        t24_payments_page.clickAuthorizeBut3.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        t24_payments_page.clickAuthorizeBut2.click();
    }

    public void GetActive() {
        String GetActive = t24_payments_page.Active.getText();
        FileUtils.FileString4("LoanPINumber", GetActive);
    }

    public void InputFacilityFeesAmortisedAndSTFParticipationFee(String rate,String FixedAmount) {
        bddUtil.sleep(1);
        t24_payments_page.rate.clear();
        t24_payments_page.rate.sendKeys(rate);
        bddUtil.sleep(1);
        t24_payments_page.FixedAmount.clear();
        bddUtil.sleep(1);
        t24_payments_page.FixedAmount.sendKeys(FixedAmount);
    }

    public void iInputSchedule(String startTime, String endTime) {
        bddUtil.sleep(1);
        t24_payments_page.type.clear();
        t24_payments_page.type.sendKeys("INTEREST");
        t24_payments_page.startTime.sendKeys(startTime);
        t24_payments_page.endTime.sendKeys(endTime);
        bddUtil.sleep(1);
    }


    public void ClickFindLoan() {
        t24_payments_page.ClickFindLoan.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
    }

    public void InputArrangement2AndFind() {
        t24_payments_page.Limit_ID.clear();
        String Active = FileUtils.LastReadFileInput4("LoanPINumber");
        t24_payments_page.Limit_ID.sendKeys(Active);
        bddUtil.sleep(1);
        t24_payments_page.Find.click();
    }

    public void ClickFindLoanOverview() {
        t24_payments_page.ClickFindLoanOverview.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
        t24_payments_page.clickschedule.click();
        bddUtil.sleep(5);

    }

    public void ClickAccount() {
        t24_payments_page.ClickAccount.click();
        t24_payments_page.clickAccountEntries.click();
        t24_payments_page.clickEntriesForToday.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
    }

    public void InputAccountAndFind(String accountNo) {
        t24_payments_page.Limit_ID.clear();
        t24_payments_page.Limit_ID.sendKeys(accountNo);
        bddUtil.sleep(1);
        t24_payments_page.Find.click();
        bddUtil.sleep(4);
    }

    public void InputLIMITAndFind() {
        t24_payments_page.LIMIT.sendKeys("LIMIT");
        bddUtil.sleep(1);
        t24_payments_page.duihao.click();
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
    }

    public void FIND() {
        String Active = FileUtils.LastReadFileInput3("LoanPINumber");
        t24_payments_page.LIMITINPUT.sendKeys(Active);
        bddUtil.sleep(1);
        t24_payments_page.fangdajing.click();
        bddUtil.sleep(3);
        bddUtil.scrollWindowToElement(t24_payments_page.zuihou);
        bddUtil.sleep(5);
    }


    public void WaitAMount() {
        bddUtil.sleep(3);
    }

//进入account页面，点击查询
    public void accountID() {
       // switchToSecondFrame();
        //bddUtil.sleep(3);
        //t24_payments_page.clickUsermenu.click();

        t24_payments_page.clickProduct.click();
        t24_payments_page.accountA.click();
        bddUtil.sleep(2);
    }


    public void CurrencyRatesList() {
        //输入值CURRENCY查询
        t24_payments_page.inputBox.sendKeys("CURRENCY");
        t24_payments_page.duihao.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.selectListLiveFile.click();
        t24_payments_page.ListLiveFile.click();
        t24_payments_page.Listgo.click();
        bddUtil.sleep(1);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
    }





    public void accountIDCA() {
//        switchToSecondFrame();
//        bddUtil.sleep(3);
      //  t24_payments_page.clickUsermenu.click();
//单币种
        t24_payments_page.clickProduct.click();
        t24_payments_page.accountB.click();
        bddUtil.sleep(2);
    }


    public void accountIDMCA() {
//多币种
        t24_payments_page.clickProduct.click();
        t24_payments_page.accountA.click();
        bddUtil.sleep(2);
    }

    @Step
    public void inputaccountclickfind() {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Arrangement", 1);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details1.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }

    @Step
    public void inputaccountclickfindTest(int a) {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Arrangement", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        //清空所有数值
        getDriver().findElement(By.xpath("//a[text()='Clear Selection']")).click();
//        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details1.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }

    @Step
    public void inputaccountclickfindIsoBank() {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Arrangement", 1);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details1.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);

    }

    @Step
    public void inputaccountclickfindIsoBankTest(int a) {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Arrangement", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details1.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);

    }

    @Step
    public void inputaccountclickfindSGD() {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Arrangement", 1);
        String Currency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Currency", 1);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        if (Currency.equals("SGD")) {
            t24_payments_page.CASGD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("USD")) {
            t24_payments_page.CAUSD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("CNY")) {
            t24_payments_page.CACNY.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("HKD")) {
            t24_payments_page.CAHKD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AUD")) {
            t24_payments_page.CAAUD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AED")) {
            t24_payments_page.CAAED.click();
            bddUtil.sleep(5);
        } else {
            t24_payments_page.CAEUR.click();
            bddUtil.sleep(5);
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }

    @Step
    public void inputaccountclickfindSGDTest(int a) {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Arrangement", a);
        String Currency = ExcelUtils.readExcel(OEExcel, "ISO_Customer", "Debit Account Currency", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        if (Currency.equals("SGD")) {
            t24_payments_page.CASGD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("USD")) {
            t24_payments_page.CAUSD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("CNY")) {
            t24_payments_page.CACNY.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("HKD")) {
            t24_payments_page.CAHKD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AUD")) {
            t24_payments_page.CAAUD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AED")) {
            t24_payments_page.CAAED.click();
            bddUtil.sleep(5);
        }else if (Currency.equals("GBP")) {
            t24_payments_page.CAGBP.click();
            bddUtil.sleep(5);
        }  else {
            t24_payments_page.CAEUR.click();
            bddUtil.sleep(5);
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }

    @Step
    public void inputaccountclickfindSGDISOBank() {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Arrangement", 1);
        String Currency = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Currency", 1);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        if (Currency.equals("SGD")) {
            t24_payments_page.CASGD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("USD")) {
            t24_payments_page.CAUSD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("CNY")) {
            t24_payments_page.CACNY.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("HKD")) {
            t24_payments_page.CAHKD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AUD")) {
            t24_payments_page.CAAUD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AED")) {
            t24_payments_page.CAAED.click();
            bddUtil.sleep(5);
        } else {
            t24_payments_page.CAEUR.click();
            bddUtil.sleep(5);
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }

    @Step
    public void inputaccountclickfindSGDISOBankTest(int a) {
        String Arrangement = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Arrangement", a);
        String Currency = ExcelUtils.readExcel(OEExcel, "ISO_Bank_Transfer", "Transaction Currency", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(Arrangement);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        if (Currency.equals("SGD")) {
            t24_payments_page.CASGD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("USD")) {
            t24_payments_page.CAUSD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("CNY")) {
            t24_payments_page.CACNY.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("HKD")) {
            t24_payments_page.CAHKD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AUD")) {
            t24_payments_page.CAAUD.click();
            bddUtil.sleep(5);
        } else if (Currency.equals("AED")) {
            t24_payments_page.CAAED.click();
            bddUtil.sleep(5);
        } else {
            t24_payments_page.CAEUR.click();
            bddUtil.sleep(5);
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);
    }
    @Step
    public void clickFixedMaturityPlacement() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickMoneyMarketMenu.click();
        t24_payments_page.FixedMaturityPlacementContracts.click();
        bddUtil.sleep(3);
    }

    @Step
    public void AssertionEnterPlacementContractsPage() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        Assert.assertEquals(t24_payments_page.MMPlacementTitle.getText(),"MM Placement (Loan)-Fixed Maturity");
    }

    @Step
    public void inputInformationOnPlacementContractsPage(int a) {
        // 从Excel里读取数据
        String DealerDesk = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Dealer Desk", a);
        String CounterpartyID = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Counterparty", a);
        String Currency = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Currency", a);
        String Amount = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Amount", a);
        String StartDate = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Start Date", a);
        String MaturityDate = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Maturity Date", a);
        String InterestRateFixed = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Interest Rate(Fixed)", a);
        String CreditAccount = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Credit Account", a);
        String CounterpartyCorresBank1 = ExcelUtils.readExcel(TreasuryExcel, "MM_Placement", "Counterparty Corres Bank.1", a);
        t24_payments_page.DealerDesk.sendKeys(DealerDesk);
        t24_payments_page.CounterpartyID.sendKeys(CounterpartyID);
        t24_payments_page.ContractScreen.click();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToDefaultContent();
        bddUtil.sleep(2);
        t24_payments_page.Currency.sendKeys(Currency);
        t24_payments_page.Amount.sendKeys(Amount);
        t24_payments_page.StartDate.sendKeys(StartDate);
        t24_payments_page.maturity_date.sendKeys(MaturityDate);
        t24_payments_page.ContractScreen.click();
        switchToDefaultContent();
        bddUtil.sleep(2);
        t24_payments_page.InterestRateFixed.sendKeys(InterestRateFixed);
        bddUtil.sleep(3);
        t24_payments_page.PaymentSettlement.click();
        t24_payments_page.CreditAccount.sendKeys(CreditAccount);
        t24_payments_page.CounterpartyCorresBank1.sendKeys(CounterpartyCorresBank1);
        t24_payments_page.PrincipalLiqAcct.sendKeys(CreditAccount);
        t24_payments_page.InterestLiqAcct.sendKeys(CreditAccount);
        bddUtil.sleep(2);
        t24_payments_page.MMPlacementLoanFixedMaturity.click();
        bddUtil.sleep(2);
    }

    //    获取当前交易的MM值
    @Step
    public void getMMNumber() {
        String mmNumber = t24_payments_page.MMNumber.getText();
        // Remove Hyphens
        String mmNum = mmNumber.replace("-","");
        FileUtils.FileString4("MMNumber", mmNum);
    }

    //    进入一级授权页面
    @Step
    public void enterUnauthorizedMMTrans() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickMoneyMarketMenu.click();
        t24_payments_page.clickUnauthorizedMMTransactionsMenu.click();
        bddUtil.sleep(2);
    }

    //    根据MMNumber Number进行查询 审批
    @Step
    public void inputMMbitAccNumber() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
//        点击放大镜
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(t24_payments_page.inputTransRef).sendKeys(FileUtils.LastReadFileInput3("MMNumber"));
//        bddUtil.scrollWindowToElement(t24_payments_page.inputDebitAccNumber).sendKeys(DebitAccNumber);
        bddUtil.sleep(2);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        t24_payments_page.Autho.click();
        bddUtil.sleep(5);
        switchToDefaultContent();
//        进入第二个 frame
        switchToSecondFrame();
        t24_payments_page.AuthorisesADeal.click();
        bddUtil.sleep(3);
    }
    @Step
    public void enterMMPaymentEntry() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickMoneyMarketMenu.click();
        t24_payments_page.clickSettlementMenu.click();
        t24_payments_page.clickMMPaymentEntryMenu.click();
        bddUtil.sleep(2);
    }
    //   输入MMNumber进行查询
    @Step
    public void inputMMNumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        t24_payments_page.inputTransID.sendKeys(FileUtils.LastReadFileInput3("MMNumber"));
        bddUtil.sleep(3);
        t24_payments_page.clickViewContractBtn.click();
        bddUtil.sleep(2);
        String PINumber = t24_payments_page.PORef.getText();
        FileUtils.FileString4("MMPINumber", PINumber);
        bddUtil.closeWindow();
        bddUtil.sleep(3);
    }
    //  进入Exceptions-Payment Enquiry-Transaction wise页面，点击查询
    @Step
    public void enterPaymentsEnquiryTransactionWiseStatusPage() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickPayments.click();
        t24_payments_page.clickPaymentHubMenu.click();
        t24_payments_page.clickPaymentInquiriesMenu.click();
        t24_payments_page.TransactionWise.click();
        bddUtil.sleep(2);
    }
    //   输入MMPINumber进行查询
    @Step
    public void inputMMPINumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        t24_payments_page.inputFileSendersReference.sendKeys(FileUtils.LastReadFileInput3("MMPINumber"));
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(3);
        String FTNumber = t24_payments_page.getFTNumber.getText();
        FileUtils.FileString4("FTNumber", FTNumber);
    }

    //    检验状态是不是49，并且进入详情页面
    @Step
    public void enterViewPage() throws Exception {
        String statusCode = t24_payments_page.statusCode.getText();
        if (statusCode.equals("49") | statusCode.equals("235") | statusCode.equals("997")) {
            System.out.println("状态码异常");
        } else {
            throw new Exception("状态码正常:"+statusCode);
        }
        bddUtil.scrollWindowToElement(t24_payments_page.View);
        bddUtil.sleep(2);
        t24_payments_page.View.click();
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    //    改变状态为235的数据,USD要点击2个按钮，SGD不点击
    @Step
    public void changeStatusCodeTrans() {
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
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
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(2);
        switchToDefaultContent();
        if (t24_payments_page.ClickErrorMessage.isVisible()) {
            t24_payments_page.ClickErrorMessage.click();
            bddUtil.sleep(2);
            if (!t24_payments_page.inputError.equals("")) {
                t24_payments_page.inputError.clear();
            }
        }
        bddUtil.sleep(3);
        String oeNumber = t24_payments_page.OENumber.getText();
        FileUtils.FileString4("OENumber", oeNumber);
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(4);
        t24_payments_page.Commit.click();
        bddUtil.sleep(4);
    }
    @Step
    public void clickForexSpotDeal() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickForexMenu.click();
        t24_payments_page.clickCaptureForexSpotDeal.click();
        bddUtil.sleep(3);
    }

    @Step
    public void inputInformationOnCustomerForexSpotDealPage(int a) {
        bddUtil.switchToNewWindow();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickCorporateCustomer.click();
        Assert.assertEquals(t24_payments_page.FXSpotTradeTitle.getText(),"FX Spot Trade");
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        // 从Excel里读取数据
        String Counterparty = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Counterparty", a);
        String CurrencyBought = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Currency Bought", a);
        String CurrencySold = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Currency Sold", a);
        String SpotRate = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Spot Rate", a);
        String BuyAmount = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Buy Amount", a);
        String SellAmount = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Sell Amount", a);
        String ValueDateBuy = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Value Date Buy", a);
        String ValueDateSell = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Value Date Sell", a);
        String MatureStartDay = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Mature at Start of Day?", a);
        String SettlementAccSell1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Sell.1", a);
        String SettlementAccBuy1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Buy.1", a);
        String CounterpartysSSI1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Counterparty's SSI.1", a);
        t24_payments_page.Counterparty.sendKeys(Counterparty);
        t24_payments_page.ContractScreen.click();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.CurrencyBought.sendKeys(CurrencyBought);
        t24_payments_page.CurrencySold.sendKeys(CurrencySold);
        t24_payments_page.SpotRate.sendKeys(SpotRate);
        t24_payments_page.BuyAmount.sendKeys(BuyAmount);
        t24_payments_page.SellAmount.sendKeys(SellAmount);
        t24_payments_page.ValueDateBuy.sendKeys(ValueDateBuy);
        t24_payments_page.ValueDateSell.sendKeys(ValueDateSell);
        if (MatureStartDay.equals("No")) {
            t24_payments_page.MatureStartDay_No.click();
        } else if (MatureStartDay.equals("Yes")) {
            t24_payments_page.MatureStartDay_Yes.click();
        }
        bddUtil.sleep(3);
        t24_payments_page.SettlementInstructions.click();
        t24_payments_page.SettlementAccSell1.sendKeys(SettlementAccSell1);
        t24_payments_page.SettlementAccBuy1.sendKeys(SettlementAccBuy1);
        t24_payments_page.CounterpartysSSI1.sendKeys(CounterpartysSSI1);
        bddUtil.sleep(2);
        t24_payments_page.SpotDeal.click();
        bddUtil.sleep(2);
    }

    //    获取当前交易的FX值
    @Step
    public void getFXNumber() {
        String fxNumber = t24_payments_page.FXNumber.getText();
        // Remove Hyphens
        String fxNum = fxNumber.replace("-","");
        FileUtils.FileString4("FXNumber", fxNum);
    }

    //    进入一级授权页面
    @Step
    public void enterUnauthorizedFXTrans() {
        bddUtil.sleep(3);
        switchToSecondFrame();
        t24_payments_page.clickUserMenu.click();
        t24_payments_page.clickTreasuryMenu.click();
        t24_payments_page.clickForexMenu.click();
        t24_payments_page.clickUnauthorizedFXTransactionsMenu.click();
        bddUtil.sleep(2);
    }
    //    根据FXNumber Number进行查询 审批
    @Step
    public void inputFXbitAccNumber() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
//        点击放大镜
        switchToFirstFrame();
        t24_payments_page.selectScreen.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(t24_payments_page.inputTransRef).sendKeys(FileUtils.LastReadFileInput3("FXNumber"));
//        bddUtil.scrollWindowToElement(t24_payments_page.inputDebitAccNumber).sendKeys(DebitAccNumber);
        bddUtil.sleep(2);
        t24_payments_page.Find.click();
        bddUtil.sleep(2);
        t24_payments_page.Autho.click();
        bddUtil.sleep(5);
        switchToDefaultContent();
//        进入第二个 frame
        switchToSecondFrame();
        t24_payments_page.AuthorisesADeal.click();
        bddUtil.sleep(3);
    }

    @Step
    public void inputDebitandCreditaccountclickfind(int a) {
        String SettlementAccSell1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Sell.1", a);
        String SettlementAccBuy1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Buy.1", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(SettlementAccBuy1);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details1.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
    }

    @Step
    public void inputDebitandCreditaccountclickfindB(int a) {
        String SettlementAccSell1 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Sell.1", a);
        String SettlementAccBuy2 = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Settlement A/c for Buy.2", a);
        String SettlementAcc = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Currency Sold", a);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(2);
        t24_payments_page.inputaccount.clear();
        t24_payments_page.inputaccount.sendKeys(SettlementAccBuy2);
        //t24_payments_page.inputaccount.sendKeys(FileUtils.LastReadFileInput3("FTNumber"));
        bddUtil.sleep(3);
        t24_payments_page.find.click();
        bddUtil.sleep(3);
        t24_payments_page.Details.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
//        t24_payments_page.CURRENCY.sendKeys(SettlementAcc);
//        bddUtil.sleep(3);
        if (SettlementAcc=="SGD") {
            t24_payments_page.CASGD.click();
            bddUtil.sleep(5);
        } else if (SettlementAcc=="USD") {
            t24_payments_page.CAUSD.click();
            bddUtil.sleep(5);
        } else if (SettlementAcc=="CNY") {
            t24_payments_page.CACNY.click();
            bddUtil.sleep(5);
        } else if (SettlementAcc=="HKD") {
            t24_payments_page.CAEUR.click();
            bddUtil.sleep(5);
        } else if (SettlementAcc=="AUD") {
            t24_payments_page.CAAUD.click();
            bddUtil.sleep(5);
        } else if (SettlementAcc=="AED") {
            t24_payments_page.CAAED.click();
            bddUtil.sleep(5);
        }
        else if (SettlementAcc=="GBP") {
            t24_payments_page.CAGBP.click();
            bddUtil.sleep(5);
        }
        else if (SettlementAcc=="JPY") {
            t24_payments_page.CAJPY.click();
            bddUtil.sleep(5);
        }
        else {
            t24_payments_page.CAHKD.click();
            bddUtil.sleep(5);
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(6);

    }


    @Step
    public void inputBoxSearchFX(int cmd) {
        t24_payments_page.inputBox.clear();
        String command = ExcelUtils.readExcel(TreasuryExcel, "FX_Customer", "Search Content", cmd);
        t24_payments_page.inputBox.sendKeys(command);
        t24_payments_page.searchBtn.click();
        bddUtil.sleep(2);
    }
    //   输入FXNumber进行查询
    @Step
    public void inputFXNumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(1);
        t24_payments_page.inputTransID.sendKeys(FileUtils.LastReadFileInput3("FXNumber"));
        bddUtil.sleep(3);
        t24_payments_page.clickViewContractBtn.click();
        bddUtil.sleep(2);
        String PINumber = t24_payments_page.PORef.getText();
        FileUtils.FileString4("FXPINumber", PINumber);
        bddUtil.closeWindow();
        bddUtil.sleep(3);
    }

    //   输入FXPINumber进行查询
    @Step
    public void inputFXPINumberClickFind() {
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        bddUtil.sleep(3);
        switchToFirstFrame();
        t24_payments_page.inputFileSendersReference.sendKeys(FileUtils.LastReadFileInput3("FXPINumber"));
        bddUtil.sleep(3);
        t24_payments_page.Find.click();
        bddUtil.sleep(3);
        String FTNumber = t24_payments_page.getFTNumber.getText();
        FileUtils.FileString4("FTNumber", FTNumber);
    }
    //    改变状态为235的数据,USD要点击2个按钮，SGD不点击
    @Step
    public void changeStatusCodeTransFX() {
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
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
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(2);
        switchToDefaultContent();
        String currentDate =  LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy")).toUpperCase();
        if (!t24_payments_page.ProcessingDate.equals("")) {
            t24_payments_page.ProcessingDate.clear();
            t24_payments_page.ProcessingDate.sendKeys(currentDate);
            t24_payments_page.CheckProcessingDate.click();
        } else {
            t24_payments_page.ProcessingDate.sendKeys(currentDate);
            t24_payments_page.CheckProcessingDate.click();
        }
        if (!t24_payments_page.DebitValueDate.equals("")) {
            t24_payments_page.DebitValueDate.clear();
            t24_payments_page.DebitValueDate.sendKeys(currentDate);
            t24_payments_page.CheckDebitValueDate.click();
        } else {
            t24_payments_page.DebitValueDate.sendKeys(currentDate);
            t24_payments_page.CheckDebitValueDate.click();
        }
        if (!t24_payments_page.CreditValueDate.equals("")) {
            t24_payments_page.CreditValueDate.clear();
            t24_payments_page.CreditValueDate.sendKeys(currentDate);
            t24_payments_page.CheckCreditValueDate.click();
        } else {
            t24_payments_page.CreditValueDate.sendKeys(currentDate);
            t24_payments_page.CheckCreditValueDate.click();
        }
        if (t24_payments_page.ClickErrorMessage.isVisible()) {
            t24_payments_page.ClickErrorMessage.click();
            bddUtil.sleep(2);
            if (!t24_payments_page.inputError.equals("")) {
                t24_payments_page.inputError.clear();
            }
        }
        bddUtil.sleep(3);
        String oeNumber = t24_payments_page.OENumber.getText();
        FileUtils.FileString4("OENumber", oeNumber);
        t24_payments_page.preSubmit.click();
        bddUtil.sleep(4);
        t24_payments_page.Commit.click();
        bddUtil.sleep(4);
    }

    @Step
    public void inputInformationOnInterBankForexSpotDealPage(int a) {
        bddUtil.switchToNewWindow();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.clickInterBank.click();
        Assert.assertEquals(t24_payments_page.FXSpotTradeTitle.getText(),"FX Spot Trade");
        bddUtil.sleep(2);
        getDriver().manage().window().maximize();
        // 从Excel里读取数据
        String Counterparty = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Counterparty", a);
        String DealerDesk = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Dealer Desk", a);
        String CurrencyBought = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Currency Bought", a);
        String CurrencySold = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Currency Sold", a);
        String SpotRate = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Spot Rate", a);
        String BuyAmount = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Buy Amount", a);
        String SellAmount = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Sell Amount", a);
        String ValueDateBuy = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Value Date Buy", a);
        String ValueDateSell = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Value Date Sell", a);
        String MatureStartDay = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Mature at Start of Day?", a);
        String Netting = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Netting", a);
        String SettlementAccSell1 = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Settlement A/c for Sell.1", a);
        String SettlementAccBuy1 = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Settlement A/c for Buy.1", a);
        String CounterpartysSSI1 = ExcelUtils.readExcel(TreasuryExcel, "FX_InterBank", "Counterparty's SSI.1", a);
        t24_payments_page.Counterparty.sendKeys(Counterparty);
        t24_payments_page.ContractScreen.click();
        bddUtil.switchToNewWindow();
        bddUtil.closeWindow();
        bddUtil.switchToNewWindow();
        switchToFirstFrame();
        bddUtil.sleep(2);
        t24_payments_page.DealerDesk.sendKeys(DealerDesk);
        t24_payments_page.CurrencyBought.sendKeys(CurrencyBought);
        t24_payments_page.CurrencySold.sendKeys(CurrencySold);
        t24_payments_page.SpotRate.sendKeys(SpotRate);
        t24_payments_page.BuyAmount.sendKeys(BuyAmount);
        t24_payments_page.SellAmount.sendKeys(SellAmount);
        t24_payments_page.ValueDateBuy.sendKeys(ValueDateBuy);
        t24_payments_page.ValueDateSell.sendKeys(ValueDateSell);
        if (MatureStartDay.equals("No")) {
            t24_payments_page.MatureStartDay_No.click();
        } else if (MatureStartDay.equals("Yes")) {
            t24_payments_page.MatureStartDay_Yes.click();
        }
        if (Netting.equals("N")) {
            t24_payments_page.Netting_No.click();
        } else if (Netting.equals("Y")) {
            t24_payments_page.Netting_Yes.click();
        }
        bddUtil.sleep(3);
        t24_payments_page.SettlementInstructions.click();
        t24_payments_page.SettlementAccSell1.sendKeys(SettlementAccSell1);
        t24_payments_page.SettlementAccBuy1.sendKeys(SettlementAccBuy1);
        t24_payments_page.CounterpartysSSI1.sendKeys(CounterpartysSSI1);
        bddUtil.sleep(2);
        t24_payments_page.SpotDealdot.click();
        bddUtil.sleep(2);
    }

}


