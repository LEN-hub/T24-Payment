package com.glbank.com.sg.bdd.utils;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

import static com.glbank.com.sg.bdd.utils.FileUtils.FileString4;

public class JenkinsReportData {

    private static String systemPath = System.getProperty("user.dir");
    public static void jenkinsReport(){
        try {
            FileUtils.writeFile("Jenkins");
//creating a constructor of file class and parsing an XML file
            File file = new File( systemPath +"/target/failsafe-reports/failsafe-summary.xml");
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
                    FileString4("Jenkins","Success="+success);
                    FileString4("Jenkins","error="+errors);
                    FileString4("Jenkins","failures="+failures);
                    FileString4("Jenkins","skipped="+skipped);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}