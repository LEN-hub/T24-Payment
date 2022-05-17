package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.openAccount;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.openAccount.openAccount_page;
import com.glbank.com.sg.bdd.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.List;
import java.util.Random;

import static com.glbank.com.sg.bdd.utils.ConnectLinux.getLastOtp;

public class openAccount_step extends ScenarioSteps {

    private openAccount_page openAccount_page;
    private BDDUtil bddUtil;
    private static String verificationCode;
    public static String otp;
    public static String passportNumber = JRandomNameTool.getStringRandom(10);
    public static String mobileNumber = RandomPhoneNumber.randomPhoneNum();
    String fileAddress = "E:\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg";


    public void clickOpenAccount() {
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
        bddUtil.sleep(2);
    }


    public void fillInInformationOnGettingStartedPage() {
        openAccount_page.clickBusinessEntityType.click();
        openAccount_page.clickNeedThisAccount.click();
        openAccount_page.clickNextOnGettingStartedPage.click();
        bddUtil.sleep(3);
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

    public void fillInInformationOnGettingStartedPage2MCA_SGD_CNY(String accountType, String accountName, String currencyType) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyType + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY_HKD_EUR(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY, String currencyTypeHKD, String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
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
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_HKD(String accountType, String accountName, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_EUR(String accountType, String accountName,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeEUR + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_CNY(String accountType, String accountName, String currencyTypeUSD, String currencyTypeCNY) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeCNY + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_HKD(String accountType, String accountName, String currencyTypeUSD, String currencyTypeHKD) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeUSD + "]/span/span")).click();
        openAccount_page.find(By.xpath("//label[@for=\"currencyList\"]/following-sibling::div//label[" + currencyTypeHKD + "]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2MCA_SGD_USD_EUR(String accountType, String accountName, String currencyTypeUSD,String currencyTypeEUR) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@role=\"radiogroup\"]/label[" + accountType + "]/span/span")).click();
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
        bddUtil.scrollWindowToElement(openAccount_page.getSalutation).click();
        openAccount_page.inputFullName.sendKeys(applicantName);
        openAccount_page.clickCountryCode.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryCode).click();
        openAccount_page.inputMobileNumber.sendKeys(mobileNumber);
        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
        openAccount_page.clickVerifyEmailAddress.click();
        bddUtil.sleep(1);
    }

    public void clickValidationCode() {
        bddUtil.sleep(3);
//        getDriver().switchTo().alert().getText();
//        bddUtil.sleep(2);
//        verificationCode = getDriver().switchTo().alert().getText().substring(7, 13);
//        bddUtil.sleep(2);
        getDriver().switchTo().alert().accept();
        otp=getLastOtp("60120003");
        System.out.println("------------otp验证码:"+otp+"-----------------");
        bddUtil.sleep(1);
    }

