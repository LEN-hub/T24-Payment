package com.glbank.com.sg.bdd.glue.enterpriseNetSilver;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.eStatement_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import java.util.List;
import java.util.Map;

public class eStatement_glue {
    @ManagedPages
    public Pages pages;

    @Steps
    private eStatement_step estatement_step;
    private BDDUtil bddUtil;

    @When("^I click My Downloads Btn$")
    public void iClickMyDownloadsBtn() {
        estatement_step.clickDownloadsBtn();
    }

    @When("^I click View eStatements Btn$")
    public void iClickViewEStatementsBtn() {
        estatement_step.clickViewEStatementsBtn();
    }

    @Then("^I should direct to the eStatements Overview page$")
    public void iShouldDirectToTheEStatementsOverviewPage() {
        estatement_step.eStatementTitle();
    }

    @When("^I click select box$")
    public void iClickSelectBox(DataTable select) {
        estatement_step.clickSelectBox();
        bddUtil.sleep(1);
//        estatement_step.selectData();
//        利用Table的形式灵活传参。
        List<Map<String, String>> selectData = select.asMaps(String.class,String.class);
        estatement_step.selectData(selectData.get(0).get("select"));
    }

    @And("^I click search button$")
    public void iClickSearchButton() {
        estatement_step.clickSearchBtn();
    }

    @Then("^I should see Account List$")
    public void iShouldSeeAccountList() {
        estatement_step.seeViewLabel();
    }

    @When("^I click on the first data to download$")
    public void iClickOnTheFirstDataToDownload() {
        estatement_step.clickFirstData();
    }

    @When("^I see My Downloads List$")
    public void iSeeMyDownloadsList() {
        estatement_step.seeMyDownloadsList();
    }

    @When("^I click on the past data to download$")
    public void iClickOnThePastDataToDownload() {
        estatement_step.clickPastData();
        bddUtil.sleep(5);
    }

    @When("^I click View eAdvices Btn$")
    public void iClickViewEAdvicesBtn() {
        estatement_step.clickViewEAdvicesBtn();
    }

    @When("^I click select button on the View eAdvices page$")
    public void iClickSelectButtonOnTheViewEAdvicesPage() {
        estatement_step.clickSearchBtn();
    }

    @When("^I click first data to download on the view eAdvices page$")
    public void iClickFirstDataToDownloadOnTheViewEAdvicesPage() {
        estatement_step.clickDownLoadBtn();
        bddUtil.sleep(3);
    }

    @When("^Successful presentation of transaction history$")
    public void successfulPresentationOfTransactionHistory() {
        estatement_step.clickMyTransactions();
    }

    @When("^Successfully demonstrated Bank Announcement$")
    public void successfullyDemonstratedBankAnnouncement() {
        estatement_step.checkMyAlertsAndNotifications();
    }

    @When("^Templete can be downloaded normally$")
    public void templeteCanBeDownloadedNormally() {
        estatement_step.checkViewExports();
    }
}
