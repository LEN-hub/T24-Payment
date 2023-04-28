package com.glbank.com.sg.bdd.glue.supplyChains.systemManager;

import com.glbank.com.sg.bdd.steps.supplyChains.systemManager.logon_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class logon_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private logon_step login_uso_step;
    public static String envTag;
    private BDDUtil bddUtil;

    @Given("^logon \"([^\"]*)\" on tube by inputting system$")
    public void logon_onboarding_custom_portal(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            login_uso_step.open_the_first_dbb_logon_page(envName);
            bddUtil.sleep(5);
            login_uso_step.enter_username_into_box(envName);
            login_uso_step.enter_password_into_box(envName);
            login_uso_step.click_login_btn();
            login_uso_step.getClickSCFlink();
            bddUtil.switchToNewWindow();
        }
    }

    @Given("^logon \"([^\"]*)\" on tube by inputting system online bank$")
    public void logon_onboarding_custom_portalOnlineBank(String envName) {
        envTag = envName;
        if (!envName.isEmpty()) {
            login_uso_step.open_the_first_dbb_logon_page(envName);
            login_uso_step.enter_username_into_box(envName);
            login_uso_step.enter_password_into_box(envName);
            login_uso_step.click_login_btn();
            login_uso_step.clickOnLineBankUat();
//            login_uso_step.clickOnlineBank();
            bddUtil.switchToNewWindow();
        }
    }

    @When("^I close driver$")
    public void iCloseDriver() {
        bddUtil.quitDriver();
    }

    @When("^logon \"([^\"]*)\" on ISO$")
    public void logonOnISO(String envName) throws Throwable {
        envTag = envName;
        if (!envName.isEmpty()) {
            login_uso_step.open_the_first_dbb_logon_page(envName);
            bddUtil.sleep(5);
            login_uso_step.enter_username_into_box(envName);
            login_uso_step.enter_password_into_box(envName);
            login_uso_step.click_login_btn();
            bddUtil.sleep(5);
        }
    }

    @When("^logon \"([^\"]*)\" on ISOBackStage$")
    public void logonOnISOBackStage(String envName) throws Throwable {
        envTag = envName;
        if (!envName.isEmpty()) {
            login_uso_step.open_the_first_dbb_logon_page(envName);
            bddUtil.sleep(5);
            login_uso_step.enter_username_Iso_BackStage(envName);
            login_uso_step.enter_password_Iso_BackStage(envName);
            login_uso_step.click_ISOBackStage_Login();
            bddUtil.sleep(5);
        }
    }
}
