package com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement.accountChange_page;
import com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement.userManagement_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

import static com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber.randomPhoneNum;

public class userManagement_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    public static String code = randomPhoneNum();

    private userManagement_page userManagement_page;

    public void selectEnterpriseManagementDesk() {
        if (userManagement_page.popWindowsTitle.isVisible()){
            userManagement_page.popWindowsOk.click();
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(userManagement_page.EnterpriseManagementDesk).perform();
    }

    public void clickAccountManagement(){userManagement_page.AccountManagement.click();}

    public void selectTheMenu() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userManagement_page.theMenu).perform();
    }

    public void clickModifyInformation(){userManagement_page.modifyInformation.click();}

    public void clickMobilePhonNo(){
        userManagement_page.mobilePhoneNo.clear();
        userManagement_page.mobilePhoneNo.sendKeys(code);}

    public void clickNext(){userManagement_page.clickNext.click();}

    public void clickSumbits(){userManagement_page.sumbits.click();}

    public void clickCodeNext(){userManagement_page.codeNext.click();}

}
