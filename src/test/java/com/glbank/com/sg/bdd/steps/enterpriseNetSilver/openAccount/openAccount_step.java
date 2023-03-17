package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.openAccount;

import cn.hutool.core.date.DateUtil;
import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.openAccount.openAccount_page;
import com.glbank.com.sg.bdd.utils.*;
import com.lu.sn.Language;
import com.lu.sn.NameType;
import com.lu.sn.RandomNameTool;
import jnr.constants.platform.Access;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.List;
import java.util.Random;

import static com.glbank.com.sg.bdd.glue.enterpriseNetSilver.openAccount.openAccount_glue.accountName;
import static com.glbank.com.sg.bdd.glue.enterpriseNetSilver.openAccount.openAccount_glue.emailName;
import static com.glbank.com.sg.bdd.utils.ConnectLinux.getLastOtp;


public class openAccount_step extends ScenarioSteps {

    private openAccount_page openAccount_page;
    private BDDUtil bddUtil;
    private static String verificationCode;
    public static String otp;
    private static String mockDataResponse;
    public static String passportNumber = JRandomNameTool.getStringRandom(10);
    public static String address = "AutoTest" + JRandomNameTool.getStringRandom(3);
    public static String emailNew = JRandomNameTool.getStringRandom(4);
    public static int idCard = (int)((Math.random()*9+1)*1000000);
    public String ApplicantEmail;
    public String customerId;
    public String chekk;
    public static String mobileNumber = RandomPhoneNumber.randomPhoneNum();
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test.jpg";

    public void joinOpenAccount(){
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
        bddUtil.sleep(2);
        openAccount_page.secondTitle.click();
    }

    public void clickOpenNewAccount() {
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
        bddUtil.sleep(2);
        openAccount_page.thirdTitle.click();
    }

    public void clickOpenAccountTrack2() {
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
        bddUtil.sleep(2);
        openAccount_page.thirdTitle.click();
    }

    public void fillInInformationOnGettingStartedPage() {
        openAccount_page.clickBusinessEntityType.click();
        openAccount_page.clickNeedThisAccount.click();
        openAccount_page.clickNextOnGettingStartedPage.click();
        bddUtil.sleep(3);
    }

//    在线开户新流程。
    public void newFillInInformationOnGettingStartedPage() {
        openAccount_page.accountTypeList.get(0).click();
        openAccount_page.currentAccount.click();
        openAccount_page.SGDCurrent.click();
        bddUtil.sleep(1);
    }

