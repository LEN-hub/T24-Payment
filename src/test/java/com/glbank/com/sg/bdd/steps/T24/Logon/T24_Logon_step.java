package com.glbank.com.sg.bdd.steps.T24.Logon;

import com.glbank.com.sg.bdd.pages.T24.Logon.T24_Logon_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.CommonUtil;
import net.thucydides.core.steps.ScenarioSteps;

public class T24_Logon_step extends ScenarioSteps {

    private T24_Logon_page logonPage;
    private BDDUtil bddUtil;
    public static String logonUrl;
    public static String username;
    public static String password;

    public void open_url (String envName){
        logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        logonPage.openUrl(logonUrl);
    }

    public String logonUserName (String envName){
        username = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".username");
        logonPage.enter_User_Name(username);
        return username;
    }

    public String logonPassword (String envName){
        password = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".password");
        logonPage.enter_Password(password);
        return password;
    }

    public void clickLogonBtn(){
        logonPage.clickLogonBtn.click();
    }
}
