package com.glbank.com.sg.bdd.utils;

import org.apache.poi.ss.formula.functions.Today;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GenerateDate {

    long millsec_day = 24*3600*1000;

    static Calendar cal_currently = Calendar.getInstance(); // get currently calendar
    static Date date = cal_currently.getTime();
    static DateFormat de = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
    static DateFormat df = new SimpleDateFormat("Mdd"); // set date format

    /**
     * 获取今天
     * @return
     */
    public static String todayDate() {
        return de.format(date);
    }
    public static String today() {
        return df.format(date);
    }

    /**
     * 相比今天往前多少天
     * @param days
     * @return
     */
    public String before(int days) {
        return df.format(date.getTime() - days * millsec_day);
    }

    /**
     * 相比今天往后多少天
     * @param days
     * @return
     */
    public String after(int days) {
        return df.format(date.getTime() + days * millsec_day);
    }
}