package com.hsbc.cmb.hk.dbb.utils;

import java.io.*;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("resource")
public class FileUtils {
    public static String FileRead(String path){
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(path),"UTF-8"));
            String data = null;
            while((data = bufferedReader.readLine()) != null){
                buffer.append(data+"\r\n");
            }
            bufferedReader.close();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return buffer.toString();
    }

    @SuppressWarnings("resource")
    public static void FileWrite(String path,String data){
        try {
            FileOutputStream outputStream = new FileOutputStream(path,true);
            outputStream.write(("\r\n" + data).getBytes());
            outputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        String filePath = "D:/Program Files (x86)/workspace/DBB_GL_AutoTestting-devsrc/test/resources/testData/autopay/testData.txt";
        String filePath2 = "D:\\Program Files (x86)\\workspace\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\testData\\autopay\\testData.txt";
        FileUtils.FileWrite(filePath2,"test0899");
        List<String> fileContent = Collections.singletonList(FileRead(filePath2));
        for (int i = 0; i< fileContent.size();i++){
            System.out.println(fileContent.get(i).toString());
        }
    }
}
