package com.glbank.com.sg.bdd.glue.enterpriseNetSilver.openAccount;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.openAccount.corporateManagementBusinessPlatform_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class corporateManagementBusinessPlatform_glue {

    @Steps
    private corporateManagementBusinessPlatform_step corporateManagementBusinessPlatform_step;
    private BDDUtil bddUtil;

    @When("^I login Corporate management business platform$")
    public void iLoginCorporateManagementBusinessPlatform(DataTable username){
        List<Map<String, String>> maps = username.asMaps(String.class, String.class);
        corporateManagementBusinessPlatform_step.openManagementPage(maps.get(0).get("url"),maps.get(0).get("username"),maps.get(0).get("password"));
    }

    @Then("^Anti money laundering exception handle$")
    public void antiMoneyLaunderingExceptionHandle(){
        corporateManagementBusinessPlatform_step.antiMoneyLaunderingException();
        bddUtil.sleep(5);
    }
}
