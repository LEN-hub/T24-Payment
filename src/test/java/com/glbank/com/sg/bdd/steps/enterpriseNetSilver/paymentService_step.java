package com.glbank.com.sg.bdd.steps.enterpriseNetSilver;

import cn.hutool.core.date.DateUtil;
import com.glbank.com.sg.bdd.pages.enterpriseNetSilver.paymentService_page;
import com.glbank.com.sg.bdd.utils.*;
import com.lu.sn.Language;
import com.lu.sn.NameType;
import com.lu.sn.RandomNameTool;
import cucumber.api.java.bs.A;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import java.util.List;
import java.util.Random;

import static com.glbank.com.sg.bdd.utils.HttpUtil.sendPost;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class paymentService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private paymentService_page paymentService_page;
    private String selectAccBth;
    public static String date = GenerateDate.todayDate();
    public String debitAccountName;
    public static String id;
    public static String serialNumber;
    public String debitAccountCurrency;
    public String debitAccountNumber;
    public String debitCompanyName;
    public String creditAccountName;
    public String creditAccountCurrency;
    public String creditAccountNumber;
    public String creditCompanyName;
    public String transactionAmount;
    public String purposeOfTransfer;
    public String referenceID;
    public String nowDate = BDDUtil.getTimeNowThroughCalendar();
    public String loginOtp;

    public String proxyId;
    public String fxDetailBankName;
    public String fxDetailPayeeName;
    public String fxDetailAccountCurrency;
    public String fxDetailPayeeAccountNum;
    public String fxDetailExchangeRate;
    public String fxDetailTransactionAmount;
    public String fxDetailBeneficiaryBankBIC;
    public String fxDetailPayeeAddress;
    public String fxDetailPayeeCountry;
    public String fxDetailEstimatedProcessingFee;
    public String fxDetailPaymentModeForCharges;
    public String fxDetailPurposeOfTransfer;
    public static String transferAmount;
    public static String feesSerialNumber;
    public static String transferCurrency;
    public static String transferAccount;
    public String randomAccount = RandomPhoneNumber.randomPhoneNum();
    private static String systemPath = System.getProperty("user.dir");
    String fileAddress = systemPath + "/src/test/resources/testData/autopay/BR.jpg";

    @Step
    public void transferAndRemittanceMenu(){
        if (paymentService_page.popWindowsTitle.isVisible()){
            paymentService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.transferAndRemittanceMenu).perform();
    }
    /**
     * SGD多币种存钱脚本
     */

    @Step
    public void SGD_Multi_Currency_Charging(String amount,String chargeOption){
        given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_LargeAccount_sit")+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD")+"\",\n" +
                        "        \"acctWithBankName\": \"BANK OF CHINA LIMITED\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \"SGD\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    /**
     * USD多币种存钱脚本
     */

    @Step
    public void USD_Multi_Currency_Charging(String amount,String chargeOption){
        given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_LargeAccount_sit")+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD")+"\",\n" +
                        "        \"acctWithBankName\": \"BANK OF CHINA LIMITED\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \"SGD\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    /**
     * SGD 单币种存钱脚本
     * @param amount
     */
    @Step
    public void SGD_Single_Currency_Charging(String amount,String chargeOption){
        given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_LargeAccount_sit")+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency")+"\",\n" +
                        "        \"acctWithBankName\": \"BANK OF CHINA LIMITED\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \"SGD\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    /**
     * USD 单币种存钱脚本
     * @param amount
     */
    @Step
    public static void USD_Single_Currency_Charging(String amount, String chargeOption){
        given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_LargeAccount_sit")+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency")+"\",\n" +
                        "        \"acctWithBankName\": \"BANK OF CHINA LIMITED\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \"SGD\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }

    /**
     * SGD转SGD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_SGD_SGD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
                Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"465456123231\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \"PI23047123W3BJX1\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"Kevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * USD转USD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_USD_USD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"45456645123\",\n" +
                        "        \"acctWithBankName\": \"BANK OF CHINA LIMITED\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * USD转USD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_USD_USD_002(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"beneficiaryBirthCountry\": \"SG\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"xi'an\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \"PI230090N49GY4BM\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * 境外转账跨币种单币种手续费USD-SGD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_SingleCurrency_USD_SGD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency")+"\",\n" +
                        "        \"beneficiaryAccountId\": \"589879321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency")+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }

    /**
     * 境外转账同币种多币种手续费SGD-SGD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_MultiCurrency_SGD_SGD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD")+"\",\n" +
                        "        \"beneficiaryAccountId\": \"321524321321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD")+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }

    /**
     * 境外转账同币种多币种手续费USD-USD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_MultiCurrency_USD_USD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD")+"\",\n" +
                        "        \"beneficiaryAccountId\": \"321524321321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD")+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }

    /**
     * 境外转账跨币种多币种手续费SGD-USD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_MultiCurrency_SGD_USD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"32154412\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }

    /**
     * 境外转账跨币种多币种手续USD-SGD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_MultiCurrency_USD_SGD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"32154412\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }



    /**
     * 境外转账跨币种手续费SGD-USD
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Fees_Query_SingleCurrency_SGD_USD(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"589879321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?validate_only=true")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        feesSerialNumber = response.path("header.id").toString();
        System.out.println(feesSerialNumber);
    }



    /**
     * SGD转SGD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_SGD_SGD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"321524321321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * SGD转SGD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_SGD_SGD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"SGD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * USD转USD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_USD_USD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"321524321321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * USD转USD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_USD_USD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"amount\": \""+amount+"\",\n" +
                        "        \"debitCurrency\": \"USD\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * SGD转USD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_SGD_USD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"589879321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?externalReference="+feesSerialNumber+"")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * SGD转USD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_SGD_USD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?externalReference="+feesSerialNumber+"")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }
    /**
     * USD转SGD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_USD_SGD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"589879321\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?externalReference="+feesSerialNumber+"")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * USD转SGD单币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Single_Currency_USD_SGD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?externalReference="+feesSerialNumber+"")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }


    /**
     * SGD转USD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_SGD_USD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"32154412\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferInCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    /**
     * SGD转USD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_SGD_USD_001(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_SGD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","USD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"SGD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }


    /**
     * USD转SGD多币种
     * @param amount
     */
    @Step
    public void overseas_Transfer_Multi_Currency_USD_SGD(String amount,String chargeOption,String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \"32154412\",\n" +
                        "        \"acctWithBankName\": \"DBS BANK LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC_DBS")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }


    /**
     * USD转SGD多币种
     * @param amount
     */
    @Step
    public static void overseas_Transfer_Multi_Currency_USD_SGD_001(String amount, String chargeOption, String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","AC_MCY_sit_USD"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {\n" +
                        "            \"overrideDetails\": [\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12621\",\n" +
                        "                    \"description\": \"The rate calculated is a reference rate and not actual rate(O-12621)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE1\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"code\": \"O-12622\",\n" +
                        "                    \"description\": \"Amount shown are notional(O-12622)\",\n" +
                        "                    \"id\": \"PI-SIM.OFF.FX.INVOLVE2\",\n" +
                        "                    \"type\": \"Override\",\n" +
                        "                    \"responseCode\": \"\"\n" +
                        "                }\n" +
                        "            ]\n" +
                        "        }\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"creditorBankCountryCode\": \"SG\",\n" +
                        "        \"chargeBearer\": \""+chargeOption+"\",\n" +
                        "        \"purpose\": \"BEXP\",\n" +
                        "        \"acctWithTownName\": \"SG\",\n" +
                        "        \"debitAccountId\": \""+transferAccount+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"acctWithBankName\": \"GREEN LINK DIGITAL BANK PTE LTD\",\n" +
                        "        \"orderingCustomerAccount\": \""+transferAccount+"\",\n" +
                        "        \"benPostSwiftAddress\": [\n" +
                        "            {\n" +
                        "                \"creditorAddress\": \"beijing\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"externalReference\": \""+feesSerialNumber+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\",\n" +
                        "        \"requestedAmount\": \""+amount+"\",\n" +
                        "        \"requestedCurrency\": \"USD\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
    }


    public static void inHouse_Transfer_Single_Currency_USD_SGD(String amount, String transferInCurrency){
        transferAmount = amount;
        transferCurrency = transferInCurrency;
        transferAccount = String.valueOf(FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency"));
        Response response = given()
                .header("Content-type","application/json")
                .and()
                .body("{\n" +
                        "    \"header\": {\n" +
                        "        \"audit\": {},\n" +
                        "        \"override\": {}\n" +
                        "    },\n" +
                        "    \"body\": {\n" +
                        "        \"narratives\": [],\n" +
                        "        \"originatorToBeneficiaryInformations\": [\n" +
                        "            {\n" +
                        "                \"originatorToBeneficiaryInformation\": \"BEXP\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"amount\": \""+transferAmount+"\",\n" +
                        "        \"debitCurrency\": \""+transferCurrency+"\",\n" +
                        "        \"beneficiaryCountryCode\": \"SG\",\n" +
                        "        \"acctWithTownName\": \"Singapore\",\n" +
                        "        \"debitAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency")+"\",\n" +
                        "        \"beneficiaryAccountId\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency_Two")+"\",\n" +
                        "        \"orderingCustomerAccount\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","SGD_AC_SingleCurrency")+"\",\n" +
                        "        \"beneficiaryTownName\": \"Singapore\",\n" +
                        "        \"accountWithBankBIC\": \""+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_BIC")+"\",\n" +
                        "        \"paymentCurrencyId\": \""+transferCurrency+"\",\n" +
                        "        \"beneficiaryName\": \"TestKevin\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("http://"+FileUtils.readtxtFile("automationTestCaseData/automationSitEnvData","sit_env_ip")+"/irf-provider-container/api/v1.0.0/order/gldb/paymentOrders/swiftPayments?externalReference="+feesSerialNumber+"")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        serialNumber = response.path("header.id").toString();
        System.out.println(serialNumber);
    }

    public static void main(String[] args) {
        System.out.println( DateUtil.format(new Date(),"dd/MM/yyyy HH:mm:ss"));
    }

    @Step
    public void sdgTransferToUsd(String rollOutAccount,String intoAccount,String current){
        paymentService_page.transferMoney.click();
        bddUtil.sleep(3);
        paymentService_page.rollOutCurrencySelectWindows.click();
        List<WebElementFacade> currency = paymentService_page.rollOutAccountSGD;
        for (int i = 0; i< currency.size();i++){
            if (rollOutAccount.contains(currency.get(i).getText().substring(0,currency.get(i).getText().indexOf("/")).trim())){
                bddUtil.scrollWindowToElement(currency.get(i)).click();
                break;
            }
        }
        if (rollOutAccount.substring(0,4).toString().equals("1102")){
            paymentService_page.getClickCurrencyBox.click();
            bddUtil.sleep(2);
            List<WebElementFacade> current1 = paymentService_page.selectAccount;
            for (int i = 0; i < current1.size(); i++) {
                if (current1.get(i).getText().equals(current)){
                    bddUtil.scrollWindowToElement(current1.get(i)).click();
                }
            }
        }
        paymentService_page.clickToAccount.click();
//        bddUtil.scrollWindowToElement(paymentService_page.rollOutAccountSGD).click();
        paymentService_page.secondPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> secondCurrency = paymentService_page.secondCurrencySelectSGD;
        for(int j = 0; j < secondCurrency.size(); j++){
            if (intoAccount.contains(secondCurrency.get(j).getText().substring(0,secondCurrency.get(j).getText().indexOf("/")).trim())){
                bddUtil.scrollWindowToElement(secondCurrency.get(j)).click();
                break;
            }
        }
//        paymentService_page.secondCurrencySelectUSD.click();
        bddUtil.scrollWindowToElement(paymentService_page.clickNextBtn);
        paymentService_page.enterMoney.sendKeys(GenerateDate.today()+"."+randomTwoNum());
        paymentService_page.transferPurpose.click();
        bddUtil.sleep(1);
        paymentService_page.selectTransferPurpose.click();
        paymentService_page.clickNextBtn.click();
    }

    @Step
    public void accountTitleVerify(){
        if (paymentService_page.tipsTitle.isVisible()){
            paymentService_page.clickTipsContinueBtn.click();
        }
    }

    @Step
    public void clickSubmitBtn(){
//        if (paymentService_page.disabledSubmitBtn.isVisible()){
//            paymentService_page.clickRefreshBtn.click();
//        }
        bddUtil.scrollWindowToElement(paymentService_page.submitBtn).click();
    }

    @Step
    public void successTitleToFXLocalPayment(String WordPath) throws Exception {
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.serialNumber.isDisplayed();
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPaymentFXMessage(WordPath);
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        debitCompanyName = paymentService_page.debitCompanyName.getText();
        FileUtils.FileString4("t24","ChannelDebitCompanyName:" + debitCompanyName);
        creditAccountName = paymentService_page.creditAccountName.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountName:" + creditAccountName);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        creditCompanyName = paymentService_page.creditCompanyName.getText();
        FileUtils.FileString4("t24","ChannelCreditCompanyName:" + creditCompanyName);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
    }

    @Step
    public void successTitle(String WordPath) throws Exception {
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.serialNumber.isDisplayed();
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToLocalPayment(WordPath);
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        debitCompanyName = paymentService_page.debitCompanyName.getText();
        FileUtils.FileString4("t24","ChannelDebitCompanyName:" + debitCompanyName);
        creditAccountName = paymentService_page.creditAccountName.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountName:" + creditAccountName);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        creditCompanyName = paymentService_page.creditCompanyName.getText();
        FileUtils.FileString4("t24","ChannelCreditCompanyName:" + creditCompanyName);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
    }

    @Step
    public void domesticTransfer(String bankName, String paymentAccount, String tradeAmountSelect, String paymentInformation, String PaymentType, String PayNowType, String PayNowContent){
        bddUtil.sleep(3);
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
//正常测试流程
//        paymentService_page.collectingBankPopWindows.click();
//        bddUtil.sleep(3);
//        List<WebElementFacade> selectBank = paymentService_page.selectSGD;
//        for (int j = 0; j< selectBank.size(); j++){
//            if (bankName.equals(selectBank.get(j).getText())){
//                bddUtil.scrollWindowToElement(selectBank.get(j)).click();
//                break;
//            }
//        }
//        paymentService_page.accountName.sendKeys(accountName);
//        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        //paynow
//        paymentService_page.selectPaymentTypeMEPS.click();
        if (PaymentType.equals("FAST")){
            paymentService_page.clickPaymentTypeFast.click();
        }else if (PaymentType.equals("MEPS")){
            paymentService_page.clickPaymentTypeMEPS.click();
        }else if(PaymentType.equals("PayNow")){
            paymentService_page.clickPaymentTypePayNow.click();
            if (PayNowType.equals("UEN")){
                paymentService_page.clickPayNowTypeUEN.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(PayNowContent);
            }else if(PayNowType.equals("VPA")){
                paymentService_page.clickPayNowTypeVPA.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(PayNowContent);
            }else if(PayNowType.equals("NRIC")){
                paymentService_page.clickPayNowTypeNRIC.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(PayNowContent);
            }else if(PayNowType.equals("Mobile Number")){
                paymentService_page.clickPayNowTypeMobileNum.click();
                paymentService_page.enterMobileNum2.sendKeys(PayNowContent);
            }
        }
        if (!PaymentType.equals("PayNow")){
            paymentService_page.payeeBankSelect.click();
            List<WebElementFacade> payeeBank = paymentService_page.selectPayeeBankText;
            for (int i = 0; i < payeeBank.size(); i++) {
                if (payeeBank.get(i).getText().equals(bankName)){
                    bddUtil.scrollWindowToElement(payeeBank.get(i));
                    payeeBank.get(i).click();
                    break;
                }
            }
            paymentService_page.payeeNameInput.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
            paymentService_page.payeeAccountNum.sendKeys(paymentAccount);
        }
        //截止代码
        paymentService_page.transferAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
//        paymentService_page.transferAmount.sendKeys("250000");
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    @Step
    public void clickManagePayNowProfileEdit(){
        paymentService_page.managePayNowProfile.click();
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.clickManagePaynowProfileThreePoint).perform();
        paymentService_page.clickEditProfile.click();
        bddUtil.sleep(3);
        paymentService_page.clickNextButton.click();
        paymentService_page.clickSubmitBtn.click();
    }

    @Step
    public void payNowTransfer(String tradeAmountSelect, String paymentInformation, String PaymentType, String PayNowType){
        bddUtil.sleep(5);
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
        if(PaymentType.equals("PayNow")){
            paymentService_page.clickPaymentTypePayNow.click();
            if (PayNowType.equals("UEN")){
                paymentService_page.clickPayNowTypeUEN.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(proxyId);
            }else if(PayNowType.equals("VPA")){
                paymentService_page.clickPayNowTypeVPA.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(proxyId);
            }else if(PayNowType.equals("NRIC")){
                paymentService_page.clickPayNowTypeNRIC.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(proxyId);
            }else if(PayNowType.equals("Mobile Number")){
                paymentService_page.clickPayNowTypeMobileNum.click();
                paymentService_page.enterMobileNum2.sendKeys(proxyId);
            }
        }
        //截止代码
        paymentService_page.transferAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
//        paymentService_page.transferAmount.sendKeys("250000");
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        bddUtil.sleep(3);
        paymentService_page.tradeAmountPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    public void payeeTransfer(String bankName, String paymentAccount, String tradeAmountSelect, String paymentInformation, String PaymentType, String PayNowType, String PayNowContent){
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
        if (PaymentType.equals("FAST")){
            paymentService_page.clickPaymentTypeFast.click();
        }else if (PaymentType.equals("MEPS")){
            paymentService_page.clickPaymentTypeMEPS.click();
        }
        if (!PaymentType.equals("PayNow")){
            paymentService_page.payeeBankSelect.click();
            List<WebElementFacade> payeeBank = paymentService_page.selectPayeeBankText;
            for (int i = 0; i < payeeBank.size(); i++) {
                if (payeeBank.get(i).getText().equals(bankName)){
                    bddUtil.scrollWindowToElement(payeeBank.get(i));
                    payeeBank.get(i).click();
                    break;
                }
            }
            paymentService_page.payeeNameInput.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
            paymentService_page.payeeAccountNum.sendKeys(paymentAccount);
        }
        //截止代码
        paymentService_page.transferAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
//        paymentService_page.transferAmount.sendKeys("250000");
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    public void timeAdjustment(String date,String cycle){
        paymentService_page.clickDateInput.clear();
        paymentService_page.clickDateInput.sendKeys(date);
        paymentService_page.clickRecurrencePattern.click();
        paymentService_page.clickMakeCheckBox.click();
        paymentService_page.clickSelectDateDropDown.click();
        List<WebElementFacade> selectdate = paymentService_page.selectCycle;
        for (int i = 0; i < selectdate.size(); i++) {
            if (selectdate.get(i).getText().equals(cycle)){
                selectdate.get(i).click();
                break;
            }
        }
    }

    @Step
    public void otherDomesticTransfer(String bankName,String accountName,String paymentAccount,String tradeAmountSelect,String paymentInformation){
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.clickPopupbtn.click();
        List<WebElementFacade> payment = paymentService_page.paymentInformationText;
        for (int i = 0; i <= payment.size(); i++){
            if (paymentInformation.equals(payment.get(i).getText().substring(0,13))){
                bddUtil.scrollWindowToElement(payment.get(i)).click();
                break;
            }
        }
        paymentService_page.collectingBankPopWindows.click();
        List<WebElementFacade> selectTitle = paymentService_page.selectTitle;
        for (int j = 0; j < selectTitle.size(); j++){
            if (bankName.equals(selectTitle.get(j).getText())){
                selectTitle.get(j).click();
                break;
            }
        }
//        paymentService_page.overseasTrasferAccount.click();
        paymentService_page.accountName.sendKeys(accountName);
        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        paymentService_page.transferAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int k = 0; k< selectTradeAmount.size(); k++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(k).getText())){
                selectTradeAmount.get(k).click();
                break;
            }
        }
    }

    @Step
    public void rollOutDate(String selectDate,String trasferOutDate){
        paymentService_page.dateInputBox.clear();
        paymentService_page.dateInputBox.sendKeys(trasferOutDate);
        paymentService_page.textTitle.click();
        paymentService_page.cycleTransferCheckBox.click();
        paymentService_page.popWindowsSelect.click();
        List<WebElementFacade> selectdate = paymentService_page.selectDate;
        for (int i = 0; i < selectdate.size(); i++){
            if (selectDate.equals(selectdate.get(i).getText())){
                selectdate.get(i).click();
                break;
            }
        }
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
//        a:for (int j = 0; j < rollOutDate.size(); j++){
//            if (sdf.format(new Date()).charAt(8) == '0' || sdf.format(new Date()).charAt(8) == '1' || sdf.format(new Date()).charAt(8) == '2' || sdf.format(new Date()).charAt(8) == '3'){
//                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
//                    rollOutDate.get(j).click();
//                    break;
//                }
//            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
//                paymentService_page.nextMonth.click();
//                for (int x = 0;x < rollOutDate.size(); x++){
//                    if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(x).getText())){
//                        rollOutDate.get(x).click();
//                        break a;
//                    }
//                }
//            }
//        }
    }

    @Step
    public void rollOutDateTwentyNine(String selectDate){
        paymentService_page.dateInputBox.click();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
        a:for (int j = 0; j < rollOutDate.size(); j++){
            if (sdf.format(new Date()).charAt(8) == '0' || sdf.format(new Date()).charAt(8) == '1' || sdf.format(new Date()).charAt(8) == '2' || sdf.format(new Date()).charAt(8) == '3'){
                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
                    if (!sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                        rollOutDate.get(j).click();
                        break a;
                    }else if(sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                        paymentService_page.nextMonth.click();
                        for (int x = 0;x < rollOutDate.size(); x++){
                            if (sdf.format(getNextWeekMonday(new Date())).charAt(8) == '0') {
                                if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())) {
                                    rollOutDate.get(x).click();
                                    break a;
                                }
                            }
                        }
                    }
                }
            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
                paymentService_page.nextMonth.click();
                for (int n = 0;n < rollOutDate.size(); n++){
                    if (sdf.format(new Date()).charAt(8) == '0') {
                        if (sdf.format(getNextWeekMonday(new Date())).substring(8, 10).equals(rollOutDate.get(j).getText())) {
                            rollOutDate.get(n).click();
                            break a;
                        }
                    }
                }
            }
        }
        paymentService_page.cycleTransferCheckBox.click();
        paymentService_page.popWindowsSelect.click();
        List<WebElementFacade> selectdate = paymentService_page.selectDate;
        for (int i = 0; i < selectdate.size(); i++){
            if (selectDate.equals(selectdate.get(i).getText())){
                selectdate.get(i).click();
                break;
            }
        }
    }

    public void enterPeriods(String periods){
        paymentService_page.appointmentPeriods.sendKeys(periods);
    }

    public void clickNextBtn(){
        paymentService_page.nextBtn.click();
    }

    @Step
    public void checkCollectionName(){
        if (paymentService_page.popwindowsTitleTransferInformation.isVisible()){
            paymentService_page.continueButtonClick.click();
        }
        bddUtil.sleep(3);
//        Assert.assertEquals(accountName,paymentService_page.checkCollectionName.getText());
//        Assert.assertEquals(paymentAccount,paymentService_page.checkPaymentAccount.getText());
//        Assert.assertEquals(transferAmount,paymentService_page.checkTransferAmount.getText());
//        Assert.assertEquals(tradeAmountSelect,paymentService_page.checkTradeAmountSelect.getText());
        paymentService_page.confirmBtn.click();
    }

    @Step
    public void confirmInformationNextBtn(){
        paymentService_page.confirmInformationNextBtn.click();
    }

    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

    public static Date getNextWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 7);
        return cal.getTime();
    }

    @Step
    public void transferSuccessTitle(){
        paymentService_page.transferSuccessTitle.isDisplayed();
        paymentService_page.checkDetailsBtn.click();
    }

    @Step
    public void checkAccountDetails(String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect){
        Assert.assertEquals(accountName,paymentService_page.getAccountName.getText());
        Assert.assertEquals(paymentAccount,paymentService_page.getAccountNumber.getText());
//        Assert.assertEquals(transferAmount,paymentService_page.getAccountMount.getText());
        Assert.assertEquals(tradeAmountSelect,paymentService_page.getAccountUse.getText());
    }

    @Step
    public void getPopWindowsTitle(){
        if (paymentService_page.getPopWindowsTitle.isVisible()){
            paymentService_page.continueBtn.click();
        }
    }

