package com.glbank.com.sg.bdd.glue.T24.Logon;

import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class T24_Logon_glue {

    @Steps
    private T24_Logon_step logon_steps;
    public static String envTag;
    private BDDUtil bddUtil;


    @Given("^to verify transaction in T24 using \"([^\"]*)\"$")
    public void T24AutomationLogin(String envName) {
        bddUtil.quitDriver();
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_steps.open_url(envName);
            logon_steps.logonUserName(envName);
            logon_steps.logonPassword(envName);
            logon_steps.clickLogonBtn();
        }
    }

    @Given("^Use \"([^\"]*)\" to log in to T24 environment$")
    public void useToLogInEnvironment(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_steps.open_url(envName);
            logon_steps.logonUserName(envName);
            logon_steps.logonPassword(envName);
            logon_steps.clickLogonBtn();
        }
    }
}
