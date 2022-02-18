package com.hsbc.cmb.hk.dbb.steps.enterpriseNetSilver;

import com.hsbc.cmb.hk.dbb.pages.enterpriseNetSilver.paymentService_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import com.hsbc.cmb.hk.dbb.utils.CommonUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import java.util.List;

public class paymentService_step extends ScenarioSteps {
    private BDDUtil bddUtil;
    private paymentService_page paymentService_page;

    @Step
    public void transferAndRemittanceMenu(){
        if (paymentService_page.popWindowsTitle.isVisible()){
            paymentService_page.popWindowsOk.click();
        }
        Actions action=new Actions(getDriver());
        action.moveToElement(paymentService_page.transferAndRemittanceMenu).perform();
    }

    @Step
    public void sdgTransferToUsd(String rollOutAccount,String intoAccount,String amount){
        paymentService_page.transferMoney.click();
        paymentService_page.rollOutCurrencySelectWindows.click();
        List<WebElementFacade> currency = paymentService_page.rollOutAccountSGD;
        for (int i = 0; i< currency.size();i++){
            if (rollOutAccount.equals(currency.get(i).getText().substring(0,currency.get(i).getText().indexOf("/")))){
                currency.get(i).click();
                break;
            }
        }
//        bddUtil.scrollWindowToElement(paymentService_page.rollOutAccountSGD).click();
        paymentService_page.secondPopWindows.click();
        List<WebElementFacade> secondCurrency = paymentService_page.secondCurrencySelectSGD;
        for(int j = 0; j < secondCurrency.size(); j++){
            if (intoAccount.equals(secondCurrency.get(j).getText().substring(0,secondCurrency.get(j).getText().indexOf("/")))){
                secondCurrency.get(j).click();
                break;
            }
        }
//        paymentService_page.secondCurrencySelectUSD.click();
        bddUtil.scrollWindowToElement(paymentService_page.clickNextBtn);
        paymentService_page.enterMoney.sendKeys(amount);
        paymentService_page.transferPurpose.click();
        paymentService_page.selectTransferPurpose.click();
        paymentService_page.clickNextBtn.click();
    }

    @Step
    public void accountTitleVerify(){
        if (paymentService_page.tipsTitle.isVisible()){
            paymentService_page.clickTipsContinueBtn.click();
        }
        paymentService_page.accountTitle.isDisplayed();
    }

    @Step
    public void clickSubmitBtn(){
        paymentService_page.submitBtn.click();
    }

    @Step
    public void successTitle(){
        paymentService_page.successTitle.isDisplayed();
        paymentService_page.serialNumber.isDisplayed();
        if(paymentService_page.statusSuccess.getText().equals("交易成功") || paymentService_page.statusSuccess.getText().equals("Trade Successfully")){
            paymentService_page.checkDetails.click();
        }
    }

    @Step
    public void domesticTransfer(String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect){
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.collectingBankPopWindows.click();
        paymentService_page.selectSGD.click();
        paymentService_page.accountName.sendKeys(accountName);
        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        paymentService_page.transferAmount.sendKeys(transferAmount);
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int i = 0; i< selectTradeAmount.size(); i++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(i).getText())){
                selectTradeAmount.get(i).click();
                break;
            }
        }
    }

    @Step
    public void otherDomesticTransfer(String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect){
        paymentService_page.domesticTransfer.click();
        CommonUtil.waiting(2000);
        paymentService_page.collectingBankPopWindows.click();
        paymentService_page.overseasTrasferAccount.click();
        paymentService_page.accountName.sendKeys(accountName);
        paymentService_page.paymentAccount.sendKeys(paymentAccount);
        paymentService_page.transferAmount.sendKeys(transferAmount);
        bddUtil.scrollWindowToElement(paymentService_page.nextBtn);
        paymentService_page.tradeAmountPopWindows.click();
        List<WebElementFacade> selectTradeAmount = paymentService_page.tradeAmountSelectFirst;
        for (int i = 0; i< selectTradeAmount.size(); i++){
            if (tradeAmountSelect.equals(selectTradeAmount.get(i).getText())){
                selectTradeAmount.get(i).click();
                break;
            }
        }
    }

    @Step
    public void rollOutDate(String selectDate){
        paymentService_page.dataInputBox.click();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
        a:for (int j = 0; j < rollOutDate.size(); j++){
            if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
                rollOutDate.get(j).click();
                break;
            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
                paymentService_page.nextMonth.click();
                for (int x = 0;x < rollOutDate.size(); x++){
                    if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(x).getText())){
                        rollOutDate.get(x).click();
                        break a;
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

    @Step
    public void rollOutDateTwentyNine(String selectDate){
        paymentService_page.dataInputBox.click();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<WebElementFacade> rollOutDate = paymentService_page.rollOutDate;
        a:for (int j = 0; j < rollOutDate.size(); j++){
            if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(j).getText())){
                if (!sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || !sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                   rollOutDate.get(j).click();
                   break;
                }else if(sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("29") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("30") || sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals("31")){
                    paymentService_page.nextMonth.click();
                    for (int x = 0;x < rollOutDate.size(); x++){
                        if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(x).getText())) {
                            rollOutDate.get(x).click();
                            break a;
                        }
                    }
                }
            }else if (!sdf.format(getNextWeekMonday(new Date())).substring(5,7).equals(sdf.format(getThisWeekMonday(new Date())).substring(5,7))){
                paymentService_page.nextMonth.click();
                for (int n = 0;n < rollOutDate.size(); n++){
                    if (sdf.format(getNextWeekMonday(new Date())).substring(8,10).equals(rollOutDate.get(n).getText())){
                        rollOutDate.get(n).click();
                        break a;
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
    public void checkCollectionName(String accountName,String paymentAccount,String transferAmount,String tradeAmountSelect){
        Assert.assertEquals(accountName,paymentService_page.checkCollectionName.getText());
        Assert.assertEquals(paymentAccount,paymentService_page.checkPaymentAccount.getText());
        Assert.assertEquals(transferAmount,paymentService_page.checkTransferAmount.getText());
        Assert.assertEquals(tradeAmountSelect,paymentService_page.checkTradeAmountSelect.getText());
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
        Assert.assertEquals(transferAmount,paymentService_page.getAccountMount.getText());
        Assert.assertEquals(tradeAmountSelect,paymentService_page.getAccountUse.getText());
    }

    @Step
    public void getPopWindowsTitle(){
        if (paymentService_page.getPopWindowsTitle.isVisible()){
            paymentService_page.continueBtn.click();
        }
    }

}