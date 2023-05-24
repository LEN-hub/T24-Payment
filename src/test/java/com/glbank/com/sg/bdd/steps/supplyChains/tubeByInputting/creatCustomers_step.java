package com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting;

import com.glbank.com.sg.bdd.pages.supplyChains.tubeByInputting.creatCustomers_page;
import com.glbank.com.sg.bdd.utils.*;
import com.lu.sn.Language;
import com.lu.sn.NameType;
import com.lu.sn.RandomNameTool;
import com.lu.sn.en.EnglishNameUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static com.glbank.com.sg.bdd.utils.AssertLocal.assertNotNull;
import static com.glbank.com.sg.bdd.utils.AssertLocal.assertTrue;
import static com.glbank.com.sg.bdd.utils.JDBCUtil.updateAmlResult;
import static org.junit.Assert.assertEquals;

public class creatCustomers_step extends ScenarioSteps {
    private creatCustomers_page customers_page;
    private BDDUtil bddUtil;
    public static String envTag;
    public static String email;
    public static String username;
    public static String password;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/test2.jpg";
    public static String directorEmail = JRandomNameTool.getStringRandom(7);
    @Step
    public void getClickCustomersMenu(){
        customers_page.clickCustomersMenu.isVisible();
        customers_page.clickCustomersMenu.click();
    }

    @Step
    public void onboardingReview(){
        customers_page.onboardingReview.click();
    }

    public void getClickOnboardingListMenu(){
        bddUtil.sleep(1);
        customers_page.clickOnboardingListMenu.click();
    }

    public void clickContractManagement(){
        bddUtil.sleep(1);
        customers_page.clickContractManagement.click();
    }

    public void uploadSingBR(){
        bddUtil.sleep(5);
        customers_page.uploadSingBR.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.clickContractType.click();
        bddUtil.sleep(5);
        customers_page.clickUploadButton.click();
        getDriver().findElement(By.xpath("//input[@name='file']")).sendKeys(fileAddress);
        customers_page.dateInput.sendKeys(bddUtil.dateFormate());
        customers_page.clickSingBRConfirmBtn.click();
    }

    public void getClickCreateCustomerBtn(){
        customers_page.clickCreateCustomerBtn.click();
    }

    @Step
    public void disPlayedSCFTitle(){
        if (customers_page.scfTitle.isVisible()){
            System.out.println("成功进入CSF页面");
        }
    }

    @Step
    public void getSelectCustomerType(){
        customers_page.selectCustomerType.click();
    }
    
    @Step
    public void getCustomerTypeValue(){
        customers_page.customerTypeBuyer.click();
    }

    @Step
    public void getCustomerType(String type){
        if (type.equals("Supplier")){
            getCustomerTypeSupplier();
        }else if (type.equals("Buyer")){
            getCustomerTypeBuyer();
        }
    }
    @Step
    public void getCustomerTypeSupplier(){
        customers_page.customerTypeSupplier.click();
    }

    @Step
    public void getCustomerTypeBuyer(){
        customers_page.getCustomerTypeBuyer.click();
    }

    @Step
    public void checkSuccessPageTitle(){
        assertEquals("Customer Profiles",customers_page.checkSuccessPageTitle.getText());
    }

    @Step
    public void getCompanyName(String value){
        customers_page.companyName.sendKeys(value);
//        customers_page.companyName.sendKeys("PUBLIC UTILITIES BOARD");
    }

    @Step
    public void getCompanyID(String value){
        customers_page.companyID.sendKeys(value);
//        customers_page.companyID.sendKeys("T08GB0045L");
    }

    @Step
    public void getSelectCountryOfRegistration(){
        customers_page.selectCountryOfRegistration.click();
    }

    @Step
    public void getCountryOfRegistrationValue(){
        bddUtil.scrollWindowToElement(customers_page.countryOfRegistrationValue);
        customers_page.countryOfRegistrationValue.click();
    }

    @Step
    public void getCompanyNameLeft(String value){
        customers_page.companyNameLeft.sendKeys(value);
    }

    @Step
    public void kycMode(String kycMode){
        customers_page.kycMode.click();
        List<WebElementFacade> kyc = customers_page.kycModeTitleList;
        for (int i = 0; i < kyc.size(); i++){
            if (kyc.get(i).getText().equals(kycMode)){
                kyc.get(i).click();
                break;
            }
        }
    }

    @Step
    public void inputBy(String inputBy){
        bddUtil.sleep(2);
        customers_page.inputBy.click();
        List<WebElementFacade> inputby = customers_page.kycModeTitleList;
        for (int i = 0; i < inputby.size(); i++){
            bddUtil.sleep(1);
            if (inputby.get(i).getText().equals(inputBy)){
                bddUtil.sleep(1);
                inputby.get(i).click();
                break;
            }
        }
    }

    @Step
    public void getCLickNextBtn(){
        customers_page.nextBtn.click();
    }

    @Step
    public void getCheckNextPage(){
        FileUtils.FileInput3("test");
        customers_page.checkNextPage.isVisible();
        assertEquals("Administrator 1",customers_page.checkNextPage.getText());
    }

    @Step
    public void checkApprovedText(){
        customers_page.viewButton.click();
        assertEquals("Approved ",customers_page.approvedText.getText());
    }

    @Step
    public void getFirstNameInput(String value){
        customers_page.firstNameInput.sendKeys(value);
    }

    @Step
    public void getEmailInput(String value){
        customers_page.emailInput.sendKeys(value);
    }

    @Step
    public void getLastName(String value){
        customers_page.lastNameInput.sendKeys(value);
    }

    @Step
    public void phoneNumberFirst(){
        customers_page.mobileAreaCode.sendKeys("86");
        customers_page.mobileNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
    }

    @Step
    public void getMobileInput(){
        customers_page.twoMobileAreaCodeInput.sendKeys("86");
        customers_page.twomobileNumberInput.sendKeys(RandomPhoneNumber.randomPhoneNum());
    }

    @Step
    public void getFirstNameSecondInput(String value){
        customers_page.firstNameSecondInput.sendKeys(value);
    }

    @Step
    public void getEmailSecondInput(String value){
        customers_page.emailSecondInput.sendKeys(value);
    }

    @Step
    public void getLastNameSecondInput(String value){
        customers_page.lastNameSecondInput.sendKeys(value);
    }

    @Step
    public void getMobileSecondInput(String value){
        customers_page.mobileSecondInput.sendKeys(value);
    }

    @Step
    public void clickSubmitBtn(){
        customers_page.submitBtn.click();
    }

    @Step
    public void emailOperation(String value){
//        if (getDriver().findElement(By.xpath("//div[@id='icon']")).isDisplayed()){
//            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
//            bddUtil.sleep(1);
//            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
//        }
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        customers_page.sendKeysEmailName.clear();
        customers_page.sendKeysEmailName.sendKeys(value);
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(20);
    }

    @Step
    public void errorEmailLink(){
        if (customers_page.errorText.isVisible()){
            customers_page.advancedButton.click();
            customers_page.enterEmailLink.click();
        }
    }

