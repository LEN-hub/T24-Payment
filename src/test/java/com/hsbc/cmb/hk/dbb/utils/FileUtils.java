package com.hsbc.cmb.hk.dbb.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.io.*;
import java.util.*;

public class FileUtils {

    /**
     * 字符流写入字符串到txt
     */
    @SuppressWarnings("resource")
    public static void FileString(String path, String data) {
        try {
            FileWriter writer = new FileWriter(path);// 字符流
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 字节输出到txt
     *
     * @param path
     * @param data
     */
    @SuppressWarnings("resource")
    public static void FileString2(String path, String data) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);// 字节流
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
     * 设置编码格式写出到txt
     *
     * @param path
     * @param data
     */
    public static void FileString3(String path, String data) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");// 设置编码格式
            writer.write(data);
            writer.close();
        } catch (UnsupportedEncodingException e) {
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
    public static String FileInput3(String path) {
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
        return rtn.substring(0, rtn.length() - 1);
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
            FileOutputStream outputStream = new FileOutputStream(path, true);// 追加写入
            String content = FileInput3(path);
            outputStream.write(((content != null && !content.equals("")) ? "\r\n" : "" + data).getBytes());
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
     * 存储list到文件
     *
     * @param path
     * @param list
     */
    @SuppressWarnings("resource")
    public static <T> void FileWriteList1(String path, List<T> list) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(list);
            stream.close();
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
     * 设置编码格式存储list到txt
     *
     * @param path
     * @param list
     */

    @SuppressWarnings("resource")
    public static <T> void FileWriteList(String path, List<T> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for (T s : list) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
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
    }


    /**
     * 读取本地文件数据设置指定编码
     *
     * @param path
     */
    @SuppressWarnings("resource")
    public static String FileInputString(String path) {
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String data = null;
            while ((data = reader.readLine()) != null) {
                buffer.append(data + "\r\n");
            }
            reader.close();
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
        return buffer.toString();
    }

    /**
     * 根据字节读取文件
     *
     * @param path
     * @return
     */
    @SuppressWarnings("resource")
    public static String FileInputString2(String path) {
        StringBuffer buffer = new StringBuffer();
        try {
            FileInputStream inputStream = new FileInputStream(path);
            byte[] bytes = new byte[1024];
            int bytead = 0;
            while ((bytead = inputStream.read(bytes)) != -1) {
                buffer.append(new String(bytes, 0, bytead));
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return buffer.toString();
    }

    /**
     * 获取本地文件中的list
     *
     * @param path
     */

    @SuppressWarnings("resource")
    public static <T> void FileInputList(String path) {
        try {
            FileInputStream inputStream = new FileInputStream(path);
            ObjectInputStream stream = new ObjectInputStream(inputStream);
            List<T> list = (List<T>) stream.readObject();
            inputStream.close();
            stream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (StreamCorruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static List<String> getFileContent(String path) {
        List<String> strList = new ArrayList<String>();
        File file = new File(Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(path)).getFile());
        InputStreamReader read = null;
        BufferedReader reader = null;
        try {
            read = new InputStreamReader(new FileInputStream(file),"utf-8");
            reader = new BufferedReader(read);
            String line;
            while ((line = reader.readLine()) != null) {
                strList.add(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (read != null) {
                try {
                    read.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        return strList;
    }

    public static void main(String[] args) {
        //String filePath = "C:/workspace/DBB_GL_AutoTesting-dev/src/test/resources/testData/autopay/test.txt";
        String systemPath = System.getProperty("user.dir");
        String filePath = systemPath + "/src/test/resources/testData/autopay/test.txt";
        FileUtils.FileString4(filePath,"datatest0");
        String rtn = FileInput3(filePath);
        String[] arry = rtn.split(",");
        List<String> fileContent = Arrays.asList(arry);
        String lastLine = fileContent.get(fileContent.size() - 1);
        System.out.println(lastLine);
        for(int i = 0; i < fileContent.size(); i++){
            //通过get方法传递索引获取集合元素
            System.out.println(fileContent.get(i));
        }
        }
}