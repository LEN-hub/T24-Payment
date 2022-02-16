package com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement;

import com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement.accountChange_page;
import com.hsbc.cmb.hk.dbb.pages.EnterpriseManagementDeskAccountManagement.userManagement_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.interactions.Actions;

public class userManagement_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private RandomPhoneNumber RandomPhoneNumber;

        private userManagement_page userManagement_page;
    public void selectEnterpriseManagementDesk() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userManagement_page.EnterpriseManagementDesk).perform();
    }

    public void clickAccountManagement(){userManagement_page.AccountManagement.click();}

    public void selectTheMenu() {
        Actions action = new Actions(getDriver());
        action.moveToElement(userManagement_page.theMenu).perform();
    }

    public void clickModifyInformation(){userManagement_page.modifyInformation.click();}


    public void clickMobilePhonNo(String Value){userManagement_page.mobilePhoneNo.sendKeys(Value);}

    public void clickNext(){userManagement_page.clickNext.click();}

    public void clicksumbits(){userManagement_page.sumbits.click();}

    public void clickcodeNext(){userManagement_page.codeNext.click();}

}
