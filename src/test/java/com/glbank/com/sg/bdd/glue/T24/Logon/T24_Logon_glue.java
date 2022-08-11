package com.glbank.com.sg.bdd.glue.T24.Logon;

import com.glbank.com.sg.bdd.steps.T24.Logon.T24_Logon_step;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class T24_Logon_glue {

    @Steps
    private T24_Logon_step logon_steps;
    public static String envTag;


    @Given("^Use \"([^\"]*)\" to log in to T24 SIT environment$")
    public void useToLogInToTSITEnvironment(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            logon_steps.open_url(envName);
            logon_steps.logonUserName(envName);
            logon_steps.logonPassword(envName);
            logon_steps.clickLogonBtn();
        }
    }
}
