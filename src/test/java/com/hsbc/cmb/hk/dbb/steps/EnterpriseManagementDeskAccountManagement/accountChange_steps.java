package com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement.accountChange_page;
import com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.Logon_step;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.EnterKeys;
import com.hsbc.cmb.hk.dbb.utils.MobileConfig;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.net.MalformedURLException;

public class accountChange_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private accountChange_page accountChange_page;
    public static String tcCode;


    public void selectEnterpriseManagementDesk() {
        if (accountChange_page.popWindowsTitle.isVisible()){
            accountChange_page.popWindowsOk.click();
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(accountChange_page.EnterpriseManagementDesk).perform();
    }

    public void accountManagement() {accountChange_page.AccountManagement.click();}

    public void selectModifyList() {
        Actions action = new Actions(getDriver());
        action.moveToElement(accountChange_page.ModifyList).perform();
    }

    //账户修改
    public void clickModify(){
        accountChange_page.Modify.click();
        bddUtil.sleep(3);}

    public void clickFinancial(){
        accountChange_page.financial.click();
        bddUtil.sleep(3);}

    public void clickNumberList(){
        accountChange_page.numberList.click();
        bddUtil.sleep(3);}

    public void clickNext(){
        accountChange_page.next.click();
        bddUtil.sleep(3);}

    public void clickSubmitChange(){
        accountChange_page.submitChange.click();
        bddUtil.sleep(2);}

    public void clickCodeNext(){
        accountChange_page.codeNext.click();
        bddUtil.sleep(3);}

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
        accountChange_page.authenticateNowBtn.click();
    }

    public void enterTcCode() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        accountChange_page.enterFirstTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(0,1));
        accountChange_page.enterSecondeTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(1,2));
        accountChange_page.enterThirdTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(2,3));
        accountChange_page.enterFourTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(3,4));
        accountChange_page.enterFiveTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(4,5));
        accountChange_page.enterSixTcCode.click();
        enterKeys.EnterKeys(MobileConfig.vxcode.substring(5,6));
    }

    public void clickNextBtn(){
        accountChange_page.clcikNextBtn.click();
    }

    public String tcCode (){
        String first = accountChange_page.firstTCCode.getText();
        String second = accountChange_page.secondTCCode.getText();
        String third = accountChange_page.thirdTCCode.getText();
        String four = accountChange_page.fourTCCode.getText();
        String five = accountChange_page.fiveTCCode.getText();
        String six = accountChange_page.sixTCCode.getText();
        String seven = accountChange_page.sevenTCCode.getText();
        String eight = accountChange_page.eightTCCode.getText();
        tcCode = first+second+third+four+five+six+seven+eight;
        return tcCode;
    }


    //账户加挂
    public void clickLinkAccount(){
        accountChange_page.linkAccount.click();
        bddUtil.sleep(5);}

    public void clickAccountSelect(){
        accountChange_page.accountSelect.click();
        bddUtil.sleep(5);}

    public void clickAccountChoose(){
        bddUtil.sleep(3);
        accountChange_page.accountChoose.click();}

    public void clickSubmit1(){
        bddUtil.sleep(5);
        accountChange_page.submit1.click();}

//  CA账户开立

    public void clickAccountOpening(){ accountChange_page.accountOpening.click();}

    public void clickCA(){
        accountChange_page.CA.click();
        bddUtil.sleep(3);}

    public void clickTransfer(){ accountChange_page.transfer.click();}

    public void clickChooseFinancial(){ accountChange_page.chooseFinancial.click();}

    public void clickAgree(){ accountChange_page.agree.click();}

    public void clickNextSubmit(){ accountChange_page.nextSubmit.click();}



//  MCA账户开立

    public void clickMCA(){
        accountChange_page.MCA.click();
        bddUtil.sleep(3);}



}
