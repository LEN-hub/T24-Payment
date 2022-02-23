package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.openAccount;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.openAccount.openAccount_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.EnterKeys;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.List;

public class openAccount_step extends ScenarioSteps {

    private openAccount_page openAccount_page;
    private BDDUtil bddUtil;
    private static String verificationCode;

    public void clickOpenAccount() {
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
    }


    public void fillInInformationOnGettingStartedPage() {
        openAccount_page.clickBusinessEntityType.click();
        openAccount_page.clickNeedThisAccount.click();
        openAccount_page.clickNextOnGettingStartedPage.click();
        bddUtil.sleep(3);
    }

    public void fillInInformationOnGettingStartedPage2(String accountType, String accountName, String currencyType) {
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@class=\"el-radio-group width_percent_100\"]/label[" + accountType + "]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(accountName);
        openAccount_page.find(By.xpath("//label[@for=\"currencyTypeCd\"]/following-sibling::div//label[" + currencyType + "]/span/span")).click();
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
        bddUtil.sleep(2);
        getDriver().switchTo().alert().getText();
        bddUtil.sleep(2);
        verificationCode = getDriver().switchTo().alert().getText().substring(7, 13);
        bddUtil.sleep(2);
        getDriver().switchTo().alert().accept();
        bddUtil.sleep(1);
    }

