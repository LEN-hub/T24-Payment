package com.glbank.com.sg.bdd.utils;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.xwpf.usermodel.*;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: Word替换字符和插入图片工具类
 * @Version: 1.0
 */
public class WordUtils {
    public static String date = BDDUtil.getCurrentTimestamp();
    private static String systemPath = System.getProperty("user.dir");
    public static String path3;


    /**
     * 根据模板生成word
     * @param path     模板的路径
     * @param params   需要替换的参数
     * @param fileName 生成word文件的文件名
     */
    public void getWord(String path, Map<String, Object> params,String fileName) throws Exception {
        File file = new File(path);
        //创建输入流
        InputStream is = new FileInputStream(file);
        //创建doc对象
        CustomXWPFDocument doc = new CustomXWPFDocument(is);
        //替换文本里面的变量
        this.replaceInPara(doc, params);
        //输出流写入文件
        FileOutputStream out = new FileOutputStream(fileName);
        doc.write(out);
        //关闭输入输出流
        this.close(is);
        out.close();
        System.out.println("<-----测试报告生成结束----->");
    }

    /**
     * 替换段落里面的变量
     * @param doc    要替换的文档
     * @param params 参数
     */
    private void replaceInPara(CustomXWPFDocument doc, Map<String, Object> params) {
        Iterator<XWPFParagraph> iterator = doc.getParagraphsIterator();
        XWPFParagraph para;
        while (iterator.hasNext()) {
            para = iterator.next();
            this.replaceInPara(para, params, doc);
        }
    }