    public void fillInInformationOnGettingStartedPage2(String accountType, String accountName, String currencyType) {
        if (accountType.substring(0,3).startsWith("div")){
            openAccount_page.find(By.xpath("//label[@for='accountTypeCd']/following-sibling::div//div[@role='radiogroup']/label[" + accountType.charAt(3) + "]/span/span")).click();
        } else if (accountType.substring(0, 5).equals("label")) {
            openAccount_page.find(By.xpath("//label[@for='accountTypeCd']/following-sibling::div//div[@role='radiogroup']/label[" + accountType.charAt(5) + "]/span/span")).click();
        }
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for='currencyTypeCd']/following-sibling::div//label[" + currencyType + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

//    在线开户新流程。
    public void newFillInInformationOnGettingStartedPage2(String accountName) {
        openAccount_page.AccountName.click();
        openAccount_page.InputAccountNameNew.sendKeys(accountName);
        openAccount_page.accountTypeList.get(1).click();
        openAccount_page.mrBtn.click();
    }

//    在线开户+贷款。
public void fillInInformationOnGettingStartedPage2AndLoan(String accountType, String accountName, String currencyType) {
    if (accountType.substring(0,3).startsWith("div")){
        openAccount_page.find(By.xpath("//label[@for='accountTypeCd']/following-sibling::div//div[@role='radiogroup']/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
    } else if (accountType.substring(0, 5).equals("label")) {
        openAccount_page.find(By.xpath("//label[@for='accountTypeCd']/following-sibling::div//div[@role='radiogroup']/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
    }
    openAccount_page.inputAccountName.sendKeys(accountName);
    openAccount_page.find(By.xpath("//label[@for='currencyTypeCd']/following-sibling::div//label[" + currencyType + "]/span/span")).click();
    openAccount_page.clickCreateType.click();
    openAccount_page.clickWhatNeed.click();
    openAccount_page.clickLetGo.click();
    bddUtil.sleep(3);
}


    public void fillInInformationOnGettingStartedPage2MCA_SGD_CNY(String accountType, String accountName, String currencyType) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyType + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_CNYAndLoan(String accountType, String accountName, String currencyType) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyType + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY_HKD_EUR(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY, String currencyTypeHKD, String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeCNY + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY_HKD_EURAndLoan(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY, String currencyTypeHKD, String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeCNY + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD(String accountType, String accountName, String currencyTypeUSD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USDAndLoan(String accountType, String accountName, String currencyTypeUSD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_HKD(String accountType, String accountName, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_HKDAndLoan(String accountType, String accountName, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_EUR(String accountType, String accountName,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_EURAndLoan(String accountType, String accountName,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeCNY + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNYAndLoan(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeCNY + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_HKD(String accountType, String accountName, String currencyTypeUSD, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_HKDAndLoan(String accountType, String accountName, String currencyTypeUSD, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }


    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_EUR(String accountType, String accountName, String currencyTypeUSD,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType.charAt(accountType.length()-1) + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_EURAndLoan(String accountType, String accountName, String currencyTypeUSD,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/div[" + accountType.charAt(accountType.length()-1) + "]/label/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void provideEssentialInformation(String applicantName, String emailName, String mobileNumber) {
        openAccount_page.clickSalutation.click();
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(openAccount_page.getSalutation).click();
        openAccount_page.inputFullName.sendKeys(applicantName);
        openAccount_page.clickCountryCode.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryCode).click();
        openAccount_page.inputMobileNumber.sendKeys(mobileNumber);
        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
//        openAccount_page.inputEmailAddress.sendKeys("cyq2412337655@163.com");
        openAccount_page.clickVerifyEmailAddress.click();
        bddUtil.sleep(1);
    }

//    在线开户 新流程。
    public void newProvideEssentialInformation(String applicantName, String emailName, String mobileNumber) {
        bddUtil.sleep(1);
        openAccount_page.inputFullName.sendKeys(applicantName);
        openAccount_page.clickTrack3ContryCode.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryCode).click();
        openAccount_page.inputContactNumber.sendKeys(mobileNumber);
//        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
        openAccount_page.inputEmailAddress.sendKeys("3111969204@qq.com");
        openAccount_page.verifyEmailNew.click();
        bddUtil.sleep(1);
    }

    public void selectOneAdministrators(){
        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//label[text()='How many company administrators’ profiles do you need to create?']")));
        if (bddUtil.find(By.xpath("//label[text()='How many company administrators’ profiles do you need to create?']/following-sibling::div//label[2]/span[1]")).getAttribute("class").equals("el-radio__input is-checked")){
            bddUtil.find(By.xpath("//label[text()='How many company administrators’ profiles do you need to create?']/following-sibling::div//label[1]/span[1]")).click();
            bddUtil.sleep(1);
            bddUtil.find(By.xpath("//div[text()='Yes']")).click();
        }else {
            bddUtil.find(By.xpath("//label[text()='How many company administrators’ profiles do you need to create?']/following-sibling::div//label[1]/span[1]")).click();
        }
        openAccount_page.selectCompany.get(0).click();
        bddUtil.sleep(1);
//        takaoka需要改，根据不同的账户改一下。
        openAccount_page.takaoka.click();
        bddUtil.sleep(1);
//        openAccount_page.emailNumber.click();
    }

    public void clickValidationCode() {
        bddUtil.sleep(10);
        getDriver().switchTo().alert().getText();
        bddUtil.sleep(2);
        verificationCode = getDriver().switchTo().alert().getText().substring(7, 13);
        getDriver().switchTo().alert().accept();
        bddUtil.sleep(2);
//        判断alert弹窗是否显示。
//        try {
//            Alert alert = getDriver().switchTo().alert();
//            if (alert != null){
//                otp = alert.getText();
//                alert.accept();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
////        verificationCode=getLastOtp("60120003");
//        verificationCode= otp.substring(7,13);
//        System.out.println("------------otp验证码:"+otp+"-----------------");
        bddUtil.sleep(1);
    }

    public void inputValidationCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(1);
        openAccount_page.sendKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(0, 1));
        bddUtil.sleep(1);
        openAccount_page.secondKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(1, 2));
        openAccount_page.thirdKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(2, 3));
        openAccount_page.fourKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(3, 4));
        openAccount_page.fiveKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(4, 5));
        openAccount_page.sixKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(5, 6));
        bddUtil.sleep(1);
    }

    public void inputEntityDetails(String entityType,String entityConsolidated,String entityIndustry,String date,String chekk) {
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        //没有挡板，用shekk数据。
//        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegistrationNumber.sendKeys(chekk);
        openAccount_page.inputCompanyRegisterDate.sendKeys(date);
        openAccount_page.goEntityDetails.click();
        openAccount_page.clickCountryOfIncorporation.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryOfIncorporation).click();
        openAccount_page.selectSameAsCountry.click();
        bddUtil.sleep(3);
        openAccount_page.clickNextOnProvideEssentialInformationPage.click();
        bddUtil.sleep(1);
//        try {
//            Thread.sleep(10000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (bddUtil.find(By.xpath("//span[text()='Reminder']")).isVisible() ){
                bddUtil.find(By.xpath("//div[@class='el-message-box']//button[@type='button']/span")).click();
                bddUtil.scrollWindowToElement(openAccount_page.clickNextOnProvideEssentialInformationPage).click();//                bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
                break;
            }else if (bddUtil.find(By.xpath("//label[text()='Postal Code']")).isVisible()){
                bddUtil.sleep(1);
                bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
                break;
            }
        }
        bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
        bddUtil.sleep(1);
//        goEntityType字段去掉了。
//        openAccount_page.clickEntityType.click();
//        List<WebElementFacade> testEntityType = openAccount_page.getEntityType2;
//        for (int i =0;i <= testEntityType.size();i++){
//            if (testEntityType.get(i).getText().equals(entityType)) {
//                bddUtil.scrollWindowToElement(testEntityType.get(i)).click();
//                break;
//            }
//        }
        openAccount_page.clickEntityConsolidatedAnnualSalesTurnover.click();
        List<WebElementFacade> testSecondEntityType = openAccount_page.getEntityType2;
        for (int j =0;j <= testSecondEntityType.size();j++){
            bddUtil.sleep(1);
            if (testSecondEntityType.get(j).getText().equals(entityConsolidated)) {
                bddUtil.sleep(1);
                bddUtil.scrollWindowToElement(testSecondEntityType.get(j)).click();
                break;
            }
        }
        openAccount_page.clickIndustry.click();
        List<WebElementFacade> testThreeEntityType = openAccount_page.getEntityType2;
        for (int k =0;k <= testThreeEntityType.size();k++){
            bddUtil.sleep(3);
            if (testThreeEntityType.get(k).getText().equals(entityIndustry)) {
                bddUtil.scrollWindowToElement(testThreeEntityType.get(k)).click();
                break;
            }
        }
        openAccount_page.clickNonprofitFlag.click();
        openAccount_page.clickNext2OnProvideEssentialInformationPage.click();
        bddUtil.sleep(2);
        openAccount_page.clickModelConstitution.click();
        bddUtil.scrollWindowToElement(openAccount_page.clickLetContinue).click();
        bddUtil.sleep(2);
        openAccount_page.clickLetContinue.click();
    }
    public void inputEntityDetailsHealthCheck() {
        bddUtil.sleep(3);
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        //没有挡板，用shekk数据。
//        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());//199906179R    201700266Z
        openAccount_page.clickCountryOfIncorporation.sendKeys("SINGAPORE");
        getDriver().findElements(By.xpath("//span[text()='SINGAPORE']")).get(0).click();
        openAccount_page.clickBusinessEntityTypeDownDrop.click();
        openAccount_page.selectBusinessEntityType.click();
        openAccount_page.BusinessOperations.click();
        openAccount_page.selectYesNew.get(1).click();
        openAccount_page.selectYesNew.get(2).click();
        openAccount_page.selectYesNew.get(3).click();
        openAccount_page.monthAmontNew.click();
        getDriver().findElement(By.xpath("//span[text()='SGD 500,001 - SGD 1 Million']")).click();
        openAccount_page.monthTrsCount.click();
        getDriver().findElement(By.xpath("//span[text()='1 - 20']")).click();
        openAccount_page.nextButtonNew.click();
        bddUtil.sleep(1);
        for (int i = 0; i < 3; i++) {
            bddUtil.sleep(2);
        }
        bddUtil.sleep(3);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(0).sendKeys(fileAddress);
        bddUtil.sleep(3);
        Assert.assertEquals("Upload Successful",openAccount_page.checkUploadFileSuccess.getText());
    }

//    在线开户新流程
public void inputEntityDetailsNew() {
        chekk = RandomPhoneNumber.randomPhoneNum();
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
    //没有挡板，用shekk数据。
//        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegistrationNumber.sendKeys(chekk);//199906179R    201700266Z
        openAccount_page.clickCountryOfIncorporation.sendKeys("SINGAPORE");
        getDriver().findElements(By.xpath("//span[text()='SINGAPORE']")).get(0).click();
        openAccount_page.clickBusinessEntityTypeDownDrop.click();
        openAccount_page.selectBusinessEntityType.click();
        openAccount_page.BusinessOperations.click();
        openAccount_page.selectYesNew.get(1).click();
        openAccount_page.selectYesNew.get(2).click();
        openAccount_page.selectYesNew.get(3).click();
        openAccount_page.monthAmontNew.click();
        getDriver().findElement(By.xpath("//span[text()='SGD 500,001 - SGD 1 Million']")).click();
        openAccount_page.monthTrsCount.click();
        getDriver().findElement(By.xpath("//span[text()='1 - 20']")).click();
        openAccount_page.nextButtonNew.click();
        bddUtil.sleep(1);
        for (int i = 0; i < 3; i++) {
            bddUtil.sleep(2);
    }
        bddUtil.sleep(3);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(0).sendKeys(fileAddress);
        Assert.assertEquals("Upload Successful",openAccount_page.checkUploadFileSuccess.getText());
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(1).sendKeys(fileAddress);
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(2).sendKeys(fileAddress);
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(3).sendKeys(fileAddress);
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(4).sendKeys(fileAddress);
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//div[@class='upload-btn']//input")).get(5).sendKeys(fileAddress);
        bddUtil.sleep(3);
        openAccount_page.confirmNew.click();
        bddUtil.sleep(5);
}

//进入后管补充信息。
    public void AdditionalInformation(){
        bddUtil.sleep(3);
        getDriver().findElements(By.xpath("//span[text()='Trading Center']")).get(0).click();
        openAccount_page.informationSupplement.click();
        getDriver().findElements(By.xpath("//input[@maxlength='20']")).get(0).sendKeys(chekk);
        openAccount_page.queryBtn.click();
        bddUtil.sleep(2);
        getDriver().findElements(By.xpath("//span[text()='Supplement']")).get(1).click();
        bddUtil.sleep(7);
        openAccount_page.enterDateOfRegistration.sendKeys(DateUtil.today());
        openAccount_page.countryWhereTitle.click();
        bddUtil.sleep(2);
//        openAccount_page.enterCountryWhere.sendKeys("SINGAPORE");
//        openAccount_page.select1Type.click();
        openAccount_page.enterIndustry.sendKeys("01111");
        openAccount_page.select1Type.click();
        openAccount_page.enterAddress.sendKeys("beijing");
        openAccount_page.enterCity.sendKeys("beijing");
        openAccount_page.enterZipCode.sendKeys("029");
        openAccount_page.businessEntity.click();
        bddUtil.sleep(1);
        openAccount_page.noListed.click();
        openAccount_page.businessTurnover.click();
        openAccount_page.thanOneMillion.click();
        openAccount_page.countryOfOperation.clear();
        openAccount_page.countryOfOperation.sendKeys("SINGAPORE");
        openAccount_page.selectNationality.click();
        openAccount_page.yesBtn.click();
        getDriver().findElement(By.xpath("//span[text()='Payroll']")).click();
        for (int i = 0; i < 5; i++) {
            if (openAccount_page.deletePerson.isVisible()){
                openAccount_page.deletePerson.click();
            }else {
                break;
            }

        }
        openAccount_page.enterSectorID.sendKeys("3001");
        openAccount_page.select1Type.click();
        bddUtil.sleep(1);
        openAccount_page.relatedPerson.click();
        bddUtil.sleep(1);
        openAccount_page.relatedName.sendKeys(accountName);
        openAccount_page.relatedAlias.sendKeys("testAuto");
        openAccount_page.relatedNationality.sendKeys("SINGAPOREAN");
        openAccount_page.selectNationality.click();
        openAccount_page.dateOfBirth.sendKeys("1994-02-08");
        openAccount_page.documentType.click();
        getDriver().findElement(By.xpath("//span[text()='NRIC']")).click();
        openAccount_page.nric.sendKeys("S"+idCard+"A");
        openAccount_page.countryOfResidence.sendKeys("SINGAPORE");
        openAccount_page.clickContryCode.click();
//        openAccount_page.selectNationality.click();
        openAccount_page.adressNew.sendKeys(address);
        openAccount_page.cityNew.sendKeys(address.toString().substring(2,5));
//        openAccount_page.emailNew.sendKeys(emailNew+"@MailTemp.top");
        openAccount_page.emailNew.sendKeys("LL3111969204@163.com");
        FileUtils.FileString4(""+"openAccountNew"+"","关联人邮箱：" + emailNew+"@MailTemp.top");
        bddUtil.sleep(1);
        openAccount_page.determine.click();
        openAccount_page.directorNew.click();
        openAccount_page.shareholderNew.click();
        openAccount_page.percentageNew.sendKeys("26");
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(openAccount_page.deletePerson);
        for (int i = 0; i < 5; i++) {
            if (openAccount_page.deleteCompany.isVisible()){
                getDriver().findElements(By.xpath("//div[text()='Related enterprise information ']/following-sibling::div//div[@class='el-table__fixed-body-wrapper']//span[text()='Delete']")).get(0).click();
            }else {
                break;
            }

        }
        bddUtil.sleep(3);
        openAccount_page.submitNew.click();
        bddUtil.sleep(3);
    }

//    进行授权
    public void Authorize(){
        bddUtil.sleep(3);
        getDriver().findElement(By.xpath("//div[@class='welHandleCon']//span[text()='Trading Center']")).click();
        bddUtil.sleep(3);
        getDriver().findElements(By.xpath("//div[@class='el-table__fixed-right']//span[text()='Authorization']")).get(0).click();
//        将申请人邮箱再次确认。
        ApplicantEmail = getDriver().findElement(By.xpath("//span[text()='Email']/following-sibling::span")).getText();
        customerId = getDriver().findElement(By.xpath("//span[text()='Corporate Customer Number']/following-sibling::span")).getText();
        FileUtils.FileString4(""+"openAccountNew"+"","企业客户编号:" + customerId);
        FileUtils.FileString4(""+"customerId"+"",BDDUtil.getTimeNowThroughCalendar());
        FileUtils.FileString4(""+"customerId"+"","企业客户编号是:");
        FileUtils.FileString4(""+"customerId"+"", customerId);
        bddUtil.sleep(3);
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//div[text()='Submit']")));
        getDriver().findElement(By.xpath("//div[text()='Submit']")).click();

    }

    public void enterMailbox(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox\");");
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
//        openAccount_page.inputEmail.sendKeys(ApplicantEmail);
        openAccount_page.inputEmail.sendKeys("y5yX6@MailTemp.top");
        bddUtil.sleep(5);
        openAccount_page.viewBtn.click();
        bddUtil.sleep(3);
        openAccount_page.refreshBtn.click();
        bddUtil.sleep(3);
        openAccount_page.firstEmail.click();
        bddUtil.sleep(1);
        getDriver().findElement(By.xpath("//a[text()='Plain Text']")).click();
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@id='body-text']/a")).click();
        bddUtil.sleep(20);
        bddUtil.switchToNewWindow();
        getDriver().findElement(By.xpath("//div[text()='Get OTP']")).click();
        bddUtil.sleep(3);
    }
//    新开户流程 在前端页面确定信息。
    public void ConfirmInformation(){
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//div[@class='el-collapse-item__content']/form/div[6]//input")));
        String DirectorMailbox = getDriver().findElement(By.xpath("//div[@class='el-collapse-item__content']/form/div[6]//input")).getText();
        bddUtil.sleep(1);
        FileUtils.FileString4(""+"openAccountNew"+"","董事邮箱:" + DirectorMailbox);
        getDriver().findElement(By.xpath("//div[text()='Next']")).click();
        bddUtil.sleep(1);
        getDriver().findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("+86");
        getDriver().findElement(By.xpath("//span[text()='CHINA']")).click();
        getDriver().findElement(By.xpath("//div[@class='paddingleft16']/div//form/div[2]//div[@class='el-row']/div[2]//input")).sendKeys(mobileNumber);
        getDriver().findElement(By.xpath("//div[text()='Next']")).click();
        bddUtil.sleep(3);
        getDriver().findElement(By.xpath("//span[text()='One Administrator']")).click();
        openAccount_page.chooseAdmin.click();
        openAccount_page.selectAdmin.click();
        openAccount_page.verifyEmailAddNew.click();
        bddUtil.sleep(5);
    }
//提交 admin 开户新流程
    public void verifyMobileNumberNew(){
        bddUtil.sleep(3);
        openAccount_page.verifyMobileNumberNew.click();
        bddUtil.sleep(5);
    }
// 提交admin
    public void confirmAdmin(){
        bddUtil.sleep(3);
        openAccount_page.nextAdminNew.click();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//label[@for='emailAddr']/following-sibling::div/div")));
        String adminEmail = getDriver().findElement(By.xpath("//label[@for='emailAddr']/following-sibling::div/div")).getText();
        FileUtils.FileString4(""+"openAccountNew"+"","admin邮箱:" + adminEmail);
//        勾选两个协议。
        getDriver().findElements(By.xpath("//label[@class='el-checkbox']")).get(0).click();
        bddUtil.sleep(1);
        getDriver().findElements(By.xpath("//label[@class='el-checkbox']")).get(1).click();
        bddUtil.sleep(1);
        getDriver().findElement(By.xpath("//div[text()='Submit']")).click();
        bddUtil.sleep(3);
    }

    public void inputEntityDetails1(String subIndustry,String entityConsolidated) {
        String entityType = "Public Listed Company (Not Listed in Singapore)";
        String industry = "Financial & Insurance Activities";
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        openAccount_page.inputCompanyRegistrationNumber.sendKeys("201700266Z");
        //用chekk数据。
        openAccount_page.inputCompanyRegisterDate.sendKeys("01/01/2010");
        openAccount_page.goEntityDetails.click();
        openAccount_page.clickCountryOfIncorporation.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryOfIncorporation).click();
        openAccount_page.clickNextOnProvideEssentialInformationPage.click();
//        加的代码
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (bddUtil.find(By.xpath("//span[text()='Reminder']")).isVisible() ){
                bddUtil.find(By.xpath("//div[@class='el-message-box']//button[@type='button']/span")).click();
                bddUtil.scrollWindowToElement(openAccount_page.clickNextOnProvideEssentialInformationPage).click();//                bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
                break;
            }else if (bddUtil.find(By.xpath("//label[text()='Postal Code']")).isVisible()){
                bddUtil.sleep(1);
                bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
                break;
            }
        }
//        调试。
        bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
        bddUtil.sleep(1);
        openAccount_page.clickEntityType.click();
        List<WebElementFacade> testEntityType = openAccount_page.getEntityType2;
        for (int i =0;i <= testEntityType.size();i++){
            if (testEntityType.get(i).getText().equals(entityType)) {
                bddUtil.scrollWindowToElement(testEntityType.get(i)).click();
                break;
            }
        }
        openAccount_page.clickEntityConsolidatedAnnualSalesTurnover.click();
        List<WebElementFacade> testSecondEntityType = openAccount_page.getEntityType2;
        for (int j =0;j <= testSecondEntityType.size();j++){
            bddUtil.sleep(1);
            if (testSecondEntityType.get(j).getText().equals(entityConsolidated)) {
                bddUtil.sleep(1);
                bddUtil.scrollWindowToElement(testSecondEntityType.get(j)).click();
                break;
            }
        }
        openAccount_page.clickMainIndustry.click();
        System.out.println("subIndustry="+subIndustry);
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()='"+ industry +"']"))).click();
        bddUtil.sleep(2);
//        openAccount_page.clickSubIndustry.click();
        bddUtil.scrollWindowToElement(openAccount_page.clickSubIndustry).click();
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//ul[@class=\"el-scrollbar__view el-select-dropdown__list\"]//span[text()='"+ subIndustry +"']"))).click();
        openAccount_page.clickNonprofitFlag.click();
        openAccount_page.clickNext2OnProvideEssentialInformationPage.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickNextToStep3).click();
        bddUtil.sleep(2);
    }

    public void inputDirectorDetails(String aliasNm, String passportNumber, String directorPhoneNumber, String directorEmailName) {
//        openAccount_page.inputContactPersonNm.click();
//        openAccount_page.inputContactPersonNm.clear();
//        openAccount_page.inputContactPersonNm.sendKeys(contactPersonNm);
//        在线开ze 户第三步。
        bddUtil.scrollWindowToElement(openAccount_page.checkBoxText);
            if (openAccount_page.selectFirstIsCheckBox.isVisible()) {
                System.out.println("Director选项已勾选！");
            }else{
                 openAccount_page.selectFirstCheckBox.click();
            }
            if (openAccount_page.selectSecondIsCheckBox.isVisible()){
                System.out.println("Shareholder选项已勾选！");
            }else {
                openAccount_page.selectSecondCheckBox.click();
            }
            if (openAccount_page.selectThirdIsCheckBox.isVisible()){
                System.out.println("Ultimate Beneficial Owner选项已勾选！");
            }else {
                openAccount_page.selectThirdCheckBox.click();
            }
            if (openAccount_page.nameDisable.isVisible()){
                System.out.println("Name已默认存在！");
            }else {
                openAccount_page.enterName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
            }
            if (openAccount_page.shareholdingPercentage.isVisible()){
                openAccount_page.shareholdingPercentage.clear();
                openAccount_page.shareholdingPercentage.sendKeys("30");
                openAccount_page.nationalityOne.sendKeys("SINGAPOREAN");
                openAccount_page.SINGAPOREAN.click();
            }
            openAccount_page.clickSalutationTest.click();
            openAccount_page.mr.click();
            openAccount_page.clickSelectCountryIcon.click();
            bddUtil.sleep(2);
            List<WebElementFacade> selectCountry = openAccount_page.selectCountry;
            for (int i = 0;i <selectCountry.size(); i++){
                if (selectCountry.get(i).getText().equals("SINGAPOREAN")){
                    bddUtil.scrollWindowToElement(selectCountry.get(i)).click();
                    break;
                }
            }
            openAccount_page.inputAliasNm.sendKeys(aliasNm);
            openAccount_page.inputBirthDate.sendKeys("01/01/2010");
            openAccount_page.clickRoleCd.click();
            bddUtil.scrollWindowToElement(openAccount_page.goIdentificationType);
            bddUtil.sleep(1);
            openAccount_page.clickIdentificationType.click();
            openAccount_page.inputPassportNumber.sendKeys(passportNumber);
            openAccount_page.inputDateOfExpiry.sendKeys("01/01/2030");
            bddUtil.sleep(2);
            openAccount_page.inputDirectorMobilePhoneNo.click();
            openAccount_page.clickDateOfExpiry.click();
            bddUtil.sleep(1);
            openAccount_page.ResidentialAddress.sendKeys(passportNumber);
            openAccount_page.cityTest.sendKeys(passportNumber);
            bddUtil.sleep(1);
            openAccount_page.postalCodeTest.sendKeys(directorPhoneNumber);
            bddUtil.sleep(1);
            openAccount_page.countryTest.sendKeys("SINGAPORE");
            bddUtil.sleep(1);
            openAccount_page.SINGAPORETest.click();
            openAccount_page.clickDateOfExpiry.click();
            openAccount_page.clickIddInput.click();
            bddUtil.scrollWindowToElement(openAccount_page.getIdd).click();
            openAccount_page.inputDirectorMobilePhoneNo.sendKeys(directorPhoneNumber);
            openAccount_page.inputDirectorEmailAddress.sendKeys(directorEmailName + "@MailTemp.top");
            openAccount_page.clickNextOnEnterConnectedPeoplesDetails.click();
            bddUtil.sleep(2);
    }

    public void inputUltimateBeneficialOwnerDetails(String ultimateBeneficialOwnerName, String ultimateBeneficialOwnerAliasName, String ultimateBeneficialOwnerPassportNumber, String ultimateBeneficialOwnerPhoneNumber, String ultimateBeneficialOwnerEmailName) {
////        openAccount_page.selectCheckBox2.click();
////        bddUtil.scrollWindowToElement(openAccount_page.goContactPersonNm);
////        openAccount_page.inputUBOName.clear();
////        openAccount_page.inputUBOName.sendKeys(ultimateBeneficialOwnerName);
//        openAccount_page.inputUBOAliasName.sendKeys(ultimateBeneficialOwnerAliasName);
//        openAccount_page.inputUBOBirthDate.sendKeys("01/01/2010");
//        openAccount_page.goContactPersonNm.click();
//        openAccount_page.clickUBOIdentificationType.click();
//        openAccount_page.inputUBOPassportNo.sendKeys(ultimateBeneficialOwnerPassportNumber);
//        openAccount_page.inputUBOPassportDueDate.sendKeys("01/01/2030");
//        openAccount_page.goContactPersonNm.click();
//        openAccount_page.inputUBOResidentialAddress.sendKeys("ResidentialAddress");
//        openAccount_page.inputUBOCityName.sendKeys("City");
//        openAccount_page.inputUBOPostalCode.sendKeys("710000");
//        openAccount_page.clickUBOCountryCode.click();
//        bddUtil.scrollWindowToElement(openAccount_page.getUBOCountry).click();
//        bddUtil.scrollWindowToElement(openAccount_page.clickUBOIdd).click();
//        bddUtil.scrollWindowToElement(openAccount_page.getUBOIdd).click();
//        openAccount_page.inputUBOMobilePhoneNo.sendKeys(ultimateBeneficialOwnerPhoneNumber);
//        openAccount_page.inputUBOEmailAddress.sendKeys(ultimateBeneficialOwnerEmailName + "@MailTemp.top");
//        openAccount_page.clickNextForUBO.click();
//        bddUtil.sleep(2);
        for (int i = 0; i<20; i++){
            if (openAccount_page.connectedPerson2.isVisible()){
                openAccount_page.deleteBtn.click();
                bddUtil.sleep(1);
                openAccount_page.clickYesBtn.click();
            }else {
                break;
            }
        }
        bddUtil.scrollWindowToElement(openAccount_page.clickNextOnEnterConnectedPeoplesDetails);
        openAccount_page.clickNextOnEnterConnectedPeoplesDetails.click();
        bddUtil.sleep(2);
        if (openAccount_page.clickCheckBox.isVisible()){
            openAccount_page.clickCheckBox.click();
        }
//        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//div[@class='paddingleft16']/label/span[1]"))).click();
        openAccount_page.clickNextForUBO.click();

    }

    public void inputOnlyUBODetails(String onlyUBOName, String onlyUBOAliasName, String onlyUBOPassportNumber, String onlyUBOPhoneNumber, String onlyUBOEmailName) {
//       第四步。
        bddUtil.sleep(2);
        for (int i = 0; i < 20; i++) {
            if (openAccount_page.deleteImg.isVisible()){
                openAccount_page.deleteImg.click();
                bddUtil.sleep(1);
                openAccount_page.YesDelete.click();
            }else if (openAccount_page.deleteAfterTitle.isVisible()){
                break;
            }
        }
        openAccount_page.clickNextForUBO2.click();
        bddUtil.sleep(2);
    }

