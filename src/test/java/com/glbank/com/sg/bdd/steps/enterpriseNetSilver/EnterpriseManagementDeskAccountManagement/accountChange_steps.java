package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.accountChange_page;
import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.Logon_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.EnterKeys;
import com.glbank.com.sg.bdd.utils.MobileConfig;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

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

    public void accountManagement() {
        accountChange_page.AccountManagement.click();
        bddUtil.sleep(3);}

    public void selectModifyList() {
        Actions action = new Actions(getDriver());
        action.moveToElement(accountChange_page.ModifyList).perform();
        bddUtil.sleep(5);
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

    public void clickFirstPeople(){
        accountChange_page.firstPeople.click();
        bddUtil.sleep(3);}

    public void clickNext(){
        accountChange_page.next.click();
        bddUtil.sleep(3);}

    public void clickSubmitChange(){
        accountChange_page.submitChange.click();
        bddUtil.sleep(2);}

    public void clickCodeNext(){
        accountChange_page.codeNext.click();
        bddUtil.sleep(5);
    }



    public void vkeyTCCode() throws InterruptedException, MalformedURLException {
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testMobile();
        bddUtil.sleep(7);
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
        accountChange_page.clickNextBtn.click();
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

    public void clickAccountOpening(){
        accountChange_page.accountOpening.click();
    }

    public void clickCA(String CA) {
        List<WebElementFacade> selectCA = accountChange_page.CA;
        for (int i = 0; i < selectCA.size(); i++) {
            if (CA.equals(selectCA.get(i).getText())) {
                selectCA.get(i).click();
                break;
            }
        }
    }
    public void selectCurrencySGD(){
        accountChange_page.selectCurrencySGD.click();
    }

    public void selectCurrencyCNY(){accountChange_page.selectCurrencyCNY.click();}

    public void selectCurrencyUSD(){accountChange_page.selectCurrencyUSD.click();}

    public void selectCurrencyHKD(){accountChange_page.selectCurrencyHKD.click();}

    public void selectCurrencyEUR(){accountChange_page.selectCurrencyEUR.click();}

    public void clickTransfer(){
        accountChange_page.transfer.click();
        bddUtil.sleep(3);}

    public void clickChooseFinancial(){
        accountChange_page.chooseFinancial.click();
        bddUtil.sleep(3);}

    public void clickAgree(){
        if (accountChange_page.getAgree.isVisible()){
            accountChange_page.getAgree.click();
        }
        accountChange_page.agree.click();
        bddUtil.sleep(3);}

    public void clickNextSubmit(){
        accountChange_page.nextSubmit.click();
        bddUtil.sleep(3);}


//  MCA账户开立

    public void macCNY(){accountChange_page.mcaCNY.click();}

    public void mcaUSD(){accountChange_page.mcaUSD.click();}

    public void mcaHKD(){accountChange_page.mcaHKD.click();}

    public void mcaEUR(){accountChange_page.mcaEUR.click();}

//授权模式
    public void clickAuthorization(){
        accountChange_page.Authorization.click();
        bddUtil.sleep(3);}

    public void clickChangeAuthorization(){
        accountChange_page.changeAuthorization.click();
        bddUtil.sleep(3);}

    public void aSingle(){accountChange_page.aSingle.click();}

    public void singleASingle(){accountChange_page.singleASingle.click();}

    public void dualASingle(){accountChange_page.dualASingle.click();}

    public void clickConfirmBt(){
        accountChange_page.confirmBt.click();
        bddUtil.sleep(2);}

    public void determine(){
        accountChange_page.determine.click();
        bddUtil.sleep(2);}

    public void secondaryAuthorization(){
        accountChange_page.secondaryAuthorization.click();
        bddUtil.sleep(2);}

    public void authorizations() {
        if (accountChange_page.waitinAauthorization.getText().equals("交易成功")) {
            assertEquals("交易成功", accountChange_page.waitinAauthorization.getText());
        } else {
            assertEquals("Successful", accountChange_page.waitinAauthorization.getText());
        }
        bddUtil.sleep(2);}

    //新增币种需要授权

    public void clickCurrencyManagement(){
        accountChange_page.currencyManagement.click();
        bddUtil.sleep(2);}

    public void clickAddCurrency(){
        accountChange_page.addCurrency.click();
        bddUtil.sleep(2);}

    public void clickSelectCurrency(){
        accountChange_page.selectCurrency.click();
        bddUtil.sleep(2);}

    public void clickNextCurrency(){
        accountChange_page.nextCurrency.click();
        bddUtil.sleep(2);}

    public void clickSubmitCurrency(){
        accountChange_page.submitCurrency.click();
        bddUtil.sleep(2);
    }

    public void authorization() {
        if (accountChange_page.waitinAauthorization.getText().equals("等待授权")) {
            assertEquals("等待授权", accountChange_page.waitinAauthorization.getText());
        } else {
            assertEquals("wait for authorization", accountChange_page.waitinAauthorization.getText());
        }
        bddUtil.sleep(2);
        bddUtil.quitDriver();
    }

    //删除币种

    public void clickDelCurrency(){
        accountChange_page.delCurrency.click();
        bddUtil.sleep(2);}

    public void clickRemoveCurrencyBox(){
        accountChange_page.removeCurrencyBox.click();
        bddUtil.sleep(2);}

    public void clickSelectRemoveCurrency(){
        accountChange_page.selectRemoveCurrency.click();
        bddUtil.sleep(2);}

    public void clickBalanceToBox(){
        accountChange_page.balanceToBox.click();
        bddUtil.sleep(2);}

    public void clickSelectCount(){
        accountChange_page.selectCount.click();
        bddUtil.sleep(2);}

    public void clickCurrencyBox(){
        accountChange_page.currencyBox.click();
        bddUtil.sleep(2);}

    public void clickSelectCurrencyBt(){
        accountChange_page.selectCurrencyBt.click();
        bddUtil.sleep(5);}

    }
