package com.glbank.com.sg.bdd.glue.supplyChains.systemManager;

import com.glbank.com.sg.bdd.steps.supplyChains.systemManager.createAdminUsers_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;


public class createAdminUser_glue {


    @ManagedPages
    public Pages pages;
    @Steps
    private createAdminUsers_step createAdminUsers_step;
    private BDDUtil bddUtil;

    @When("^login successfully and click the SCF link to createAdminUser$")
    public void loginSuccessfullyAndClickTheSCFLinkToCreteAdminUser() {
        createAdminUsers_step.create_Admin_User();
    }

    @And("^createAdminUser Fill in information randomUsername")
    public void createAdminUserFillInInformation() {
            createAdminUsers_step.getUsername();
            createAdminUsers_step.getEmail();
            createAdminUsers_step.getUserNo();
        }
    @Then("^update AdminUser PermissionMenu$")
    public void updateAdminUserPermissionMenu() {
        createAdminUsers_step.clickConfirm_Create();
        createAdminUsers_step.clickAuthoritySetting();
        createAdminUsers_step.clickPermissionMenu();
//        createAdminUsers_step.clickImportMean();
        createAdminUsers_step.clickConfirm_Update();
        bddUtil.sleep(20);

    }


    @When("^I should see home after login$")
    public void iShouldSeeHomeAfterLogin() {
        bddUtil.sleep(20);
    }
}
