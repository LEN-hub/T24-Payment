package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver.openAccount;

import com.hsbc.cmb.hk.dbb.WebRunner;
import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.openAccount.corporateManagementBusinessPlatform_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.FileUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

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