    public void inputValidationCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(1);
        openAccount_page.sendKeysBox.click();
        enterKeys.EnterKeys(otp.substring(0, 1));
        bddUtil.sleep(1);
        openAccount_page.secondKeysBox.click();
        enterKeys.EnterKeys(otp.substring(1, 2));
        openAccount_page.thirdKeysBox.click();
        enterKeys.EnterKeys(otp.substring(2, 3));
        openAccount_page.fourKeysBox.click();
        enterKeys.EnterKeys(otp.substring(3, 4));
        openAccount_page.fiveKeysBox.click();
        enterKeys.EnterKeys(otp.substring(4, 5));
        openAccount_page.sixKeysBox.click();
        enterKeys.EnterKeys(otp.substring(5, 6));
        bddUtil.sleep(1);
    }

    public void inputEntityDetails(String entityType,String entityConsolidated,String entityIndustry,String date) {
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        //没有挡板，用shekk数据。
//        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegistrationNumber.sendKeys("201700266Z");
        openAccount_page.inputCompanyRegisterDate.sendKeys(date);
        openAccount_page.goEntityDetails.click();
        openAccount_page.clickCountryOfIncorporation.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryOfIncorporation).click();
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
        openAccount_page.clickIndustry.click();
        List<WebElementFacade> testThreeEntityType = openAccount_page.getEntityType2;
        for (int k =0;k <= testThreeEntityType.size();k++){
            bddUtil.sleep(2);
            if (testThreeEntityType.get(k).getText().equals(entityIndustry)) {
                bddUtil.scrollWindowToElement(testThreeEntityType.get(k)).click();
                break;
            }
        }
        openAccount_page.clickNonprofitFlag.click();
        openAccount_page.clickNext2OnProvideEssentialInformationPage.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickNextToStep3).click();
        bddUtil.sleep(2);
    }

    public void inputEntityDetails1(String subIndustry) {
        String entityType = "Public Limited Co (not listed in Singapore)";
        String industry = "Financial & Insurance Activities";
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegisterDate.sendKeys("01/01/2010");
        openAccount_page.goEntityDetails.click();
        openAccount_page.clickCountryOfIncorporation.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryOfIncorporation).click();
        openAccount_page.clickNextOnProvideEssentialInformationPage.click();
        bddUtil.scrollWindowToElement(openAccount_page.goEntityType);
        bddUtil.sleep(1);
        openAccount_page.clickEntityType.click();
        if (openAccount_page.getEntityType.getText().equals(entityType)) {
            bddUtil.scrollWindowToElement(openAccount_page.getEntityType).click();
        } else {
            bddUtil.scrollWindowToElement(openAccount_page.getEntityTypeCN).click();
        }
        openAccount_page.clickEntityConsolidatedAnnualSalesTurnover.click();
        bddUtil.scrollWindowToElement(openAccount_page.getEntityConsolidatedAnnualSalesTurnover).click();
        openAccount_page.clickIndustry.click();
        if (openAccount_page.getIndustryToSub.getText().equals(industry)) {
            bddUtil.scrollWindowToElement(openAccount_page.getIndustryToSub).click();
        } else {
            bddUtil.scrollWindowToElement(openAccount_page.getGetIndustryToSubCN).click();
        }
        openAccount_page.clickSubIndustry.click();
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
        openAccount_page.inputAliasNm.sendKeys(aliasNm);
        openAccount_page.inputBirthDate.sendKeys("01/01/2010");
        openAccount_page.clickRoleCd.click();
        bddUtil.scrollWindowToElement(openAccount_page.goIdentificationType);
        bddUtil.sleep(1);
        openAccount_page.clickIdentificationType.click();
        openAccount_page.inputPassportNumber.sendKeys(passportNumber);
        openAccount_page.inputDateOfExpiry.sendKeys("01/01/2030");
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
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//div[@class='paddingleft16']/label/span[1]"))).click();
        openAccount_page.clickNextForUBO.click();

    }

    public void inputOnlyUBODetails(String onlyUBOName, String onlyUBOAliasName, String onlyUBOPassportNumber, String onlyUBOPhoneNumber, String onlyUBOEmailName) {
        bddUtil.sleep(2);
////        openAccount_page.selectCheckBox3.click();
//        bddUtil.scrollWindowToElement(openAccount_page.goUBO2Name);
////        openAccount_page.inputOnlyUBOName.clear();
////        openAccount_page.inputOnlyUBOName.sendKeys(onlyUBOName);
//        openAccount_page.inputOnlyUBOAliasName.sendKeys(onlyUBOAliasName);
//        openAccount_page.inputUBO2BirthDate.sendKeys("01/01/2010");
//        openAccount_page.goUBO2Name.click();
//        openAccount_page.clickUBO2IdentificationType.click();
//        openAccount_page.inputUBO2PassportNo.sendKeys(onlyUBOPassportNumber);
//        openAccount_page.inputUBO2PassportDueDate.sendKeys("01/01/2030");
//        openAccount_page.goUBO2Name.click();
//        openAccount_page.inputUBO2ResidentialAddress3.sendKeys("ResidentialAddress");
//        openAccount_page.inputUBO2CityName3.sendKeys("City");
//        openAccount_page.inputUBO2PostalCode3.sendKeys("710000");
//        openAccount_page.clickUBO2Country3.click();
//        bddUtil.scrollWindowToElement(openAccount_page.getUBO2Country).click();
//        bddUtil.scrollWindowToElement(openAccount_page.clickUBO2Idd).click();
//        bddUtil.scrollWindowToElement(openAccount_page.getUBO2Idd).click();
//        openAccount_page.inputUBO2MobilePhoneNo.sendKeys(onlyUBOPhoneNumber);
//        openAccount_page.inputUBO2EmailAddress.sendKeys(onlyUBOEmailName + "@MailTemp.top");
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

    public void inputEmailTwo( String emailName){
//        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
        openAccount_page.emailAddressTwo.sendKeys(emailName + "@MailTemp.top");
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

    public void reviewDetails(){
        bddUtil.scrollWindowToElement(openAccount_page.clickAccepted).click();
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
}