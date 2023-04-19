package com.glbank.com.sg.bdd.steps.VaPatch;

import com.glbank.com.sg.bdd.pages.VaPatch.VaPatch_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import com.glbank.com.sg.bdd.utils.FileUtils;
import com.glbank.com.sg.bdd.utils.JRandomNameTool;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class VaPatch_step extends ScenarioSteps {
    private VaPatch_page vaPatch_page;
    private BDDUtil bddUtil;
    public static String envTag;
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/Excel/测试合同123.docx";

//    判断是否进入CNP系统
    @Step
    public void clickCNPSystem() throws Exception{
        vaPatch_page.CNPSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String CNPTitle = vaPatch_page.CNPTitle.getText();
        bddUtil.sleep(5);
        if (CNPTitle.equals("Favorite")){
            System.out.println("进入CNP成功");
        }else {
            throw new Exception("进入CNP失败");
        }
    }

//    判断是否进入CPS系统
    @Step
    public void clickCPSSystem() throws Exception{
        vaPatch_page.CPSSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
//      判断你是否出现链接不是私密连接
        if (getDriver().findElement(By.xpath("//body[@id='body']//button[@id='details-button']")).isDisplayed()){
            getDriver().findElement(By.xpath("//body[@id='body']//button[@id='details-button']")).click();
            bddUtil.sleep(2);
            getDriver().findElement(By.xpath("//body[@id='body']//a[@id='proceed-link']")).click();
            bddUtil.sleep(5);
        }
        String CPSTitle = vaPatch_page.CPSTitle.getText();
        bddUtil.sleep(5);
        if (CPSTitle.equals("CreditLens™")){
            System.out.println("进入CPS成功");
        }else {
            throw new Exception("进入CNP失败");
        }
    }

//  判断是否进入DFT系统
    public void clickDFTSystem() throws Exception {
        vaPatch_page.DFTSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String DFTTitle = vaPatch_page.DFTTitle.getText();
        bddUtil.sleep(5);
        if (DFTTitle.equals("GLDB DFT")){
            System.out.println("进入DFT成功");
        }else {
            throw new Exception("进入DFT失败");
        }
    }

    //  判断是否进入EBK系统
    public void clickEBKSystem() throws Exception {
        vaPatch_page.EBKSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String EBKTitle = vaPatch_page.EBKTitle.getText();
        bddUtil.sleep(5);
        if (EBKTitle.equals("Welcome message")){
            System.out.println("进入EBK成功");
        }else {
            throw new Exception("进入EBK失败");
        }
    }

    //  判断是否进入ESC系统
    public void clickESCSystem() throws Exception {
        vaPatch_page.ESCSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String ESCTitle = vaPatch_page.ESCTitle.getText();
        bddUtil.sleep(5);
        if (ESCTitle.equals("Contract Management")){
            System.out.println("进入ESC成功");
        }else {
            throw new Exception("进入ESC失败");
        }
    }

    //  判断是否进入EST系统
    public void clickESTSystem() throws Exception {
        vaPatch_page.ESTSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String ESTTitle = vaPatch_page.ESTTitle.getText();
        bddUtil.sleep(5);
        if (ESTTitle.equals("Favorite")){
            System.out.println("进入EST成功");
        }else {
            throw new Exception("进入EST失败");
        }
    }

    //  判断是否进入IMS系统
    public void clickIMSSystem() throws Exception {
        vaPatch_page.IMSSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String IMSTitle = vaPatch_page.IMSTitle.getText();
        bddUtil.sleep(5);
        if (IMSTitle.equals("Image Management System")){
            System.out.println("进入IMS成功");
        }else {
            throw new Exception("进入IMS失败");
        }
    }

    //  判断是否进入SCF系统
    public void clickSCFSystem() throws Exception {
        vaPatch_page.SCFSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String SCFTitle = vaPatch_page.SCFTitle.getText();
        bddUtil.sleep(5);
        if (SCFTitle.equals("Home")){
            System.out.println("进入SCF成功");
        }else {
            throw new Exception("进入SCF失败");
        }
    }

    //  判断是否进入SCF-JOB系统
    public void clickSCF_JOBSystem() throws Exception {
        vaPatch_page.SCFJOBSystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String SCFJOTitle = vaPatch_page.SCFJOBTitle.getText();
        bddUtil.sleep(5);
        if (SCFJOTitle.equals("Scheduling Center")){
            System.out.println("进入SCF-JOB成功");
        }else {
            throw new Exception("进入SCF-JOB失败");
        }
    }

    //  判断是否进入SmartBI系统
    public void clickSmartBISystem() throws Exception {
        vaPatch_page.SmartBISystem.click();
        bddUtil.sleep(5);
        bddUtil.switchToNewWindow();
        String SmartBITitle = vaPatch_page.SmartBITitle.getText();
        bddUtil.sleep(5);
        if (SmartBITitle.equals("Homepage")){
            System.out.println("进入SmartBI成功");
        }else {
            throw new Exception("进入SmartBI失败");
        }
    }

    //  判断ISO是否登录成功
    public void checkISO() throws Exception {
        bddUtil.sleep(5);
        String ISOTitle = vaPatch_page.ISOTitle.getText();
        bddUtil.sleep(3);
        if (ISOTitle.equals("Logout")){
            System.out.println("进入ISO成功");
        }else {
            throw new Exception("进入ISO失败");
        }
    }

    //  判断ISO是否退出成功
    public void checkISOLogOUT() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ISOTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.continueBtn.click();
        bddUtil.sleep(3);
        String loginTitle = vaPatch_page.loginTitle.getText();
        bddUtil.sleep(3);
        if (loginTitle.equals("Login to USO Server")){
            System.out.println("退出ISO成功");
        }else {
            throw new Exception("退出ISO失败");
        }
    }

