package com.glbank.com.sg.bdd.utils;

import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.EnterpriseManagementDeskAccountManagement.accountChange_steps;
import com.glbank.com.sg.bdd.steps.enterpriseNetSilver.Logon_step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileConfig {
    public static AppiumDriver<AndroidElement> driver;
    HaveOrNo checkElement=new HaveOrNo();
    private BDDUtil bddUtil;
    public static String vcode;
    public static String vxcode;

    public void testMobile() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //指定测试设备的名称
        cap.setCapability("deviceName", Logon_step.deviceName);
        //添加操作系统配置
        cap.setCapability("platformName", "Android");
        //添加操作系统版本设置adb devices
        cap.setCapability("platformVersion", "11");
        //指定想要测试应用的包名
        cap.setCapability("appPackage", "com.glbank.mobileapp");
        //指定想要测试应用的入口activity
        cap.setCapability("appActivity", "com.glbank.mobileapp.LauncherActivity");
        //不需要清理数据，避免重新安装的问题
        cap.setCapability("noReset", true);
        cap.setCapability("instrumentation", "UiAutomator2");
        //2.创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public void testSecondMobile() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //指定测试设备的名称
        cap.setCapability("deviceName", Logon_step.deviceName);
        //添加操作系统配置
        cap.setCapability("platformName", "Android");
        //添加操作系统版本设置adb devices
        cap.setCapability("platformVersion", "12");
        //指定想要测试应用的包名
        cap.setCapability("appPackage", "com.glbank.mobileapp");
        //指定想要测试应用的入口activity
        cap.setCapability("appActivity", "com.glbank.mobileapp.LauncherActivity");
        cap.setCapability("instrumentation", "UiAutomator2");
        //2.创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    public void clickSystemPopupWindows(){
        By seletor=new By.ByXPath("//android.widget.TextView[ends-with(@resource-id,'permission_message')]");
        if (checkElement.check(driver,seletor)){
            for (int i =0;i<3;i++){
                driver.switchTo().alert().accept();
            }
        }
    }

    public void clickStartButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'btn_methods')]/child::android.widget.TextView[1]").click();
    }

    public void logonVkeyApp(String profile, String email, String password){
        CommonUtil.waiting(2000);
        driver.findElementById("et_acct_id").clear();
        driver.findElementById("et_acct_id").sendKeys(profile);
        driver.findElementById("et_email").clear();
        driver.findElementById("et_email").sendKeys(email);
        driver.findElementById("et_password").sendKeys(password);
        driver.findElementById("btn_login").click();
    }

    public void clickLetUsStart() throws InterruptedException {
        Thread.sleep(10000);
        By seletor=new By.ById("btn_submit");
        if (checkElement.check(driver,seletor)){
            driver.findElementById("btn_submit").click();
        }
    }

    public void verification() throws InterruptedException {
        Thread.sleep(14000);
        String testText = MobileConfig.driver.findElementById("tv_message").getText();
        System.out.println(testText);
        MobileConfig.driver.findElementById("btn_confirm").click();
        Thread.sleep(3000);
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[1]").sendKeys(testText.substring(0,1));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[2]").sendKeys(testText.substring(1,2));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[3]").sendKeys(testText.substring(2,3));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[4]").sendKeys(testText.substring(3,4));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[5]").sendKeys(testText.substring(4,5));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[6]").sendKeys(testText.substring(5,6));
        Thread.sleep(2000);
        String testText2 = MobileConfig.driver.findElementById("tv_message").getText();
        System.out.println(testText);
        MobileConfig.driver.findElementById("btn_confirm").click();
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[1]").sendKeys(testText2.substring(0,1));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[2]").sendKeys(testText2.substring(1,2));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[3]").sendKeys(testText2.substring(2,3));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[4]").sendKeys(testText2.substring(3,4));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[5]").sendKeys(testText2.substring(4,5));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_email_code')]/child::android.widget.EditText[6]").sendKeys(testText2.substring(5,6));
        Thread.sleep(5000);
    }

    public void clickCreatPassword() throws InterruptedException {
        Thread.sleep(30000);
        MobileConfig.driver.findElementById("btn_submit").click();
        Thread.sleep(1000);
        for (int i = 0; i<2;i++){
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[1]").sendKeys("1");
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[2]").sendKeys("4");
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[3]").sendKeys("7");
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[4]").sendKeys("2");
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[5]").sendKeys("5");
            MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_pin')]/child::android.widget.EditText[6]").sendKeys("8");
        }
        MobileConfig.driver.findElementById("btn_submit").click();
    }

    public String getVcode() throws InterruptedException {
        Thread.sleep(3000);
        MobileConfig.driver.findElementById("btn_otp").click();
        Thread.sleep(3000);
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[1]").sendKeys("1");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[2]").sendKeys("4");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[3]").sendKeys("7");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[4]").sendKeys("2");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[5]").sendKeys("5");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[6]").sendKeys("8");
        String Vcode1 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[1]").getText();
        String Vcode2 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[2]").getText();
        String Vcode3 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[3]").getText();
        String Vcode4 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[4]").getText();
        String Vcode5 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[5]").getText();
        String Vcode6 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout [ends-with(@resource-id,'gtv_otp')]/child::android.widget.TextView[6]").getText();
        vcode = Vcode1+Vcode2+Vcode3+Vcode4+Vcode5+Vcode6;
        return vcode;
    }
    public static void exeCmd(String cmd) {

        try {
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"GBK");
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public String transactionCode() throws InterruptedException {
        MobileConfig.driver.findElementById("btn_tc").click();
        Thread.sleep(3000);
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[1]").sendKeys("1");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[2]").sendKeys("4");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[3]").sendKeys("7");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[4]").sendKeys("2");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[5]").sendKeys("5");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_vkey_pin')]/child::android.widget.EditText[6]").sendKeys("8");
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[1]").sendKeys(accountChange_steps.tcCode.substring(0,1));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[2]").sendKeys(accountChange_steps.tcCode.substring(1,2));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[3]").sendKeys(accountChange_steps.tcCode.substring(2,3));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[4]").sendKeys(accountChange_steps.tcCode.substring(3,4));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[5]").sendKeys(accountChange_steps.tcCode.substring(4,5));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[6]").sendKeys(accountChange_steps.tcCode.substring(5,6));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[7]").sendKeys(accountChange_steps.tcCode.substring(6,7));
        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_tc_sign')]/child::android.widget.EditText[8]").sendKeys(accountChange_steps.tcCode.substring(7,8));
        String vxcode1 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[1]").getText();
        String vxcode2 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[2]").getText();
        String vxcode3 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[3]").getText();
        String vxcode4 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[4]").getText();
        String vxcode5 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[5]").getText();
        String vxcode6 = MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'gtv_tc')]/child::android.widget.TextView[6]").getText();
        vxcode = vxcode1+vxcode2+vxcode3+vxcode4+vxcode5+vxcode6;
        return vxcode;
    }
    public void quitAndroid() {
        driver.quit();
    }
}