//    第五步。
    public void goOnDueDiligenceTest(){
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()='Yes']"))).click();
        bddUtil.sleep(1);

    }


    public void goOnDueDiligence() {
        String language = "* Mandatory";
        bddUtil.scrollWindowToElement(openAccount_page.goDueDiligence);
        if (openAccount_page.getPageLanguage.getText().equals(language)){
            openAccount_page.clickDirector1.click();
            openAccount_page.inputDirector1ResidentialAddress.sendKeys("Address");
            openAccount_page.inputDirector1City.sendKeys("City");
            openAccount_page.inputDirector1PostalCode.sendKeys("710000");
            openAccount_page.clickDirector1Country.click();
            bddUtil.scrollWindowToElement(openAccount_page.getDirector1Country).click();
            openAccount_page.clickDirector2.click();
        }
        else {
            openAccount_page.clickDirector1.click();
            openAccount_page.inputDirector1ResidentialAddressCN.sendKeys("Address");
            openAccount_page.inputDirector1CityCN.sendKeys("City");
            openAccount_page.inputDirector1PostalCodeCN.sendKeys("710000");
            openAccount_page.clickDirector1CountryCN.click();
            bddUtil.scrollWindowToElement(openAccount_page.getDirector1Country).click();
            openAccount_page.clickDirector2.click();
            openAccount_page.inputDirector2ResidentialAddressCN.sendKeys("Address");
            openAccount_page.inputDirector2CityCN.sendKeys("City");
            openAccount_page.inputDirector2PostalCodeCN.sendKeys("710000");
            openAccount_page.inputDirector2CountryCN.click();
            bddUtil.sleep(1);
            bddUtil.scrollWindowToElement(openAccount_page.getDirector2Country).click();
        }
        openAccount_page.clickNextToStep4.click();
        bddUtil.sleep(2);
    }

    public void enterConnectedEntitiesDetails(){
        openAccount_page.selectCompany.get(0).click();
        bddUtil.sleep(1);
//        takaoka需要改，根据不同的账户改一下。
        openAccount_page.takaoka.click();
        bddUtil.sleep(1);
        openAccount_page.mobileNumber.click();
    }

    public void enterConnectedEntitiesDetails2(){
        bddUtil.scrollWindowToElement(openAccount_page.inputPostalCodeConnectedCorporateEntity);
        openAccount_page.inputPostalCodeConnectedCorporateEntity.sendKeys("710000");
        openAccount_page.clickConnectedCorporateEntity2.click();
        bddUtil.scrollWindowToElement(openAccount_page.inputPostalCodeConnectedCorporateEntity);
        openAccount_page.inputPostalCodeConnectedCorporateEntity.sendKeys("710000");
        openAccount_page.clickNextToStep5.click();
        bddUtil.sleep(2);
    }

    public void choseOneAdministrator(String contactPersonNm){
        openAccount_page.clickOneAdministrators.click();
        bddUtil.sleep(1);
        openAccount_page.clickYESOneAdministrators.click();
        openAccount_page.clickYESConnectedPerson1.click();
        openAccount_page.clickConnectedPersons1Name.click();
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()='"+ contactPersonNm +"']"))).click();
        bddUtil.scrollWindowToElement(openAccount_page.goVerifyMobileNumber1);
        openAccount_page.clickVerifyMobileNumber1.click();
    }


    public void createCompanyAdministratorsProfiles(String contactPersonNm){
        openAccount_page.clickYESConnectedPerson1.click();
        openAccount_page.clickConnectedPersons1Name.click();
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()='"+ contactPersonNm +"']"))).click();
        bddUtil.scrollWindowToElement(openAccount_page.goVerifyMobileNumber1);
        openAccount_page.clickVerifyMobileNumber1.click();
    }

    public void clickVerifyEmailAddress1(){
        String verify = "Verify Email Address";
        if (openAccount_page.clickVerifyEmailAddress1.getText().equals(verify)){
            openAccount_page.clickVerifyEmailAddress1.click();
        }
        else {
            openAccount_page.clickVerifyEmailAddress1CN.click();
        }
    }

    public void clickNextToAdministrator2AndEdit(String ultimateBeneficialOwnerName){
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickNextToAdministrator2).click();
//        还要加判断。
        bddUtil.sleep(2);
