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


public class XMLGenerator_CBPR_PACS008_v5 {

    //Initialize file counter
    private static int fileCounter = 1;

    public static void main(String[] args) {
        try {
            // Read test data from an Excel file
            List<Map<String, String>> values = readTestDataFromExcel("E:\\TEST\\automation\\T24-payment\\import_xml_files\\TestData_PACS008_v5.xlsx");

            // Count the number of test data entries
            int testDataEntryCount = values.size();
            System.out.println("Total Test Data Entries: " + testDataEntryCount);

            // Process each entry of test data
            for (Map<String, String> data : values) {

                // Read existing XML file
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new File("E:\\TEST\\automation\\T24-payment\\import_xml_files\\001PACS008.xml"));

                // Modify XML template with current test data
                modifyXml(doc.getDocumentElement(), data);

                // Generate output XML file name with sequential number and "xml" extension
                String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyy"));
                String fileName = "output_xml_files/" + currentDate + fileCounter + "PACS008.xml";
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

        modifyNodeList(element.getElementsByTagName("Saa:X1"), element.getElementsByTagName("Saa:Sender"), values);
        modifyNodeList(element.getElementsByTagName("Saa:SWIFTRef"), values);
        modifyNodeList(element.getElementsByTagName("Saa:SNLRef"), values);
        modifyNodeList(element.getElementsByTagName("Saa:SnFInputTime"), values);
        modifyNodeList(element.getElementsByTagName("Saa:SnFDeliveryTime"), values);
        modifyNodeList(element.getElementsByTagName("head:BICFI"), element.getElementsByTagName("head:Fr"), values);
        modifyNodeList(element.getElementsByTagName("head:BizMsgIdr"), values);
        modifyNodeList(element.getElementsByTagName("head:CreDt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:MsgId"), values);
        modifyNodeList(element.getElementsByTagName("pacs:CreDtTm"), values);
        modifyNodeList(element.getElementsByTagName("pacs:InstrId"), values);
        modifyNodeList(element.getElementsByTagName("pacs:EndToEndId"), values);
        modifyNodeList(element.getElementsByTagName("pacs:TxId"), values);
        modifyNodeList(element.getElementsByTagName("pacs:UETR"), values);
        modifyNodeList(element.getElementsByTagName("pacs:IntrBkSttlmAmt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:IntrBkSttlmDt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:InstdAmt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:ChrgBr"), values);
        modifyNodeList(element.getElementsByTagName("pacs:Amt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:BICFI"), element.getElementsByTagName("pacs:Agt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:BICFI"), element.getElementsByTagName("pacs:InstgAgt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:AnyBIC"), values);
        modifyNodeList(element.getElementsByTagName("pacs:BICFI"), element.getElementsByTagName("pacs:DbtrAgt"), values);
        modifyNodeList(element.getElementsByTagName("pacs:Id"), element.getElementsByTagName("pacs:Othr"), values);
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