    public void inputValidationCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(2);
        openAccount_page.sendKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(0, 1));
        bddUtil.sleep(3);
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
    }

    public void inputEntityDetails() {
        String entityType = "Public Limited Co (not listed in Singapore)";
        String industry = "Manufacturing";
        bddUtil.scrollWindowToElement(openAccount_page.goEntityDetails);
        bddUtil.sleep(1);
        openAccount_page.inputCompanyRegistrationNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        openAccount_page.inputCompanyRegisterDate.sendKeys("2010-01-01");
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
        if (openAccount_page.getIndustry.getText().equals(industry)) {
            bddUtil.scrollWindowToElement(openAccount_page.getIndustry).click();
        } else {
            bddUtil.scrollWindowToElement(openAccount_page.getIndustryCN).click();
        }
        openAccount_page.clickNonprofitFlag.click();
        openAccount_page.clickNext2OnProvideEssentialInformationPage.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(openAccount_page.clickNextToStep3).click();
        bddUtil.sleep(2);
    }

    public void inputDirectorDetails(String contactPersonNm, String aliasNm, String passportNumber, String directorPhoneNumber, String directorEmailName) {
        openAccount_page.inputContactPersonNm.click();
        openAccount_page.inputContactPersonNm.clear();
        openAccount_page.inputContactPersonNm.sendKeys(contactPersonNm);
        openAccount_page.inputAliasNm.sendKeys(aliasNm);
        openAccount_page.inputBirthDate.sendKeys("2000-01-01");
        openAccount_page.clickRoleCd.click();
        bddUtil.scrollWindowToElement(openAccount_page.goIdentificationType);
        bddUtil.sleep(1);
        openAccount_page.clickIdentificationType.click();
        openAccount_page.inputPassportNumber.sendKeys(passportNumber);
        openAccount_page.inputDateOfExpiry.sendKeys("2030-01-01");
        openAccount_page.clickDateOfExpiry.click();
        openAccount_page.clickIddInput.click();
        bddUtil.scrollWindowToElement(openAccount_page.getIdd).click();
        openAccount_page.inputDirectorMobilePhoneNo.sendKeys(directorPhoneNumber);
        openAccount_page.inputDirectorEmailAddress.sendKeys(directorEmailName + "@MailTemp.top");
        openAccount_page.clickNextOnEnterConnectedPeoplesDetails.click();
        bddUtil.sleep(2);
    }

    public void inputUltimateBeneficialOwnerDetails(String ultimateBeneficialOwnerName, String ultimateBeneficialOwnerAliasName, String ultimateBeneficialOwnerPassportNumber, String ultimateBeneficialOwnerPhoneNumber, String ultimateBeneficialOwnerEmailName) {
        bddUtil.scrollWindowToElement(openAccount_page.goContactPersonNm);
        openAccount_page.inputUBOName.clear();
        openAccount_page.inputUBOName.sendKeys(ultimateBeneficialOwnerName);
        openAccount_page.inputUBOAliasName.sendKeys(ultimateBeneficialOwnerAliasName);
        openAccount_page.inputUBOBirthDate.sendKeys("2000-01-01");
        openAccount_page.goContactPersonNm.click();
        openAccount_page.clickUBOIdentificationType.click();
        openAccount_page.inputUBOPassportNo.sendKeys(ultimateBeneficialOwnerPassportNumber);
        openAccount_page.inputUBOPassportDueDate.sendKeys("2030-01-01");
        openAccount_page.goContactPersonNm.click();
        openAccount_page.clickUBOIdd.click();
        bddUtil.scrollWindowToElement(openAccount_page.getUBOIdd).click();
        openAccount_page.inputUBOMobilePhoneNo.sendKeys(ultimateBeneficialOwnerPhoneNumber);
        openAccount_page.inputUBOEmailAddress.sendKeys(ultimateBeneficialOwnerEmailName + "@MailTemp.top");
        openAccount_page.clickNextForUBO.click();
        bddUtil.sleep(2);
    }

    public void inputOnlyUBODetails(String onlyUBOName, String onlyUBOAliasName, String onlyUBOPassportNumber, String onlyUBOPhoneNumber, String onlyUBOEmailName) {
        bddUtil.scrollWindowToElement(openAccount_page.goUBO2Name);
        openAccount_page.inputOnlyUBOName.clear();
        openAccount_page.inputOnlyUBOName.sendKeys(onlyUBOName);
        openAccount_page.inputOnlyUBOAliasName.sendKeys(onlyUBOAliasName);
        openAccount_page.inputUBO2BirthDate.sendKeys("2000-01-01");
        openAccount_page.goUBO2Name.click();
        openAccount_page.clickUBO2IdentificationType.click();
        openAccount_page.inputUBO2PassportNo.sendKeys(onlyUBOPassportNumber);
        openAccount_page.inputUBO2PassportDueDate.sendKeys("2030-01-01");
        openAccount_page.goUBO2Name.click();
        openAccount_page.clickUBO2Idd.click();
        bddUtil.scrollWindowToElement(openAccount_page.getUBO2Idd).click();
        openAccount_page.inputUBO2MobilePhoneNo.sendKeys(onlyUBOPhoneNumber);
        openAccount_page.inputUBO2EmailAddress.sendKeys(onlyUBOEmailName);
        openAccount_page.clickNextForUBO2.click();
        bddUtil.sleep(2);
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
            openAccount_page.inputDirector2ResidentialAddress.sendKeys("Address");
            openAccount_page.inputDirector2City.sendKeys("City");
            openAccount_page.inputDirector2PostalCode.sendKeys("710000");
            openAccount_page.inputDirector2Country.click();
            List<WebElementFacade> getDirector2Country = openAccount_page.getDirector2Country;
            bddUtil.scrollWindowToElement(getDirector2Country.get(2)).click();
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
            List<WebElementFacade> getDirector2Country = openAccount_page.getDirector2Country;
            JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
            webdriver.executeScript("arguments[0].click();", getDirector2Country.get(2));
        }
        openAccount_page.clickNextToStep4.click();
        bddUtil.sleep(2);
    }

    public void enterConnectedEntitiesDetails(){
        bddUtil.scrollWindowToElement(openAccount_page.inputPostalCodeConnectedCorporateEntity1);
        openAccount_page.inputPostalCodeConnectedCorporateEntity1.sendKeys("710000");
        openAccount_page.clickNextToConnectedCorporateEntity2.click();
        openAccount_page.inputPostalCodeConnectedCorporateEntity2.sendKeys("710000");
        openAccount_page.clickNextToStep5.click();
        bddUtil.sleep(2);
    }

    public void createCompanyAdministratorsProfiles(String contactPersonNm){
        openAccount_page.clickYESConnectedPerson1.click();
        openAccount_page.clickConnectedPersons1Name.click();
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()="+ contactPersonNm +"]"))).click();
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
        openAccount_page.clickNextToAdministrator2.click();
        bddUtil.scrollWindowToElement(openAccount_page.goChoseYESConnectedPerson2);
        openAccount_page.clickYESConnectedPerson2.click();
        openAccount_page.clickConnectedPersons2Name.click();
        bddUtil.scrollWindowToElement(openAccount_page.find(By.xpath("//span[text()="+ ultimateBeneficialOwnerName +"]"))).click();
        bddUtil.scrollWindowToElement(openAccount_page.goVerifyMobileNumber1);
        openAccount_page.clickVerifyMobileNumber2.click();
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

    public void clickNextToStep6(){
        openAccount_page.clickNextToStep6.click();
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
        openAccount_page.clickUpload1.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickUpload2.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickUpload3.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickUpload4.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickUpload5.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickUpload6.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
        openAccount_page.clickNextToStep13.click();
    }

    public void reviewDetails(){
        bddUtil.scrollWindowToElement(openAccount_page.clickAccepted).click();
        openAccount_page.clickSubmitToStep14.click();
        bddUtil.sleep(5);
    }

    public void getOrganisationID(String emailName){
        bddUtil.switchToNewWindow();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox\");");
        openAccount_page.sendEmail.clear();
        openAccount_page.sendEmail.sendKeys(emailName);
        openAccount_page.createEmailButton.click();
    }


}