//        bddUtil.scrollWindowToElement(openAccount_page.goChoseYESConnectedPerson2);
        bddUtil.scrollWindowToElement(openAccount_page.YesConnectedPerson2Test);
        bddUtil.sleep(1);
        openAccount_page.clickNOConnectedPerson2.click();
//        openAccount_page.clickConnectedPersons2Name.get(1).click();
//        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()='"+ ultimateBeneficialOwnerName +"']"))).click();
//        bddUtil.scrollWindowToElement(openAccount_page.goVerifyMobileNumber1);
//        openAccount_page.clickVerifyMobileNumber2.click();
//        bddUtil.sleep(2);
        openAccount_page.selectSalutation.click();
        openAccount_page.mr.click();
        openAccount_page.fullName.sendKeys(ultimateBeneficialOwnerName);
        openAccount_page.dataForBirth.sendKeys("01/01/2010");
        bddUtil.sleep(1);
        openAccount_page.fullName.click();
        openAccount_page.nationalityTwo.sendKeys("SINGAPOREAN");
        openAccount_page.SINGAPOREAN.click();
        openAccount_page.clickIdentificationTypeTwo.click();
        openAccount_page.passportNumberTwo.sendKeys(passportNumber);
        openAccount_page.addressTwo.sendKeys(passportNumber);
        openAccount_page.dataOfExpiry.sendKeys("01/02/2030");
        openAccount_page.passportNumberTwo.click();
        openAccount_page.cityTestTwo.sendKeys(passportNumber);
        openAccount_page.countryTwo.sendKeys("SINGAPORE");
        bddUtil.sleep(1);
        openAccount_page.SingaporeCountry.click();
        openAccount_page.iddNumber.sendKeys("+86");
        openAccount_page.find(By.xpath("//span[text()='+86']")).click();
        openAccount_page.mobileNumberTest.sendKeys(mobileNumber);
        bddUtil.sleep(1);
        openAccount_page.clickVerifyMobileNumber2.click();
        bddUtil.sleep(2);

    }

    public void clickVerifyEmailAddress2(){
        String verify = "Verify Email Address";
        if (openAccount_page.clickVerifyEmailAddress2.getText().equals(verify)){
            openAccount_page.clickVerifyEmailAddress2.click();
        }
        else {
            openAccount_page.clickVerifyEmailAddress2CN.click();
        }
    }

    public void inputEmailTwo(String emailName){
//        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
//        openAccount_page.emailAddressTwo.sendKeys(emailName + "@MailTemp.top");
        openAccount_page.emailAddressTwo.sendKeys("cyq2412337655@163.com");
        bddUtil.sleep(1);
        openAccount_page.clickVerifyEmailAddress2.click();
        bddUtil.sleep(1);
    }

    public void clickNextToStep6(){
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickNextToStep6).click();
        bddUtil.sleep(2);
    }

    public void choseRiskProfile(){
        bddUtil.scrollWindowToElement(openAccount_page.goIndicate);
        openAccount_page.clickHowIndicate.click();
        bddUtil.scrollWindowToElement(openAccount_page.goReceiveMoney);
        openAccount_page.clickReceiveMoney.click();
        bddUtil.scrollWindowToElement(openAccount_page.goTransactions);
        openAccount_page.clickTransactions.click();
        openAccount_page.clickBusinessActivities.click();
        openAccount_page.clickPrincipal.click();
        openAccount_page.clickControlledBy.click();
        openAccount_page.clickNextToStep12.click();
    }

