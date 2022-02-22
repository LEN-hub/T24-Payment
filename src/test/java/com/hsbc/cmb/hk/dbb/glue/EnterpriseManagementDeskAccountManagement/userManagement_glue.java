package com.hsbc.cmb.hk.dbb.glue.EnterpriseManagementDeskAccountManagement;


import com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement.accountChange_steps;
import com.hsbc.cmb.hk.dbb.steps.EnterpriseManagementDeskAccountManagement.userManagement_steps;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.RandomPhoneNumber;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class userManagement_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private userManagement_steps  userManagement_steps;
    private BDDUtil bddUtil;



    @When("^I click on the Enterprise Administration Desk as well as user administration$")
    public void iClickOnTheEnterpriseAdministrationDeskAsWellAsUserAdministration() {
        userManagement_steps.clickEnterpriseManagementDesk();
        userManagement_steps.clickAccountManagements();

    }

    @When("^I click modify info menu$")
    public void iClickModifyInfoMenu() {
        userManagement_steps.selectTheMenus();
        userManagement_steps.clickModifyInformation();
        userManagement_steps.clickMobilePHONNO();
        userManagement_steps.clickNext();
        userManagement_steps.clickSumbits();
        userManagement_steps.clickCodeNext();




    }
}




