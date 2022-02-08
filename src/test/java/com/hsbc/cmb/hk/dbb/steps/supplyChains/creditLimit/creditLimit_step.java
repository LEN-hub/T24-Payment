package com.hsbc.cmb.hk.dbb.steps.supplyChains.creditLimit;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.creditLimit.creditLimit_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.FileUtils;
import net.thucydides.core.steps.ScenarioSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

public class creditLimit_step extends ScenarioSteps {
    private creditLimit_page creditLimit_page;
    private BDDUtil bddUtil;
    public static String envTag;


    @Step
    public void clickUnderWritingAndApproval(){
        creditLimit_page.underWriting.click();
        bddUtil.sleep(1);
        creditLimit_page.underWritingApproval.click();
    }

    @Step
    public void seeUnderWritingAndApprovalText(){
        assertEquals("Underwriting Approval",creditLimit_page.underWritingApprovalText.getText());
    }

    @Step
    public void clickBuyerAssignBtn(){
        List<WebElementFacade> role = creditLimit_page.role;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i <8 ; i++) {
            if (role.get(i).getText().equals("Buyer")){
                assignBtn.get(i).click();
                break;
            }

        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickBuyerTestDataAssignBtn(){
        List<WebElementFacade> data = creditLimit_page.applicant;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i < data.size(); i++) {
            if (FileUtils.LastReadFileInput3("buyer").equals(data.get(i).getText())){
                bddUtil.scrollWindowToElement(data.get(i)).click();
                assignBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
        /*for (int i = 0; i <8 ; i++) {
            if (data.get(i).getText().equals("test06")){
                assignBtn.get(i).click();
                break;
            }

        }*/
    }

    @Step
    public void clickTopAssignBtn(){
        bddUtil.sleep(2);
        creditLimit_page.assignToMeTopBtn.click();
    }

    @Step
    public void seeProceedBtn(){
        bddUtil.sleep(2);
        creditLimit_page.proceedBtn.click();
    }

    @Step
    public void clickCompletedBtn(){
        creditLimit_page.completed.click();
        bddUtil.sleep(1);
    }

    @Step
    public void clickResultBtn(){
        creditLimit_page.result.click();
    }

    @Step
    public void clickApproveBtn(){
        List<WebElementFacade> roles = creditLimit_page.resultList;
        for (int i = 0; i <roles.size() ; i++) {
            System.out.println(roles.get(i).getText());
            if (roles.get(i).getText().equals("Approve")){
                roles.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
        creditLimit_page.SubmitBtn.click();
        bddUtil.sleep(2);
//        bddUtil.quitDriver();
    }

    @Step
    public void clickUnderWritingListBtn(){
        creditLimit_page.choseUnderWriting.click();
        bddUtil.sleep(2);
        creditLimit_page.underwritingListBtn.click();
        bddUtil.sleep(2);
    }

    @Step
    public void clickProceedBtn(){
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals("Buyer")){
                System.out.println(roles.get(i).getText());
                System.out.println(actions.get(i).getText());
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", actions.get(i));
//                actions.get(i).click();
                break;
            }
        }
    }

    @Step
    public void clickSupplierAssignBtn(){
        List<WebElementFacade> role = creditLimit_page.role;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i <8 ; i++) {
            if (role.get(i).getText().equals("Supplier")){
                assignBtn.get(i).click();
                break;
            }

        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickSupplierTestDataAssignBtn(){
        List<WebElementFacade> data = creditLimit_page.applicant;
        List<WebElementFacade> assignBtn = creditLimit_page.assignToMeBtn;
        for (int i = 0; i < data.size(); i++) {
            if (FileUtils.LastReadFileInput3("companyData").equals(data.get(i).getText())){
                bddUtil.scrollWindowToElement(data.get(i)).click();
                assignBtn.get(i).click();
                break;
            }
        }
        bddUtil.sleep(1);
    }

    @Step
    public void clickSupplierProceedBtn(){
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals("Supplier")){
                System.out.println(roles.get(i).getText());
                System.out.println(actions.get(i).getText());
                JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
                webdriver.executeScript("arguments[0].click();", actions.get(i));
//                actions.get(i).click();
                break;
            }
        }
    }
}
