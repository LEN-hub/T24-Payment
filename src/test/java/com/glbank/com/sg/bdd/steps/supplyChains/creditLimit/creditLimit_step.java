package com.glbank.com.sg.bdd.steps.supplyChains.creditLimit;

import com.glbank.com.sg.bdd.pages.supplyChains.creditLimit.creditLimit_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.RandomPhoneNumber;
import net.thucydides.core.steps.ScenarioSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class creditLimit_step extends ScenarioSteps {
    private creditLimit_page creditLimit_page;
    private BDDUtil bddUtil;
    public static String envTag;
    String fileAddress = "E:\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\testData\\autopay\\test.jpg";

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
                bddUtil.clickByJS(actions.get(i));
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
        List<WebElementFacade> assignBtn = creditLimit_page.assignBtn;
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
                bddUtil.clickByJS(actions.get(i));
                break;
            }
        }
    }


    @Step
    public void openToSupplierPortal() {     //跳转供应商门户
        String Url = "http://119.8.173.195:8080/";
        creditLimit_page.openUrl(Url);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(20);
    }



    @Step
    public void loginEmailUrlTest(){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        System.out.println("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");
        //"+FileUtils.LastReadFileInput3("emailData")+");
    }


    @Step
    public void inputOtherData(String passWord,String CompanyID) {
        creditLimit_page.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        creditLimit_page.GLDBEmailPassword.sendKeys(passWord);
        creditLimit_page.enterCompanyId.sendKeys(CompanyID);
        creditLimit_page.sendCodeBtn.click();
//        bddUtil.switchToNewWindow();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        creditLimit_page.advancedButton.click();
        creditLimit_page.enterEmailLink.click();
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(1);
        creditLimit_page.thirdEmail.click();
        String Vcode = creditLimit_page.emailVerificationCode.getText();
        bddUtil.switchToWindows();
        creditLimit_page.inputSendCode.sendKeys(Vcode);
        creditLimit_page.GLDBEmailLoginBtn.click();
//        creditLimit_page.clickRefreshBtn.click();
//        bddUtil.sleep(1);
//        creditLimit_page.thirdEmail.click();
//        String Vcode = creditLimit_page.emailVerificationCode.getText();
        bddUtil.sleep(10);
    }

    @Step
    public void clickPendingSignatureBtn(){
        creditLimit_page.pendingSignatureBtn.click();
    }

    @Step
    public void clickConfirmBtn(){
        creditLimit_page.confirmBtn.click();
    }

    @Step
    public void clickEmail(){
        bddUtil.switchToNewWindow();
        bddUtil.sleep(2);//应该留20S
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(4);
        creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(2);
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
        creditLimit_page.inputToken.sendKeys(emailToken);
        creditLimit_page.plainText.click();//故意报错
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);

    }

    @Step
    public void toSign(){
        bddUtil.scrollWindowToElement(creditLimit_page.signHere).click();
        //div[@class='upload-demo']//div//input
        creditLimit_page.upLoadImg.sendKeys(fileAddress);
        bddUtil.sleep(10);

    }

    @Step
    public void clickRefreshBtn(){
        creditLimit_page.refreshListBtn.click();
    }

    @Step
    public void clickFirstEmail(){
        creditLimit_page.firstEmail.click();
    }

    @Step
    public void storeToken(){
        creditLimit_page.firstEmail.click();
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(creditLimit_page.token);
        String token = creditLimit_page.token.getText();
        bddUtil.sleep(1);
        bddUtil.scrollWindowToElement(creditLimit_page.secondEmail);
        creditLimit_page.secondEmail.click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.switchToNewWindow();
        creditLimit_page.inputToken.sendKeys(token);

    }

    public void changeRating(){
        bddUtil.scrollWindowToElement(creditLimit_page.underWritingMode);
        creditLimit_page.rating.click();
        List<WebElementFacade> roles = creditLimit_page.resultList;
        for (int i = 0; i <roles.size() ; i++) {
            System.out.println(roles.get(i).getText());
            if (roles.get(i).getText().equals("BB")){
                roles.get(i).click();
                break;
            }
        }
    }
}
