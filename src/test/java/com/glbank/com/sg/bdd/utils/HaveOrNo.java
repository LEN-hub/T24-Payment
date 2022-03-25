package com.glbank.com.sg.bdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HaveOrNo {
    public Boolean check(WebDriver driver,By seletor) {
        try {
            driver.findElement(seletor);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}