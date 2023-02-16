package com.glbank.com.sg.bdd.utils;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.*;

public class JenkinsReportData {

    private static String systemPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        try {
            writeFile("Jenkins");
//creating a constructor of file class and parsing an XML file
            File file = new File( "C:/Users/CyberArk/.jenkins/workspace/Testcase/target/failsafe-reports/failsafe-summary.xml");
//an instance of factory that gives a document builder
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//an instance of builder to parse the specified xml file
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("failsafe-summary");
// nodeList is not iterable, so we are using for loop
            for (int itr = 0; itr < nodeList.getLength(); itr++)
            {
                Node node = nodeList.item(itr);
                System.out.println("\nNode Name :" + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element eElement = (Element) node;
                    String success = eElement.getElementsByTagName("completed").item(0).getTextContent();
                    String errors = eElement.getElementsByTagName("errors").item(0).getTextContent();
                    String failures = eElement.getElementsByTagName("failures").item(0).getTextContent();
                    String skipped = eElement.getElementsByTagName("skipped").item(0).getTextContent();
                    int successReport = Integer.parseInt(success)-2;
                    System.out.println(successReport);
                    FileString4("Jenkins","success="+successReport);
                    FileString4("Jenkins","error="+errors);
                    FileString4("Jenkins","failures="+failures);
                    FileString4("Jenkins","skipped="+skipped);
                    int sum = Integer.parseInt(success)-2+Integer.parseInt(errors)+Integer.parseInt(failures)+Integer.parseInt(skipped);
                    FileString4("Jenkins","sum=" + String.valueOf(sum));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path) throws Exception{
        System.out.println(systemPath);
        String allPath = "C:/Users/CyberArk/.jenkins/workspace/Testcase/src/test/resources/testData/autopay/" + path + ".txt";
        File f = new File (allPath);
        FileWriter fw = new FileWriter (f);
        fw.write("");
        fw.flush();
        fw.close();
    }

    public static void FileString4(String path, String data) {
        try {
            String allPath = "C:/Users/CyberArk/.jenkins/workspace/Testcase/src/test/resources/testData/autopay/" + path + ".txt";
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

    public static String FileInput3(String path) {
        path = "C:/Users/CyberArk/.jenkins/workspace/Testcase/src/test/resources/testData/autopay/" + path + ".txt";
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

}