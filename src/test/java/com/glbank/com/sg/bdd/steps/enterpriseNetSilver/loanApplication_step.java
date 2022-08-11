package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.loanApplication_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import static com.glbank.com.sg.bdd.utils.AssertLocal.assertEquals;
import static com.glbank.com.sg.bdd.utils.ContactUtil.getEmail;
import static com.glbank.com.sg.bdd.utils.RandomPhoneNumber.randomPhoneNum;

public class loanApplication_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private loanApplication_page loanApplication_page;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test.jpg";

    //鼠标悬浮在贷款业务上。
    public void FloatingLoanButton(){
//        Actions actions = new Actions(getDriver());
//        actions.moveToElement(loanApplication_page.loan).build().perform();
        loanApplication_page.loan.click();
        loanApplication_page.loanApplicationBtn.click();
        bddUtil.sleep(1);
    }

    public void clickLoanDisbursementBtn(){
        loanApplication_page.loan.click();
        loanApplication_page.loanDisbursementBtn.click();
    }

    public void clickLoanManagement(){
        bddUtil.sleep(3);
        Actions action=new Actions(getDriver());
        action.moveToElement( loanApplication_page.loan).perform();
        loanApplication_page.loanManagement.click();
    }

    public static String getPerFirstDayOfMonth() {
        SimpleDateFormat dft = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return dft.format(calendar.getTime());
    }

    public void clickSGDPrepayBtn(){
        getDriver().findElement(By.xpath("//div[@class='el-table__fixed-right']//tr[1]//div[@class='el-tooltip btn-icon']")).click();
//        loanApplication_page.threePointSingapore.click();
        loanApplication_page.ApplicationForPayment.click();
        loanApplication_page.repaymentDate.sendKeys(getPerFirstDayOfMonth());
//        在页面点击下一个月，选择 下个月的日期。
        getDriver().findElement(By.xpath("//button[@aria-label='Next Month']")).click();
//        选择次月的中旬日期。
        getDriver().findElement(By.xpath("//table[@class='el-date-table']//tr[4]/td[3]")).click();
        loanApplication_page.repayDate.click();
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(2);
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(3);
    }//点击新币的按钮。

    public void clickUSDPrepayBtn(){
        getDriver().findElement(By.xpath("//div[@class='el-table__fixed-right']//tr[2]//div[@class='el-tooltip btn-icon']")).click();
//        loanApplication_page.threePointSingapore.click();
        loanApplication_page.ApplicationForPayment.click();
        loanApplication_page.proAmount.sendKeys("2000");
        loanApplication_page.repaymentDate.sendKeys(getPerFirstDayOfMonth());
//        在页面点击下一个月，选择 下个月的日期。
        getDriver().findElement(By.xpath("//button[@aria-label='Next Month']")).click();
//        选择次月的中旬日期。
        getDriver().findElement(By.xpath("//table[@class='el-date-table']//tr[4]/td[3]")).click();
        loanApplication_page.repayDate.click();
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(2);
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(3);
    }//点击美元的按钮。

    public void prepaymentAmountDisabled(){
        if (loanApplication_page.prepaymentAmountDisabled.isVisible()){
            System.out.println("当前元素为置灰状态，不可输入任何内容！");
        }else if (loanApplication_page.prepaymentAmount.isVisible()){
            loanApplication_page.prepaymentAmount.sendKeys("1000");
        }
    }

    public void clickApplicationForPayment(){
        bddUtil.sleep(2);
//        loanApplication_page.threePoint.click();
        getDriver().findElement(By.xpath("//div[@class='el-table__fixed-right']//tbody/tr[3]/td[5]//div/div")).click();
        loanApplication_page.ApplicationForPayment.click();
    }

    public void selectProductType(String productTypeName){
        List<WebElementFacade> productType = loanApplication_page.productType;
        List<WebElementFacade> moreInfo = loanApplication_page.moreInformation;
        for (int i = 0; i<= productType.size();i++){
            if (productType.get(i).getText().equals(productTypeName)){
                Actions action = new Actions(getDriver());
                action.moveToElement(moreInfo.get(i)).perform();
                loanApplication_page.ApplicationForPayment.click();
                break;
            }
        }
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
        bddUtil.scrollWindowToElement(loanApplication_page.find(By.xpath("//div[@class='mandatory']")));
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

    public void selectCorporateGuarantee(String registeredName,String RegistrationNumber,String registrationDate,String address,String city,String zipCode,String Sex){
        loanApplication_page.corporateGuarantor.click();
        loanApplication_page.personalGuarantorRole.click();
        loanApplication_page.salutation.click();
        List<WebElementFacade> selectSex = loanApplication_page.selectSalutation;
        for (int i = 0; i <= selectSex.size(); i++){
            if (Sex.equals(selectSex.get(i).getText())){
                selectSex.get(i).click();
                break;
            }
        }
        loanApplication_page.registeredName.sendKeys(registeredName);
        loanApplication_page.dateOfBirth.sendKeys(bddUtil.dateFormate());
        loanApplication_page.getNotionalityText.click();
        loanApplication_page.mobileNum.sendKeys(randomPhoneNum());
        loanApplication_page.notionalityText.sendKeys("CHINESE");
        loanApplication_page.selectChinese.click();
        loanApplication_page.certfctNo.sendKeys("T1234567B");
        loanApplication_page.idd.sendKeys("+86");
        loanApplication_page.selectChina.click();
        loanApplication_page.inputEmail.sendKeys(getEmail(1,10));
        loanApplication_page.inputExperience.sendKeys("1");
        loanApplication_page.nextBtnTwo.click();
//        loanApplication_page.companyRegisterDate.sendKeys(registrationDate);
//        loanApplication_page.companyRegisterDate.click();
//        loanApplication_page.RegistrationNumber.sendKeys(RegistrationNumber);
//        loanApplication_page.entRegisterCountry.click();
//        loanApplication_page.RegisteredInChina.click();
//        loanApplication_page.entRegisterAddr.sendKeys(address);
//        loanApplication_page.city.sendKeys(city);
//        loanApplication_page.zipCode.sendKeys(zipCode);
//        loanApplication_page.countryBox.click();
//        loanApplication_page.RegisteredInChina.click();
//        loanApplication_page.enterpriseTypeCd.click();
//        loanApplication_page.privateLimitedCompany.click();
//        loanApplication_page.submit.click();
//        bddUtil.sleep(3);
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
        bddUtil.scrollWindowToElement(loanApplication_page.yesBtn);
        loanApplication_page.overdraft.click();
//        loanApplication_page.financialInstitutionName.sendKeys(financialInstitutionName);
        loanApplication_page.loanAmt.sendKeys(loanAmt);
        loanApplication_page.outstandingAmt.sendKeys(outstandingAmt);
        loanApplication_page.monthlyInstallments.sendKeys(monthlyInstallments);
        loanApplication_page.rate.sendKeys(rate);
        bddUtil.scrollWindowToElement(loanApplication_page.loanAmt);
        loanApplication_page.nextStep.click();
        bddUtil.sleep(3);
    }//填写其他财务承诺。

    public void inputOtherFinancialCommitmentOnCompany(String financialInstitutionName,String loanAmt,String outstandingAmt,String monthlyInstallments,String rate,String months, String twoMonths){
        loanApplication_page.firstDate.sendKeys(bddUtil.dateFormate());
        loanApplication_page.firstReportingPeriodText.click();
        loanApplication_page.firstReportingPeriod.click();
        List<WebElementFacade> firstMonths = loanApplication_page.firstSelectMonths;
        for (int i = 0; i<= firstMonths.size();i++){
            if (months.equals(firstMonths.get(i).getText())){
                firstMonths.get(i).click();
                break;
            }
        }
        loanApplication_page.firstNetSalesInput.sendKeys("10000");
        loanApplication_page.firstNetProfitInput.sendKeys("10000");
        loanApplication_page.firstTotalAssets.sendKeys("10000");
        loanApplication_page.firstTotalLiabilities.sendKeys("10000");
        loanApplication_page.secondDate.sendKeys(bddUtil.dateFormate());
        loanApplication_page.secondReportingPeriodText.click();
        loanApplication_page.secondReportingPeriod.click();
        List<WebElementFacade> secondMonths = loanApplication_page.firstSelectMonths;
        for (int i = 0; i<= secondMonths.size();i++){
            if (twoMonths.equals(secondMonths.get(i).getText())){
                secondMonths.get(i).click();
                break;
            }
        }
        loanApplication_page.secondNetSalesInput.sendKeys("10000");
        loanApplication_page.secondNetProfitInput.sendKeys("10000");
        loanApplication_page.secondTotalAssets.sendKeys("10000");
        loanApplication_page.secondTotalLiabilities.sendKeys("10000");
        loanApplication_page.checkPoint.click();
        loanApplication_page.nextBtnTwo.click();
//        loanApplication_page.yesBtnCompany.click();
////        loanApplication_page.financialInstitutionCompanyName.sendKeys(financialInstitutionName);
//        loanApplication_page.overdraftCompany.click();
//        loanApplication_page.loanAmtCompany.sendKeys(loanAmt);
////        loanApplication_page.outstandingAmtCompany.sendKeys(outstandingAmt);
////        loanApplication_page.monthlyInstallmentsCompany.sendKeys(monthlyInstallments);
//        loanApplication_page.rateCompany.sendKeys(rate);
//        bddUtil.scrollWindowToElement(loanApplication_page.rateCompany);
//        loanApplication_page.nextStep.click();
//        bddUtil.sleep(3);
    }//填写其他财务承诺在公司担保界面。。

    public void inputOtherOnRealEstateMortgage(String financialInstitutionName,String loanAmt,String outstandingAmt,String monthlyInstallments,String rate){
        loanApplication_page.financialCommitment.click();
//        loanApplication_page.financialInstitutionNameHouse.sendKeys(financialInstitutionName);
        loanApplication_page.overdraftHouse.click();
        loanApplication_page.loanAmtHouse.sendKeys(loanAmt);
//        loanApplication_page.outstandingAmtHouse.sendKeys(outstandingAmt);
//        loanApplication_page.monthlyInstallmentsHouse.sendKeys(monthlyInstallments);
        loanApplication_page.rateHouse.sendKeys(rate);
        bddUtil.scrollWindowToElement(loanApplication_page.overdraftHouse);
        loanApplication_page.nextStep.click();
        bddUtil.sleep(3);
    }//填写其他财务承诺在房产抵债。

    public void upLoadFile(){
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][2]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div/div[4]//div[@class='upload_block'][3]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
    }

    public void upLoadFileOnHouse(){
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

    public void nextAndSubmit(){
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(2);
        loanApplication_page.clickSubmitBtn.click();
        bddUtil.sleep(15);
        assertEquals("Congratulations!",loanApplication_page.checkText.getText());
    }

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

    public void selectISingaporeDollar(){
        loanApplication_page.currency.click();
        loanApplication_page.SingaporeDollars.click();
    }

    public void selectUsDollar(){
        loanApplication_page.currency.click();
        loanApplication_page.usDollar.click();
    }

    public void inputApplyForAmount(String amount,String dayNum,String goodsDescr){
        loanApplication_page.ApplyForAmount.sendKeys(amount);
        loanApplication_page.financingDayNum.sendKeys(dayNum);
        loanApplication_page.goodsDescr.sendKeys(goodsDescr);
        loanApplication_page.transportMethod.click();
        loanApplication_page.landTran.click();
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div//form/div[3]//div[@class='upload_pic_container'][1]/div/div")));
        loanApplication_page.LendingAccount.click();
        bddUtil.sleep(1);
        loanApplication_page.account.click();
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div//form/div[3]//div[@class='upload_pic_container'][1]//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//div[@class='ui-container-full__body']/div//form/div[5]//div[@class='upload_pic_container']//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        loanApplication_page.nextOnUpLoadFile.click();
        bddUtil.sleep(2);
        loanApplication_page.agreeToTerms.click();
        loanApplication_page.submitOnSpendPage.click();
        bddUtil.sleep(5);
    }
}
