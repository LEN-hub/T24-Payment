package com.glbank.com.sg.bdd.glue.supplyChains.creditFile;

import com.glbank.com.sg.bdd.steps.supplyChains.creditFile.createBuyerCreditFile_step;
import com.glbank.com.sg.bdd.steps.supplyChains.tubeByInputting.creatCustomers_step;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

public class createBuyerCreditFile_glue {

    @ManagedPages
    public Pages pages;
    @Steps
    private creatCustomers_step customers_step;
    @Steps
    private createBuyerCreditFile_step createBuyerCreditFile_step;
    private BDDUtil bddUtil;
    public String buyer = FileUtils.LastReadFileInput3("buyer");


    @When("^login successfully and click the SCF link to createBuyerCreditFile$")
    public void loginSuccessfullyAndClickTheSCFLinkToCreateBuyerCreditFile(){
        customers_step.getClickCustomersMenu();
        createBuyerCreditFile_step.clickBuyerCreditProfileList();//进入买方信用档案列表
        createBuyerCreditFile_step.clickCreateNewUnderwriting();
        createBuyerCreditFile_step.createNewUnderwriting(buyer);//创建买方信用档案
        bddUtil.sleep(2);
    }

    @And("^edit Buyer Credit Profile$")
    public void editBuyerCreditProfile(){
        createBuyerCreditFile_step.editBuyerCreditProfile(buyer);  //编辑买方信用档案
        createBuyerCreditFile_step.displayedCreateBuyerCreditProfilePage(); //判断是否进入买方信用档案编辑界面
        createBuyerCreditFile_step.toEditBuyerCreditProfile(); //编辑买方信用档案并保存
        bddUtil.sleep(2);
    }

    @Then("^submit Buyer Credit Profile$")
    public void submitBuyerCreditProfile(){
        createBuyerCreditFile_step.submitBuyerProfileList(buyer); //提交
    }
}
