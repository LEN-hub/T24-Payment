import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TXTGenerator_MT202_v1 {

    //Initialize file counter
    private static int fileCounter = 1;

    public static void main(String[] args) {
        try {

            // Load the Excel file
            FileInputStream fileInputStream = new FileInputStream("E:\\TEST\\automation\\T24-payment\\import_txt_files\\TestData_MT202_v1.xlsx");
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0); // Assuming test data is in the first sheet

            FileInputStream existingTextInputStream = new FileInputStream( "E:\\TEST\\automation\\T24-payment\\import_txt_files\\MT202.xlsx");
            Workbook existingTextWorkbook = new XSSFWorkbook(existingTextInputStream);
            Sheet existingTextSheet = existingTextWorkbook.getSheetAt(0); // Assuming text data is in the first sheet

            // Read header row from test data to get the keys
            Row headerRow = sheet.getRow(0);
            Map<Integer, String> keyIndexMap = new HashMap<>();
            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
                Cell cell = headerRow.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                String key = cell.getStringCellValue();
                keyIndexMap.put(i, key);
            }

            // Extract test data from Excel starting from the 2nd row
            Map<String, Map<String, String>> testData = new HashMap<>();
            int lastRowNum = sheet.getLastRowNum();
            for (int i = 1; i <= lastRowNum; i++) { // Start from 2nd row
                Row row = sheet.getRow(i);
                if (row != null) {
                    String key = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
                    if (!key.isEmpty()) {
                        Map<String, String> testDataRow = new HashMap<>();
                        for (int j = 0; j < row.getLastCellNum(); j++) {
                            Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                            String value = cell.getStringCellValue();
                            String columnKey = keyIndexMap.get(j);
                            testDataRow.put(columnKey, value);
                        }
                        testData.put(key, testDataRow);
                    }
                } else {
                    break; // Stop processing when encountering an empty row
                }
            }

            // Count the number of test data entries
            int testDataEntryCount = testData.size();
            System.out.println("Total Test Data Entries: " + testDataEntryCount);

            // Extract existing text from Excel
            StringBuilder existingTextBuilder = new StringBuilder();
            for (int i = 0; i <= existingTextSheet.getLastRowNum(); i++) {
                Row row = existingTextSheet.getRow(i);
                if (row != null) {
                    Cell cell = row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    String cellValue = cell.getStringCellValue();
                    if (!cellValue.isEmpty()) {
                        existingTextBuilder.append(cellValue).append("\n");
                    } else {
                        break; // Stop reading when encountering an empty cell
                    }
                }
            }
            String existingText = existingTextBuilder.toString();

            // Generate text files with different values
            for (Map.Entry<String, Map<String, String>> entry : testData.entrySet()) {
                String tag2 = entry.getValue().get("Tag 2");
                String tag121 = entry.getValue().get("Tag 121");
                String tag20 = entry.getValue().get("Tag 20");
                String tag32A = entry.getValue().get("Tag 32A");
                String tag58A = entry.getValue().get("Tag 58A");
                String newText = existingText
                        .replaceFirst("2:.*?}", "2:" + tag2 + "}")
                        .replaceFirst("121:.*?}", "121:" + tag121 + "}")
                        .replaceFirst(":20:.*?<Cr><Lf>", ":20:" + tag20 + "<Cr><Lf>")
                        .replaceFirst(":32A:.*?<Cr><Lf>", ":32A:" + tag32A + "<Cr><Lf>")
                        .replaceFirst(":58A:.*?<Cr><Lf>", ":58A:" + tag58A + "<Cr><Lf>");

                // Write the updated text to a new file
                String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyy"));
                try (FileOutputStream fileOutputStream = new FileOutputStream("output_txt_files/" + currentDate + fileCounter + "MT202.txt")) {
                    fileOutputStream.write(newText.getBytes());
                    String fileName = "output_txt_files/" + currentDate + fileCounter + "MT202.txt";
                    System.out.println("Generated " + fileName);
                }
                fileCounter++;
            }

            System.out.println('\n' + "Text files generated successfully.");

            // Close workbooks and streams
            workbook.close();
            fileInputStream.close();
            existingTextWorkbook.close();
            existingTextInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}