package com.hsbc.cmb.hk.dbb.steps.RPA;
import com.hsbc.cmb.hk.dbb.pages.BundledPayments.payments_page;
import com.hsbc.cmb.hk.dbb.pages.ProductSettings.product_page;
import com.hsbc.cmb.hk.dbb.pages.RPA.rpa_page;
import com.hsbc.cmb.hk.dbb.utils.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.hsbc.cmb.hk.dbb.utils.FileUtils.FileInput3;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class rpa_steps extends ScenarioSteps {
    private BDDUtil bddUtil;
    private rpa_page rpaPage;

    public static String content = JRandomNameTool.getStringRandom(6);

    @Step
    public void open_the_first_dbb_logon_page(String envName) {
        String logonUrl = CommonUtil.getEnvironmentSpecificConfiguration("environments." + envName + ".webdriver.base.url");
        rpaPage.openUrl(logonUrl);
    }


    @Step
    public void clickCustomers(){rpaPage.Customers.click();}

    @Step
    public void clickContractManagement(){rpaPage.ContractManagement.click();}

    @Step
    public void clickCompanyName(){rpaPage.CompanyName.sendKeys(FileUtils.LastReadFileInput3("companyData"));}

    @Step
    public void clickCompanyNameClickReset(){rpaPage.CompanyNameClickReset.click();}

    @Step
    public void clickUpload(){rpaPage.upload.click();}

    @Step
    public void clickBrowse(){
        rpaPage.browse.click();
        bddUtil.sleep(2);
        bddUtil.fileUpload();
        bddUtil.sleep(5);
    }
    //上传图片

    @Step
    public void clickData(){
        rpaPage.icondata.click();
        rpaPage.Data.click();}

    @Step
    public void clickConfirms(){rpaPage.confirms.click();}


}

