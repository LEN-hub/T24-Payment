package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.userManagement_page;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;

import static com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.accountChange_steps.tcCode;
import static com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber.randomPhoneNum;
import static org.junit.Assert.assertEquals;

public class userManagement_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    public static String code = randomPhoneNum();
    public static String content = JRandomNameTool.getStringRandom(6);
    public static String verificationCode;

    private userManagement_page userManagement_page;

    public void clickEnterpriseManagementDesk() {
        if (userManagement_page.popWindowsTitle.isVisible()) {
            userManagement_page.popWindowsOk.click();
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(userManagement_page.EnterpriseManagementDesk).perform();
    }

    public void clickAccountManagements() {
        userManagement_page.accountManagement.click();
        bddUtil.sleep(10);
        userManagement_page.record.click();
        bddUtil.sleep(3);
    }


    public void selectTheMenus() {
        bddUtil.sleep(5);
        List<WebElementFacade> checkEmail = userManagement_page.checkEmail;
        List<WebElementFacade> sumNum = userManagement_page.sumNum;
        a:for (int x = 0; x < sumNum.size(); x++){
            sumNum.get(sumNum.size()-1).click();
            for (int i = 0; i < checkEmail.size(); i++) {
                if (checkEmail.get(i).getText().equals(FileUtils.LastReadFileInput3("emailData"))) {
                    Actions action = new Actions(getDriver());
                    System.out.println(checkEmail.size());
                    int t = i+1;
                    System.out.println(t);
                    action.moveToElement(userManagement_page.find(By.xpath("//div[@class='el-table__body-wrapper is-scrolling-none']//tbody/tr["+t+"]/td[7]//img"))).perform();
                    break a;
                }
            }
        }
        bddUtil.sleep(5);
    }

    public void clickModifyInformation() {
        userManagement_page.modifyInformation.click();
        bddUtil.sleep(2);
    }

    public void clickMobilePHONNO() {
        userManagement_page.mobilePhoneNo.clear();
        bddUtil.sleep(5);
        userManagement_page.mobilePhoneNo.sendKeys(code);
        bddUtil.sleep(3);
    }

    public void clickNext() {
        userManagement_page.clickNext.click();
        bddUtil.sleep(3);
    }

    public void clickSumbits() {
        userManagement_page.sumbits.click();
        bddUtil.sleep(3);
    }

    public void clickCodeNext() {
        userManagement_page.codeNext.click();
        bddUtil.sleep(3);
    }
    public void vkeyTCCode() throws InterruptedException, MalformedURLException {
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testMobile();
        Thread.sleep(3000);
        if (MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'btn_otp')]/child::android.widget.TextView[2]").getText().equals("一次性\n密码")) {
            test.transactionCode();
        }else {
            test.clickSystemPopupWindows();
            test.clickStartButton();
            test.logonVkeyApp(Logon_step.organisationID, Logon_step.email, Logon_step.password);
            test.clickLetUsStart();
            test.verification();
            test.clickCreatPassword();
        }
    }
    public void authenticateNowBtn(){
        userManagement_page.authenticateNowBtn.click();
    }

    public void enterTcCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        userManagement_page.enterFirstTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(0,1));
        userManagement_page.enterSecondeTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(1,2));
        userManagement_page.enterThirdTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(2,3));
        userManagement_page.enterFourTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(3,4));
        userManagement_page.enterFiveTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(4,5));
        userManagement_page.enterSixTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(5,6));
    }

    public void clickNextBtn(){
        userManagement_page.clcikNextBtn.click();
    }

    public String tcCode (){
        String first = userManagement_page.firstTCCode.getText();
        String second = userManagement_page.secondTCCode.getText();
        String third = userManagement_page.thirdTCCode.getText();
        String four = userManagement_page.fourTCCode.getText();
        String five = userManagement_page.fiveTCCode.getText();
        String six = userManagement_page.sixTCCode.getText();
        String seven = userManagement_page.sevenTCCode.getText();
        String eight = userManagement_page.eightTCCode.getText();
        tcCode = first+second+third+four+five+six+seven+eight;
        return tcCode ;
    }



    //新增用户
    public void clickAddUsers() {
        userManagement_page.addUsers.click();
    }

    public void clickCall() {
        userManagement_page.call.click();
    }

    public void clickMr() {
        userManagement_page.Mr.click();
    }

    public void clickSendKeyName() {
        userManagement_page.sendKeyName.sendKeys(content);
    }

    public void clickPassport() {
        userManagement_page.clickPassport.click();
    }

    public void passportNumber() {
        userManagement_page.PassportNumber.sendKeys(code);
    }

    public void clickTimeLimit(String TimeLimit) {
        userManagement_page.TimeLimit.sendKeys(TimeLimit);
        userManagement_page.disappear.click();
    }

    public void clickBirthday(String birthday) {
        userManagement_page.birthday.sendKeys(birthday);
        userManagement_page.disappear.click();
    }

    public void clickCountries(String countries) {
        bddUtil.sleep(5);
        userManagement_page.countries.sendKeys(countries);
        bddUtil.sleep(5);
        userManagement_page.chinese.click();
    }

    public void clickPNumber() {
        userManagement_page.pNumber.sendKeys(code);
    }

    public void clickValidation() {
        bddUtil.sleep(2);
        userManagement_page.validation.click();
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

    public void sendKeyBoth() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        bddUtil.sleep(2);
        userManagement_page.sendKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(0,1));
        bddUtil.sleep(3);
        userManagement_page.secondKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(1,2));
        userManagement_page.thirdKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(2,3));
        userManagement_page.fourKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(3,4));
        userManagement_page.fiveKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(4,5));
        userManagement_page.sixKeysBox.click();
        enterKeys.EnterKeys(verificationCode.substring(5,6));
    }

    public void clickKeysEmail () {
            userManagement_page.keysEmail.sendKeys(FileUtils.LastReadFileInput3("userAddEmailData"));
            bddUtil.sleep(3);}

    public void clickValidationEmail(){userManagement_page.validationEmail.click();}

    public void clickPermissions(){userManagement_page.permissions.click();}

    public void clickNextOne(){userManagement_page.clickNextOne.click();}

    public void NextBtnS(){userManagement_page.clcikNextBtns.click();}