    /**
     * 替换段落里面的变量
     * @param para   要替换的段落
     * @param params 参数
     */
    private void replaceInPara(XWPFParagraph para, Map<String, Object> params, CustomXWPFDocument doc) {
        List<XWPFRun> runs;
        Matcher matcher;
        if (this.matcher(para.getParagraphText()).find()) {
            runs = para.getRuns();
            int start = -1;
            int end = -1;
            String str = "";
            for (int i = 0; i < runs.size(); i++) {
                XWPFRun run = runs.get(i);
                String runText = run.toString();
                if ('$' == runText.charAt(0) && '{' == runText.charAt(1)) {
                    start = i;
                }
                if ((start != -1)) {
                    str += runText;
                }
                if ('}' == runText.charAt(runText.length() - 1)) {
                    if (start != -1) {
                        end = i;
                        break;
                    }
                }
            }

            for (int i = start; i <= end; i++) {
                para.removeRun(i);
                i--;
                end--;
            }

            for (Map.Entry<String, Object> entry : params.entrySet()) {
                String key = entry.getKey();
                if (str.indexOf(key) != -1) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        str = str.replace(key, value.toString());
                        para.createRun().setText(str, 0);
                        break;
                    } else if (value instanceof Map) {
                        str = str.replace(key, "");
                        Map pic = (Map) value;
                        int width = Integer.parseInt(pic.get("width").toString());
                        int height = Integer.parseInt(pic.get("height").toString());
                        int picType = getPictureType(pic.get("type").toString());
                        byte[] byteArray = (byte[]) pic.get("content");
                        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArray);
                        try {
                            //int ind = doc.addPicture(byteInputStream,picType);
                            //doc.createPicture(ind, width , height,para);
                            doc.addPictureData(byteInputStream, picType);
                            doc.createPicture(doc.getAllPictures().size() - 1, width, height, para);
                            para.createRun().setText(str, 0);
                            break;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    /**
     * 正则匹配字符串
     * @param str
     * @return
     */
    private Matcher matcher(String str) {
        Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher;
    }
    /**
     * 根据图片类型，取得对应的图片类型代码
     * @param picType
     * @return int
     */
    private static int getPictureType(String picType) {
        int res = CustomXWPFDocument.PICTURE_TYPE_PICT;
        if (picType != null) {
            if (picType.equalsIgnoreCase("png")) {
                res = CustomXWPFDocument.PICTURE_TYPE_PNG;
            } else if (picType.equalsIgnoreCase("dib")) {
                res = CustomXWPFDocument.PICTURE_TYPE_DIB;
            } else if (picType.equalsIgnoreCase("emf")) {
                res = CustomXWPFDocument.PICTURE_TYPE_EMF;
            } else if (picType.equalsIgnoreCase("jpg") || picType.equalsIgnoreCase("jpeg")) {
                res = CustomXWPFDocument.PICTURE_TYPE_JPEG;
            } else if (picType.equalsIgnoreCase("wmf")) {
                res = CustomXWPFDocument.PICTURE_TYPE_WMF;
            }
        }
        return res;
    }

    /**
     * 将输入流中的数据写入字节数组
     * @param in
     * @return
     */
    public static byte[] inputStream2ByteArray(InputStream in, boolean isClose) {
        byte[] byteArray = null;
        try {
            int total = in.available();
            byteArray = new byte[total];
            in.read(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isClose) {
                try {
                    in.close();
                } catch (Exception e2) {
                    e2.getStackTrace();
                }
            }
        }
        return byteArray;
    }
    /**
     * 关闭输入流
     * @param is
     */
    private void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void photoStorageToLocalPaymentFXMessage(){
        BDDUtil.size = BDDUtil.size + 1;
        int size = BDDUtil.size;
        WordUtils wordUtil = new WordUtils();
        String path = systemPath + "/src/test/resources/testData/";
        Map<String,Object> jepg = new HashMap<String, Object>(){{
            put("width", 648);put("height", 389);put("type", "png");
        }};
        try{
            Map<String, Object> data = SerializationUtils.clone((HashMap<String, Object>) jepg);
            data.put("content", WordUtils.inputStream2ByteArray(
                    new FileInputStream(path+"screenShots/"+BDDUtil.date.get(size - 1) +".png"),
                    true
            ));
            BDDUtil.params.put("${picture" + size + "}", data);
            //模板文件位置
            String path2=path + "excel/Internal Transfer Same Currency.docx";
            path3 = path + "word/"+date+"Internal Transfer Same Currency.docx";
            //生成文件位置
            String fileName= new String(path3.getBytes("UTF-8"),"iso-8859-1");
            wordUtil.getWord(path2,BDDUtil.params,fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void photoStorageToLocalPayment(){
        BDDUtil.size = BDDUtil.size + 1;
        int size = BDDUtil.size;
        WordUtils wordUtil = new WordUtils();
        String path = systemPath + "/src/test/resources/testData/";
        Map<String,Object> jepg = new HashMap<String, Object>(){{
            put("width", 648);put("height", 389);put("type", "png");
        }};
        try{
            Map<String, Object> data = SerializationUtils.clone((HashMap<String, Object>) jepg);
            data.put("content", WordUtils.inputStream2ByteArray(
                    new FileInputStream(path+"screenShots/"+BDDUtil.date.get(size - 1) +".png"),
                    true
            ));
            BDDUtil.params.put("${picture" + size + "}", data);
            //模板文件位置
            String path2=path + "excel/Internal Transfer Different Currency.docx";
            path3 = path + "word/"+date+"Internal Transfer Different Currency.docx";
            //生成文件位置
            String fileName= new String(path3.getBytes("UTF-8"),"iso-8859-1");
            wordUtil.getWord(path2,BDDUtil.params,fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void photoStorageToFXPaymentMX(){
        BDDUtil.size = BDDUtil.size + 1;
        int size = BDDUtil.size;
        WordUtils wordUtil = new WordUtils();
        String path = systemPath + "/src/test/resources/testData/";
        Map<String,Object> jepg = new HashMap<String, Object>(){{
            put("width", 692);put("height", 389);put("type", "png");
        }};
        try{
            Map<String, Object> data = SerializationUtils.clone((HashMap<String, Object>) jepg);
            data.put("content", WordUtils.inputStream2ByteArray(
                    new FileInputStream(path+"screenShots/"+BDDUtil.date.get(size - 1) +".png"),
                    true
            ));
            BDDUtil.params.put("${picture" + size + "}", data);
            //模板文件位置
            String path2=path + "excel/Oversea Payment Same Currency.docx";
            path3 = path + "word/"+date+"Oversea Payment Same Currency.docx";
            //生成文件位置
            String fileName= new String(path3.getBytes("UTF-8"),"iso-8859-1");
            wordUtil.getWord(path2,BDDUtil.params,fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void photoStorageToFxPaymentDifferentCurrencyMX(){
        BDDUtil.size = BDDUtil.size + 1;
        int size = BDDUtil.size;
        WordUtils wordUtil = new WordUtils();
        String path = systemPath + "/src/test/resources/testData/";
        Map<String,Object> jepg = new HashMap<String, Object>(){{
            put("width", 692);put("height", 389);put("type", "png");
        }};
        try{
            Map<String, Object> data = SerializationUtils.clone((HashMap<String, Object>) jepg);
            data.put("content", WordUtils.inputStream2ByteArray(
                    new FileInputStream(path+"screenShots/"+BDDUtil.date.get(size - 1) +".png"),
                    true
            ));
            BDDUtil.params.put("${picture" + size + "}", data);
            //模板文件位置
            String path2=path + "excel/Oversea Payment Different Currency MX.docx";
            path3 = path + "word/"+date+"Oversea Payment Different Currency MX.docx";
            //生成文件位置
            String fileName= new String(path3.getBytes("UTF-8"),"iso-8859-1");
            wordUtil.getWord(path2,BDDUtil.params,fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void photoStorageToFxPaymentMT(){
        BDDUtil.size = BDDUtil.size + 1;
        int size = BDDUtil.size;
        WordUtils wordUtil = new WordUtils();
        String path = systemPath + "/src/test/resources/testData/";
        Map<String,Object> jepg = new HashMap<String, Object>(){{
            put("width", 692);put("height", 389);put("type", "png");
        }};
        try{
            Map<String, Object> data = SerializationUtils.clone((HashMap<String, Object>) jepg);
            data.put("content", WordUtils.inputStream2ByteArray(
                    new FileInputStream(path+"screenShots/"+BDDUtil.date.get(size - 1) +".png"),
                    true
            ));
            BDDUtil.params.put("${picture" + size + "}", data);
            //模板文件位置
            String path2=path + "excel/Oversea Payment Different Currency MT.docx";
            path3 = path + "word/"+date+"Oversea Payment Different Currency MT.docx";
            //生成文件位置
            String fileName= new String(path3.getBytes("UTF-8"),"iso-8859-1");
            wordUtil.getWord(path2,BDDUtil.params,fileName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public  static <T extends Serializable> T clone(T obj) {
        T clonedObj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();
            ByteArrayInputStream bais = new  ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            clonedObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clonedObj;
    }
}

