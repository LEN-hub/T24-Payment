import org.w3c.dom.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class XMLGenerator_PACS008O_v1 {

    //Initialize file counter
    private static int fileCounter = 1;

    public static void main(String[] args) {
        try {
            // Read test data from an Excel file
            List<Map<String, String>> values = readTestDataFromExcel("E:\\TEST\\automation\\T24-payment\\import_xml_files\\TestData_PACS008O_v1.xlsx");

            // Count the number of test data entries
            int testDataEntryCount = values.size();
            System.out.println("Total Test Data Entries: " + testDataEntryCount);

            // Process each entry of test data
            for (Map<String, String> data : values) {

                // Read existing XML file
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new File("E:\\TEST\\automation\\T24-payment\\import_xml_files\\001PACS008O.xml"));

                // Modify XML template with current test data
                modifyXml(doc.getDocumentElement(), data);

                // Generate output XML file name with sequential number and "xml" extension
                //String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                String fileName = "output_xml_files/" +"PT_"+ "20241024" + "PACS008."+fileCounter+".ia";
                fileCounter++;

                // Write modified content to a new file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(fileName));
                transformer.transform(source, result);
                System.out.println("Generated " + fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Map<String, String>> readTestDataFromExcel(String filePath) throws IOException {
        List<Map<String, String>> values = new ArrayList<>();
        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            // Read keys from the first row
            Row headerRow = sheet.getRow(0);
            List<String> keys = new ArrayList<>();
            for (Cell cell : headerRow) {
                keys.add(cell.getStringCellValue());
            }

            // Read values from subsequent rows
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                Map<String, String> rowValues = new LinkedHashMap<>();
                for (int colIndex = 0; colIndex < keys.size(); colIndex++) {
                    Cell cell = row.getCell(colIndex);
                    String value = getCellValue(cell);
                    rowValues.put(keys.get(colIndex), value);
                }
                values.add(rowValues);
            }
        }
        return values;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        } else {
            switch (cell.getCellType()) { // Use getCellTypeEnum() instead of CellType
                case Cell.CELL_TYPE_NUMERIC:
                    return String.valueOf(cell.getNumericCellValue());
                case Cell.CELL_TYPE_STRING:
                    return cell.getStringCellValue();
                case Cell.CELL_TYPE_BOOLEAN:
                    return String.valueOf(cell.getBooleanCellValue());
                case Cell.CELL_TYPE_FORMULA:
                    return cell.getCellFormula();
                default:
                    return "";
            }
        }
    }

    private static void modifyXml(Element element, Map<String, String> values) {

        modifyNodeList(element.getElementsByTagName("Saa:SenderReference"), values);
        modifyNodeList(element.getElementsByTagName("Saa:X1"), element.getElementsByTagName("Saa:Receiver"), values);
        modifyNodeList(element.getElementsByTagName("Saa:UserReference"), values);
        modifyNodeList(element.getElementsByTagName("BICFI"), element.getElementsByTagName("To"), values);
        modifyNodeList(element.getElementsByTagName("BizMsgIdr"), values);
        modifyNodeList(element.getElementsByTagName("CreDt"), values);
        modifyNodeList(element.getElementsByTagName("MsgId"), values);
        modifyNodeList(element.getElementsByTagName("CreDtTm"), values);
        modifyNodeList(element.getElementsByTagName("InstrId"), values);
        modifyNodeList(element.getElementsByTagName("EndToEndId"), values);
        modifyNodeList(element.getElementsByTagName("TxId"), values);
        modifyNodeList(element.getElementsByTagName("UETR"), values);
        modifyNodeList(element.getElementsByTagName("IntrBkSttlmAmt"), values);
        modifyNodeList(element.getElementsByTagName("IntrBkSttlmDt"), values);
        modifyNodeList(element.getElementsByTagName("ChrgBr"), values);
        modifyNodeList(element.getElementsByTagName("BICFI"), element.getElementsByTagName("InstdAgt"), values);
        modifyNodeList(element.getElementsByTagName("Nm"), element.getElementsByTagName("Dbtr"), values);
        modifyNodeList(element.getElementsByTagName("AdrLine"), element.getElementsByTagName("Dbtr"), values);

        // Assuming there's only one <DbtrAcct> node
        Node dbtrAcctNode = element.getElementsByTagName("DbtrAcct").item(0);
        if (dbtrAcctNode != null && dbtrAcctNode.getNodeType() == Node.ELEMENT_NODE) {
            Element dbtrAcctElement = (Element) dbtrAcctNode;
            // Assuming there's only one <Othr> node under <DbtrAcct>
            Node othrNode = dbtrAcctElement.getElementsByTagName("Othr").item(0);
            Element othrElement = (Element) othrNode;
            // Assuming there's only one <Id> node under <Othr>
            Node idNode = othrElement.getElementsByTagName("Id").item(0);
            if (idNode != null && idNode.getNodeType() == Node.ELEMENT_NODE) {
                // Assuming the key in the test data map is "Id"
                idNode.setTextContent(values.get("Idd"));
            }
        }

        modifyNodeList(element.getElementsByTagName("BICFI"), element.getElementsByTagName("CdtrAgt"), values);
        // Assuming there's only one <CdtrAcct> node
        Node cdtrAcctNode = element.getElementsByTagName("CdtrAcct").item(0);
        if (cdtrAcctNode != null && cdtrAcctNode.getNodeType() == Node.ELEMENT_NODE) {
            Element cdtrAcctElement = (Element) cdtrAcctNode;
            // Assuming there's only one <Othr> node under <CdtrAcct>
            Node othrNode = cdtrAcctElement.getElementsByTagName("Othr").item(0);
            Element othrElement = (Element) othrNode;
            // Assuming there's only one <Id> node under <Othr>
            Node idNode = othrElement.getElementsByTagName("Id").item(0);
            if (idNode != null && idNode.getNodeType() == Node.ELEMENT_NODE) {
                // Assuming the key in the test data map is "Id"
                idNode.setTextContent(values.get("Idc"));
            }
        }
        modifyNodeList(element.getElementsByTagName("Ustrd"), values);
    }

    private static void modifyNodeList(NodeList nodeList, Map<String, String> values) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String nodeName = element.getNodeName();
                if (values.containsKey(nodeName)) {
                    element.setTextContent(values.get(nodeName));
                }
                // Recursively process nested elements
                NodeList childNodes = element.getChildNodes();
                modifyNodeList(childNodes, values);
            }
        }
    }

    private static void modifyNodeList(NodeList nodeList, NodeList ParentNodes, Map<String, String> values) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String nodeName = element.getNodeName();
                if (values.containsKey(nodeName)) {
                    // Check if the node is under <Saa:Sender>
                    if (isUnderSender(element, ParentNodes)) {
                        element.setTextContent(values.get(nodeName));
                    }
                }
            }
        }
    }

    private static boolean isUnderSender(Element element, NodeList ParentNodes) {
        // Iterate through the sender nodes to check if the element is under <Saa:Sender>
        for (int i = 0; i < ParentNodes.getLength(); i++) {
            Node senderNode = ParentNodes.item(i);
            if (isAncestor(senderNode, element)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAncestor(Node ancestor, Node node) {
        // Check if the given ancestor is an ancestor of the given node
        while (node != null) {
            if (node.isSameNode(ancestor)) {
                return true;
            }
            node = node.getParentNode();
        }
        return false;
    }
}