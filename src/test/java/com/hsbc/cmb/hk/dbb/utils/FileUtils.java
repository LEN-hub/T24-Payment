package com.hsbc.cmb.hk.dbb.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.io.*;
import java.util.*;

public class FileUtils {

    private static String systemPath = System.getProperty("user.dir");

    private static String GBK = "gbk";

    /**
     * 高效读取指定编码格式的文件
     * @param path
     * @return
     */
    @SuppressWarnings("resource")
    public static String FileInput3(String path) {
        path = systemPath + "/src/test/resources/testData/autopay/" + path + ".txt";
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                //buffer.append(data+"\r\n");
                buffer.append(data+",");
            }
            bufferedReader.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String rtn = buffer.toString();
        return rtn != null && !rtn.equals("") ? rtn.substring(0, rtn.length() - 1) : null;
    }

    /**
     * 高效读取指定编码格式的文件
     * @param path
     * @return
     */
    @SuppressWarnings("resource")
    public static String LastReadFileInput3(String path) {
        path = systemPath + "/src/test/resources/testData/autopay/" + path + ".txt";
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                //buffer.append(data+"\r\n");
                buffer.append(data+",");
            }
            bufferedReader.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String rtn = buffer.toString();
        rtn = rtn != null && !rtn.equals("") ? rtn.substring(0, rtn.length() - 1) : null;
        if(rtn != null){
            String[] content = rtn.split(",");
            return content[content.length - 1];
        }
        return null;
    }


    /**
     * 追加写入到txt
     *
     * @param path
     * @param data
     */
    @SuppressWarnings("resource")
    public static void FileString4(String path, String data) {
        try {
            String allPath = systemPath + "/src/test/resources/testData/autopay/" + path + ".txt";
            FileOutputStream outputStream = new FileOutputStream(allPath, true);// 追加写入
            String content = FileInput3(path);
            data = content != null && !content.equals("") ? "\r\n" + data : "" + data;
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        String filePath = "C:/workspace/DBB_GL_AutoTesting-dev/src/test/resources/testData/autopay/test.txt";
        String filePath = "emailData";
        FileUtils.FileString4(filePath,"datatest2022");
//        System.out.println(FileUtils.LastReadFileInput3("test"));
//        String rtn = FileInput3(filePath);
//        String[] arry = rtn.split(",");
//        List<String> fileContent = Arrays.asList(arry);
//        String emailName = fileContent.get(fileContent.size()-2);
//        String lastLine = fileContent.get(fileContent.size() - 1);
//        System.out.println("用户名称："+emailName);
//        System.out.println("邮箱地址："+lastLine);
//        for(int i = 0; i < fileContent.size(); i++){
//            //通过get方法传递索引获取集合元素
//            System.out.println(fileContent.get(i-1));
//        }
        }
}