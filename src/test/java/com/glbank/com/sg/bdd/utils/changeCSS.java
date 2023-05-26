package com.glbank.com.sg.bdd.utils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class changeCSS {
    private static String systemPath = System.getProperty("user.dir");

    public static void main(String[] args) throws IOException{
        //获取文件路径
        Path p = Paths.get(systemPath+"/target/site/serenity/nivo-slider/3.2/nivo-slider.css");
        //读取文件内容
        List<String> lines = Files.readAllLines(p);
        //存储文件内容
        List<String> lines_New = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        lines.forEach(l->{
            //替换文件内容
//            boolean contains = lines.contains("position:absolute;");
//            if (lines.contains("position:absolute;")){
//                for (int i = 1; i < lines.size(); i++) {
//                    System.out.println("这是第"+i+"次为："+contains);
//                }
//            }
            if(l.contains("position:absolute;")) {
//                l = l.replace(".nivo-caption {\n" +
//                        "\tposition:absolute;","position:");
                //                存入list
                list.add(l);
                System.out.println("list:"+list);
                System.out.println("List的長度："+list.size());
                if (list.size() == 5){
//                    当前的position值
                    l = l.replace("position:absolute;","position:static;");
                }
            }
//            //            等全部遍历完毕
//            if (list.size() == 5){
//                l.replace("position:absolute;","position:;");
//            }
            System.out.println(l);
            lines_New.add(l);
        });
        //删除旧文件
        Files.delete(p);
        System.out.println("delete...after.");
        //创建新文件
        File file = new File(systemPath+"/target/site/serenity/nivo-slider/3.2/nivo-slider.css");
        Path p2 = Paths.get(file.getAbsolutePath());
        //写内容到文件
        Files.write(p2,lines_New);
        System.out.println("写入成功");
    }
}
