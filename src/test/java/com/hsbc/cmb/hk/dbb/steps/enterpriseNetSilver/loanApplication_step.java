package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.loanApplication_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.hsbc.cmb.hk.dbb.utils.AssertLocal.assertEquals;

public class loanApplication_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private loanApplication_page loanApplication_page;

    //鼠标悬浮在贷款业务上。
    public void FloatingLoanButton(){
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(loanApplication_page.loan).perform();
        loanApplication_page.loan.click();
        loanApplication_page.loanApplicationBtn.click();
        bddUtil.sleep(1);
    }

    //在输入信息页面，输入相对应的信息。
    public void sendInformation(String amount){
//        loanApplication_page.microDemandOverdraft.click();
//        bddUtil.scrollWindowToElement(loanApplication_page.inputLoanAmount).sendKeys(amount);
//        bddUtil.scrollWindowToElement(loanApplication_page.submitBtn).click();
        loanApplication_page.lessThanOneMillion.click();
        loanApplication_page.currentAssets.click();
        loanApplication_page.nextBtn.click();
        bddUtil.sleep(1);
        loanApplication_page.ApplyForMicroDemand.click();
        loanApplication_page.inputLoanAmount.sendKeys(amount);
        loanApplication_page.submitBtn.click();
        bddUtil.sleep(5);
    }

    //选择关联人信息。
    public void selectPersonalGuarantor(String name){
        loanApplication_page.personalGuarantor.click();
        bddUtil.sleep(1);
        loanApplication_page.relatedParty.click();
        bddUtil.sleep(1);
        loanApplication_page.affiliateName.click();
        List<WebElementFacade> nameList = loanApplication_page.nameList;
        for (int i = 0; i < nameList.size(); i++) {
            String a = nameList.get(i).getText();
            if (name.equals(a)){
                System.out.println(a);
                nameList.get(i).click();
                break;
            }
        }
    }
    //补全关联人其他信息。
    public void selectBirthday(String experience){
        bddUtil.scrollWindowToElement(loanApplication_page.birthDay);
        loanApplication_page.birthDay.click();
        bddUtil.sleep(5);
        loanApplication_page.industryExperience.sendKeys(experience);
    }

    public void selectGuarantor(String name,String birthday,String idCard,String phoneNum,String email,String experience){
        loanApplication_page.personalGuarantor.click();
        loanApplication_page.director.click();
        loanApplication_page.sex.click();
        loanApplication_page.mr.click();
        loanApplication_page.name.sendKeys(name);
        bddUtil.scrollWindowToElement(loanApplication_page.birthDay);
        loanApplication_page.birthDay.sendKeys(birthday);
        loanApplication_page.name.click();
        loanApplication_page.countryBox.click();
        loanApplication_page.china.click();
        loanApplication_page.idCard.sendKeys(idCard);
        loanApplication_page.countryCode.click();
        loanApplication_page.chinaCode.click();
        loanApplication_page.phoneNumber.sendKeys(phoneNum);
        loanApplication_page.email.sendKeys(email);
        loanApplication_page.experience.sendKeys(experience);
        loanApplication_page.submit.click();
        bddUtil.sleep(3);
    }//选择个人担保人和董事以及一系列值。

    public void selectCorporateGuarantee(String registeredName,String RegistrationNumber,String registrationDate,String address,String city,String zipCode){
        loanApplication_page.corporateGuarantor.click();
        loanApplication_page.registeredName.sendKeys(registeredName);
        loanApplication_page.companyRegisterDate.sendKeys(registrationDate);
        loanApplication_page.companyRegisterDate.click();
        loanApplication_page.RegistrationNumber.sendKeys(RegistrationNumber);
        loanApplication_page.entRegisterCountry.click();
        loanApplication_page.RegisteredInChina.click();
        loanApplication_page.entRegisterAddr.sendKeys(address);
        loanApplication_page.city.sendKeys(city);
        loanApplication_page.zipCode.sendKeys(zipCode);
        loanApplication_page.countryBox.click();
        loanApplication_page.RegisteredInChina.click();
        loanApplication_page.enterpriseTypeCd.click();
        loanApplication_page.privateLimitedCompany.click();
        loanApplication_page.submit.click();
        bddUtil.sleep(3);
    }//选择企业担保人以及一系列值。

    public void selectRealEstateMortgage(String houseAddress,String zipCode,String constructionArea){
        loanApplication_page.property.click();
        loanApplication_page.houseAddress.sendKeys(houseAddress);
        loanApplication_page.zipCode.sendKeys(zipCode);
        loanApplication_page.constructionArea.sendKeys(constructionArea);
        loanApplication_page.submit.click();
        bddUtil.sleep(3);
    }//选择房产抵押并完善一系列值。

    public void inputFinancialStatus(String reportDate,String netSales,String preTaxSales,String totalAssets,String dibtAssets){
        loanApplication_page.reportDate.sendKeys(reportDate);
        loanApplication_page.otherBtn.click();
        loanApplication_page.reportDuration.click();
        loanApplication_page.reportSix.click();
        loanApplication_page.netSales.sendKeys(netSales);
        loanApplication_page.preTaxSales.sendKeys(preTaxSales);
        loanApplication_page.totalAssets.sendKeys(totalAssets);
        loanApplication_page.dibtAssets.sendKeys(dibtAssets);
    }//填写财务报告1

    public void inputSecondFinancialStatus(String reportDate,String netSales,String preTaxSales,String totalAssets,String dibtAssets){
        loanApplication_page.reportDate2.sendKeys(reportDate);
        loanApplication_page.otherBtn.click();
        loanApplication_page.reportDuration2.click();
        loanApplication_page.reportSix2.click();
        loanApplication_page.netSales2.sendKeys(netSales);
        loanApplication_page.preTaxSales2.sendKeys(preTaxSales);
        loanApplication_page.totalAssets2.sendKeys(totalAssets);
        loanApplication_page.dibtAssets2.sendKeys(dibtAssets);

    }//填写财务报告2

    public void inputOtherFinancialCommitment(String financialInstitutionName,String loanAmt,String outstandingAmt,String monthlyInstallments,String rate){
        loanApplication_page.yesBtn.click();
        loanApplication_page.financialInstitutionName.sendKeys(financialInstitutionName);
        loanApplication_page.overdraft.click();
        loanApplication_page.loanAmt.sendKeys(loanAmt);
        loanApplication_page.outstandingAmt.sendKeys(outstandingAmt);
        loanApplication_page.monthlyInstallments.sendKeys(monthlyInstallments);
        loanApplication_page.rate.sendKeys(rate);
        loanApplication_page.nextStep.click();
        bddUtil.sleep(3);
    }//填写其他财务承诺。

    public void inputOtherFinancialCommitmentOnCompany(String financialInstitutionName,String loanAmt,String outstandingAmt,String monthlyInstallments,String rate){
        loanApplication_page.yesBtnCompany.click();
        loanApplication_page.financialInstitutionCompanyName.sendKeys(financialInstitutionName);
        loanApplication_page.overdraftCompany.click();
        loanApplication_page.loanAmtCompany.sendKeys(loanAmt);
        loanApplication_page.outstandingAmtCompany.sendKeys(outstandingAmt);
        loanApplication_page.monthlyInstallmentsCompany.sendKeys(monthlyInstallments);
        loanApplication_page.rateCompany.sendKeys(rate);
        loanApplication_page.nextStep.click();
        bddUtil.sleep(3);
    }//填写其他财务承诺在公司担保界面。。

    public void inputOtherOnRealEstateMortgage(String financialInstitutionName,String loanAmt,String outstandingAmt,String monthlyInstallments,String rate){
        loanApplication_page.financialCommitment.click();
        loanApplication_page.financialInstitutionNameHouse.sendKeys(financialInstitutionName);
        loanApplication_page.overdraftHouse.click();
        loanApplication_page.loanAmtHouse.sendKeys(loanAmt);
        loanApplication_page.outstandingAmtHouse.sendKeys(outstandingAmt);
        loanApplication_page.monthlyInstallmentsHouse.sendKeys(monthlyInstallments);
        loanApplication_page.rateHouse.sendKeys(rate);
        loanApplication_page.nextStep.click();
        bddUtil.sleep(3);
    }//填写其他财务承诺在房产抵债。

    public void upLoadFile(String fileAddress){
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][2]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][3]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
    }

    public void upLoadFileOnHouse(String fileAddress){
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][2]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][3]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][4]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][5]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
    }//房产抵押上传文件。

    public void clickNextBtn(){
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(2);
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(15);
    }

    public void selectOneMillionTOTwoMillion(String amount){
        loanApplication_page.oneToTwoMillion.click();
        loanApplication_page.currentAssets.click();
        loanApplication_page.nextBtn.click();
        bddUtil.sleep(1);
        loanApplication_page.demandOverdraft.click();
        loanApplication_page.inputLoanAmount.sendKeys(amount);
        loanApplication_page.submitBtn.click();
        bddUtil.sleep(5);
    }//选择100W-200W 并且选择活期透支。

    public void selectCollectionFinancing(String amount){
        loanApplication_page.oneToTwoMillion.click();
        loanApplication_page.currentAssets.click();
        loanApplication_page.nextBtn.click();
        bddUtil.sleep(1);
        loanApplication_page.CollectionFinancing.click();
        loanApplication_page.inputLoanAmount.sendKeys(amount);
        loanApplication_page.thirtyDays.click();
        loanApplication_page.submitBtn.click();
        bddUtil.sleep(5);
    }//选择100W-200W 并且选择收账融资。

    public void selectCarFinancing(String amount){
        loanApplication_page.oneToTwoMillion.click();
        loanApplication_page.fixedAssets.click();
        loanApplication_page.nextBtn.click();
        bddUtil.sleep(1);
        loanApplication_page.newCarFinancing.click();
        loanApplication_page.inputLoanAmount.sendKeys(amount);
        loanApplication_page.oneYears.click();
        loanApplication_page.submitBtn.click();
        bddUtil.sleep(5);
    }//选择100W-200W 并且选择固定资产。

    public void inputBuyerInformation(String name,String RelationshipYears,String annualSales,String creditPeriod){
        loanApplication_page.buyerName.sendKeys(name);
        loanApplication_page.buyerYears.sendKeys(RelationshipYears);
        loanApplication_page.buyerSales.sendKeys(annualSales);
        loanApplication_page.buyerTermsOfTrade.click();
        loanApplication_page.buyerCreditPeriod.sendKeys(creditPeriod);
        loanApplication_page.RelatedParty.click();
    }//填写买方的信息。

    public void inputSupplierInformation(String name,String RelationshipYears,String annualSales,String creditPeriod){
        loanApplication_page.supplierName.sendKeys(name);
        loanApplication_page.supplierYears.sendKeys(RelationshipYears);
        loanApplication_page.supplierSales.sendKeys(annualSales);
        loanApplication_page.supplierTermsOfTrade.click();
        loanApplication_page.supplierCreditPeriod.sendKeys(creditPeriod);
        loanApplication_page.supplierRelatedParty.click();
        loanApplication_page.nextStep.click();
    }//填写供应方的信息。

    public void inputVehicleDetails(String brand,String price){
        loanApplication_page.carType.click();
        loanApplication_page.carInfo.sendKeys(brand);
        loanApplication_page.buyAmount.sendKeys(price);
        loanApplication_page.nextStep.click();
    }
}
