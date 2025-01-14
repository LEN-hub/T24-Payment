package com.glbank.com.sg.bdd.steps.enterpriseNetSilver.CBSOnline;

import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.CBSOnline.logon_page;

public class logon_step extends ScenarioSteps {
    private logon_page loginPage;
    private BDDUtil bddUtil;

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        loginPage.openUrl(logonUrl);
    }

    @Step
    public void enter_Organisation_ID(String codebox){
        loginPage.userid.sendKeys("200007");
        loginPage.loginid.sendKeys("0003@qq.com");
        loginPage.password.sendKeys("Zx123456.");
        loginPage.confirmBtn.click();
        loginPage.clickNextBtn.click();
        loginPage.codebox.sendKeys(codebox);
    }
}
