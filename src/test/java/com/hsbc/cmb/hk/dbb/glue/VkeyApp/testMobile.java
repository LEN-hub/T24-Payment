package com.hsbc.cmb.hk.dbb.glue.VkeyApp;

import com.hsbc.cmb.hk.dbb.utils.MobileConfig;
import java.io.IOException;

public class testMobile {

    public static void main(String[] args) throws IOException, InterruptedException{
        MobileConfig test = new MobileConfig();
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server");
        MobileConfig.exeCmd("adb uninstall io.appium.uiautomator2.server.test");
        test.testMobile();
        Thread.sleep(3000);
        if (!MobileConfig.driver.findElementById("vkey_title").getText().equals("数字令牌")) {
            test.clickSystemPopupWindows();
            test.clickStartButton();
            test.logonVkeyApp("201297", "17762216590@163.com", "Gl123456.");
            test.clickLetUsStart();
            test.verification();
            test.clickCreatPassword();
        }
        test.getVcode();

//        // TODO Auto-generated method stub
//        //1.添加配置，创建DesiredCapabilities对象
//        DesiredCapabilities cap = new DesiredCapabilities();
//        //指定测试设备的名称
//        cap.setCapability("deviceName", "R5CRA16L86H");
//        //添加操作系统配置
//        cap.setCapability("platformName", "Android");
//        //添加操作系统版本设置
//        cap.setCapability("platformVersion", "11");
//        //指定想要测试应用的包名
//        cap.setCapability("appPackage", "com.glbank.mobileapp");
//        //指定想要测试应用的入口activity
//        cap.setCapability("appActivity", "com.glbank.mobileapp.LauncherActivity");
//        //不需要清理数据，避免重新安装的问题
//        cap.setCapability("appiumNoReset",true);
//        cap.setCapability("instrumentation","UiAutomator2");
//        //2.创建驱动...URL是appium的固定地址；指定appium通讯的地址，将相对应的配置传入到驱动里边
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        //加线程等待
        //Thread.sleep(5000);
//
//        for (int i =0;i<3;i++){
//           MobileConfig.driver.switchTo().alert().accept();
//        }
//        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'btn_methods')]/child::android.widget.TextView[1]").click();
//
////        driver.findElementById("btn_submit").click();
//        Thread.sleep(1000);
//        MobileConfig.driver.findElementById("et_acct_id").sendKeys("200007");
//        MobileConfig.driver.findElementById("et_email").sendKeys("0003@qq.com");
//        MobileConfig.driver.findElementById("et_password").sendKeys("Zx123456.");
//        MobileConfig.driver.findElementById("btn_login").click();
//        Thread.sleep(20000);
//        MobileConfig.driver.findElementById("btn_submit").click();
//        String testText = MobileConfig.driver.findElementsById("tv_message").toString();
//        System.out.println(testText);
//        MobileConfig.driver.findElementById("btn_confirm").click();
//        MobileConfig.driver.findElementByXPath("//android.widget.LinearLayout[ends-with(@resource-id,'giv_sms_code')]/child::android.widget.EditText[1]").sendKeys(testText);
//
//        Thread.sleep(100000);
//        //退出
//        MobileConfig.driver.quit();
//    }
//
//
//    //截图
//    private static void test(WebDriver driver){
//        File screen = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//        File screenFile = new File("Y:/Downloads/screenshots/screen.png");
//        try {
//            FileUtils.copyFile(screen,screenFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}