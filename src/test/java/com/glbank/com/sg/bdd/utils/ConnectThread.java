package com.glbank.com.sg.bdd.utils;

public class ConnectThread extends Thread{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ":start----");
        String data = ConnectLinux.getLastOtp("60120003");
        System.out.println(data);
        System.out.println(threadName + ":end----");
    }

}
