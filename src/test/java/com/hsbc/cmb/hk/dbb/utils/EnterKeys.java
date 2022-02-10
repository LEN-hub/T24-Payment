package com.hsbc.cmb.hk.dbb.utils;

import java.awt.*;
import java.awt.event.KeyEvent;

public class EnterKeys {

    public void EnterKeys(String value) throws AWTException {
        Robot robot = new Robot();
        if (value.equals("1")){
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
        }else if (value.equals("2")){
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
        }else if (value.equals("3")){
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
        }else if (value.equals("4")){
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
        }else if (value.equals("5")){
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
        }else if (value.equals("6")){
            robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_6);
        }else if (value.equals("7")){
            robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);
        }else if (value.equals("8")){
            robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_8);
        }else if (value.equals("9")){
            robot.keyPress(KeyEvent.VK_9);
            robot.keyRelease(KeyEvent.VK_9);
        }else if (value.equals("0")){
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
        }
    }
}