//境外转账（SGD--USD）

    public void overseasTransfer(){
        paymentService_page.overseasTransfer.click();
    }

    public void selectPaymentAccount(String selectAccount,String Currency){
        paymentService_page.accountBox.click();
        bddUtil.sleep(3);
        List<WebElementFacade> Acc = paymentService_page.selectAccount;
        for (int i = 0; i < Acc.size(); i++){
            if (selectAccount.equals(Acc.get(i).getText())){
                Acc.get(i).click();
                break;
            }
        }
        if (selectAccount.substring(0,4).toString().equals("1102")){
            paymentService_page.overseasClickCurrencyBox.click();
            bddUtil.sleep(2);
            List<WebElementFacade> current1 = paymentService_page.selectAccount;
            for (int i = 0; i < current1.size(); i++) {
                if (current1.get(i).getText().equals(Currency)){
                    current1.get(i).click();
                }
            }
        }
        bddUtil.sleep(3);
    }
//    public void clickCurrency(String payeeCurrency){
//        paymentService_page.clickCurrencyBox.click();
//        List<WebElementFacade> payee = paymentService_page.payeeCurrency;
//        for (int i = 0; i <payee.size(); i++){
//            if (payeeCurrency.equals(payee.get(i).getText())){
//                payee.get(i).click();
//                break;
//            }
//        }
//        bddUtil.sleep(5);}

    public String randomTwoNum(){
        Random random = new Random();
        int num = random.nextInt(99);
        String Amount = String.format("%02d",num);
        return Amount;
    }


    public void enterAmount(){
        paymentService_page.enterAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
//        paymentService_page.enterAmount.sendKeys("150000");
    }

    public void largeAmount(){
        paymentService_page.enterAmount.sendKeys("310000");
    }

    public void selectAccBth(String selectAccBth){
        paymentService_page.currencyBox.click();
        bddUtil.sleep(3);
        List<WebElementFacade> selectAcc = paymentService_page.selectAccBth;
        for (int i = 0; i < selectAcc.size(); i++){
            if (selectAccBth.equals(selectAcc.get(i).getText())){
                selectAcc.get(i).click();
                break;
            }
        }
    }

    public void sendPaymentAccount(String sendPaymentAccount){paymentService_page.sendPaymentAccount.sendKeys(sendPaymentAccount);}

    public void namePayee(String NamePayee){paymentService_page.NamePayee.sendKeys(NamePayee);}

    public void collectingBox(){
        paymentService_page.collectingBankBox.click();
        bddUtil.sleep(3);
    }

    public void collectingBankBox(String collectingBank) {
        paymentService_page.selectBank.click();
        paymentService_page.searchBox.sendKeys(collectingBank);
        paymentService_page.serachButton.click();
        bddUtil.sleep(4);
        paymentService_page.radioSelect.click();
        paymentService_page.getConfirmBtn.click();
//        List<WebElementFacade> bank = paymentService_page.collectingBank;
//        for (int i = 0; i < bank.size(); i++) {
//            if (collectingBank.equals(bank.get(i).getText())) {
//                bank.get(i).click();
//                break;
//            }
//        }
    }

    public void payeeAdd(String payeeAdd){
        paymentService_page.payeeAdd.sendKeys(payeeAdd);}

    public void payeeCountriesEnCd(String payeeCountries) {
        paymentService_page.payeeCountriesEnCdBox.click();
        bddUtil.sleep(2);
        paymentService_page.payeeCountries.click();
        getDriver().findElement(By.xpath("//span[text()='AFGHANISTAN']/parent::li")).click();
    }
    public void remittancePostscriptContent(String remittancePostscriptContent){
        paymentService_page.remittancePostscriptContent.sendKeys(remittancePostscriptContent);}

    public void expense(String expense) {
        paymentService_page.expenseBox.click();
        bddUtil.sleep(5);
        List<WebElementFacade> bears = paymentService_page.expense;
        for (int i = 0; i < bears.size(); i++) {
            if (expense.equals("SHA") && "The expenses shall be borne by each party".equals(bears.get(i).getText())){
                bears.get(i).click();
                break;
            }else if (expense.equals("BEN") && "All expenses shall be borne by the payee".equals(bears.get(i).getText())){
                bears.get(i).click();
                break;
            } else if (expense.equals("OUR") && "All expenses shall be borne by the remitter".equals(bears.get(i).getText())) {
                bears.get(i).click();
                break;
            }
            }
        }

    public void paymentAttributeCd(String selectPaymentAttributeCd){
        paymentService_page.paymentAttributeCdBox.click();
        bddUtil.sleep(3);
        paymentService_page.selectPaymentAttributeCd.click();
    }

