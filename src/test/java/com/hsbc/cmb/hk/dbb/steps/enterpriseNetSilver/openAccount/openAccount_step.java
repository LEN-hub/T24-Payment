package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.openAccount;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.openAccount.openAccount_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.EnterKeys;
import com.hsbc.cmb.hk.dbb.utils.JRandomNameTool;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import java.awt.*;

public class openAccount_step extends ScenarioSteps {

    private openAccount_page openAccount_page;
    private BDDUtil bddUtil;
    private static String verificationCode;

    public void clickOpenAccount(){
        openAccount_page.clickOpenAccount.click();
        openAccount_page.clickNewUser.click();
    }


    public void fillInInformationOnGettingStartedPage(){
        openAccount_page.clickBusinessEntityType.click();
        openAccount_page.clickNeedThisAccount.click();
        openAccount_page.clickNextOnGettingStartedPage.click();
    }
    public void fillInInformationOnGettingStartedPage2(String accountType,String currencyType){
        openAccount_page.find(By.xpath("//label[@for=\"accountTypeCd\"]/following-sibling::div//div[@class=\"el-radio-group width_percent_100\"]/label["+ accountType +"]/span/span")).click();
        openAccount_page.inputAccountName.sendKeys(JRandomNameTool.getStringRandom(5));
        openAccount_page.find(By.xpath("//label[@for=\"currencyTypeCd\"]/following-sibling::div//label["+ currencyType +"]/span/span")).click();
        openAccount_page.clickCreateType.click();
        openAccount_page.clickWhatNeed.click();
        openAccount_page.clickLetGo.click();
    }

    public void provideEssentialInformation(String emailName,String mobileNumber){
        openAccount_page.clickSalutation.click();
        bddUtil.scrollWindowToElement(openAccount_page.getSalutation).click();
        openAccount_page.inputFullName.sendKeys("AutoTest_" + JRandomNameTool.getStringRandom(10));
        openAccount_page.clickCountryCode.click();
        bddUtil.scrollWindowToElement(openAccount_page.getCountryCode).click();
        openAccount_page.inputMobileNumber.sendKeys(mobileNumber);
        openAccount_page.inputEmailAddress.sendKeys(emailName + "@MailTemp.top");
    }

    public void clickValidationCode() {
        bddUtil.sleep(1);
        getDriver().switchTo().alert().getText();
        bddUtil.sleep(2);
        verificationCode = getDriver().switchTo().alert().getText().substring(7, 13);
        bddUtil.sleep(2);
        getDriver().switchTo().alert().accept();
        bddUtil.sleep(1);
    }

    public void inputValidationCode()throws AWTException{
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(2);
        openAccount_page.sendKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(0,1));
        bddUtil.sleep(3);
        openAccount_page.secondKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(1,2));
        openAccount_page.thirdKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(2,3));
        openAccount_page.fourKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(3,4));
        openAccount_page.fiveKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(4,5));
        openAccount_page.sixKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(5,6));
    }

    public void inputEntityDetails(){
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
        if(openAccount_page.getEntityType.getText().equals(entityType)){
            bddUtil.scrollWindowToElement(openAccount_page.getEntityType).click();
        }
        else{
            bddUtil.scrollWindowToElement(openAccount_page.getEntityTypeCN).click();
        }
        openAccount_page.clickEntityConsolidatedAnnualSalesTurnover.click();
        bddUtil.scrollWindowToElement(openAccount_page.getEntityConsolidatedAnnualSalesTurnover).click();
        openAccount_page.clickIndustry.click();
        if(openAccount_page.getIndustry.getText().equals(industry)){
            bddUtil.scrollWindowToElement(openAccount_page.getIndustry).click();
        }
        else {
            bddUtil.scrollWindowToElement(openAccount_page.getIndustryCN).click();
        }
        openAccount_page.clickNonprofitFlag.click();
        openAccount_page.clickNext2OnProvideEssentialInformationPage.click();
        openAccount_page.clickNextToStep3.click();
    }

    public void inputDirectorDetails(String contactPersonNm,String aliasNm,String passportNumber,String directorPhoneNumber,String directorEmailName){
        openAccount_page.inputContactPersonNm.click();
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

    public void inputUltimateBeneficialOwnerDetails(String ultimateBeneficialOwnerName,String ultimateBeneficialOwnerAliasName,String ultimateBeneficialOwnerPassportNumber,String ultimateBeneficialOwnerPhoneNumber,String ultimateBeneficialOwnerEmailName){
        bddUtil.scrollWindowToElement(openAccount_page.goContactPersonNm);
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

}
