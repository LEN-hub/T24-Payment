package com.glbank.com.sg.bdd.steps.supplyChains.creditLimit;

import com.glbank.com.sg.bdd.pages.supplyChains.creditLimit.creditLimit_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.RandomPhoneNumber;
import net.thucydides.core.steps.ScenarioSteps;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class creditLimit_step extends ScenarioSteps {
    private creditLimit_page creditLimit_page;
    private BDDUtil bddUtil;
    public static String envTag;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/BR.jpg";
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
//                assignBtn.get(i).click();
                bddUtil.clickByJS(assignBtn.get(i));
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
    public void updateLimit(){
        bddUtil.find(By.xpath("//label[@for='limitType']"));
        bddUtil.sleep(1);
        creditLimit_page.updateLimit.clear();
        creditLimit_page.updateLimit.sendKeys("2500000");
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
        bddUtil.sleep(2);
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals(FileUtils.LastReadFileInput3("buyer"))){
                getDriver().findElements(By.xpath("//table[@class='fixed-right-table']//td[@data-key='f31h3cr2']//span[contains(text(),'Proceed')]")).get(i).click();
//                bddUtil.clickByJS(actions.get(i));
//                actions.get(i).click();
                bddUtil.sleep(2);
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
        bddUtil.sleep(3);
        List<WebElementFacade> roles = creditLimit_page.roleList;
        List<WebElementFacade> actions = creditLimit_page.actionList;
        for (int i = 0; i <roles.size() ; i++) {
            if (roles.get(i).getText().equals(FileUtils.LastReadFileInput3("companyData"))){
                getDriver().findElements(By.xpath("//div[@class='lowcode-table-fixed-right table-shadow']//span[@data-key='f3cahm5l']")).get(i).click();
//                bddUtil.clickByJS(actions.get(i));
                bddUtil.sleep(2);
                break;
            }
        }
    }


    @Step
    public void openToSupplierPortal() {     //跳转供应商门户
        String Url = "http://10.24.9.126:8080/";
        creditLimit_page.openUrl(Url);
        bddUtil.switchToNewWindow();
        bddUtil.sleep(8);
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
        bddUtil.sleep(30);
        creditLimit_page.GLDBEmailInput.sendKeys(FileUtils.LastReadFileInput3("emailData"));//("362DDf6O@MailTemp.top");
        creditLimit_page.GLDBEmailPassword.sendKeys(passWord);
        creditLimit_page.enterCompanyId.sendKeys(CompanyID);
        creditLimit_page.sendCodeBtn.click();
//        bddUtil.switchToNewWindow();
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/mailbox?name="+FileUtils.LastReadFileInput3("emailData").substring(0,8)+"\")");//name=362DDf60
        bddUtil.sleep(5);
        bddUtil.switchToWindows();
//        一次性邮箱需要验证。
        if (creditLimit_page.find(By.xpath("//div[@id='main-message']/h1")).isVisible()){
            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
            bddUtil.sleep(1);
            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        }
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
        bddUtil.sleep(40);//应该留40S
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(4);
        creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
//        creditLimit_page.inputToken.sendKeys(emailToken);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);

    }

    @Step
    public void toSign(){
        bddUtil.sleep(2);
        bddUtil.scrollWindowToElement(creditLimit_page.signHere).click();
        //div[@class='upload-demo']//div//input
//        creditLimit_page.upLoadImg.sendKeys(fileAddress);
        getDriver().findElement(By.xpath("//div[@class='upload-demo']//div//input")).sendKeys(fileAddress);
        bddUtil.sleep(2);
        getDriver().findElement(By.xpath("//span[text()='Confirm Digital Signature']")).click();
        bddUtil.sleep(5);

    }

    @Step
    public void ToggleSecondEmail(){
        String twoEmail = FileUtils.LastReadFileInput3("emailData").substring(0,8)+"2";
        bddUtil.switchToWindows();
        //        一次性邮箱需要验证。
        if (creditLimit_page.find(By.xpath("//div[@id='main-message']/h1")).isVisible()){
            getDriver().findElement(By.xpath("//div[@class='nav-wrapper']/button[3]")).click();
            bddUtil.sleep(1);
            getDriver().findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        }
        bddUtil.find(By.xpath("//input[@name='name']")).sendKeys(twoEmail);
        bddUtil.sleep(1);
        bddUtil.find(By.xpath("//button[@type='submit']")).click();
        bddUtil.sleep(5);
    }

    @Step
    public void signTheSecondBR(){
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(4);
        creditLimit_page.agreement.get(0).click();
        bddUtil.sleep(1);
        creditLimit_page.plainText.click();
        creditLimit_page.tokenLink.click();
        bddUtil.sleep(3);
        bddUtil.switchToWindows();
        bddUtil.switchToWindows();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        bddUtil.sleep(5);
        creditLimit_page.clickRefreshBtn.click();
        creditLimit_page.otpToken.click();
        bddUtil.sleep(1);
        String emailToken = creditLimit_page.emailToken.getText();
        bddUtil.sleep(1);
//        creditLimit_page.agreement.get(0).click();
        bddUtil.switchToWindows();
        bddUtil.sleep(2);
//        creditLimit_page.inputToken.sendKeys(emailToken);
//        bddUtil.scrollWindowToElement(creditLimit_page.inputToken).sendKeys(emailToken);
        getDriver().findElement(By.xpath("//div[@class='Verificationode_BoxChildIptChild']/div/form/input")).sendKeys(emailToken);
//        creditLimit_page.otpToken.click();
        bddUtil.sleep(5);
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