//停用此用户
    public void clickStopUser(){
        userManagement_page.stopUser.click();
        bddUtil.sleep(5);}
    public void clickSure(){
        userManagement_page.sure.click();
        bddUtil.sleep(5);}
    public void clickComplete(){
        userManagement_page.complete.click();
        bddUtil.sleep(5);}

    public void seeViewLabel(){
        if (userManagement_page.JudgeChinese.getText().equals("停用")){
            assertEquals("停用",userManagement_page.JudgeEnglish.getText());
         }else {
                assertEquals("Disable",userManagement_page.JudgeEnglish.getText());
        }
    }



//启用此用户
    public void clickStartUser(){
        userManagement_page.startUser.click();
        bddUtil.sleep(5);}

    public void seeViewStart(){
        if (userManagement_page.JudgesChinese.getText().equals("正常")){
            assertEquals("正常",userManagement_page.JudgesEnglish.getText());
        }else {
            assertEquals("Active",userManagement_page.JudgesEnglish.getText());
        }
    }

//用户注销
    //选择刚新增未激活的账户，进行注销,注销需谨慎


    public void selectMenus() {
        bddUtil.sleep(5);
        List<WebElementFacade> checkEmail = userManagement_page.checkEmail;
        List<WebElementFacade> sumNum = userManagement_page.sumNum;
        a:for (int x = 0; x < sumNum.size(); x++){
            sumNum.get(sumNum.size()-1).click();
            for (int i = 0; i < checkEmail.size(); i++) {
                if ( checkEmail.get(i).getText().equals(FileUtils.LastReadFileInput3("userAddEmailData"))) {
                    Actions action = new Actions(getDriver());
                    System.out.println(checkEmail.size());
                    int t = i+1;
                    System.out.println(t);
                    action.moveToElement(userManagement_page.find(By.xpath("//div[@class='el-table__body-wrapper is-scrolling-none']//tbody/tr["+t+"]/td[7]//img"))).perform();
                    break a;
                }
            }
        }
        bddUtil.sleep(5);
    }


    public void clickLogOut(){
        userManagement_page.logOut.click();
    }

}
