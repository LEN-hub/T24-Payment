package com.glbank.com.sg.bdd.steps.VaPatch;

import com.glbank.com.sg.bdd.pages.VaPatch.VaPatch_page;
import com.glbank.com.sg.bdd.pages.supplyChains.bingdingRelationship.relationship_page;
import com.glbank.com.sg.bdd.utils.BDDUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

public class VaPatch_step extends ScenarioSteps {
    private VaPatch_page vaPatch_page;
    private BDDUtil bddUtil;
    public static String envTag;

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

}