//    在线开户的贷款步骤,第七步。
    public void loanOnOpenAccount(String loanAmount){
        openAccount_page.loanContinue.click();
        bddUtil.sleep(1);
        openAccount_page.capitalLoan.click();
        openAccount_page.loanContinue.click();  //第七步的next。
        openAccount_page.applyMicro.click();    //选择 小额贷款。
        openAccount_page.loanAmount.sendKeys(loanAmount);
        bddUtil.sleep(1);
        openAccount_page.loanContinue.click();
        bddUtil.sleep(1);
    }

    //    在线开户的贷款步骤,第八步和第九步,完善担保人信息。
    public void CompleteGuarantorInformation(){
        openAccount_page.personal.click();
    }

    // 在线开户的贷款步骤，第十步。
    public void declareFinancials(){
        if (openAccount_page.connectedPersonIsNo.isVisible()){
            openAccount_page.connectedPersonIsNo.click();
            openAccount_page.clickNextButton.click();
            if (openAccount_page.selectFirstIsCheckBox.isVisible()) {
                System.out.println("Director选项已勾选！");
            }else{
                openAccount_page.selectFirstCheckBox.click();
            }
            if (openAccount_page.selectSecondIsCheckBox.isVisible()){
                System.out.println("Shareholder选项已勾选！");
            }else {
                openAccount_page.clickShareholder.click();
            }
            openAccount_page.inputShareholdingPercentage.sendKeys("22");
            openAccount_page.clickDownBox.click();
            openAccount_page.selectMr.click();
            openAccount_page.enterFullName.sendKeys("testFullName");
            openAccount_page.enterBirthDay.sendKeys("01/01/2010");
            openAccount_page.clickSelectCountryIcon.click();
            bddUtil.sleep(2);
            List<WebElementFacade> selectCountry = openAccount_page.selectCountry;
            for (int i = 0;i <selectCountry.size(); i++){
                if (selectCountry.get(i).getText().equals("SINGAPOREAN")){
                    bddUtil.scrollWindowToElement(selectCountry.get(i)).click();
                    break;
                }
            }
            openAccount_page.idNumber.sendKeys("S6829123T");
            openAccount_page.countryCode.click();
            openAccount_page.selectSingapore.click();
            openAccount_page.inputDirectorMobilePhoneNo.sendKeys("13008227162");
            openAccount_page.inputDirectorEmailAddress.sendKeys("123321@MailTemp.top");
            openAccount_page.enterIndustryExperience.sendKeys("5");
            openAccount_page.clickNextOnEnterConnectedPeoplesDetails.click();
        }
        //        左边信息输入。
        bddUtil.sleep(4);
        openAccount_page.reportingDateLeft.clear();
        openAccount_page.reportingDateLeft.sendKeys("26/05/2023");
        openAccount_page.reportingPeriodTitle.click();
//        openAccount_page.todayLeft.click();//选择今天。
        openAccount_page.reportPeriodLeft.click();
        List<WebElementFacade> selectMonths = openAccount_page.twelveMonths;
        for (int i = 0; i < selectMonths.size(); i++){
            if (selectMonths.get(i).getText().equals("12 months")){
                selectMonths.get(i).click();
                break;
            }
        }//选择12月。
        openAccount_page.netSalesLeft.sendKeys("9");
        openAccount_page.preTaxSalesLeft.sendKeys("9");
        openAccount_page.totalAssetsLeft.sendKeys("8");
        openAccount_page.dibtAssetsLeft.sendKeys("8");
//      右边信息输入。
        openAccount_page.reportingDateRight.clear();
        openAccount_page.reportingDateRight.sendKeys("26/05/2023");
        openAccount_page.reportingPeriodTitle.click();
        openAccount_page.reportPeriodRight.click();
        List<WebElementFacade> selectMonths2 = openAccount_page.twelveMonths;
        for (int i = 0; i < selectMonths2.size(); i++){
            if (selectMonths2.get(i).getText().equals("12 months")){
                selectMonths2.get(i).click();
                break;
            }
        }//选择12月。
        openAccount_page.netSalesRight.sendKeys("9");
        openAccount_page.preTaxSalesRight.sendKeys("9");
        openAccount_page.totalAssetsRight.sendKeys("8");
        openAccount_page.dibtAssetsRight.sendKeys("8");
//        选择没有其他财务承诺。
        bddUtil.find(By.xpath("//label[text()='Do you have any other financial commitments?']/following-sibling::div/div/label[2]/span[1]")).click();
        bddUtil.sleep(1);
        openAccount_page.loanContinue.click();
    }


    public void uploadSupportingDocuments(){
        bddUtil.scrollWindowToElement(openAccount_page.goUploadFile);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[1]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[2]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[3]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[4]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[5]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[6]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        openAccount_page.clickNextToStep13.click();
    }

    public void uploadSupportingDocumentsOnLoanPage(){
        bddUtil.scrollWindowToElement(bddUtil.find(By.xpath("//div[@class='open_account_tips']")));
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[1]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[2]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[3]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[4]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[5]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[6]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[7]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[8]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//div[@class=\"upload_container\"]//div[9]//div[2]//div[1]//div[1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        openAccount_page.clickNextToStep13.click();
    }

    public void reviewDetails(){
        bddUtil.sleep(10);
        bddUtil.scrollWindowToElement(openAccount_page.clickAccepted).click();
//        openAccount_page.clickSubmitToStep14.click();
        bddUtil.sleep(10);
    }

    public void reviewDetailsOnLoan(){
        bddUtil.scrollWindowToElement(openAccount_page.clickAccepted).click();
//        bddUtil.scrollWindowToElement(openAccount_page.clickAcceptedApplication).click();
//        openAccount_page.clickSubmitToStep14.click();
        bddUtil.sleep(5);
    }

    public void reviewDetailsCNY(){
        bddUtil.scrollWindowToElement(openAccount_page.clickAccepted).click();
        bddUtil.scrollWindowToElement(openAccount_page.clickAcceptedCNY).click();
        openAccount_page.clickSubmitToStep14.click();
        bddUtil.sleep(5);
    }

    public void getOrganisationID(String emailName,String applicantName){
        bddUtil.sleep(2);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox\");");
        bddUtil.sleep(2);
        bddUtil.switchToNewWindow();
        openAccount_page.sendEmail.clear();
        openAccount_page.sendEmail.sendKeys(emailName);
        openAccount_page.createEmailButton.click();
        for(int i=0;i<10;i++){
            List<WebElementFacade> emailList = openAccount_page.emailList;
            emailList.get(0).click();
            String getApplicantName = openAccount_page.getOrganisationID.getText().substring(6,32);
            if (getApplicantName.equals(applicantName)){
                String organisationID = openAccount_page.getOrganisationID.getText().substring(114,120);
                FileUtils.FileString4("openAccountInformation","开户企业ID:" + organisationID);
                FileUtils.FileString4("OrganisationID",organisationID);
                System.out.println("---------------开户企业ID："+ organisationID + "----------------------");
                break;
            }
            else if(i==9)
                {
                    System.out.println("---------------未获取到企业ID，排查开户失败原因----------------------");
                    bddUtil.quitDriver();
                }
            else {
                bddUtil.sleep(5);
                openAccount_page.clickRefresh.click();
            }
        }
    }
    //Track1Myinfo
    public void trackMyinfoStep1(String currency){
        openAccount_page.clickOpenAccountBtn.click();
        openAccount_page.clickTrack1SatrtFromScratchBtn.click();
        openAccount_page.clickSingaporeAllIndividuals.click();
        openAccount_page.clickCurrentAccount.click();
        if (currency.equals("SGD")){
            openAccount_page.selectSGD.click();
        }else if (currency.equals("USD")){
            openAccount_page.selectUSD.click();
        }

        openAccount_page.clickTrack1NextBtn.click();
        bddUtil.scrollWindowToElement(openAccount_page.getClickLetGo);
        bddUtil.sleep(4);
        openAccount_page.getClickLetGo.click();
    }
    private static String MockData ="{\n"+
            "\"person\": {\n" +
                "\"name\": {\n" +
                    "\"lastupdated\": \"2022-07-16\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"WATTNANARANARM TIWARAT\"\n"+
            "    },\n" +
        "\"hanyupinyinname\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"\"\n"+
            "    },\n" +
        "\"hanyupinyinaliasname\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"MYINFOALIAS C\"\n"+
                    "    },\n" +
        "\"sex\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"code\": \"F\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"desc\": \"FEMALE\""+
                    "    },\n" +
        "\"email\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"4\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"openaccount@MailTemp.top\""+
                    "    },\n" +
        "\"mobileno\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"4\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"areacode\": {\n"+
                    "\"value\": \"86\""+
                    "    },\n" +
            "\"prefix\": {\n"+
                "\"value\": \"+\"\n"+
                    "    },\n" +
            "\"nbr\": {\n"+
                "\"value\": \"13008553349\"\n"+
            "}\n"+
                    "    },\n" +
        "\"uinfin\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"S6005052Z\"\n"+
                    "    },\n" +
        "\"aliasname\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"\"\n"+
                    "    },\n" +
        "\"dob\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"value\": \"1967-11-13\"\n"+
        "},\n"+
        "\"nationality\": {\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"code\": \"SG\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"desc\": \"SINGAPORE CITIZEN\"\n"+
        "},\n"+
        "\"regadd\": {\n"+
            "\"country\": {\n"+
                "\"code\": \"SG\",\n"+
                        "\"desc\": \"SINGAPORE\"\n"+
            "},\n"+
            "\"unit\": {\n"+
                "\"value\": \"4\"\n"+
            "},\n"+
            "\"street\": {\n"+
                "\"value\": \"HAVELOCK ROAD\"\n"+
            "},\n"+
            "\"lastupdated\": \"2022-07-14\",\n"+
                    "\"block\": {\n"+
                "\"value\": \"18\"\n"+
            "},\n"+
            "\"source\": \"1\",\n"+
                    "\"postal\": {\n"+
                "\"value\": \"596740\"\n"+
            "},\n"+
            "\"classification\": \"C\",\n"+
                    "\"floor\": {\n"+
                "\"value\": \"12\"\n"+
            "},\n"+
            "\"type\": \"SG\",\n"+
                    "\"building\": {\n"+
                "\"value\": \"SINGAPORE ADDRESS\"\n"+
           " }\n"+
                    " }\n"+
                    " },\n"+
            "\"headResponseStatus\": \"OK\",\n"+
            "\"entity\": {\n"+
        "\"basic-profile\": {\n"+
            "\"uen\": {\n"+
                "\"value\": \""+RandomPhoneNumber.randomPhoneNum()+"R\"\n"+
            "},\n"+
            "\"entity-name\": {\n"+
                "\"value\": \"Ignite Company\"\n"+
            "},\n"+
            "\"entity-type\": {\n"+
                "\"code\": \"LC\",\n"+
                        "\"desc\": \"Local Company\"\n"+
            "},\n"+
            "\"entity-status\": {\n"+
                "\"value\": \"LIVE\"\n"+
           " },\n"+
            "\"primary-activity\": {\n"+
                "\"code\": \"10401\",\n"+
                        "\"desc\": \"REPAIR AND MAINTENANCE (INCLUDING INSPECTION) OF VEHICLES\"\n"+
            "},\n"+
            "\"secondary-activity\": {\n"+
                "\"code\": \"36000\",\n"+
                        "\"desc\": \"Collection, purification and distribution of water (including desalination of water)\"\n"+
            "},\n"+
            "\"registration-date\": {\n"+
                "\"value\": \"1982-02-01\"\n"+
            "},\n"+
            "\"company-type\": {\n"+
                "\"code\": \"A3\",\n"+
                        "\"desc\": \"Public Company Limited by Guarantee\"\n"+
            "},\n"+
            "\"ownership\": {\n"+
                "\"code\": \"1\",\n"+
                        "\"desc\": \"Individual Shareholders only\"\n"+
            "},\n"+
            "\"country-of-incorporation\": {\n"+
                "\"code\": \"SG\",\n"+
                        "\"desc\": \"SINGAPORE\"\n"+
            "}\n"+
        "},\n"+
        "\"previous-names\": {\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"previous-names-list\": [],\n"+
            "\"source\": \"1\",\n"+
                    "\"classification\": \"C\"\n"+
        "},\n"+
        "\"previous-uens\": {\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"previous-uens-list\": [],\n"+
            "\"source\": \"1\",\n"+
                    "\"classification\": \"C\"\n"+
        "},\n"+
        "\"addresses\": {\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"addresses-list\": [{\n"+
                "\"standard\": {\n"+
                    "\"code\": \"D\",\n"+
                            "\"desc\": \"Singapore Government Enterprise Architecture (SGEA) Data Reference Model (DRM) Standard\"\n"+
                "},\n"+
                "\"country\": {\n"+
                    "\"code\": \"SG\",\n"+
                            "\"desc\": \"SINGAPORE\"\n"+
                "},\n"+
                "\"unit\": {\n"+
                    "\"value\": \"6\"\n"+
                "},\n"+
                "\"street\": {\n"+
                    "\"value\": \"Kaki Bukit Avenue 1\"\n"+
                "},\n"+
                "\"block\": {\n"+
                    "\"value\": \"2\"\n"+
                "},\n"+
                "\"postal\": {\n"+
                    "\"value\": \"417938\"\n"+
                "},\n"+
                "\"floor\": {\n"+
                    "\"value\": \"3\"\n"+
                "},\n"+
                "\"type\": \"SG\",\n"+
                        "\"building\": {\n"+
                    "\"value\": \"\"\n"+
                "}\n"+
            "}],\n"+
            "\"source\": \"1\",\n"+
                    "\"classification\": \"C\"\n"+
        "},\n"+
        "\"capitals\": {\n"+
            "\"capitals-list\": [{\n"+
                "\"paid-up-capital-amount\": {\n"+
                    "\"value\": 10000\n"+
                "},\n"+
                "\"capital-type\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Ordinary Capital\"\n"+
                "},\n"+
                "\"issued-capital-amount\": {\n"+
                    "\"value\": 10000\n"+
                "},\n"+
                "\"currency\": {\n"+
                    "\"code\": \"SGD\",\n"+
                            "\"desc\": \"SINGAPORE, DOLLARS\"\n"+
                "},\n"+
                "\"share-allotted-amount\": {\n"+
                    "\"value\": 10000\n"+
                "}\n"+
            "}],\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\"\n"+
       " },\n"+
        "\"appointments\": {\n"+
            "\"appointments-list\": [{\n"+
                "\"person-reference\": {\n"+
                    "\"nationality\": {\n"+
                        "\"code\": \"SG\",\n"+
                                "\"desc\": \"SINGAPORE CITIZEN\"\n"+
                    "},\n"+
                    "\"idno\": {\n"+
                        "\"value\": \"S9812380F\"\n"+
                    "},\n"+
                    "\"person-name\": {\n"+
                        "\"value\": \"WONG WAI MUN\"\n"+
                    "}\n"+
                "},\n"+
                "\"appointment-date\": {\n"+
                    "\"value\": \"1982-02-01\"\n"+
                "},\n"+
                "\"position\": {\n"+
                    "\"code\": \"7\",\n"+
                            "\"desc\": \"Director\"\n"+
                "},\n"+
                "\"category\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Individual\"\n"+
                "}\n"+
            "}, {\n"+
                "\"person-reference\": {\n"+
                    "\"nationality\": {\n"+
                        "\"code\": \"SG\",\n"+
                                "\"desc\": \"SINGAPORE CITIZEN\"\n"+
                   " },\n"+
                    "\"idno\": {\n"+
                        "\"value\": \"S9912366D\"\n"+
                    "},\n"+
                    "\"person-name\": {\n"+
                        "\"value\": \"FATIMAH\"\n"+
                   " }\n"+
                "},\n"+
                "\"appointment-date\": {\n"+
                    "\"value\": \"1982-02-01\"\n"+
                "},\n"+
                "\"position\": {\n"+
                    "\"code\": \"7\",\n"+
                            "\"desc\": \"Director\"\n"+
                "},\n"+
                "\"category\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Individual\"\n"+
               "}\n"+
            "}],\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\"\n"+
        "},\n"+
        "\"shareholders\": {\n"+
            "\"lastupdated\": \"2020-12-22\",\n"+
                    "\"source\": \"1\",\n"+
                    "\"classification\": \"C\",\n"+
                    "\"shareholders-list\": [{\n"+
                "\"allocation\": {\n"+
                    "\"value\": 9000\n"+
               " },\n"+
                "\"person-reference\": {\n"+
                    "\"nationality\": {\n"+
                        "\"code\": \"SG\",\n"+
                                "\"desc\": \"SINGAPORE CITIZEN\"\n"+
                    "},\n"+
                    "\"idno\": {\n"+
                        "\"value\": \"S9812380F\"\n"+
                   "},\n"+
                    "\"person-name\": {\n"+
                        "\"value\": \"WONG WAI MUN\"\n"+
                    "}\n"+
                "},\n"+
                "\"currency\": {\n"+
                    "\"code\": \"SGD\",\n"+
                            "\"desc\": \"SINGAPORE, DOLLARS\"\n"+
                "},\n"+
                "\"category\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Individual\"\n"+
                "},\n"+
                "\"share-type\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Ordinary Capital\"\n"+
                "}\n"+
            "}, {\n"+
                "\"allocation\": {\n"+
                    "\"value\": 1000\n"+
                "},\n"+
                "\"person-reference\": {\n"+
                    "\"nationality\": {\n"+
                        "\"code\": \"SG\",\n"+
                                "\"desc\": \"SINGAPORE PR\"\n"+
                    "},\n"+
                    "\"idno\": {\n"+
                        "\"value\": \"S9812379B\"\n"+
                   " },\n"+
                    "\"person-name\": {\n"+
                        "\"value\": \"LIM YONG XIANG\"\n"+
                    "}\n"+
                "},\n"+
                "\"currency\": {\n"+
                    "\"code\": \"SGD\",\n"+
                            "\"desc\": \"SINGAPORE, DOLLARS\"\n"+
                "},\n"+
                "\"category\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Individual\"\n"+
                "},\n"+
                "\"share-type\": {\n"+
                    "\"code\": \"1\",\n"+
                            "\"desc\": \"Ordinary Capital\"\n"+
                "}\n"+
            "}]\n"+
        "}\n"+
    "}\n"+
    "}";

    @Step
    public void openMyinfoDataUrl(String url){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        if (url.equals("UAT"))
            webdriver.executeScript("window.open(\"http://10.24.9.119:60008/direct/test_pc_ent.html\");");
        else if (url.equals("SIT")){
            webdriver.executeScript("window.open(\"http://10.24.4.27:8080/direct/test_pc_ent.html\");");
        }
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
        openAccount_page.inputMockInformation.sendKeys("myinfoMockData");
        openAccount_page.inputMockGetInformation.click();
        openAccount_page.inputAuthUrlType.sendKeys("E");
        openAccount_page.inputMockData.sendKeys(MockData);
        openAccount_page.clickTestBtn.click();
        mockDataResponse = openAccount_page.getResponseStatus.getText().substring(openAccount_page.getResponseStatus.getText().indexOf("state")+9).substring(0,36);
        if (url.equals("UAT")){
            webdriver.executeScript("window.open(\"https://inb-uat.intranet.glbank.com/#/myinfo/stayInTouch?state="+mockDataResponse+"\")");
        }else if (url.equals("SIT")){
            webdriver.executeScript("window.open(\"https://inb-sit.intranet.glbank.com/#/myinfo/stayInTouch?state="+mockDataResponse+"\")");
        }

        bddUtil.switchToNewWindow();
    }

    @Step
    public void step3Information(){
        openAccount_page.clickSalutationDrop.click();
        openAccount_page.selectMrOnPage.click();
        openAccount_page.clickNextBtn.click();
        if (openAccount_page.getWindows.isVisible()){
            openAccount_page.clickSubmitBtn.click();
        }
    }
    @Step
    public void step4Information(){
        bddUtil.sleep(5);
//        openAccount_page.clickReminderDownDrop.click();
//        openAccount_page.select1Type.click();
//        openAccount_page.clickOkBtn.click();
        openAccount_page.selectSingaporeTrack1.click();
        openAccount_page.selectCountryOfOperation.sendKeys("SINGAPORE");
        openAccount_page.clickSingapore.click();
        openAccount_page.selectProfitNonProfitOrganisation.click();
        openAccount_page.clickDrowDrop.click();
        openAccount_page.selectGroupConsolidatedRevenue.click();
        openAccount_page.selectACRAModelConstitution.click();
        openAccount_page.selectPurposeOfAccount.click();
        openAccount_page.selectBusinessOperations.click();
        openAccount_page.LoansBanks.click();
        openAccount_page.estimatedMonthlyTransactionAmount.click();
        openAccount_page.estimatedMonthlyTransactionVolume.click();
        openAccount_page.clickFirstRiskStatements.click();
        openAccount_page.clickSecondRiskStatements.click();
        openAccount_page.clickTrack1NextBtn.click();
    }

    @Step
    public void step5Information(){
        bddUtil.sleep(3);
        openAccount_page.selectNRIC.click();
        openAccount_page.inputCountryCode.sendKeys("+65");
        openAccount_page.selectCountryCode.click();
        openAccount_page.inputMobileNum.sendKeys("13008553349");
        openAccount_page.inputEmailAdd.sendKeys("openaccount@MailTemp.top");
        openAccount_page.inputReEmailAdd.sendKeys("openaccount@MailTemp.top");
        bddUtil.sleep(3);
        openAccount_page.selectSecondNRIC.click();
        openAccount_page.inputSecondCountryCode.sendKeys("+65");
        openAccount_page.selectSecondCountryCode.click();
        openAccount_page.inputSecondMobileNum.sendKeys("13008553349");
        openAccount_page.inputSecondEmailAdd.sendKeys("openaccount2@MailTemp.top");
        openAccount_page.inputSecondReEmailAdd.sendKeys("openaccount2@MailTemp.top");
        openAccount_page.clickTrack1NextBtn.click();
    }
    @Step
    public void step6Information(){
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickTrack1NextBtn);
        openAccount_page.clickTrack1NextBtn.click();
    }

    @Step
    public void step7Information(){
        bddUtil.sleep(3);
        openAccount_page.selectOneCompanyAdministrator.click();
        openAccount_page.clickYesProceedBtn.click();
        openAccount_page.selectAdmin1YesProceed.click();
        openAccount_page.clickCompanyAdmin.click();
        openAccount_page.selectCompanyAdmin.click();
        openAccount_page.clickIdTypeNRIC.click();
        openAccount_page.clickSalutationDownDrop.click();
        openAccount_page.selectMr.click();
        openAccount_page.inputCountryCodeCompanyAdmin.sendKeys("+65");
        openAccount_page.selectSingporeCompanAdmin.click();
        openAccount_page.inputMobileNumberAdmin.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputFirstEmailAdmin.click();
        if (openAccount_page.ensureThatTheMobile.isVisible()){
            openAccount_page.clickYesAccurate.click();
        }
        openAccount_page.inputFirstEmailAdmin.sendKeys("openaccount@MailTemp.top");
        openAccount_page.inputSecondEmailAdmin.sendKeys("openaccount@MailTemp.top");
        openAccount_page.clickTrack1NextBtn.click();
    }
    
    @Step
    public void step8Information(){
        getDriver().findElement(By.xpath("//form[@class='el-form']/div[1]//input[@class='el-upload__input']")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//form[@class='el-form']/div[2]//input[@class='el-upload__input']")).sendKeys(fileAddress);
        bddUtil.sleep(5);
        getDriver().findElement(By.xpath("//form[@class='el-form']/div[3]//input[@class='el-upload__input']")).sendKeys(fileAddress);
        openAccount_page.clickTrack1NextBtn.click();
    }

    @Step
    public void step9Information(){
        bddUtil.scrollWindowToElement(openAccount_page.clickFirstCheckBox);
        openAccount_page.clickFirstCheckBox.click();
        openAccount_page.clickSecondCheckBox.click();
        openAccount_page.clickThirdCheckBox.click();
        openAccount_page.submitNew.click();
        openAccount_page.viewCongratulations.isVisible();
    }

    @Step
    public void track3FirstPageInformationEnter(String accountType,String salutation){
        openAccount_page.clickAccountTypeDropDownBox.click();
        List<WebElementFacade> accountTypeText = openAccount_page.selectAccountTypeDropDownBox;
        for (int i = 0; i < accountTypeText.size(); i++) {
            if (accountType.equals(accountTypeText.get(i).getText())){
                accountTypeText.get(i).click();
                break;
            }
        }
        openAccount_page.selectAccountTypeSGD.click();
        openAccount_page.clickSalutationDownDropBox.click();
        bddUtil.sleep(1);
        List<WebElementFacade> salutationText = openAccount_page.selectSalutaionText;
        for (int j = 0; j < salutationText.size(); j++){
            if (salutation.equals(salutationText.get(j).getText())){
                salutationText.get(j).click();
                break;
            }
        }
        openAccount_page.enterOperatePersonNm.sendKeys("zhangsan");
        openAccount_page.enterContactNumberFirst.sendKeys("SINGAPORE");
        bddUtil.clickByJS(openAccount_page.selectContactNumberFirstCountry);
        openAccount_page.enterContactNumberSecond.sendKeys("85642126");
        openAccount_page.enterEmailInput.sendKeys("617558302@qq.com");
        bddUtil.sleep(1);
        openAccount_page.verifyEmailNew.click();
    }
}