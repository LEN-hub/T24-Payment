package com.glbank.com.sg.bdd.utils;


import java.io.File;
import java.io.IOException;

public class createXML {
    private static String systemPath = System.getProperty("user.dir");
    public static String path = systemPath + "/src/test/resources/testData/autopay/";
    public static void main(String[] args) throws IOException {
        createXML createXML = new createXML();
        createXML.createPayment_XML();
    }

    public static void createNewXml(File file) throws IOException{
            if (!file.exists()){
                try {
                    file.createNewFile();
                    System.out.println("XML文件创建成功");
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
    }

    public void createPayment_XML() throws IOException {
        File file = new File(path);
        if (!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        if (file.isDirectory()){
            System.out.println("文件是一个目录");
        }
        File deleteFile = new File(path, "Payment_XML.xml");
        if (deleteFile.exists()){
            System.out.println("文件存在");
            deleteFile.delete();
            System.out.println("文件删除成功");
            File createFile = new File(path, "Payment_XML.xml");
            createNewXml(createFile);
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件不存在");
            File createFile = new File(path, "Payment_XML.xml");
            createNewXml(createFile);
            System.out.println("文件创建成功");
        }
    }
}