//    进入ESC系统 首页
    public void enterAllFilesPage(){
        vaPatch_page.ESCSystem.click();
        bddUtil.sleep(4);
        bddUtil.switchToNewWindow();
    }

    //  判断是否进入ESC系统首页
    public void CheckESCSystem() throws Exception {
        bddUtil.sleep(5);
        String ESCTitle = vaPatch_page.ESCTitle.getText();
        bddUtil.sleep(5);
        if (ESCTitle.equals("Contract Management")){
            System.out.println("进入ESC成功");
        }else {
            throw new Exception("进入ESC失败");
        }
    }

    //  判断是否进入ESC系统ToBeSigned页面
    public void CheckESC_ToBeSigned() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
        bddUtil.sleep(2);
        String ToBeSignedTitle = vaPatch_page.ToBeSignedTitle.get(0).getText();
        bddUtil.sleep(5);
        if (ToBeSignedTitle.equals("To be signed")){
            System.out.println("进入To be signed成功");
        }else {
            throw new Exception("进入To be signed失败");
        }
    }

    //  判断是否进入ESC系统Signing In Progress页面
    public void CheckESC_SigningInProgress() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
        bddUtil.sleep(2);
        String SigningInProgressTitle = vaPatch_page.SigningInProgressTitle.get(0).getText();
        bddUtil.sleep(5);
        if (SigningInProgressTitle.equals("Signing in progress")){
            System.out.println("进入Signing in progress成功");
        }else {
            throw new Exception("进入Signing in progress失败");
        }
    }

    //  判断是否进入ESC系统Signing Completed页面
    public void CheckESC_SigningCompleted() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningCompletedBtn.click();
        bddUtil.sleep(2);
        String SigningCompletedTitle = vaPatch_page.SigningCompletedTitle.get(0).getText();
        bddUtil.sleep(5);
        if (SigningCompletedTitle.equals("Signing completed")){
            System.out.println("进入Signing completed成功");
        }else {
            throw new Exception("进入Signing completed失败");
        }
    }

    //  判断是否进入ESC系统Signing Failed页面
    public void CheckESC_SigningFailed() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningFailedBtn.click();
        bddUtil.sleep(2);
        String SigningFailedTitle = vaPatch_page.SigningFailedTitle.get(0).getText();
        bddUtil.sleep(5);
        if (SigningFailedTitle.equals("Signing failed")){
            System.out.println("进入Signing failed成功");
        }else {
            throw new Exception("进入Signing failed失败");
        }
    }

    //  判断是否进入ESC系统Template Management页面
    public void CheckESC_TemplateManagement() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(2);
        String TemplateManagementTitle = vaPatch_page.TemplateManagementTitle.getText();
        bddUtil.sleep(5);
        if (TemplateManagementTitle.equals("Create template")){
            System.out.println("进入Create template成功");
        }else {
            throw new Exception("进入Create template失败");
        }
    }

    //  检查All Files 页面see按钮
    public void CheckESC_AllFilesSeeBtn() throws Exception {
        bddUtil.sleep(5);
//        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='See']")).get(0));
        bddUtil.sleep(2);
        String seeBtnPageTitleText = vaPatch_page.SeeBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (seeBtnPageTitleText.equals("View details")){
            System.out.println("进入See 页面成功");
        }else {
            throw new Exception("进入See 页面失败");
        }
    }

    //  检查All Files 页面Download按钮
    public void CheckESC_AllFilesDownloadBtn() throws Exception {
        bddUtil.sleep(5);
//        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='Download']")).get(0));
        bddUtil.sleep(2);
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查All Files 页面search按钮
    public void CheckESC_AllFilesSearchBtn() throws Exception {
        bddUtil.sleep(5);
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        String contractID = vaPatch_page.contractIDTwo.getText();
        bddUtil.sleep(5);
        if (contractID.equals(contractIDText)){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    //  检查All Files 页面Reset按钮
    public void CheckESC_AllFilesResetBtn() throws Exception {
        bddUtil.sleep(5);
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.ResetBtn.click();
        bddUtil.sleep(2);
        String SecondContractID = vaPatch_page.SecondContractID.getText();
        bddUtil.sleep(5);
        if (SecondContractID.equals(contractIDText)){
            throw new Exception("Reset按钮出错");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //  检查All Files 页面batch Download按钮
    public void CheckESC_AllFilesBatchDownloadBtn() throws Exception {
        bddUtil.sleep(5);
//        选择前两个 进行下载
        vaPatch_page.checkbox.get(1).click();
        vaPatch_page.checkbox.get(2).click();
        vaPatch_page.BatchDownloadBtn.click();
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查ESC系统ToBeSigned页面See按钮
    public void CheckESC_ToBeSignedSeeBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
    //        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='See']")).get(0));
        bddUtil.sleep(2);
        String seeBtnPageTitleText = vaPatch_page.SeeBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (seeBtnPageTitleText.equals("View details")){
            System.out.println("进入See 页面成功");
        }else {
            throw new Exception("进入See 页面失败");
        }
    }

    //  检查To Be Signed 页面Download按钮
    public void CheckESC_ToBeSignedDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
//        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='Download']")).get(0));
        bddUtil.sleep(2);
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查To Be Sign 页面search按钮
    public void CheckESC_ToBeSignSearchBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        String contractID = vaPatch_page.contractIDTwo.getText();
        bddUtil.sleep(5);
        if (contractID.equals(contractIDText)){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    //  检查To Be Sign  页面Reset按钮
    public void CheckESC_ToBeSignResetBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.ResetBtn.click();
        bddUtil.sleep(2);
        String SecondContractID = vaPatch_page.SecondContractID.getText();
        bddUtil.sleep(5);
        if (SecondContractID.equals(contractIDText)){
            throw new Exception("Reset按钮出错");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //  检查To Be Sign 页面batch Download按钮
    public void CheckESC_ToBeSignBatchDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.ToBeSignedBtn.click();
//        选择前两个 进行下载
        vaPatch_page.checkbox.get(1).click();
        vaPatch_page.checkbox.get(2).click();
        vaPatch_page.BatchDownloadBtn.click();
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查ESC系统Signing In Progress页面See按钮
    public void CheckESC_SigningInProgressSeeBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
        //        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='See']")).get(0));
        bddUtil.sleep(2);
        String seeBtnPageTitleText = vaPatch_page.SeeBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (seeBtnPageTitleText.equals("View details")){
            System.out.println("进入See 页面成功");
        }else {
            throw new Exception("进入See 页面失败");
        }
    }

    //  检查Signing In Progress 页面Download按钮
    public void CheckESC_SigningInProgressDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
//        普通点击无效 使用JS点击。
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='Download']")).get(0));
        bddUtil.sleep(2);
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查Signing In Progress页面search按钮
    public void CheckESC_SigningInProgressSearchBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        String contractID = vaPatch_page.contractIDTwo.getText();
        bddUtil.sleep(5);
        if (contractID.equals(contractIDText)){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    //  检查Signing In Progress页面Reset按钮
    public void CheckESC_SigningInProgressResetBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.ResetBtn.click();
        bddUtil.sleep(2);
        String SecondContractID = vaPatch_page.SecondContractID.getText();
        bddUtil.sleep(5);
        if (SecondContractID.equals(contractIDText)){
            throw new Exception("Reset按钮出错");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //  检查Signing In Progress页面batch Download按钮
    public void CheckESC_SigningInProgressBatchDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningInProgressBtn.click();
//        选择前两个 进行下载
        bddUtil.sleep(3);
        vaPatch_page.checkbox.get(1).click();
        vaPatch_page.checkbox.get(2).click();
        vaPatch_page.BatchDownloadBtn.click();
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    @Step
    public void checkISOBackStage() throws Exception{
        String isoBackStageTitleText = vaPatch_page.ISOBackStageTitle.getText();
        bddUtil.sleep(2);
        if (isoBackStageTitleText.equals("Summary")){
            System.out.println("ISO后台登录成功");
        }else {
            throw new Exception("ISO后台登录失败");
        }
    }

    @Step
    public void logoutISOBackStage(){
        vaPatch_page.logoutBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.logoutBtnConfirm.click();
        bddUtil.sleep(2);
    }

    @Step
    public void checkISOLogoutTitle() throws Exception{
        String logoutTitleText = vaPatch_page.ISOLogoutTitle.getText();
        bddUtil.sleep(2);
        if (logoutTitleText.equals("Login Id")){
            System.out.println("成功退出IOS 后台");
        }else {
            throw new Exception("没有成功退出ISO 后台");
        }
    }

//    ISO后台新增用户
    @Step
    public void addUser(){
        vaPatch_page.userSegment.click();
        bddUtil.sleep(1);
        vaPatch_page.userTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.createUser.click();
        bddUtil.sleep(1);
        String userId= JRandomNameTool.getStringRandom(5);
        FileUtils.FileString4("ISO_AddUser",userId);
        vaPatch_page.UserId.sendKeys(userId);
        vaPatch_page.UserName.sendKeys(userId);
        bddUtil.sleep(1);
        vaPatch_page.saveBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.ResetPwd.click();
        vaPatch_page.NewPassword.sendKeys("Password1");
        vaPatch_page.ConfirmNewPassword.sendKeys("Password1");
        vaPatch_page.saveBtn.click();
        vaPatch_page.okBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.loginAccounts.click();
        vaPatch_page.editBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.ForceChangePwd.click();
        vaPatch_page.ForceChangeNoBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.saveBtn.click();
        bddUtil.sleep(2);
    }

//    校验新增用户是否成功UAT环境
    @Step
    public void checkNewUserUat() throws Exception{
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.26.9.74:8080/usoserver/\");");
        bddUtil.switchToWindows();
        vaPatch_page.userNameInputbox.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        vaPatch_page.passwordInputbox.sendKeys("Password1");
        vaPatch_page.clickLogonBtn.click();
        bddUtil.sleep(4);
        String ISOTitle = vaPatch_page.ISOTitle.getText();
        if (ISOTitle.equals("Logout")){
            System.out.println("登录成功");
        }else {
            throw new Exception("登录失败");
        }
    }

// 修改ISO用户权限
    @Step
    public void changeIsoUser(){
        vaPatch_page.userSegment.click();
        bddUtil.sleep(1);
        vaPatch_page.userTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.inputUserId.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        bddUtil.sleep(1);
        vaPatch_page.search.click();
        bddUtil.sleep(1);
        vaPatch_page.clickUserId.click();
        bddUtil.sleep(1);
        vaPatch_page.SAMLPage.click();
        vaPatch_page.editBtn.click();
        vaPatch_page.addBtn.click();
        vaPatch_page.SAMLServiceProvider.click();
        vaPatch_page.SCF_JOB.click();
        bddUtil.sleep(2);
        vaPatch_page.okBtn.click();
        vaPatch_page.saveBtn.click();
        bddUtil.sleep(2);
    }


//    检验UAT环境 ISO用户权限是否新增成功
    @Step
    public void checkChangeISOUserUat() throws Exception {
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.26.9.74:8080/usoserver/\");");
        bddUtil.switchToWindows();
        vaPatch_page.userNameInputbox.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        vaPatch_page.passwordInputbox.sendKeys("Password1");
        vaPatch_page.clickLogonBtn.click();
        bddUtil.sleep(3);
        String text = vaPatch_page.SCFJOBSystem.getText();
        if (text.equals("Supply Chain Finance-JOB")){
            System.out.println("权限修改成功");
        }else {
            throw new Exception("权限修改失败");
        }
    }

//    查找ISO用户
    @Step
    public void selectISOUser()throws Exception{
        vaPatch_page.userSegment.click();
        bddUtil.sleep(1);
        vaPatch_page.userTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.search.click();
        bddUtil.sleep(3);
        String selectTitleText = vaPatch_page.selectTitle.getText();
        if (selectTitleText.equals("Search User Result")){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
        vaPatch_page.inputUserId.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        bddUtil.sleep(1);
        vaPatch_page.search.click();
        bddUtil.sleep(3);
        if (selectTitleText.equals("Search User Result")){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    @Step
    public void DeleteISOUser(){
        vaPatch_page.userSegment.click();
        bddUtil.sleep(1);
        vaPatch_page.userTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.inputUserId.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        bddUtil.sleep(1);
        vaPatch_page.search.click();
        bddUtil.sleep(3);
        vaPatch_page.clickUserId.click();
        bddUtil.sleep(1);
        vaPatch_page.deleteBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.okBtn.click();
        bddUtil.sleep(3);
    }

    @Step
    public void checkDeleteISOUser()throws Exception{
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.26.9.74:8080/usoserver/\");");
        bddUtil.switchToWindows();
        vaPatch_page.userNameInputbox.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        vaPatch_page.passwordInputbox.sendKeys("Password1");
        vaPatch_page.clickLogonBtn.click();
        bddUtil.sleep(3);
        String loginFiledTitleText = vaPatch_page.loginFiledTitle.getText();
        if (loginFiledTitleText.equals("Login verification failed.")){
            System.out.println("删除数据成功");
        }else {
            throw new Exception("删除数据失败");
        }
    }

//    修改新密码为Password123
    @Step
    public void resetPassword(){
        vaPatch_page.userSegment.click();
        bddUtil.sleep(1);
        vaPatch_page.userTitle.click();
        bddUtil.sleep(1);
        vaPatch_page.inputUserId.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        bddUtil.sleep(1);
        vaPatch_page.search.click();
        bddUtil.sleep(3);
        vaPatch_page.clickUserId.click();
        bddUtil.sleep(2);
        vaPatch_page.ResetPwd.click();
        vaPatch_page.NewPassword.sendKeys("Password123");
        vaPatch_page.ConfirmNewPassword.sendKeys("Password123");
        vaPatch_page.saveBtn.click();
        bddUtil.sleep(3);
        vaPatch_page.okBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.loginAccounts.click();
        vaPatch_page.editBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.ForceChangePwd.click();
        vaPatch_page.ForceChangeNoBtn.click();
        bddUtil.sleep(1);
        vaPatch_page.saveBtn.click();
        bddUtil.sleep(2);
    }

//    校验新密码是否可以登录
    @Step
    public void checkNewPassword() throws Exception{
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"http://10.26.9.74:8080/usoserver/\");");
        bddUtil.switchToWindows();
        vaPatch_page.userNameInputbox.sendKeys(FileUtils.LastReadFileInput3("ISO_AddUser"));
        vaPatch_page.passwordInputbox.sendKeys("Password123");
        vaPatch_page.clickLogonBtn.click();
        bddUtil.sleep(3);
        String ISOTitle = vaPatch_page.ISOTitle.getText();
        if (ISOTitle.equals("Logout")){
            System.out.println("登录成功");
        }else {
            throw new Exception("登录失败");
        }
    }

//    SigningComplete页面的see按钮
    @Step
    public void checkSigningCompletedSeeBtn() throws Exception{
        vaPatch_page.SigningCompletedBtn.click();
        bddUtil.sleep(5);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='See']")).get(0));
        bddUtil.sleep(2);
        String seeBtnPageTitleText = vaPatch_page.SeeBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (seeBtnPageTitleText.equals("View details")){
            System.out.println("进入See 页面成功");
        }else {
            throw new Exception("进入See 页面失败");
        }
    }

    @Step
    public void checkSigningCompletedDownloadBtn() throws Exception{
        vaPatch_page.SigningCompletedBtn.click();
        bddUtil.sleep(5);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='Download']")).get(0));
        bddUtil.sleep(2);
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查SigningCompleted页面search按钮
    @Step
    public void CheckESC_SigningCompletedSearchBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningCompletedBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        String contractID = vaPatch_page.contractIDTwo.getText();
        bddUtil.sleep(5);
        if (contractID.equals(contractIDText)){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    //  检查SigningCompleted页面Reset按钮
    public void CheckESC_SigningCompletedResetBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningCompletedBtn.click();
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(5);
        vaPatch_page.ResetBtn.click();
        bddUtil.sleep(2);
        String SecondContractID = vaPatch_page.SecondContractID.getText();
        bddUtil.sleep(5);
        if (SecondContractID.equals(contractIDText)){
            throw new Exception("Reset按钮出错");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //  检查SigningCompleted页面batch Download按钮
    public void CheckESC_SigningCompletedBatchDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningCompletedBtn.click();
//        选择前两个 进行下载
        bddUtil.sleep(5);
        vaPatch_page.checkbox.get(1).click();
        vaPatch_page.checkbox.get(2).click();
        vaPatch_page.BatchDownloadBtn.click();
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //    SigningFailed页面的see按钮
    @Step
    public void checkSigningFailedSeeBtn() throws Exception{
        vaPatch_page.SigningFailedBtn.click();
        bddUtil.sleep(5);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='See']")).get(0));
        bddUtil.sleep(2);
        String seeBtnPageTitleText = vaPatch_page.SeeBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (seeBtnPageTitleText.equals("View details")){
            System.out.println("进入See 页面成功");
        }else {
            throw new Exception("进入See 页面失败");
        }
    }


//    SigningFailed 页面Download
    @Step
    public void checkSigningFailedDownloadBtn() throws Exception{
        vaPatch_page.SigningFailedBtn.click();
        bddUtil.sleep(5);
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("arguments[0].click();", getDriver().findElements(By.xpath("//a[text()='Download']")).get(0));
        bddUtil.sleep(2);
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

    //  检查Signing Failed页面search按钮
    @Step
    public void CheckESC_SigningFailedSearchBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningFailedBtn.click();
        bddUtil.sleep(4);
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(2);
        String contractID = vaPatch_page.contractIDTwo.getText();
        bddUtil.sleep(5);
        if (contractID.equals(contractIDText)){
            System.out.println("查询成功");
        }else {
            throw new Exception("查询失败");
        }
    }

    //  检查SigningFailed页面Reset按钮
    public void CheckESC_SigningFailedResetBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningFailedBtn.click();
        bddUtil.sleep(4);
//        把contractID输入 contractID输入框中，进行查询
        String contractIDText = vaPatch_page.contractID.getText();
        vaPatch_page.contractIDInput.sendKeys(contractIDText);
        bddUtil.sleep(1);
        vaPatch_page.SearchBtn.click();
        bddUtil.sleep(5);
        vaPatch_page.ResetBtn.click();
        bddUtil.sleep(2);
        String SecondContractID = vaPatch_page.SecondContractID.getText();
        bddUtil.sleep(5);
        if (SecondContractID.equals(contractIDText)){
            throw new Exception("Reset按钮出错");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //  检查SigningFailed页面batch Download按钮
    public void CheckESC_SigningFailedBatchDownloadBtn() throws Exception {
        bddUtil.sleep(5);
        vaPatch_page.SigningFailedBtn.click();
//        选择前两个 进行下载
        bddUtil.sleep(5);
        vaPatch_page.checkbox.get(1).click();
        vaPatch_page.checkbox.get(2).click();
        vaPatch_page.BatchDownloadBtn.click();
        String DownloadBtnPageTitle = vaPatch_page.DownloadBtnPageTitle.getText();
        bddUtil.sleep(5);
        if (DownloadBtnPageTitle.equals("Download complete!")){
            System.out.println("下载成功");
        }else {
            throw new Exception("下载失败");
        }
    }

//    检查Template Management页面的Query按钮
    @Step
    public void checkTemplateManagementQueryBtn() throws Exception{
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(4);
        String templateNameText = vaPatch_page.TemplateName.getText();
        vaPatch_page.TemplateNameInput.sendKeys(templateNameText);
        vaPatch_page.SubmitBtn.click();
        bddUtil.sleep(4);
        if (templateNameText.equals(vaPatch_page.TemplateNameInput.getValue())){
            System.out.println("查找成功");
        }else {
            throw new Exception("查找失败");
        }
    }

    //    检查Template Management页面的Reset按钮
    @Step
    public void checkTemplateManagementResetBtn() throws Exception{
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(4);
        String templateNameText = vaPatch_page.TemplateName.getText();
        vaPatch_page.TemplateNameInput.sendKeys(templateNameText);
        vaPatch_page.SubmitBtn.click();
        bddUtil.sleep(3);
        vaPatch_page.TemplateManagementResetBtn.click();
        bddUtil.sleep(4);
        if (templateNameText.equals(vaPatch_page.TemplateNameInput.getValue())){
            throw new Exception("Reset按钮有问题");
        }else {
            System.out.println("Reset按钮正常");
        }
    }

    //    检查Template Management页面的See按钮
    @Step
    public void checkTemplateManagementSeeBtn() throws Exception{
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(4);
        vaPatch_page.TemplateSeeBtn.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        String contractViewText = vaPatch_page.contractView.getText();
        bddUtil.sleep(2);
        if (contractViewText.equals("Contract view")){
            System.out.println("Template页面See按钮正常");
        }else {
            throw new Exception("Template页面See按钮按钮有问题");
        }
    }

//    Template Management页面create Template
    @Step
    public void checkTemplateManagementCreateTemplateBtn() throws Exception{
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(4);
        vaPatch_page.createTemplate.click();
        bddUtil.sleep(3);
//        上传测试合同
        getDriver().findElement(By.id("signFile")).sendKeys(fileAddress);
        bddUtil.sleep(4);
        vaPatch_page.nextBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.confirmTemplateBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.EnableNow.click();
        bddUtil.sleep(5);
        String createTemplateName = vaPatch_page.TemplateName.getText();
        if (createTemplateName.equals("测试合同123")){
            System.out.println("新增合同成功");
        }else {
            throw new Exception("新增合同失败");
        }
    }

    //    Template Management页面Deactivate校验
    @Step
    public void checkTemplateManagementManagementDeactivateBtn() throws Exception{
        vaPatch_page.DeactivateBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.deactivateBtn.click();
        bddUtil.sleep(4);
        String deleteBtnText1 = vaPatch_page.templateDeleteBtn.getText();
        if (deleteBtnText1.equals("Delete")){
            System.out.println("Deactivate按钮正常");
        }else {
            throw new Exception("Deactivate按钮有问题");
        }
        vaPatch_page.templateDeleteBtn.click();
        bddUtil.sleep(2);
        vaPatch_page.templateConfirmBtn.click();
        bddUtil.sleep(5);
    }

//    Template Management 页面 Journal按钮校验
    @Step
    public void checkTemplateManagementManagementJournalBtn() throws Exception{
        vaPatch_page.TemplateManagementBtn.click();
        bddUtil.sleep(4);
        vaPatch_page.journalBtn.click();
        bddUtil.sleep(3);
        bddUtil.switchToNewWindow();
        String journalTitleText = vaPatch_page.journalTitle.getText();
        if (journalTitleText.equals("Serial number")){
            System.out.println("journal按钮正常");
        }else {
            throw new Exception("journal按钮报错");
        }
    }
}
