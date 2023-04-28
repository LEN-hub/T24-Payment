package com.glbank.com.sg.bdd.steps.supplyChains.systemManager;

import com.glbank.com.sg.bdd.pages.supplyChains.systemManager.logon_page;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class logon_step extends ScenarioSteps {
    private logon_page login_page;
    public String profileNum;


    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        login_page.openUrl(logonUrl);
    }

    @Step
    public void enter_username_into_box(String envName) {
        String userName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".username");
        login_page.enterUserName(userName);
    }

    @Step
    public void enter_password_into_box(String envName) {
        String userName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        login_page.enterPassWord(userName);
    }

    @Step
    public void enter_username_Iso_BackStage(String envName) {
        String userName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".username");
        login_page.enterUserNameIsoBackStage(userName);
    }

    @Step
    public void enter_password_Iso_BackStage(String envName) {
        String userName = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        login_page.enterPassWordIsoBackStage(userName);
    }

    @Step
    public void click_login_btn(){
        login_page.clickLogonBtn.click();
    }

    @Step
    public void click_ISOBackStage_Login(){
        login_page.IOSBackStage_LoginBtn.click();

    }

    @Step
    public void getClickSCFlink(){
        login_page.clickSCFlink.click();
    }


//    SIT
    @Step
    public void clickOnlineBank(){
        login_page.onlineBank.click();
    }

//    UAT
    @Step
    public void clickOnLineBankUat(){
        login_page.onlineBankUat.click();
    }

}
