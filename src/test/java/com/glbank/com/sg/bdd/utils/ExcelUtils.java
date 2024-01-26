package com.glbank.com.sg.bdd.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 使用工具里传入3个参数（文件路径，sheet页名，key值），返回一个字段value
* */

public class ExcelUtils {
    public static String getValuesByKey(String filePath, String sheetName, String key) {
        StringBuilder result = new StringBuilder();

        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet != null) {
                DataFormatter dataFormatter = new DataFormatter();

                int lastRowNum = sheet.getLastRowNum();
                for (int i = 0; i <= lastRowNum; i++) {
                    Row row = sheet.getRow(i);

                    if (row != null) {
                        Cell keyCell = row.getCell(0);

                        if (keyCell != null) {
                            String cellValue = dataFormatter.formatCellValue(keyCell);

                            if (cellValue.trim().equalsIgnoreCase(key)) {
                                int lastCellNum = row.getLastCellNum();
                                for (int j = 1; j < lastCellNum; j++) {  // 从索引1开始，跳过关键字所在的单元格
                                    Cell valueCell = row.getCell(j);
                                    if (valueCell != null) {
                                        String value = dataFormatter.formatCellValue(valueCell);
                                        result.append(value).append(" ");
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString().trim();
    }

    //根据 不同的key  读出excel的value，第一行是key，下面的是value
    public static String readExcel(String filePath, String sheetName, String key, int rowIndex) {
        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet != null) {
                DataFormatter dataFormatter = new DataFormatter();
                Row headerRow = sheet.getRow(0);
                int columnIndex = -1;

                if (headerRow != null) {
                    int lastCellNum = headerRow.getLastCellNum();
                    for (int i = 0; i < lastCellNum; i++) {
                        Cell headerCell = headerRow.getCell(i);
                        if (headerCell != null) {
                            String headerValue = dataFormatter.formatCellValue(headerCell);

                            if (headerValue.trim().equalsIgnoreCase(key)) {
                                columnIndex = i;
                                break;
                            }
                        }
                    }
                }

                if (columnIndex != -1) {
                    Row row = sheet.getRow(rowIndex);
                    if (row != null) {
                        Cell cell = row.getCell(columnIndex);
                        if (cell != null) {
                            return dataFormatter.formatCellValue(cell);
                        } else {
                            return "";
                        }
                    } else {
                        return "Row not found.";
                    }
                } else {
                    return "Key not found.";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Failed to read cell value.";
    }


    //获取Excel里有多行的数据，进行for循环
    public static int countDataRows(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);

        int dataRows = 0;

        // 获取指定名称的 sheet
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet != null) {
            // 获取总行数（包括标题行）
            int totalRows = sheet.getLastRowNum() + 1;
            System.out.println("totalRows："+ totalRows);

            // 获取标题行的列数
            Row titleRow = sheet.getRow(0);
            int totalColumns = titleRow.getLastCellNum();
            System.out.println("totalColumns："+ totalColumns);
            // 计算非空行的数量
            for (int rowIndex = 1; rowIndex < totalRows; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                boolean isEmptyRow = true;
                for (int columnIndex = 0; columnIndex < totalColumns; columnIndex++) {
                    Cell cell = row.getCell(columnIndex, Row.MissingCellPolicy.RETURN_BLANK_AS_NULL);
                    if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK) {
                        isEmptyRow = false;
                        break;
                    }
                }
                if (!isEmptyRow) {
                    dataRows++;
                }
            }
        }

        workbook.close();
        fis.close();

        return dataRows;
    }

    // 往excel里写值，
    public static String writeExcel(String filePath, String sheetName, String key, int rowIndex, String value) {
        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet != null) {
                DataFormatter dataFormatter = new DataFormatter();
                Row headerRow = sheet.getRow(0);
                int columnIndex = -1;

                if (headerRow != null) {
                    int lastCellNum = headerRow.getLastCellNum();
                    for (int i = 0; i < lastCellNum; i++) {
                        Cell headerCell = headerRow.getCell(i);
                        if (headerCell != null) {
                            String headerValue = dataFormatter.formatCellValue(headerCell);

                            if (headerValue.trim().equalsIgnoreCase(key)) {
                                columnIndex = i;
                                break;
                            }
                        }
                    }
                }

                if (columnIndex != -1) {
                    Row row = sheet.getRow(rowIndex);
                    if (row == null) {
                        row = sheet.createRow(rowIndex);
                    }

                    Cell cell = row.createCell(columnIndex);
                    cell.setCellValue(value);

                    FileOutputStream fileOut = new FileOutputStream(filePath);
                    workbook.write(fileOut);
                    fileOut.close();

                    System.out.println("Value written to cell successfully.");
                    return "写入成功";
                } else {
                    System.out.println("Key not found.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "写入成功1";
    }

    //根据列名清空该列的所有内容
    public static void clearColumn(String filePath, String sheetName, String columnName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheet(sheetName);

            // 获取列索引
            int columnIndex = -1;
            Row headerRow = sheet.getRow(0);
            for (Cell cell : headerRow) {
                if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }

            if (columnIndex == -1) {
                System.out.println("指定的列名不存在");
                return;
            }

            // 清空指定列的内容
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue; // 跳过列名行
                }
                Cell cell = row.getCell(columnIndex);
                if (cell != null) {
                    cell.setCellValue("");  // 清空单元格内容
                }
            }

            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            workbook.write(fileOutputStream);
            workbook.close();
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("列清空完成");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        String systemPath = System.getProperty("user.dir");
        String INB_TestData = systemPath + "/src/test/resources/testData/Excel/AddAuthorizer.xlsx";
        String HomePage = "OverseasTransfer";
        clearColumn(INB_TestData,"排序后的授权账号","email");
        int ExcelLength = ExcelUtils.countDataRows(INB_TestData,"排序后的授权账号");
        System.out.println("有多少行"+ExcelLength);
      /*   网银授权工具类调用
       for (int i = 0; i < 10; i++) {
            String key = "CustomerNumber" + i;
            String customer = "tian";
            String valuesByKey = ExcelUtils.getValuesByKey(INB_TestData, HomePage, key);
            String valuesByKey1 = ExcelUtils.getValuesByKey(INB_TestData, HomePage, customer);
            System.out.println(valuesByKey);
        }*/

        /*   网银转账工具类调用
       for (int i = 1; i < 32; i++) {
            String key = ExcelUtils.readExcel(INB_TestData, HomePage, "key", i);
            String key2 = ExcelUtils.readExcel(INB_TestData, HomePage, "value", i);
//            System.out.println(key);
            System.out.println(key2);
        }*/

        /*  网银转账写入实际执行结果工具类调用。
       for (int i = 1; i < 19; i++) {
            String excel = ExcelUtils.writeExcel(INB_TestData, HomePage, "测试", i,"交易成功");
            System.out.println(excel);
        }*/
//        int i = countDataRows(INB_TestData,HomePage);
//        System.out.println(i);

    }
}

