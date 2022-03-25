package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.openAccount;

import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.openAccount.corporateManagementBusinessPlatform_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import net.thucydides.core.steps.ScenarioSteps;

public class corporateManagementBusinessPlatform_step extends ScenarioSteps {

    private corporateManagementBusinessPlatform_page corporateManagementBusinessPlatform_page;
    private BDDUtil bddUtil;


    public void openManagementPage(String url,String username,String password){
        corporateManagementBusinessPlatform_page.openUrl(url);
        corporateManagementBusinessPlatform_page.inputUserName.sendKeys(username);
        corporateManagementBusinessPlatform_page.inputPassWord.sendKeys(password);
        corporateManagementBusinessPlatform_page.clickLogin.click();
        bddUtil.sleep(2);
    }

    public void antiMoneyLaunderingException(){
        corporateManagementBusinessPlatform_page.clickTradingCenter.click();
        corporateManagementBusinessPlatform_page.clickExceptionHandling.click();
        corporateManagementBusinessPlatform_page.inputCustomerNo.sendKeys(FileUtils.LastReadFileInput3("OrganisationID"));
        corporateManagementBusinessPlatform_page.clickQuery.click();
        bddUtil.sleep(2);
        corporateManagementBusinessPlatform_page.clickHandling.click();
        bddUtil.scrollWindowToElement(corporateManagementBusinessPlatform_page.clickSubmit).click();
    }
}