    @Step
    public void openEmailUrl(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        bddUtil.switchToNewWindow();
//        errorEmailLink();
        bddUtil.switchToWindows();
    }
    @Step
    public void openEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://ihotmails.com/\");");
        bddUtil.switchToNewWindow();
        customers_page.clickEditEmailName.click();
        customers_page.sendKeysEmailName.clear();
        customers_page.sendKeysEmailName.sendKeys("6652pq42");
        customers_page.clickEditEmailName.click();
    }

    @Step
    public void clickInputBySelectBox(){
        customers_page.clickInputBySelectBox.click();
        customers_page.inputByTypeCustomer.click();
    }

    @Step
    public void clickSendEmailBtn(){
        bddUtil.sleep(3);
        customers_page.emailIcon.isVisible();
        bddUtil.sleep(1);
        customers_page.emailIcon.click();
        customers_page.confirmBtn.click();
        bddUtil.sleep(5);
    }

    @Step
    public void checkSendEmailSuccess(){
        assertEquals("Green Link Digital Bank - Invitation",customers_page.firstEmail.getText());
    }

    public void iChangeTheEmailAddressOnThePage(String emailAddress){
        bddUtil.switchToNewWindow();
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        customers_page.sendKeysEmailName.clear();
        customers_page.sendKeysEmailName.sendKeys(emailAddress);
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(20);
    }
    @Step
    public void viewEmail(String emailAddress){
        bddUtil.switchToNewWindow();
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(3);
        customers_page.sendKeysEmailName.clear();
        customers_page.sendKeysEmailName.sendKeys(emailAddress);
        customers_page.clickEditEmailName.click();
        bddUtil.sleep(20);
        bddUtil.switchToNewWindow();
        clickSendEmailBtn();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        customers_page.clickFirstEmailName.click();
    }

    @Step
    public void selectFirstEmailAndTakeVCode(){
        username = bddUtil.scrollWindowToElement(customers_page.userName).getText();
        password = bddUtil.scrollWindowToElement(customers_page.passWord).getText();
//        cuString stomers_page.scfLink.isVisible();
        CommonUtil.waiting(2000);
//        邮箱链接暂时失效，需要手动打开。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.9.126:8080/#/login\");");
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys(password);
        bddUtil.sleep(2);
        customers_page.sendCodeBtn.click();
    } @Step
    public void selectFirstEmailAndTakeVCodeOnSitEvn(){
        username = bddUtil.scrollWindowToElement(customers_page.userName).getText();
        password = bddUtil.scrollWindowToElement(customers_page.passWord).getText();
//        cuString stomers_page.scfLink.isVisible();
        CommonUtil.waiting(2000);
//        邮箱链接暂时失效，需要手动打开。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.7.8:8080/\");");  // SIT链接
//        webdriver.executeScript("window.open(\"http://10.24.9.126:8080/\");"); // UAT链接
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.sendCodeBtn.click();
    }

    @Step
    public void selectFirstEmailAndTakeVCodeOnSUATEvn(){
        username = bddUtil.scrollWindowToElement(customers_page.userName).getText();
        password = bddUtil.scrollWindowToElement(customers_page.passWord).getText();
//        cuString stomers_page.scfLink.isVisible();
        CommonUtil.waiting(2000);
//        邮箱链接暂时失效，需要手动打开。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
//        webdriver.executeScript("window.open(\"http://10.24.7.8:8080/\");");  // SIT链接
        webdriver.executeScript("window.open(\"http://10.24.9.126:8080/\");"); // UAT链接
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.sendCodeBtn.click();
    }

    public void iGetUsernameAndPasswordInTheEmail(){
        CommonUtil.waiting(2000);
//        邮箱链接暂时失效，需要手动打开。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.9.126:8080/#/login\");");
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        customers_page.sendCodeBtn.click();
    }

    public void iGetUsernameAndPasswordInTheEmailScfSitEnv(){
        CommonUtil.waiting(2000);
//        邮箱链接暂时失效，需要手动打开。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.7.8:8080/\");");
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        customers_page.scfLink.click();
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        customers_page.sendCodeBtn.click();
    }
    @Step
    public void thirdEmail(){
        bddUtil.sleep(3);
        customers_page.clickRefresh.click();
        bddUtil.sleep(3);
        bddUtil.scrollWindowToElement(customers_page.selectCodeEamil).click();
        bddUtil.sleep(2);
        String verificationCode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(verificationCode);
    }
    @Step
    public void enterCompanyIdAndClickLoginBtn(){
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void setNewPasswordPage(){
        customers_page.setNewPasswordPage.isVisible();
    }

    @Step
    public void enterNewPassword(String firstPassword,String secondPassword){
        customers_page.firstNewPassword.sendKeys(firstPassword);
        customers_page.secondNewPassword.sendKeys(secondPassword);
        customers_page.newPasswordPageConfirmBtn.click();
    }

    @Step
    public void enterLoginInformationAgain(String value,String password){
        customers_page.GLDBEmailInput.sendKeys(value + "@ihotmails.com");
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.enterCompanyId.clear();
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        bddUtil.switchToNewWindow();
//        customers_page.clickEditEmailName.click();
//        bddUtil.sleep(3);
//        customers_page.sendKeysEmailName.clear();
//        customers_page.sendKeysEmailName.sendKeys(FileUtils.LastReadFileInput3("emailData").substring(0,8));
//        customers_page.clickEditEmailName.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        customers_page.sendCodeBtn.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(5);
//        customers_page.clickRefresh.click();
//        bddUtil.scrollWindowToElement(customers_page.selectCodeEamil).click();
        bddUtil.scrollWindowToElement(customers_page.selectFirstCode.get(0)).click();
        bddUtil.sleep(3);
//        customers_page.find(By.xpath("//div[@id='message-list']/button[1]")).click();
        String Vcode = customers_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.clear();
        customers_page.inputSendCode.sendKeys(Vcode);
        customers_page.GLDBEmailLoginBtn.click();
        bddUtil.sleep(6);
        assertEquals("Service Agreement",getDriver().findElement(By.xpath("//span[text()='Service Agreement']")).getText());
        bddUtil.sleep(2);
    }

    @Step
    public void getClickCheckBox(){
        bddUtil.sleep(3);
        if (customers_page.serviceAgreementTitle.isVisible()){
//            bddUtil.scrollWindowToElement(customers_page.clickCheckBox);
//            customers_page.clickCheckBox.click();
            if (customers_page.selectFirstCheckBox.isVisible()){
                customers_page.selectFirstCheckBox.click();
            }
            if (customers_page.selectSecondCheckBox1.isVisible()){
                customers_page.selectSecondCheckBox1.click();
                customers_page.selectThirdCheckBox.click();
                customers_page.selectFourCheckBox.click();
            }
            bddUtil.sleep(4);
            customers_page.clickAgreeBtn.click();
        }
        bddUtil.sleep(6);
        customers_page.inputManually.click();
    }

    public void iClickAgreeServiceAgreementOnSimpleKYC(){
        bddUtil.sleep(3);
        if (customers_page.serviceAgreementTitle.isVisible()){
//            bddUtil.scrollWindowToElement(customers_page.clickCheckBox);
//            customers_page.clickCheckBox.click();
            if (customers_page.selectFirstCheckBox.isVisible()){
                customers_page.selectFirstCheckBox.click();
            }
            if (customers_page.selectSecondCheckBox1.isVisible()){
                customers_page.selectSecondCheckBox1.click();
                customers_page.selectThirdCheckBox.click();
                customers_page.selectFourCheckBox.click();
            }
            bddUtil.sleep(4);
            customers_page.clickAgreeBtn.click();
        }
    }
    @Step
    public void jumpLoginPage(){
        customers_page.loginPageTitle.isVisible();
    }

    @Step
    public void checkJumpPageTellUsTitle(){
        customers_page.checkjumpPageTellUs.isVisible();
    }

    @Step
    public void companyPageInformation(String value){
        bddUtil.sleep(3);
        customers_page.dateInputBox.sendKeys(bddUtil.lastDate());//公司创建日期 要小于核心日期。
        bddUtil.sleep(2);
        customers_page.annualReturnSizeClick.click();
        customers_page.annualReturnSizeSelect.click();
        customers_page.checkBoxPublicCompanyYes.click();
        customers_page.companyEmail.clear();
        customers_page.companyEmail.sendKeys(value+ "@ihotmails.com");
        customers_page.companyPhoneNumber.clear();
        customers_page.companyPhoneNumber.sendKeys("86");
        customers_page.companyPhoneNumberTwo.clear();
        customers_page.companyPhoneNumberTwo.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        customers_page.fileUpdate.click();
//        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.noExpiryDateTitle);
        customers_page.selectDate.click();
        customers_page.noExpiryDateInput.sendKeys("1999-09-10");
//        customers_page.memorandumAndArticlesOfAssLink.click();
        bddUtil.sleep(2);
//        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test2.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        customers_page.countryOfTaxation.sendKeys("singapore");
        bddUtil.sleep(1);
        customers_page.selectCountry.click();
//        bddUtil.scrollWindowToElement(customers_page.registeredAddressTitle);
        customers_page.registeredAddress.clear();
        customers_page.registeredAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        bddUtil.scrollWindowToElement(customers_page.sectorTitle);
        customers_page.businessCountry.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.businessAddress.clear();
        customers_page.businessAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.industry.click();
        bddUtil.scrollWindowToElement(customers_page.selectIndustry).click();
        customers_page.legalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.selectLegalStructure).click();
        customers_page.isNonProfitYes.click();
        bddUtil.sleep(3);
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void companyPageInformationFullKyc(String value){
        bddUtil.sleep(3);
        customers_page.dateInputBox.sendKeys(bddUtil.lastDate());//公司创建日期 要小于核心日期。
        bddUtil.sleep(2);
        customers_page.annualReturnSizeClick.click();
        customers_page.annualReturnSizeSelect.click();
        customers_page.checkBoxPublicCompanyYes.click();
        customers_page.companyEmail.clear();
        customers_page.companyEmail.sendKeys(value+ "@ihotmails.com");
        customers_page.companyPhoneNumber.clear();
        customers_page.companyPhoneNumber.sendKeys("86");
        customers_page.companyPhoneNumberTwo.clear();
        customers_page.companyPhoneNumberTwo.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        customers_page.fileUpdate.click();
//        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0001']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.sleep(2);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.noExpiryDateTitle);
        customers_page.selectDate.click();
        customers_page.noExpiryDateInput.sendKeys("2024-09-10");
//        customers_page.memorandumAndArticlesOfAssLink.click();
        bddUtil.sleep(2);
//        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys("C:\\workspace\\DBB_GL_AutoTesting-dev\\src\\test\\resources\\testData\\autopay\\test2.jpg");
        getDriver().findElement(By.xpath("//label[@for='A0010']//following-sibling::div//input")).sendKeys(fileAddress);
//        bddUtil.fileUpload();
        bddUtil.sleep(5);
        customers_page.countryOfTaxation.sendKeys("singapore");
        bddUtil.sleep(1);
        customers_page.selectCountry.click();
//        bddUtil.scrollWindowToElement(customers_page.registeredAddressTitle);
        customers_page.registeredAddress.clear();
        customers_page.registeredAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        bddUtil.scrollWindowToElement(customers_page.sectorTitle);
        customers_page.businessCountry.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.businessAddress.clear();
        customers_page.businessAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.industry.click();
        bddUtil.scrollWindowToElement(customers_page.selectIndustry).click();
        customers_page.legalStructure.click();
        bddUtil.scrollWindowToElement(customers_page.selectLegalStructure).click();
        customers_page.isNonProfitYes.click();
        bddUtil.sleep(3);
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void changeEmail1(){
       //修改第个董事签约BR的邮箱
        bddUtil.sleep(2);
        FileUtils.FileString4("directEmail",directorEmail + "@uuf.me");
        //先清掉之前的邮箱
        getDriver().findElements(By.xpath("//label[@for='email']/following-sibling::div//input")).get(0).clear();
        getDriver().findElements(By.xpath("//label[@for='email']/following-sibling::div//input")).get(0).sendKeys(directorEmail+"@uuf.me");
    }

    @Step
    public void checkStatus(){
        customers_page.clickCustomersMenu.click();
        bddUtil.sleep(2);
        customers_page.clickOnboardingListMenu.click();
        bddUtil.sleep(2);
        customers_page.uploadSingBR.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.checkSuccessPageTitle.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(customers_page.LastUpdatedBtn);
        bddUtil.sleep(1);
        try {
            Assert.assertEquals("Approved",customers_page.supplierStatus.getText());
            if (customers_page.supplierStatus.getText().equals("Approved")){
                System.out.println("数据正常");
            }else {
                throw new Exception("INB系统进入失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        bddUtil.sleep(5);
    }

    @Step
    public void changeEmail2(){
        //修改第2个董事签约BR的邮箱
        bddUtil.sleep(2);
        //先清掉之前的邮箱
        getDriver().findElements(By.xpath("//label[@for='email']/following-sibling::div//input")).get(1).clear();
        getDriver().findElements(By.xpath("//label[@for='email']/following-sibling::div//input")).get(1).sendKeys(directorEmail+"2@uuf.me");
    }

    @Step
    public void testNext(){
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void clickSubmitBtnOnGLDB(){
        bddUtil.sleep(3);
        customers_page.clickSubmitBtnOnGLDB.click();
        bddUtil.sleep(5);
        customers_page.clickConfirmBtnOnGLDB.click();
        bddUtil.sleep(10);
    }

    public void clickSubmitButtonFullKycTransferSimpleKyc(){
        bddUtil.sleep(3);
        customers_page.clickSubmitBtnOnGLDB.click();
        bddUtil.sleep(3);
    }

    @Step
    public void confirmPageTitle(){
        bddUtil.sleep(10);
        customers_page.confirmPageTitle.isVisible();
    }

    @Step
    public void iLoginServiceAgreementWindow(){
        bddUtil.switchToWindows();
        customers_page.GLDBEmailInput.sendKeys("6652pq42@ihotmails.com");
        customers_page.GLDBEmailPassword.sendKeys("P@ssw0rd_123");
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        bddUtil.scrollWindowToElement(customers_page.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(customers_page.getEmailOtp).getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.clear();
        customers_page.inputSendCode.sendKeys(otp);
        customers_page.GLDBEmailLoginBtn.click();
    }

    @Step
    public void jumpSetUpPrimaryAdminTitle(){
        customers_page.jumpSetUpPrimaryAdminTitle.isVisible();
    }

    @Step
    public void enterInformationOnPeoplePage(String value){
        bddUtil.sleep(3);
        customers_page.enterFullName.clear();
        customers_page.enterFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.applicantPhoneNumFirst.sendKeys("86");
        customers_page.applicantPhoneNumSecond.clear();
        customers_page.applicantPhoneNumSecond.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.applicantEmial.clear();
        customers_page.applicantEmial.sendKeys(value + "@ihotmails.com");
        customers_page.enterPinYin.clear();
        customers_page.enterPinYin.sendKeys("zhangsan");
        customers_page.enterAlias.clear();
        customers_page.enterAlias.sendKeys("China");
        customers_page.enterPinYinAlias.clear();
        customers_page.enterPinYinAlias.sendKeys("zhongguo");
        customers_page.idTypeDropbox.click();
        bddUtil.scrollWindowToElement(customers_page.selectIdType).click();
        customers_page.enterIdNo.clear();
        customers_page.enterIdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.adminIDExpiryDate.click();
        customers_page.dateOfBirth.sendKeys("1999-09-10");
        customers_page.enterNationality.sendKeys("singapore");
        bddUtil.sleep(1);
        customers_page.selectCountry.click();
        customers_page.countryOfResidence.sendKeys("singapore");
        bddUtil.sleep(1);
        customers_page.selectCountry.click();
        customers_page.enterCity.clear();
        customers_page.enterCity.sendKeys("beijing");
        customers_page.enterPostalCode.clear();
        customers_page.enterPostalCode.sendKeys("010");
        customers_page.selectDirector.click();
        customers_page.enterResidentialAddress.clear();
        customers_page.enterResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.enterFullName.clear();
        customers_page.enterFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.enterPinYin2.clear();
        customers_page.enterPinYin2.sendKeys("zhangsan");
        customers_page.enterAlias2.clear();
        customers_page.enterAlias2.sendKeys("China");
        customers_page.enterPinYinAlias2.clear();
        customers_page.enterPinYinAlias2.sendKeys("zhongguo");
        customers_page.idTypeDropbox2.click();
        if (customers_page.selectIdType.isDisabled()){
            customers_page.idTypeDropbox2.click();
        }
        bddUtil.scrollWindowToElement(customers_page.selectIdType).click();
        customers_page.enterIdNo2.clear();
        customers_page.enterIdNo2.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.adminIDExpiryDate2.click();
        customers_page.dateOfBirth2.sendKeys("1999-09-10");
        customers_page.enterNationality2.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.countryOfResidence2.sendKeys("singapore");
        bddUtil.sleep(1);
        customers_page.selectCountry.click();
        customers_page.enterCity2.clear();
        customers_page.enterCity2.sendKeys("beijing");
        customers_page.enterPostalCode2.clear();
        customers_page.enterPostalCode2.sendKeys("010");
        customers_page.selectDirector2.click();
        customers_page.enterResidentialAddress2.clear();
        customers_page.enterResidentialAddress2.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void jumpToDirectorInformation(){
        customers_page.directorOfTheInformation.isVisible();
    }

    @Step
    public void jumpToTheShareholderInformation(){
        customers_page.shareholderOfTheInformation.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheDirectorPage(String value){
        customers_page.director1FullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director1EnterPinYin.sendKeys("zhangsan");
        customers_page.director1Alias.sendKeys("China");
        customers_page.director1PinyinAliasName.sendKeys("zhongguo");
        customers_page.director1IdType.click();
        customers_page.director1SelectIdType.click();
        customers_page.director1IdNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1IdExpiryDate.click();
        customers_page.director1DateOfBirth.sendKeys("1999-09-10");
        customers_page.director1NationalityDrop.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.director1City.sendKeys("beijing");
        customers_page.director1PostalCode.sendKeys("010");
        customers_page.director1ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director1CountryOfResidence.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.director1FirstPhoneNum.sendKeys("+86");
        customers_page.director1SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director1EmailAddress.sendKeys(value + "@ihotmails.com");
        customers_page.director1SelectCheckBox.click();
        customers_page.director2FullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director2EnterPinYin.sendKeys("zhangsan");
        customers_page.director2Alias.sendKeys("China");
        customers_page.director2PinyinAliasName.sendKeys("zhongguo");
        customers_page.director2IdType.click();
        customers_page.director2SelectIdType.click();
        customers_page.director2IdNumber.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director2IdExpiryDate.click();
        customers_page.director2DateOfBirth.sendKeys("1999-09-10");
        customers_page.director2NationalityDrop.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.director2City.sendKeys("beijing");
        customers_page.director2PostalCode.sendKeys("010");
        customers_page.director2ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.director2CountryOfResidence.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.director2FirstPhoneNum.sendKeys("+86");
        customers_page.director2SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.director2EmailAddress.sendKeys(value + "@ihotmails.com");
        customers_page.director2SelectCheckBox.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void fillInTheInformationOnTheShareholderPage(String currency,String value){
        customers_page.shareholder1Name.clear();
        customers_page.shareholder1Name.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder1PinyinName.clear();
        customers_page.shareholder1PinyinName.sendKeys("zhangsan");
        customers_page.shareholder1Alias.clear();
        customers_page.shareholder1Alias.sendKeys("China");
        customers_page.shareholder1PinyinAliasName.clear();
        customers_page.shareholder1PinyinAliasName.sendKeys("zhongguo");
        customers_page.shareholder1IdTypeSelect.click();
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(customers_page.shareholder1Passport).click();
        customers_page.shareholder1IdNo.clear();
        customers_page.shareholder1IdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1NoExpiry.click();
        customers_page.shareholder1DateOfBirth.sendKeys("1999-09-10");
        customers_page.shareholder1Nationality.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.shareholder1ResidentialAddress.clear();
        customers_page.shareholder1ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder1CountryOfResidence.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.shareholder1NoExpiry.click();
        customers_page.shareholder1FirstPhoneNum.clear();
        customers_page.shareholder1FirstPhoneNum.sendKeys("86");
        customers_page.shareholder1SecondPhoneNum.clear();
        customers_page.shareholder1SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder1EnterEmail.clear();
        customers_page.shareholder1EnterEmail.sendKeys(value + "@ihotmails.com");
        customers_page.shareholder1CEnterCity.clear();
        customers_page.shareholder1CEnterCity.sendKeys("beijing");
        customers_page.shareholder1EnterPostalCode.sendKeys("010");
//        customers_page.shareholder1ShareTypeDrowBox.click();
//        bddUtil.scrollWindowToElement(customers_page.shareholder1SelectShareType).click();
        customers_page.shareholder1AllocationDropDown.click();
        List<WebElementFacade> allocation = customers_page.shareholder1AllocationCurrency;
        for (int i = 0; i < allocation.size(); i++) {
            if (allocation.get(i).getText().equals(currency)){
                allocation.get(i).click();
                break;
            }
        }
        customers_page.shareholder1AllocationSecondEnter.clear();
        customers_page.shareholder1AllocationSecondEnter.sendKeys("10000");
        customers_page.shareholder1Shareholding.sendKeys("26");
        customers_page.shareholder2FullName.clear();
        customers_page.shareholder2FullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder2PinyinName.clear();
        customers_page.shareholder2PinyinName.sendKeys("zhangsan");
        customers_page.shareholder2Alias.clear();
        customers_page.shareholder2Alias.sendKeys("China");
        customers_page.shareholder2PinyinAliasName.clear();
        customers_page.shareholder2PinyinAliasName.sendKeys("zhongguo");
        customers_page.shareholder2IdTypeDropDown.click();
        bddUtil.scrollWindowToElement(customers_page.shareholder2SelectPassport).click();
        customers_page.shareholder2IdNo.clear();
        customers_page.shareholder2IdNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2IDExpiryDate.click();
        customers_page.shareholder2DateOfBirth.sendKeys("1999-09-10");
        customers_page.shareholder2Nationality.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.shareholder2ResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.shareholder2CountryOfResidence.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.shareholder2FirstPhoneNum.sendKeys("86");
        customers_page.shareholder2SecondPhoneNum.clear();
        customers_page.shareholder2SecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.shareholder2EnterEmail.clear();
        customers_page.shareholder2EnterEmail.sendKeys(value +"2"+ "@ihotmails.com");
        customers_page.shareholder2CEnterCity.clear();
        customers_page.shareholder2CEnterCity.sendKeys("beijing");
        customers_page.shareholder2EnterPostalCode.sendKeys("010");
//        customers_page.shareholder2ShareTypeDrowBox.click();
//        bddUtil.scrollWindowToElement(customers_page.shareholder2SelectShareType).click();
        customers_page.shareholder2AllocationDropDown.click();
        List<WebElementFacade> allocation2 = customers_page.shareholder1AllocationCurrency;
        for (int i = 0; i < allocation2.size(); i++) {
            if (allocation2.get(i).getText().equals(currency)){
                allocation2.get(i).click();
                break;
            }
        }
        customers_page.shareholder2AllocationSecondEnter.clear();
        customers_page.shareholder2AllocationSecondEnter.sendKeys("10000");
        customers_page.shareholder2Shareholding.sendKeys("26");
        customers_page.nextBtnIndustry.click();
    }

    public void enterShareholding(){
        customers_page.shareholder1Shareholding.sendKeys("26");
        customers_page.shareholder2Shareholding.sendKeys("26");
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheBeneficialPageIsDisplayed(){
        customers_page.beneficialTitle.isVisible();
    }

    @Step
    public void fillInTheInformationOnTheBeneficialPage(String currency, String value){
        customers_page.beneficialFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
//        因为股份大于25，所以最终受益人信息不用填写。
      /*  customers_page.beneficialPinYinName.sendKeys("lisi");
        customers_page.beneficialAlias.sendKeys("China");
        customers_page.beneficialPinYinAliasName.sendKeys("zhongguo");
        customers_page.beneficialCertificationType.click();
        customers_page.selectIdType.click();
        customers_page.beneficialCertificationNo.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficialTimePermanent.click();
        customers_page.beneficialDateBirth.sendKeys("2024-09-10");
//        customers_page.beneficialShareType.click();
//        customers_page.shareholder2SelectShareType.click();
        customers_page.beneficialAllocation.click();
        bddUtil.getDriver().findElement(By.xpath("//div[@x-placement=\"bottom-start\" or @x-placement=\"top-start\"]//span[text()='"+currency+"']")).click();
//        List<WebElementFacade> allocation = customers_page.shareholder1AllocationCurrency;
//        for (int i = 0; i < allocation.size(); i++) {
//            if (allocation.get(i).getText().equals(currency)){
//                allocation.get(i).click();
//                break;
//            }
//        }
        customers_page.beneficialFundScale.sendKeys("26");
        customers_page.beneficialCountry.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.beneficialCity.sendKeys("beijing");
        customers_page.beneficialCountryOfResidence.sendKeys("singapore");
        customers_page.selectCountry.click();
        customers_page.beneficialPostalCode.sendKeys("010");
        customers_page.beneficialResidentialAddress.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
        customers_page.beneficialFirstPhoneNum.sendKeys("+86");
        customers_page.beneficialSecondPhoneNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.beneficialEmail.sendKeys(value + "@ihotmails.com");*/
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void verifyWhetherTheAccountPageIsDisplayed(){
        customers_page.tellUsAboutAccoutPageTitle.isVisible();
    }

    @Step
    public void enterTheAccountInformation(String value){
        bddUtil.sleep(3);
        customers_page.account1Currency.click();
        List<WebElementFacade> selectCurrency = customers_page.selectCurrency;
        for (int i = 0; i < selectCurrency.size(); i++) {
            if (selectCurrency.get(i).getText().equals(value)){
                selectCurrency.get(i).click();
                break;
            }
        }
        customers_page.clickFirstAccountName.click();
        customers_page.account2Currency.click();
        List<WebElementFacade> select2Currency = customers_page.selectCurrency;
        bddUtil.sleep(1);
        for (int i = 0; i < select2Currency.size(); i++) {
            if (select2Currency.get(i).getText().equals(value)){
                select2Currency.get(i).click();
                break;
            }
        }
        customers_page.clickSecondAccountName.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void checkWhetherTheQuestionnairePageIsDisplayed(){
        customers_page.questionnaireTitle.isVisible();
    }

    @Step
    public void questionNaireInformation(){
        customers_page.firstQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.firstQuestionAnswer).click();
        customers_page.secondQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.secondQuestionAnswer).click();
        customers_page.thirdQuestion.click();
        bddUtil.scrollWindowToElement(customers_page.thirdQuestionAnswer).click();
        bddUtil.scrollWindowToElement(customers_page.sixQuestionCheckBox);
        customers_page.fourQuestionCheckBox.click();
        customers_page.fiveQuestionCheckBox.click();
        customers_page.sixQuestionCheckBox.click();
//        customers_page.SaveBtnIndustry.click();
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void questionFirstCheckBox(String currency,String num){
        customers_page.clickFirstCheckBox.click();
        customers_page.clickSecondCheckBox.click();
        customers_page.clickThirdCheckBox.click();
        customers_page.clickSecondQuestionDownDrop.click();
        List<WebElementFacade> selectSecondQuestion = customers_page.selectCurrency;
        for (int i = 0; i < selectSecondQuestion.size(); i++) {
            if (selectSecondQuestion.get(i).getText().equals(currency)){
                selectSecondQuestion.get(i).click();
                break;
            }
        }
        customers_page.clickThirdQuestionDownDrop.click();
        bddUtil.sleep(2);
        List<WebElementFacade> selectThirdQuestion = customers_page.selectCurrency;
        for (int i = 0; i < selectThirdQuestion.size(); i++) {
            bddUtil.sleep(2);
            if (selectThirdQuestion.get(i).getText().equals(num)){
                selectThirdQuestion.get(i).click();
                break;
            }
        }
        customers_page.clickFourQuestionCheckBox.click();
        customers_page.clickFiveQuestionCheckBox.click();
        getDriver().findElement(By.xpath("//span[text()='Browse']/parent::div/parent::div/following-sibling::input")).sendKeys(fileAddress);
        bddUtil.sleep(7);
        bddUtil.scrollWindowToElement(getDriver().findElement(By.xpath("//div[@class='content-submit']/button[3]")));
        customers_page.nextBtnIndustry.click();
    }

    @Step
    public void approvalInTheSupplyChainSystem(){
        getClickCustomersMenu();
        customers_page.clickOnboardingReview.click();

    }

    @Step
    public void click_login_btn(){
        customers_page.clickLogonBtn.click();
    }

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        customers_page.openUrl(logonUrl);
    }

    @Step
    public void onboardingReviewTitle(){
        customers_page.onboardingReviewTitle.isVisible();
    }

    @Step
    public void assignToMePage(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        bddUtil.sleep(1);
        customers_page.searchCheckBox.click();
        bddUtil.sleep(3);
        bddUtil.clickByJS(customers_page.assignToMeButton);
    }

    @Step
    public void assignToMePageBuyer(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        bddUtil.sleep(1);
        customers_page.searchCheckBox.click();
        bddUtil.sleep(3);
        bddUtil.clickByJS(customers_page.assignToMeButton);
    }

    @Step
    public void assignToMeBtn(String value){
        List<WebElementFacade> assignToMe = customers_page.assignToMeBtn;
        List<WebElementFacade> companyName = customers_page.companyNameList;
        for (int i = 0; i < companyName.size(); i++){
            if (value.equals(companyName.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", assignToMe.get(i));
                break;
            }
        }
    }

    @Step
    public void clickAssignToMeTitle(){
        customers_page.clickAssignToMeTitle.click();
    }

    @Step
    public void joinRatingLimitPage(){
        customers_page.clickMoreMenu.click();
        customers_page.clickRatingsLimits.click();
        customers_page.clickRatingsLimitsMenu.click();
    }
    @Step
    public void searchData(String dataName,String data){
        customers_page.enterSearchData.sendKeys(dataName);
        customers_page.clickStatusTitle.click();
        while(true){
            List<WebElementFacade> test = customers_page.clientName;
            for (int i = 0; i < test.size(); i++) {
                try {
                    if (data.equals(test.get(i).getText())){
                        bddUtil.clickByJS(customers_page.clickChangeBtn);
                        return;
                    }
                }catch (Exception e){
                    break;
                }
            }
            customers_page.clickNextBtnSelectData.click();
            bddUtil.sleep(2);
        }
    }
    @Step
    public void checkAmount(String amount){
        customers_page.limitForThisProduct.clear();
        customers_page.limitForThisProduct.sendKeys(amount);
        customers_page.titleProposedLimit.click();
        String checkAmount = solve(amount)+".00";
        if (checkAmount.equals(customers_page.titleAmount.getText())){
            System.out.println("交易成功！");
        }
        customers_page.inputCommentText.sendKeys("ok");
        customers_page.clickSubmitBtnOnGLDB.click();
    }

    @Step
    public void checkTitleTips() throws Exception{
        if (customers_page.checkTitleTips.getText().equals("Saved successfully")){
            System.out.println("交易成功2！");
        }else {
            System.out.println("交易失败！");
            throw new Exception("交易失败！");
        }
    }

    @Step
    public void UnderWritingMenu(){
        if(customers_page.clickUnderwritingMenuTtile.isVisible()){
            customers_page.clickUnderwritingMenuTtile.click();
        }else {
            customers_page.clickMoreMenu.click();
            bddUtil.sleep(1);
            customers_page.clickUnderwritingMenu.click();
        }
        customers_page.clickUnderwritingApproval.click();
        customers_page.clickAssignedToMeBtn.click();
    }

    @Step
    public void selectDataAndCredit(String data) throws Exception{
        customers_page.searchBox.sendKeys(data);
        customers_page.clickApplicantTitle.click();
        bddUtil.clickByJS(customers_page.clickUnderWritingProceedBtn);
        bddUtil.scrollWindowToElement(customers_page.clickCpsPreadjustedCGInput);
        customers_page.clickCpsPreadjustedCGInput.clear();
        customers_page.clickCpsApprovedCGInput.clear();
        bddUtil.scrollWindowToElement(customers_page.clickRetriggerCPS).click();
        bddUtil.sleep(5);
        bddUtil.scrollWindowToElement(customers_page.lastUpdated);
        String text = customers_page.clickCpsApprovedCGInput.getAttribute("value");
        if (!text.isEmpty()){
            System.out.println("成功拉取数据。");
             }else {
            throw new Exception("CPS系统拉取失败");
        }
    }


    public static String solve(String num) {
        if (num == null) {
            return null;
        }
        // 判断是否有小数
        int index = num.indexOf(".");
        if (index >= 0) {
            String integer = num.substring(0, index);
            String decimal = num.substring(index);
            // 分隔后的整数+小数拼接起来
            return addSeparator(integer) + decimal;
        } else {
            return addSeparator(num);
        }
    }

    // 添加分隔符
    public static String addSeparator(String num) {
        int length = num.length();
        ArrayList list = new ArrayList();
        while (length > 3) {
            list.add(num.substring(length - 3, length));
            length = length - 3;
        }
        // 将前面小于三位的数字添加到ArrayList中
        list.add(num.substring(0, length));
        StringBuffer buffer = new StringBuffer();
        // 倒序拼接
        for (int i = list.size() - 1; i > 0; i--) {
            buffer.append(list.get(i) + ",");
        }
        buffer.append(list.get(0));
        return buffer.toString();
    }


    @Step
    public void clickProceedButtonOnAssignToMePage(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.searchCheckBox.click();
        bddUtil.sleep(2);
        bddUtil.clickByJS(customers_page.proceedButtton);
    }

    @Step
    public void clickProceedButtonOnAssignToMePageBuyer(){
        customers_page.searchCompanyInput.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        customers_page.searchCheckBox.click();
        bddUtil.sleep(2);
        bddUtil.clickByJS(customers_page.proceedButtton);
    }

    @Step
    public void clickProceedBtnOnAssignToMePage(String value){
        List<WebElementFacade> proceedBtn = customers_page.proceedBtn;
        List<WebElementFacade> assignToMeContent = customers_page.comPanyNameListOnAssginToMePage;
        for (int i = 0; i < assignToMeContent.size(); i++){
            if (value.equals(assignToMeContent.get(i).getText())){
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", proceedBtn.get(i));
                break;
            }
        }
    }

    public void processPageApprove(){
//        bddUtil.scrollWindowToElement(customers_page.relatedPartyCheckBox);
        bddUtil.clickByJS(customers_page.relatedPartyCheckBox);
        bddUtil.sleep(2);
        // 获取到T24ID，并且 写入txt文件里。
       String T24ID =  getDriver().findElement(By.xpath("//label[text()='T24 Client No.']/following-sibling::div//input")).getAttribute("value");
       FileUtils.FileString4("SCF-T24ID",T24ID);
       customers_page.resultCheckBox.click();
        customers_page.selectApprove.click();
        customers_page.inputBoxComment.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.submitBtnOnAssignToMePage.click();
        bddUtil.sleep(13);
        updateAmlResult(1,"companyData");
    }
    @Step
    public void clickEditIcon(String companyType){
        customers_page.sendKeysCompanyNameOnOnboardingList.clear();
        if(companyType.equals("Buyer")){
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        }else {
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        }
        customers_page.clickStatusOnOnboardingList.click();
        bddUtil.sleep(2);
        customers_page.clickEditIcon.click();
    }

    @Step
    public void companyInformation(String Industry,String selectIdType,String customerType){
        bddUtil.sleep(5);
        customers_page.enterRegisteredAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.clickCountryOfBusiness.click();
        customers_page.selectCountryOfBusinessText.click();
        customers_page.enterBusinessCity.sendKeys("beijing");
        customers_page.enterBusinessAddress.sendKeys("beijing");
        customers_page.clickIndustryDownDrop.click();
        List<WebElementFacade> industry = customers_page.selectIndustryText;
        for (int i = 0; i < industry.size(); i++) {
            if (Industry.equals(industry.get(i).getText())){
                bddUtil.scrollWindowToElement(industry.get(i)).click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//label[@for='A0030']/following-sibling::div//input")).sendKeys(fileAddress);
        customers_page.enterPinYinName.sendKeys("zhangsan");
        customers_page.enterAliasSimpleKYC.sendKeys("beijing");
        customers_page.enterPinYinAliasName.sendKeys("zhangsana");
        customers_page.clickIdTypeDownDrop.click();
        List<WebElementFacade> selectIdTypeText = customers_page.selectIdTypeText;
        for (int i = 0; i < selectIdTypeText.size(); i++) {
            if (selectIdType.equals(selectIdTypeText.get(i).getText())){
                selectIdTypeText.get(0).click();
                break;
            }
        }
        customers_page.enterIdNoSimpleKYC.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.selectNoExpirySimpleKYC.click();
        customers_page.enterDateSimpleKYC.sendKeys("2029-12-22");
        customers_page.clickNationalityDownDrop.click();
        customers_page.selectNationalitySimpleKYC.click();
        customers_page.enterResidentialAddressSimpleKYC.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.clickCountryOfResidenceSimpleKYC.click();
        customers_page.selectCountryOfResidenceSimpleKYC.click();
        customers_page.enterCitySimpleKYC.sendKeys("beijing");
        customers_page.enterPinYin2Name.sendKeys("zhangsan");
        customers_page.enterAlias2SimpleKYC.sendKeys("beijing");
        customers_page.enterPinYin2AliasName.sendKeys("zhangsana");
        customers_page.clickIdType2DownDrop.click();
        List<WebElementFacade> selectIdType2Text = customers_page.selectIdType2Text;
        for (int i = 0; i < selectIdType2Text.size(); i++) {
            if (selectIdType.equals(selectIdType2Text.get(i).getText())){
                selectIdType2Text.get(0).click();
                break;
            }
        }
        customers_page.enterIdNo2SimpleKYC.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.selectNoExpiry2SimpleKYC.click();
        customers_page.enterDate2SimpleKYC.sendKeys("2029-12-22");
        customers_page.clickNationality2DownDrop.click();
        customers_page.selectNationality2SimpleKYC.click();
        customers_page.enterResidentialAddress2SimpleKYC.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.clickCountryOfResidence2SimpleKYC.click();
        customers_page.selectCountryOfResidence2SimpleKYC.click();
        customers_page.enterCity2SimpleKYC.sendKeys("beijing");
        customers_page.getClickSaveBtn.click();
        bddUtil.sleep(10);
        if(customers_page.clickBackButton.isVisible()){
            customers_page.clickBackButton.click();
            customers_page.sendKeysCompanyNameOnOnboardingList.clear();
            if (customerType.equals("Buyer")){
                customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("buyer"));
            }else {
                customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
            }
            customers_page.clickStatusOnOnboardingList.click();
        }
        bddUtil.sleep(5);
        customers_page.clickSubmitSimpleKYC.click();
        customers_page.clickComfirmBtnSimpleKYC.click();
    }
    
    public void companyInformationNoAdministrator(String Industry,String customerType){
        customers_page.enterRegisteredAddress.sendKeys(JRandomNameTool.getStringRandom(10));
        customers_page.clickCountryOfBusiness.click();
        customers_page.selectCountryOfBusinessText.click();
        customers_page.enterBusinessCity.sendKeys("beijing");
        customers_page.enterBusinessAddress.sendKeys("beijing");
        customers_page.clickIndustryDownDrop.click();
        List<WebElementFacade> industry = customers_page.selectIndustryText;
        for (int i = 0; i < industry.size(); i++) {
            if (Industry.equals(industry.get(i).getText())){
                bddUtil.scrollWindowToElement(industry.get(i)).click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//label[@for='A0030']/following-sibling::div//input")).sendKeys(fileAddress);
        customers_page.getClickSaveBtn.click();
        bddUtil.sleep(20);
        if(customers_page.clickBackButton.isVisible()){
            customers_page.clickBackButton.click();
            customers_page.sendKeysCompanyNameOnOnboardingList.clear();
            if (customerType.equals("Buyer")){
                customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("buyer"));
            }else {
                customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
            }
            customers_page.clickStatusOnOnboardingList.click();
        }
        bddUtil.sleep(5);
        customers_page.clickSubmitSimpleKYC.click();
        bddUtil.sleep(2);
        customers_page.clickComfirmBtnSimpleKYC.click();
    }

    @Step
    public void assignToMe(String result,String customerType){
        List<WebElementFacade> assign = customers_page.ReviewCustomer;
        List<WebElementFacade> assignBtn = customers_page.clickAssignBtn;
        for (int i = 0; i < assign.size(); i++) {
            bddUtil.sleep(3);
            if (customerType.equals("Buyer")){
                if (FileUtils.LastReadFileInput3("buyer").equals(assign.get(i).getText())) {
                    assignBtn.get(i).click();
                    break;
                }
            }else {
                if (FileUtils.LastReadFileInput3("companyData").equals(assign.get(i).getText())) {
                    assignBtn.get(i).click();
                    break;
                }
            }

        }
        customers_page.assignedToMeClick.click();
        bddUtil.sleep(8);
        List<WebElementFacade> company = customers_page.getCompanyNameList;
        List<WebElementFacade> proceed = customers_page.clickProceedBtn;
        for (int j = 0; j < company.size(); j++){
            if (customerType.equals("Buyer")){
                if (FileUtils.LastReadFileInput3("buyer").equals(company.get(j).getText())){
                    bddUtil.sleep(8);
                    bddUtil.clickByJS(proceed.get(j));
                    break;
                }
            }else{
                if (FileUtils.LastReadFileInput3("companyData").equals(company.get(j).getText())){
                    bddUtil.sleep(8);
                    bddUtil.clickByJS(proceed.get(j));
                    break;
                }
            }
        }
        bddUtil.sleep(25);
        customers_page.clickResultDownDrop.click();
        List<WebElementFacade> enterResult = customers_page.selectResult;
        for (int k = 0; k < enterResult.size(); k++){
            if (result.equals(enterResult.get(k).getText())){
                enterResult.get(k).click();
                break;
            }
        }
        customers_page.enterComment.sendKeys(RandomPhoneNumber.randomPhoneNum());
//        if (customerType.equals("Buyer")){
//            bddUtil.scrollWindowToElement(customers_page.clickRelatedPartySelectYes).click();
//        }
        customers_page.clickSubmitBtn.click();
        bddUtil.sleep(10);
    }

    @Step
    public void assignToMeFullKYC(String result,String customerType){
        List<WebElementFacade> assign = customers_page.ReviewCustomer;
        List<WebElementFacade> assignBtn = customers_page.clickAssignBtn;
        for (int i = 0; i < assign.size(); i++) {
            if (customerType.equals("Buyer")){
                if (FileUtils.LastReadFileInput3("buyer").equals(assign.get(i).getText())) {
                    assignBtn.get(i).click();
                    break;
                }
            }else {
                if (FileUtils.LastReadFileInput3("companyData").equals(assign.get(i).getText())) {
                    assignBtn.get(i).click();
                    break;
                }
            }
        }
        customers_page.assignedToMeClick.click();
        bddUtil.sleep(8);
        List<WebElementFacade> company = customers_page.getCompanyNameList;
        List<WebElementFacade> proceed = customers_page.clickProceedBtn;
        for (int j = 0; j < company.size(); j++){
            if (customerType.equals("Buyer")){
                if (FileUtils.LastReadFileInput3("buyer").equals(company.get(j).getText())){
                    bddUtil.sleep(8);
                    proceed.get(j).click();
                    break;
                }
            }else {
                if (FileUtils.LastReadFileInput3("companyData").equals(company.get(j).getText())){
                    bddUtil.sleep(8);
                    proceed.get(j).click();
                    break;
                }
            }
        }
        bddUtil.sleep(10);
        bddUtil.scrollWindowToElement(customers_page.clickRelatedPartySelectYes).click();
        bddUtil.sleep(10);
        customers_page.clickResultDownDrop.click();
        List<WebElementFacade> enterResult = customers_page.selectResult;
        for (int k = 0; k < enterResult.size(); k++){
            if (result.equals(enterResult.get(k).getText())){
                enterResult.get(k).click();
                break;
            }
        }
        customers_page.enterComment.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.clickSubmitBtn.click();
        bddUtil.sleep(10);
    }

    public void checkRegistrationReport(String companyType){
        customers_page.sendKeysCompanyNameOnOnboardingList.clear();
        if (companyType.equals("Buyer")){
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        }else{
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        }
        customers_page.clickStatusOnOnboardingList.click();
        Assert.assertEquals("Pending Registration",customers_page.checkRegistrationtatus.getText());
        bddUtil.sleep(2);
    }

    public void checkRegistrationAndSubmit(){
        customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.clickStatusOnOnboardingList.click();
        customers_page.clickSubmitSimpleKYC.click();
        customers_page.clickComfirmBtnSimpleKYC.click();
    }

    public void checkApprovedStatus(String status,String customerType){
        customers_page.sendKeysCompanyNameOnOnboardingList.clear();
        if (customerType.equals("Buyer")){
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("buyer"));
        }else {
            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        }
        customers_page.clickStatusOnOnboardingList.click();
        bddUtil.sleep(5);
//        if (!status.equals(customers_page.checkRegistrationtatus.getText())){
//            bddUtil.clickByJS(customers_page.clickViewDetailsBtn);
//            bddUtil.scrollWindowToElement(bddUtil.getDriver().findElement(By.xpath("//div[text()='Beneficial Owner (s)']")));
//            customers_page.clickBackDetailsBtn.click();
//            customers_page.sendKeysCompanyNameOnOnboardingList.clear();
//            customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
//            customers_page.clickStatusOnOnboardingList.click();
//        }
        bddUtil.scrollWindowToElement(customers_page.LastUpdatedBtn);
        Assert.assertEquals(status,customers_page.checkRegistrationtatus.getText());
        bddUtil.sleep(5);
    }

    public void checkRegistrationReportUpgrade(){
        customers_page.sendKeysCompanyNameOnOnboardingList.clear();
        customers_page.sendKeysCompanyNameOnOnboardingList.sendKeys(FileUtils.LastReadFileInput3("companyData"));
        customers_page.clickStatusOnOnboardingList.click();
        bddUtil.sleep(3);
        Assert.assertEquals("Upgrade",customers_page.checkRegistrationtatus.getText());
        bddUtil.sleep(2);
    }

    public void findEamilOtp(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        bddUtil.scrollWindowToElement(customers_page.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(customers_page.getEmailOtp).getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.sendKeys(otp);
    }

    public void enterNewPasswordAndLoginSuccess(String password){
        customers_page.GLDBEmailInput.sendKeys(username);
        customers_page.GLDBEmailPassword.sendKeys(password);
        customers_page.enterCompanyId.clear();
        customers_page.enterCompanyId.sendKeys(RandomPhoneNumber.randomPhoneNum());
        customers_page.sendCodeBtn.click();
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        bddUtil.scrollWindowToElement(customers_page.clickFirstEmailName).click();
        String otp = bddUtil.scrollWindowToElement(customers_page.getEmailOtp).getText();
        bddUtil.switchToWindows();
        customers_page.inputSendCode.clear();
        customers_page.inputSendCode.sendKeys(otp);
        customers_page.GLDBEmailLoginBtn.click();
        bddUtil.sleep(5);
        assertEquals("Service Agreement",getDriver().findElement(By.xpath("//span[text()='Service Agreement']")).getText());
        bddUtil.sleep(2);
    }
    public void clickConfirmationInformation(){
        if (customers_page.clickConfirmationInformation.isVisible()){
            customers_page.clickConfirmationInformation.click();
            customers_page.clickBackButton.click();
        }else if(customers_page.clickCustomerProfilePendingActions.isVisible()){
            customers_page.clickCustomerProfilePendingActions.click();
            customers_page.clickIwillInputManuallyBtn.click();
        }else {
            customers_page.clickOpenAccountApplicationActions.click();
        }
    }
    @Step
    public void clickUpgradeFullKYC(String UpgradeKYC){
        customers_page.clickUpgradeKYC.click();
        bddUtil.sleep(10);
        customers_page.clickUpgradeModeDownDrop.click();
        List<WebElementFacade> upgrade = customers_page.selectUpgradeMode;
        for (int i = 0; i < upgrade.size(); i++) {
            if (UpgradeKYC.equals(upgrade.get(i).getText())){
                upgrade.get(i).click();
                break;
            }
        }
        if (customers_page.submitBtnOnAssignToMePage.isVisible()){
            customers_page.submitBtnOnAssignToMePage.click();
        }else {
            customers_page.clickConfirmBtn.click();
        }
    }

    @Step
    public void clickUpgradeKYC(String UpgradeKYC,String inputBy){
        customers_page.clickUpgradeKYC.click();
        bddUtil.sleep(10);
        customers_page.clickUpgradeModeDownDrop.click();
        List<WebElementFacade> upgrade = customers_page.selectUpgradeMode;
        for (int i = 0; i < upgrade.size(); i++) {
            if (UpgradeKYC.equals(upgrade.get(i).getText())){
                upgrade.get(i).click();
                break;
            }
        }
        bddUtil.sleep(10);
        customers_page.clickInputByDownDrop.click();
        List<WebElementFacade> inputby = customers_page.selectIndustryText;
        for (int j = 0; j < inputby.size(); j++) {
            if (inputBy.equals(inputby.get(j).getText())){
               inputby.get(j).click();
               break;
            }
        }
        if (customers_page.submitBtnOnAssignToMePage.isVisible()){
            customers_page.submitBtnOnAssignToMePage.click();
        }else {
            customers_page.clickConfirmBtn.click();
        }
    }
    public void enterUpgradeKYCAdmin1Email(String email){
        customers_page.enterUpgradeKYCAdmin1Email.sendKeys(email);
    }
    public void enterUpgradeKYCAdmin1FullName(){
        customers_page.enterUpgradeKYCAdmin1FullName.sendKeys(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
    }

    public void enterUpgradeKYCAdmin1AreaCode(){
        customers_page.enterUpgradeKYCAdmin1AreaCode.sendKeys("+86");
        customers_page.enterUpgradeKYCAdmin1MobileNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
    }
    public void enterUpgradeKYCAdmin2FullName(){
        customers_page.enterUpgradeKYCAdmin2FullName.sendKeys(RandomNameTool.getName(Language.en,NameType.FULL_NAME));
    }
    public void enterUpgradeKYCAdmin2Email(String email){
        customers_page.enterUpgradeKYCAdmin2Email.sendKeys(email);
    }
    public void enterUpgradeKYCAdmin2AreaCode(){
        customers_page.enterUpgradeKYCAdmin2AreaCode.sendKeys("+86");
        customers_page.enterUpgradeKYCAdmin2MobileNum.sendKeys(RandomPhoneNumber.randomPhoneNum());
    }
    public void getEmailInformation(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
        customers_page.clickFirstEmailName.click();
    }

    public void enterInformationAdministrator(){
        customers_page.enterFullName.clear();
        customers_page.enterFullName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
    }

    public void enterFullKYCUpdateSimpleKYCInfomation(String value,String currency,String num){
        bddUtil.sleep(3);
        customers_page.account1Currency.click();
        List<WebElementFacade> selectCurrency = customers_page.selectCurrency;
        for (int i = 0; i < selectCurrency.size(); i++) {
            if (selectCurrency.get(i).getText().equals(value)){
                selectCurrency.get(i).click();
                break;
            }
        }
        customers_page.clickFirstAccountName.click();
        customers_page.account2Currency.click();
        List<WebElementFacade> select2Currency = customers_page.selectCurrency;
        bddUtil.sleep(1);
        for (int i = 0; i < select2Currency.size(); i++) {
            if (select2Currency.get(i).getText().equals(value)){
                select2Currency.get(i).click();
                break;
            }
        }
        customers_page.clickSecondAccountName.click();
        customers_page.clickFirstCheckBox.click();
        bddUtil.scrollWindowToElement(customers_page.clickSecondCheckBox);
        customers_page.clickSecondCheckBox.click();
        customers_page.clickSecondQuestionDownDrop.click();
        List<WebElementFacade> selectSecondQuestion = customers_page.selectCurrency;
        for (int i = 0; i < selectSecondQuestion.size(); i++) {
            if (selectSecondQuestion.get(i).getText().equals(currency)){
                selectSecondQuestion.get(i).click();
                break;
            }
        }
        customers_page.clickThirdQuestionDownDrop.click();
        bddUtil.sleep(2);
        List<WebElementFacade> selectThirdQuestion = customers_page.selectCurrency;
        for (int i = 0; i < selectThirdQuestion.size(); i++) {
            bddUtil.sleep(2);
            if (selectThirdQuestion.get(i).getText().equals(num)){
                selectThirdQuestion.get(i).click();
                break;
            }
        }
        bddUtil.scrollWindowToElement(customers_page.clickFourQuestionCheckBox);
        customers_page.clickFourQuestionCheckBox.click();
        customers_page.clickFiveQuestionCheckBox.click();
        getDriver().findElement(By.xpath("//span[text()='Browse']/parent::div/parent::div/following-sibling::input")).sendKeys(fileAddress);
        bddUtil.sleep(5);
    }

    private static String MyinfoData = "{\n" +
            " \"uinfin\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"S9812353I\"\n" +
            " },\n" +
            " \"name\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"SONG CHIN YONG\"\n" +
            " },\n" +
            " \"aliasname\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"\"\n" +
            " },\n" +
            " \"hanyupinyinaliasname\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"\"\n" +
            " },\n" +
            " \"hanyupinyinname\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"SONG ZHENYANG\"\n" +
            " },\n" +
            " \"sex\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"code\": \"M\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"desc\": \"MALE\"\n" +
            " },\n" +
            " \"regadd\": {\n" +
            "  \"country\": {\n" +
            "   \"code\": \"SG\",\n" +
            "   \"desc\": \"SINGAPORE\"\n" +
            "  },\n" +
            "  \"unit\": {\n" +
            "   \"value\": \"192\"\n" +
            "  },\n" +
            "  \"street\": {\n" +
            "   \"value\": \"TELOK BLANGAH STREET 31\"\n" +
            "  },\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"block\": {\n" +
            "   \"value\": \"92b\"\n" +
            "  },\n" +
            "  \"source\": \"1\",\n" +
            "  \"postal\": {\n" +
            "   \"value\": \"101092\"\n" +
            "  },\n" +
            "  \"classification\": \"C\",\n" +
            "  \"floor\": {\n" +
            "   \"value\": \"12\"\n" +
            "  },\n" +
            "  \"type\": \"SG\",\n" +
            "  \"building\": {\n" +
            "   \"value\": \"TELOK BLANGAH PARCVIEW\"\n" +
            "  }\n" +
            " },\n" +
            " \"mobileno\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"4\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"areacode\": {\n" +
            "   \"value\": \"65\"\n" +
            "  },\n" +
            "  \"prefix\": {\n" +
            "   \"value\": \"+\"\n" +
            "  },\n" +
            "  \"nbr\": {\n" +
            "   \"value\": \"97399245\"\n" +
            "  }\n" +
            " },\n" +
            " \"email\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"4\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"myinfotesting@gmail.com\"\n" +
            " },\n" +
            " \"nationality\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"code\": \"SG\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"desc\": \"SINGAPORE CITIZEN\"\n" +
            " },\n" +
            " \"dob\": {\n" +
            "  \"lastupdated\": \"2022-10-27\",\n" +
            "  \"source\": \"1\",\n" +
            "  \"classification\": \"C\",\n" +
            "  \"value\": \"1988-10-06\"\n" +
            " }\n" +
            "}";

    public void enterMyinfoInfomation(){
        bddUtil.switchToNewWindow();
        bddUtil.scrollWindowToElement(customers_page.clickFirstEmailName).click();
        bddUtil.scrollWindowToElement(customers_page.clickmyinfoInternetButton).click();
        bddUtil.switchToWindows();
        String url = getDriver().getCurrentUrl();
        String url2 = url.substring(0, url.indexOf("?"));
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.24.7.8:8080/#/myInfoCallBack?"+url.substring(url2.length() + 1, url.length())+"\");");
        bddUtil.switchToNewWindow();
        customers_page.clickUploadJson.click();
        customers_page.enterJsonInfomation.sendKeys(MyinfoData);
        customers_page.getClickConfirmBtn.click();
    }

    public void clickSCFLink(){
        customers_page.clickSCFLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        if (customers_page.clickSeniorBtn.isVisible()){
            customers_page.clickSeniorBtn.click();
            customers_page.clickJumpToSCFlink.click();
        }
        customers_page.scfPageTitle.getText();
    }
}