//    为触发AML高风险输入特定的数据。
    @Step
    public void inputHighRiskData(){
        paymentService_page.paymentAttributeCdBox.click();
        bddUtil.sleep(3);
        paymentService_page.TradeServices.click();
        bddUtil.sleep(2);
        paymentService_page.FreightOptions.click();
        bddUtil.sleep(2);
        paymentService_page.Sea.click();
        paymentService_page.VesselName.sendKeys("SANDINO");
        paymentService_page.VesselImo.sendKeys("9441178");
        paymentService_page.PortOfLoading.sendKeys("SDA");
        paymentService_page.PortOfDelivery.sendKeys("DASD");
        paymentService_page.GoodInvolved.sendKeys("Rubber");
        paymentService_page.expenseBox.click();
        bddUtil.sleep(2);
        paymentService_page.AllExpensesShal.click();
//        上传2个文件
        getDriver().findElement(By.xpath("//label[text()='Invoice']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        getDriver().findElement(By.xpath("//label[text()='Transport Document']/following-sibling::div//input")).sendKeys(fileAddress);
        bddUtil.sleep(3);
        paymentService_page.clickNextBox.click();
        bddUtil.sleep(5);
    }

    public void clickNextBox(){
        paymentService_page.clickNextBox.click();
    }
    public void checkErrorInformation(){
        paymentService_page.checkErrorInformation.isVisible();
    }

    public void staging() {
//        if (paymentService_page.getResetAmount.isVisible()){
//            paymentService_page.clickContinue.click();
//        }
//        accountTitleVerify();
        paymentService_page.staging.click();
    }

    public void selectSumB(){
        paymentService_page.selectSumB.click();
    }

    @Step
    public void vkeyAuthorizationSIT(){
        paymentService_page.clickNextButton.click();
        bddUtil.sleep(6);
        if (paymentService_page.clickNextButton.isVisible()){
            paymentService_page.clickNextButton.click();
        }
        paymentService_page.clickSendVerificationBtn.click();
        bddUtil.sleep(1);
        loginOtp = getDriver().switchTo().alert().getText().substring(7, 13);
        System.out.println(loginOtp);
        getDriver().switchTo().alert().accept();
        paymentService_page.inputVerificationCode.sendKeys(loginOtp);
        paymentService_page.clickOkBtn.click();
        bddUtil.sleep(2);
    }

    @Step
    public void getPayNowProxyId(){
        paymentService_page.clickViewDetails.click();
        proxyId = paymentService_page.getPayNowProxyId.getText();
        paymentService_page.clickDoneBtn.click();
    }

    @Step
    public void openEmailUrl(String emailName){
        JavascriptExecutor webdriver = (JavascriptExecutor)getDriver();
        webdriver.executeScript("window.open(\"https://mailtemp.top/\");");
        bddUtil.switchToNewWindow();
        paymentService_page.inputMailBox.sendKeys(emailName);
        paymentService_page.clickCreateBtn.click();
        paymentService_page.getClickRefreshBtn.click();
        bddUtil.sleep(2);
        paymentService_page.getClickRefreshBtn.click();
        bddUtil.sleep(2);
        Assert.assertEquals("Green Link Digital Bank Pte. Ltd message notification",paymentService_page.emailTitle.getText());
    }
    @Step
    public void getInnerPaymentDataOnChannelPage(String WordPath) throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ", "");
        FileUtils.FileString4("t24", nowDate + "\n" + "ChannelReferenceID:" + referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24", "ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24", "ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24", "ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24", "ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        creditAccountCurrency = paymentService_page.creditAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountCurrency:" + creditAccountCurrency);
        creditAccountNumber = paymentService_page.creditAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelCreditAccountNumber:" + creditAccountNumber);
        transactionAmount = paymentService_page.transactionAmount.getText();
        FileUtils.FileString4("t24","ChannelTransactionAmount:" + transactionAmount);
        purposeOfTransfer = paymentService_page.purposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelPurposeOfTransfer:" + purposeOfTransfer);
        bddUtil.scrollWindowToElement(paymentService_page.purposeOfTransfer);
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
    }
    @Step
    public void getFxPaymentDataOnChannelPage(String WordPath) throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24","ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        fxDetailPayeeAccountNum = paymentService_page.fxDetailPayeeAccountNum.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAccountNum:" + fxDetailPayeeAccountNum);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        fxDetailTransactionAmount = paymentService_page.fxDetailTransactionAmount.getText();
        FileUtils.FileString4("t24","ChannelDetailTransactionAmount:" + fxDetailTransactionAmount);
        bddUtil.scrollWindowToElement(paymentService_page.fxDetailBeneficiaryBankBIC);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentMT(WordPath);
        fxDetailBeneficiaryBankBIC = paymentService_page.fxDetailBeneficiaryBankBIC.getText();
        FileUtils.FileString4("t24","ChannelDetailBeneficiaryBankBIC:" + fxDetailBeneficiaryBankBIC);
        fxDetailPayeeAddress = paymentService_page.fxDetailPayeeAddress.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAddress:" + fxDetailPayeeAddress);
        fxDetailEstimatedProcessingFee = paymentService_page.fxDetailEstimatedProcessingFee.getText();
        FileUtils.FileString4("t24","ChannelDetailEstimatedProcessingFee:" + fxDetailEstimatedProcessingFee);
        fxDetailPaymentModeForCharges = paymentService_page.fxDetailPaymentModeForCharges.getText();
        FileUtils.FileString4("t24","ChannelDetailPaymentModeForCharges:" + fxDetailPaymentModeForCharges);
        fxDetailPurposeOfTransfer = paymentService_page.fxDetailPurposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelDetailPurposeOfTransfer:" + fxDetailPurposeOfTransfer);
    }
    @Step
    public void getFxPaymentDataOnChannelPageDifferentCurrency(String WordPath) throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24","ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        fxDetailPayeeAccountNum = paymentService_page.fxDetailPayeeAccountNum.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAccountNum:" + fxDetailPayeeAccountNum);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        fxDetailTransactionAmount = paymentService_page.fxDetailTransactionAmount.getText();
        FileUtils.FileString4("t24","ChannelDetailTransactionAmount:" + fxDetailTransactionAmount);
        bddUtil.scrollWindowToElement(paymentService_page.fxDetailBeneficiaryBankBIC);
        bddUtil.screenShort();
        WordUtils.photoStorageToFxPaymentDifferentCurrencyMX(WordPath);
        fxDetailBeneficiaryBankBIC = paymentService_page.fxDetailBeneficiaryBankBIC.getText();
        FileUtils.FileString4("t24","ChannelDetailBeneficiaryBankBIC:" + fxDetailBeneficiaryBankBIC);
        fxDetailPayeeAddress = paymentService_page.fxDetailPayeeAddress.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAddress:" + fxDetailPayeeAddress);
        fxDetailEstimatedProcessingFee = paymentService_page.fxDetailEstimatedProcessingFee.getText();
        FileUtils.FileString4("t24","ChannelDetailEstimatedProcessingFee:" + fxDetailEstimatedProcessingFee);
        fxDetailPaymentModeForCharges = paymentService_page.fxDetailPaymentModeForCharges.getText();
        FileUtils.FileString4("t24","ChannelDetailPaymentModeForCharges:" + fxDetailPaymentModeForCharges);
        fxDetailPurposeOfTransfer = paymentService_page.fxDetailPurposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelDetailPurposeOfTransfer:" + fxDetailPurposeOfTransfer);
    }
    @Step
    public void getFxPaymentMXDataOnChannelPage(String WordPath) throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ","");
        FileUtils.FileString4("t24",nowDate+"\n"+"ChannelReferenceID:"+referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        FileUtils.deleteFile("screenShots");
        bddUtil.screenShort();
        if (WordPath.equals("Bic is DBS USD-USD")|| WordPath.equals("Bic is Bank of China USD-USD")){
            WordUtils.photoStorageToFXPaymentMXUSDToUSD(WordPath);
        } else{
            WordUtils.photoStorageToFXPaymentMX(WordPath);
        }
        debitAccountName = paymentService_page.debitAccountName.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountName:" + debitAccountName);
        debitAccountCurrency = paymentService_page.debitAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountCurrency:" + debitAccountCurrency);
        debitAccountNumber = paymentService_page.debitAccountNumber.getText();
        FileUtils.FileString4("t24","ChannelDebitAccountNumber:" + debitAccountNumber);
        fxDetailBankName = paymentService_page.fxDetailBankName.getText();
        FileUtils.FileString4("t24","ChannelDetailBankName:" + fxDetailBankName);
        fxDetailPayeeName = paymentService_page.fxDetailPayeeName.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeName:" + fxDetailPayeeName);
        fxDetailAccountCurrency = paymentService_page.fxDetailAccountCurrency.getText();
        FileUtils.FileString4("t24","ChannelDetailAccountCurrency:" + fxDetailAccountCurrency);
        fxDetailPayeeAccountNum = paymentService_page.fxDetailPayeeAccountNum.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAccountNum:" + fxDetailPayeeAccountNum);
        if (paymentService_page.fxDetailExchangeRate.isVisible()){
            fxDetailExchangeRate = paymentService_page.fxDetailExchangeRate.getText();
            FileUtils.FileString4("t24","ChannelDetailExchangeRate:" + fxDetailExchangeRate);
        }
        fxDetailTransactionAmount = paymentService_page.fxDetailTransactionAmount.getText();
        FileUtils.FileString4("t24","ChannelDetailTransactionAmount:" + fxDetailTransactionAmount);
        bddUtil.scrollWindowToElement(paymentService_page.fxDetailBeneficiaryBankBIC);
        bddUtil.screenShort();
        WordUtils.photoStorageToFXPaymentMX(WordPath);
        fxDetailBeneficiaryBankBIC = paymentService_page.fxDetailBeneficiaryBankBIC.getText();
        FileUtils.FileString4("t24","ChannelDetailBeneficiaryBankBIC:" + fxDetailBeneficiaryBankBIC);
        fxDetailPayeeAddress = paymentService_page.fxDetailPayeeAddress.getText();
        FileUtils.FileString4("t24","ChannelDetailPayeeAddress:" + fxDetailPayeeAddress);
        fxDetailEstimatedProcessingFee = paymentService_page.fxDetailEstimatedProcessingFee.getText();
        FileUtils.FileString4("t24","ChannelDetailEstimatedProcessingFee:" + fxDetailEstimatedProcessingFee);
        fxDetailPaymentModeForCharges = paymentService_page.fxDetailPaymentModeForCharges.getText();
        FileUtils.FileString4("t24","ChannelDetailPaymentModeForCharges:" + fxDetailPaymentModeForCharges);
        fxDetailPurposeOfTransfer = paymentService_page.fxDetailPurposeOfTransfer.getText();
        FileUtils.FileString4("t24","ChannelDetailPurposeOfTransfer:" + fxDetailPurposeOfTransfer);
    }
    @Step
    public void InspectionStatus(String selectAccount,String sendPaymentAccount) {
        if (paymentService_page.BankProcess.getText().equals("银行处理中") || paymentService_page.BankProcess.getText().equals("bank in processing")) {
            CommonUtil.waiting(3000);
            paymentService_page.checkDetail.click();
        }
        CommonUtil.waiting(3000);
        Assert.assertEquals(selectAccount, paymentService_page.checkSelectAccount.getText());
        Assert.assertEquals(sendPaymentAccount, paymentService_page.checkSendPaymentAccount.getText());
    }


    public void saveTemplate() {paymentService_page.saveTemplate.click();}

    public void templateName(String templateName) {paymentService_page.templateName.sendKeys(templateName);}

    public void saveB() {paymentService_page.save.click();}

    public void theMenu() {
        Actions action = new Actions(getDriver());
        action.moveToElement(paymentService_page.theMenu).perform();
    }

    public void templateImport() {
        paymentService_page.templateImport.click();
        CommonUtil.waiting(5000);
    }

 //贸易融资
    public void transportMethod(String transportMethod){
        paymentService_page.transportMethodBox.click();
        CommonUtil.waiting(3000);
        List<WebElementFacade> Transportation = paymentService_page.transportMethod;
        for (int i = 0; i < Transportation.size(); i++) {
             if (transportMethod.equals(Transportation.get(i).getText())) {
                 Transportation.get(i).click();
                 break;
         }
     }
 }

    public void shipNm(String shipNm){paymentService_page.shipNm.sendKeys(shipNm);}

    public void shipNo(String shipNo){paymentService_page.shipNo.sendKeys(shipNo);}

    public void shipmentAddR(String shipmentAddR){paymentService_page.shipmentAddR.sendKeys(shipmentAddR);}

    public void trafficAddR(String trafficAddR){paymentService_page.trafficAddR.sendKeys(trafficAddR);}

    public void goodInvolved(String goodInvolved){paymentService_page.goodInvolved.sendKeys(goodInvolved);}

    public void invoice() {
        paymentService_page.invoice.click();
        CommonUtil.waiting(5000);
        bddUtil.fileUpload();
        CommonUtil.waiting(3000);
    }

    public void billLading() {
        paymentService_page.billLading.click();
        CommonUtil.waiting(5000);
        bddUtil.fileUpload();
        CommonUtil.waiting(3000);
    }

    public void SINGAPORE(){
        paymentService_page.SINGAPORE.click();
    }

    public void beginValidation() {
        if (paymentService_page.popTitle.isVisible()) {
            paymentService_page.begin.click();
        }
    }

    @Step
    public void managePayNowProfile() throws AWTException {
        EnterKeys enterKeys = new EnterKeys();
        paymentService_page.managePayNowProfile.click();
        paymentService_page.managePayNowProfileTitle.isVisible();
        bddUtil.sleep(3);
        paymentService_page.clickRegisterPayNowProfileBtn.click();
        paymentService_page.enterNum1.click();
        enterKeys.EnterKeys(StringUtil.getRandomNum(1));
        paymentService_page.enterNum2.click();
        enterKeys.EnterKeys(StringUtil.getRandomNum(1));
        paymentService_page.enterNum3.click();
        enterKeys.EnterKeys(StringUtil.getRandomNum(1));
        paymentService_page.clickNextBox.click();
        paymentService_page.clickSubmitBtn.click();
    }

    public void singSuccess(){
        String reference = paymentService_page.getReferenceID.getText();
        List<WebElementFacade> referenceId = paymentService_page.checkPayNowProxyID;
        for (int i = 0; i < referenceId.size(); i++) {
            if (reference.equals(referenceId.get(i).getText())){
                System.out.println("签约成功！");
                break;
            }
        }
    }

    @Step
    public void singOff(){
        paymentService_page.managePayNowProfile.click();
        paymentService_page.managePayNowProfileTitle.isVisible();
        List<WebElementFacade> singoff = paymentService_page.selectRegistered;
        List<WebElementFacade> threepoint = paymentService_page.selectThreePoint;
        for (int i = 0; i < singoff.size(); i++) {
            if (singoff.get(i).getText().equals("Registered")){
                Actions action=new Actions(getDriver());
                bddUtil.sleep(1);
                action.moveToElement(threepoint.get(i)).perform();
                paymentService_page.clickDeregisterProfile.click();
                break;
            }
        }
        paymentService_page.clickSubmitBtn.click();
    }

    @Step
    public void singModify(String accountNum){
        paymentService_page.managePayNowProfile.click();
        paymentService_page.managePayNowProfileTitle.isVisible();
        List<WebElementFacade> singoff = paymentService_page.selectRegistered;
        List<WebElementFacade> threepoint = paymentService_page.selectThreePoint;
        for (int i = 0; i < singoff.size(); i++) {
            if (singoff.get(i).getText().equals("Registered")){
                Actions action=new Actions(getDriver());
                bddUtil.sleep(1);
                action.moveToElement(threepoint.get(i)).perform();
                paymentService_page.clickEditProfile.click();
                break;
            }
        }
        List<WebElementFacade> accountNumTest = paymentService_page.editAccountNum;
        for (int i = 0; i < accountNumTest.size(); i++) {
            if (accountNumTest.get(i).getText().substring(0,13).equals(accountNum)){
                accountNumTest.get(i).getText();
                break;
            }
        }
        paymentService_page.clickNextBox.click();
        paymentService_page.clickSubmitBtn.click();
        paymentService_page.getSuccessTitle.isVisible();
    }

    @Step
    public void clickSubmitBtnJumpToVerifyCode(){
        paymentService_page.getClickSubmitBtn.click();
        paymentService_page.clickNextButton.click();
    }

    @Step
    public void checkAccountIsVisible(){
        bddUtil.sleep(3);
        paymentService_page.domesticTransfer.click();
        paymentService_page.clickMEPSBtn.click();
        paymentService_page.clickNextButton.click();
        paymentService_page.sitEnvLocalFundAccountPopBox.click();
        paymentService_page.sitEnvLocalFundAccountisDisplay.isVisible();
    }

    public void checkMEPSAccount(String fromAccountNum){
        bddUtil.sleep(3);
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.selectMepsMenu.click();
        paymentService_page.clickNextButton.click();
        paymentService_page.clickFromAccountDownDropBox.click();
        List<WebElementFacade> fromAccount = paymentService_page.selectFromAccountNum;
        for (int i = 0; i < fromAccount.size(); i++) {
            if (fromAccountNum.equals(fromAccount.get(i).getText())){
                fromAccount.get(i).click();
                break;
            }
        }
    }

    @Step
    public void inputFastInformation(String fromAccountNum,String toAccountNum,String date,String bankName,String transferType,String payNowModule,String payNowContent,String recurringTransfer,String dateType){
        bddUtil.sleep(3);
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        if (transferType.equals("Fast")) {
            paymentService_page.selectFastMenu.click();
        } else if (transferType.equals("Meps")) {
            paymentService_page.selectMepsMenu.click();
        } else if (transferType.equals("PayNow")) {
            paymentService_page.selectPayNowMenu.click();
        }
        paymentService_page.clickNextButton.click();
        paymentService_page.clickFromAccountDownDropBox.click();
        List<WebElementFacade> fromAccount = paymentService_page.selectFromAccountNum;
        for (int i = 0; i < fromAccount.size(); i++) {
            if (fromAccountNum.equals(fromAccount.get(i).getText().substring(0,13))){
                fromAccount.get(i).click();
                break;
            }
        }
        if (transferType.equals("Fast") || transferType.equals("Meps")){
            paymentService_page.clickANewPayeeBtn.click();
            paymentService_page.inputPayeeAccountName.sendKeys(RandomNameTool.getName(Language.en, NameType.FULL_NAME));
            paymentService_page.inputPayeeAccountNum.sendKeys(toAccountNum);
            paymentService_page.inputBankName.sendKeys(bankName);
            paymentService_page.selectBankName.click();
            paymentService_page.clickAddPayeeSecondBox.click();
        }else if (transferType.equals("PayNow")){
            if (payNowModule.equals("UEN")){
                paymentService_page.sitEnvPayNowUen.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(payNowContent);
            } else if (payNowModule.equals("VPA")) {
                paymentService_page.sitEnvPayNowVpa.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(payNowContent);
            } else if (payNowModule.equals("Mobile")) {
                paymentService_page.sitEnvPayNowMobileNumber.click();
                paymentService_page.inputCountryCode.sendKeys("+65");
                bddUtil.clickByJS(paymentService_page.selectCountryCode);
                paymentService_page.enterMobileNum.sendKeys(payNowContent);
            } else if (payNowModule.equals("NRIC")) {
                paymentService_page.sitEnvPayNowNric.click();
                paymentService_page.enterPayeeAcctNo.sendKeys(payNowContent);
            }
        }
        paymentService_page.inputTransactionAmount.sendKeys(GenerateDate.today()+"."+randomTwoNum());
        paymentService_page.inputTransactionDate.clear();
        if (date.equals("today")){
            paymentService_page.inputTransactionDate.sendKeys(DateUtil.format(new Date(),"dd/MM/yyyy"));
            bddUtil.sleep(1);
            paymentService_page.clickTransactionTips.click();
        }else {
            paymentService_page.inputTransactionDate.sendKeys(date);
            paymentService_page.clickTransactionTips.click();
            if (recurringTransfer.equals("No")){
                paymentService_page.selectRecurringTransferNoBox.click();
            }else if (recurringTransfer.equals("Yes")){
                paymentService_page.selectRecurringTransferYesBox.click();
                paymentService_page.requencyOfRecurrence.click();
                List<WebElementFacade> selectDate = paymentService_page.selectRequencyOfRecurrenceDate;
                for (int i = 0; i < selectDate.size(); i++) {
                    if (dateType.equals(selectDate.get(i).getText())){
                        selectDate.get(i).click();
                        break;
                    }
                }
            }
        }
        paymentService_page.clickPurposeInputBox.click();
        paymentService_page.selectPurposeText.click();
        paymentService_page.clickNextButton.click();
        paymentService_page.getClickSubmitBtn.click();
    }

    public void checkINBPage(){
        Assert.assertEquals("Home",paymentService_page.viewHomeMenu.getText());
        Assert.assertEquals("Accounts",paymentService_page.viewAccountsMenu.getText());
        Assert.assertEquals("Fixed Deposits",paymentService_page.viewFixedDepositsMenu.getText());
        Assert.assertEquals("Loans",paymentService_page.viewLoansMenu.getText());
        if (paymentService_page.transferAndRemittanceMenu.getText().equals("Payments")){
            Assert.assertEquals("Payments",paymentService_page.transferAndRemittanceMenu.getText());
        }else{
            Assert.assertEquals("Payments & Transfers",paymentService_page.transferAndRemittanceMenu.getText());
        }
        if (paymentService_page.adminMenu.getText().equals("Admin")){
            Assert.assertEquals("Admin",paymentService_page.adminMenu.getText());
        }else {
            Assert.assertEquals("Company Administration",paymentService_page.adminMenu.getText());
        }

        Assert.assertEquals("Supply Chain Finance",paymentService_page.viewSupplyChainFinanceMenu.getText());
    }

    public void checkMessage(){
        Assert.assertEquals("Welcome message",paymentService_page.checkMessage.getText());
    }

    @Step
    public void getTransactionDetails() throws Exception {
        FileUtils.writeFile("t24");
        referenceID = paymentService_page.referenceID.getText().replace(" ", "");
        FileUtils.FileString4("t24", nowDate + "\n" + "ChannelReferenceID:" + referenceID);
        paymentService_page.checkDetails.click();
        bddUtil.sleep(2);
        debitAccountNumber = paymentService_page.getFromAccountNumber.getText();
        FileUtils.FileString4("t24", "getDebitAccountNum:" + debitAccountNumber);
        if (paymentService_page.getToAccountNumber.isVisible()){
            creditAccountNumber = paymentService_page.getToAccountNumber.getText();
            FileUtils.FileString4("t24","getCreditAccountNumber:" + creditAccountNumber);
        }
        transactionAmount = paymentService_page.getTransferAmountSmockTest.getText();
        FileUtils.FileString4("t24","getTransactionAmount:" + transactionAmount);
    }
    public void inputTransferInformation(String fromAccountNum,String toAccountNum){
        paymentService_page.transferMoney.click();
        bddUtil.sleep(3);
        paymentService_page.rollOutCurrencySelectWindows.click();
        List<WebElementFacade> fromAccount = paymentService_page.selectFromAccountNum;
        for (int i = 0; i < fromAccount.size(); i++) {
            if (fromAccountNum.equals(fromAccount.get(i).getText())){
                fromAccount.get(i).click();
                break;
            }
        }
        paymentService_page.localPaymentToAccountDownDrop.click();
        bddUtil.sleep(2);
        List<WebElementFacade> toAccount = paymentService_page.selectFromAccountNum;
        for (int j = 0; j < toAccount.size(); j++) {
            if (toAccountNum.equals(toAccount.get(j).getText())){
                toAccount.get(j).click();
                break;
            }
        }
        transactionAmount = GenerateDate.today()+"."+randomTwoNum();
        paymentService_page.inputTransactionAmount.sendKeys(transactionAmount);
        paymentService_page.clickPurposeInputBox.click();
        paymentService_page.selectPurposeText.click();
        paymentService_page.clickNextButton.click();
        paymentService_page.getClickSubmitBtn.click();
    }
    public void checkMyTransactionInformation(){
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.clickMyTransaction.click();
        if (paymentService_page.getMyTransactionDate.getText().substring(0,9).equals(DateUtil.format(new Date(),"dd/MM/yyyy"))){
            Assert.assertEquals(transferAmount,paymentService_page.getMyTransactionAmount.getText());
        }
    }

    @Step
    public void clickManagePayees(){
        paymentService_page.clickManagePayees.click();
    }

    @Step
    public void payeesAddNewPayee(String bankName){
        paymentService_page.payeesAddNewPayee.click();
        paymentService_page.payeesAccountNum.sendKeys(randomAccount);
        paymentService_page.payeesAccountName.sendKeys("zhangsan");
        paymentService_page.clickPayeeBankDownDrop.click();
        List<WebElementFacade> selectBank = paymentService_page.selectTitle;
        for (int i = 0; i < selectBank.size(); i++) {
            if (bankName.equals(selectBank.get(i).getText())){
                selectBank.get(i).click();
                break;
            }
        }
        paymentService_page.clickSaveBtn.click();
    }

    public void checkDataAccountNum(){
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.payeesNewStatus.getText(),"Successful");
        paymentService_page.clickReturnBtn.click();
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.getFirstDataAccountNum.getText(),randomAccount);
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.threePoint).perform();
        paymentService_page.clickModifyBtn.click();
        paymentService_page.payeesAccountName.clear();
        paymentService_page.payeesAccountName.sendKeys("lisi");
        paymentService_page.clickSaveBtn.click();
    }

    public void modifyAndTransfer(){
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.payeesNewStatus.getText(),"Successful");
        paymentService_page.clickReturnBtn.click();
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.getFirstDataAccountNum.getText(),randomAccount);
        Actions action=new Actions(getDriver());
        bddUtil.sleep(3);
        action.moveToElement(paymentService_page.threePoint).perform();
        paymentService_page.clickTransferBtn.click();
    }

    @Step
    public void Transfer(){
        Actions action=new Actions(getDriver());
        bddUtil.sleep(3);
        action.moveToElement(paymentService_page.threePoint).perform();
        paymentService_page.clickTransferBtn.click();
    }

    @Step
    public void clickDeleteBtn(){
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.payeesNewStatus.getText(),"Successful");
        paymentService_page.clickReturnBtn.click();
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.getFirstDataAccountNum.getText(),randomAccount);
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.threePoint).perform();
        paymentService_page.clickDeleteBtn.click();
        paymentService_page.clickYesBtn.click();
    }

    @Step
    public void clickAccountsMenu(){
        if (paymentService_page.popWindowsTitle.isVisible()){
            paymentService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.clickAccountsMenu).perform();
    }

    @Step
    public void checkLocalFundsTransfer(){
        paymentService_page.clickAccountsOverview.click();
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.clickThreePoint).perform();
        paymentService_page.clickLocalFundsTransfer.click();
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.localFundsTransferTitle.getText(),"Local Fund Transfer");
    }

    @Step
    public void checkPlaceFixedDeposits(){
        paymentService_page.clickAccountsOverview.click();
        Actions action=new Actions(getDriver());
        bddUtil.sleep(1);
        action.moveToElement(paymentService_page.clickThreePoint).perform();
        paymentService_page.clickPlaceFixedDeposits.click();
        bddUtil.sleep(2);
        Assert.assertEquals(paymentService_page.checkPlaceFixedDepositTitle.getText(),"Place Fixed Deposit");
    }

    @Step
    public void appointmentTransferCycleTransfer(String accountNum,String status){
        paymentService_page.manageScheduledRecurringTransfers.click();
        paymentService_page.clickAccountNumberDownDrop.click();
        List<WebElementFacade> selectAccount = paymentService_page.selectAccountNumber;
        for (int i = 0; i < selectAccount.size(); i++) {
            if (accountNum.equals(selectAccount.get(i).getText().substring(0,13))){
                selectAccount.get(i).click();
                break;
            }
        }
        bddUtil.sleep(2);
        paymentService_page.clickStatusOfScheduledPaymentsDownDrop.click();
        List<WebElementFacade> statusOfScheduledPayments = paymentService_page.selectTitle;
        for (int j = 0; j < statusOfScheduledPayments.size(); j++) {
            if (status.equals(statusOfScheduledPayments.get(j).getText())){
                statusOfScheduledPayments.get(j).click();
                break;
            }
        }
        paymentService_page.clickSearchBtn.click();
        bddUtil.sleep(4);
        paymentService_page.checkSizes.isVisible();
    }
    public void clickFinishBtn(){
        paymentService_page.clickFinishBtn.click();
    }

    @Step
    public void checkTransferFromAccount(String rollOutAccount){
        paymentService_page.transferMoney.click();
        bddUtil.sleep(3);
        paymentService_page.rollOutCurrencySelectWindows.click();
        List<WebElementFacade> currency = paymentService_page.rollOutAccountSGD;
        for (int i = 0; i< currency.size();i++){
            if (rollOutAccount.contains(currency.get(i).getText().substring(0,currency.get(i).getText().indexOf("/")).trim())){
                bddUtil.scrollWindowToElement(currency.get(i)).click();
                break;
            }else {
                System.out.println("账号不存在，案例成功！");
            }
        }
    }
}
