package com.glbank.com.sg.bdd.utils;

public class ConnectThreadTest {

    public static void main(String[] args) throws InterruptedException {
        ConnectThread thread1 = new ConnectThread();
        ConnectThread thread2 = new ConnectThread();
        ConnectThread thread3 = new ConnectThread();
        ConnectThread thread4 = new ConnectThread();
        ConnectThread thread5 = new ConnectThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
    }

}
