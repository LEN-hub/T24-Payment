package com.glbank.com.sg.bdd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ModifyExcel {
    private static String systemPath = System.getProperty("user.dir");
    private BDDUtil bddUtil;

    public void excelPOI (String path) {
        try {
            path = systemPath + "/src/test/resources/testData/excel/" + path + ".xlsx";
            XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(path));
            Map<String, String> fields = new HashMap<String, String>();
            XSSFSheet xSheet = xwb.getSheetAt(0);  //获取excel表的第一个sheet
            for (int i = 1; i <= xSheet.getLastRowNum(); i++) {  //遍历所有的行
                if(xSheet.getRow(i)==null){ //这行为空执行下次循环
                    continue;
                }
                for (int j = 0; j <=  xSheet.getRow(i).getPhysicalNumberOfCells(); j++) {  //遍历当前行的所有列
                    StringBuffer sb =new StringBuffer();
                    if(xSheet.getRow(i).getCell(j)==null){//为空跳出循环
                        continue;
                    }
                    XSSFCell xCell = xSheet.getRow(i).getCell(j);
                    if (xSheet.getRow(i-1).getCell(j).toString().contains("Doc Ref. No.")){
                        xCell.setCellValue(BDDUtil.getTimeNowThroughCalendar());
                    }else if (xSheet.getRow(i-1).getCell(j).toString().contains("Buyer")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("buyer"));
                    }else if (xSheet.getRow(i-1).getCell(j).toString().contains("Supplier")){
                        xCell.setCellValue(FileUtils.LastReadFileInput3("companyData"));
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
        ModifyExcel a = new ModifyExcel();
        a.excelPOI("testAuto");
    }
}
