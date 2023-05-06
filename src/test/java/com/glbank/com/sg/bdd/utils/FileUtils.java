package com.glbank.com.sg.bdd.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

//    为了xml特意改的方法
    public static String XMLInput3(String path) {
        path = systemPath + "/src/test/resources/testData/autopay/" + path + ".xml";
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
     * 删除指定文件夹下的全部内容
     * @param file
     */
    public static void remove(File file) {
        File[] files = file.listFiles();//将file子目录及子文件放进文件数组
        if (files != null) {//如果包含文件进行删除操作
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {//删除子文件
                    files[i].delete();
                } else if (files[i].isDirectory()) {//通过递归方法删除子目录的文件
                    remove(files[i]);
                    System.out.println(file + "文件删除成功！");
                }
//                files[i].delete();//删除子目录
            }
        }
    }
    public static void deleteFile(String path){
        path = systemPath + "/src/test/resources/testData/" + path;
        File basefile = new File(path);   //path为给定的文件夹地址
        remove(basefile);
    }
    /**
     * 追加写入到txt
     *
     * @param path
     * @param data
     */
    @SuppressWarnings("resource")
    public static void FileString(String path, String data) {
        try {
            String allPath = systemPath + "/src/test/resources/testData/caseMessage/" + path + ".txt";
            File file=new File(allPath);
            if(!file.isFile() && !file.exists()){ //判断文件是否存在
                file.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(allPath, true);// 追加写入
            String content = FileInput4(path);
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

    /**
     * 高效读取指定编码格式的文件
     * @param path
     * @return
     */
    @SuppressWarnings("resource")
    public static String FileInput4(String path) {
        path = systemPath + "/src/test/resources/testData/caseMessage/" + path + ".txt";
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
     * 追加写入到txt
     *
     * @param path
     * @param data
     */
    @SuppressWarnings("resource")
    public static void FileString4(String path, String data) {
        try {
            String allPath = systemPath + "/src/test/resources/testData/autopay/" + path + ".txt";
            File file=new File(allPath);
            if(!file.isFile() && !file.exists()){ //判断文件是否存在
                file.createNewFile();
            }
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

//    追加写入XML
    public static void writeXML(String path, String data) {
        try {
            String allPath = systemPath + "/src/test/resources/testData/autopay/" + path + ".xml";
            File file=new File(allPath);
            if(!file.isFile() && !file.exists()){ //判断文件是否存在
                file.createNewFile();
            }
            FileOutputStream outputStream = new FileOutputStream(allPath, true);// 追加写入
            String content = XMLInput3(path);
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

    public static Map<String, String> getMap(String path){
        Map<String, String> map = new HashMap<>();
        try {
            String encoding="GBK";
            path = systemPath + "/src/test/resources/testData/" + path + ".txt";
            File file=new File(path);
            if(!file.isFile() && !file.exists()){ //判断文件是否存在
                file.createNewFile();
            }
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null){
                String[] s = lineTxt.split(":");
                map.put(s[0],s[1]);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return map;
    }

    public static void writeFile(String path) throws Exception{
        String allPath = systemPath + "/src/test/resources/testData/autopay/" + path + ".txt";
        File f = new File (allPath);
        FileWriter fw = new FileWriter (f);
        fw.write("");
        fw.flush();
        fw.close();
        System.out.println(path+".txt 文件内容清除成功！");
    }
    public static CharSequence readtxtFile(String path,String filed) {
        Map<String, String> map = getMap(path);
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getKey().equals(filed)) {
                return m.getValue();
            }
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(readtxtFile("automationTestCaseData/automationSitEnvData","sit_url_test"));
//        FileString("12345","321321312");
//        System.out.println(readtxtFile("t24","ChannelReferenceID"));
//        writeFile("t24");
//        //String filePath = "C:/workspace/DBB_GL_AutoTesting-dev/src/test/resources/testData/autopay/test.txt";
//        String filePath = "test";
//        FileUtils.FileString4(filePath,"datatest2022");
//        System.out.println(FileUtils.LastReadFileInput3("test"));
//        String rtn = FileInput3("test");
//        String[] arry = rtn.split(",");
//        List<String> fileContent = Arrays.asList(arry);
//        String lastLine = fileContent.get(fileContent.size() - 1);
//        System.out.println(lastLine);
//        for(int i = 0; i < fileContent.size(); i++){
//            //通过get方法传递索引获取集合元素
//            System.out.println(fileContent.get(i));
////        String filePath = "C:/workspace/DBB_GL_AutoTesting-dev/src/test/resources/testData/autopay/test.txt";
//        String filePath = "emailData";
//        String filePath1 = "userAddEmailData";
//        FileUtils.FileString4(filePath,"datatest2022");
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