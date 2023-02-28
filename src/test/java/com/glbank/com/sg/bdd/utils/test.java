package com.glbank.com.sg.bdd.utils;

import org.apache.commons.lang3.StringUtils;

public class test {
    private static String systemPath = System.getProperty("user.dir");
    public static void main(String[] args) {
        System.out.println(systemPath);
        String a = "C:/Users/CyberArk/.jenkins/workspace/SCF_HealthCheck_Automation/target/failsafe-reports/failsafe-summary.xml";
        int startIndex = a.indexOf("workspace/")+10;
        int endIndex = a.indexOf("/target");
        String aa = a.substring(startIndex,endIndex);
        System.out.println(aa);
    }
}
