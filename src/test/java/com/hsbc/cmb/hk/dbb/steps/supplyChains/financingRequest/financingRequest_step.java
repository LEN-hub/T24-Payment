package com.hsbc.cmb.hk.dbb.steps.supplyChains.financingRequest;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.financingRequest.financingRequest_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class financingRequest_step extends ScenarioSteps {

    private financingRequest_page financingRequest_page;
    private BDDUtil bddUtil;

    @Step
    public void openGLDBLoginPage(String envName){
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        financingRequest_page.openUrl(logonUrl);
    }
    public void enterLoginDateToBox(String email,String password,String companyId,String code){
        financingRequest_page.enterEmailToBox.sendKeys(email);
        financingRequest_page.enterPasswordToBox.sendKeys(password);
        financingRequest_page.enterCompanyIdToBox.sendKeys(companyId);
        financingRequest_page.enterCodeToBox.sendKeys(code);
        financingRequest_page.clickLogin.click();
    }
    public void clickRequestFinancing(){
        financingRequest_page.clickRequestFinancing.click();
    }
    public void uploadRequestFinancing(){
        financingRequest_page.clickUpload.click();
        financingRequest_page.clickOfUploadFile.click();
    }
}
