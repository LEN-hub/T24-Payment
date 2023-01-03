package com.glbank.com.sg.bdd.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class historyExcel {
    private static String systemPath = System.getProperty("user.dir");
    private BDDUtil bddUtil;

    public String InvoiceNo = "Invoice"+RandomPhoneNumber.randomPhoneNum().substring(0,7);
    public String poNo = "Invoice"+RandomPhoneNumber.randomPhoneNum().substring(0,7);

    public void excelPOI (String path) {
        try {
            path = systemPath + "/src/test/resources/testData/excel/" + path + ".xlsx";
            XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(path));
            Map<String, String> fields = new HashMap<String, String>();
            XSSFSheet xSheet = xwb.getSheetAt(0);  //获取excel表的第一个sheet
            XSSFSheet xSheet1 = xwb.getSheetAt(1);//获取excel表的第二个sheet
            for (int i = 1; i <= xSheet.getLastRowNum(); i++) {  //遍历所有的行
                if(xSheet.getRow(i)==null){ //这行为空执行下次循环
                    continue;
                }
                for (int j = 0; j <=  xSheet.getRow(i).getPhysicalNumberOfCells(); j++) {  //遍历当前行的所有列
                    if(xSheet.getRow(i).getCell(j)==null){//为空跳出循环
                        continue;
                    }
                    XSSFCell xCell = xSheet.getRow(i).getCell(j);
                    if (xSheet.getRow(i-1).getCell(j).toString().contains("PO No.")){
                        xCell.setCellValue(poNo);
                    }else if (xSheet.getRow(i-1).getCell(j).toString().contains("*Invoice No.")){
                        xCell.setCellValue(InvoiceNo);
                    }else if (xSheet.getRow(i-1).getCell(j).toString().contains("Supplier Name")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("companyData"));
                    }else if (xSheet.getRow(i-1).getCell(j).toString().contains("Buyer Name")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("buyer"));
                    }
                }
            }
            System.out.println(xSheet1.getLastRowNum());
            for (int i = 1; i <= xSheet1.getLastRowNum(); i++) { //遍历所有的行
                if(xSheet1.getRow(i)==null){ //这行为空执行下次循环
                    continue;
                }
                for (int j = 0; j <=  xSheet1.getRow(i).getPhysicalNumberOfCells(); j++) {  //遍历当前行的所有列
                    if(xSheet1.getRow(i).getCell(j)==null){//为空跳出循环
                        continue;
                    }
                    XSSFCell xCell = xSheet1.getRow(i).getCell(j);
                    if (xSheet1.getRow(i-1).getCell(j).toString().contains("Invoice No.")){
                        xCell.setCellValue(InvoiceNo);
                    }else if (xSheet1.getRow(i-1).getCell(j).toString().contains("PO No.")){
                        xCell.setCellValue(poNo);
                    }else if (xSheet1.getRow(i-1).getCell(j).toString().contains("Supplier Name")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("companyData"));
                    }else if (xSheet1.getRow(i-1).getCell(j).toString().contains("Buyer Name")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("buyer"));
                    }
                }

            }
            FileOutputStream out = new FileOutputStream(path);
            xwb.write(out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        historyExcel historyExcel = new historyExcel();
        historyExcel.excelPOI("HistoricalExcel");
    }
}
