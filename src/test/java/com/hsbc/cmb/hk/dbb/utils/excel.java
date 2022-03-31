package com.hsbc.cmb.hk.dbb.utils;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;

public class excel {
    public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
         String Buyer = FileUtils.LastReadFileInput3("testBuyer");
         String Supplier = FileUtils.LastReadFileInput3("test");
         String Number =  RandomPhoneNumber.randomPhoneNum();

        String[] data = {"Flow Type", "*Doc Ref. No.", "*Document Type", "*Buyer", "*Supplier", "PO Issue Date", "*Currency", "*Document Amount", "Invoice Adjustment Amount", "Acceptance Date", "Accepted Amount", "Accepted Maturity Date", "Proposed Payment Ref. No.", "*Description of Goods", "*B/L No.", "Transport Mode", "*Carrier / Charter / Agent", "*Country / Region of Origin", "*Consignee", "Consignor", "Destination Country", "*Freight Forwarders", "*Shipper", "*Notify Party", "*Port of Discharge", "*Port of Loading", "Port of Transhipment", "*Vessel Name", "IMO No."};

        String[] data1 = {"Service", Number, "INVOICE", Buyer, Supplier, " ","SGD", "5000"," "," "," "," "," ", "2023/11/29", "60000", "2025/1/11", "120000031", "13", "9", "9", "10", "22", "11", "11", "13", "14", "15", "16", "95", "84", "84", "62"};

        WriteExcel("write_excel.xls", data, data1);
    }


    //往Excel里面写数据
    public static void WriteExcel(String name, String[] data, String[] data1) throws IOException, RowsExceededException, WriteException {
        //创建Excel文件
        File file = new File(name);
        //创建工作簿
        WritableWorkbook book = Workbook.createWorkbook(file);
        //创建Sheet，用户管理是Sheet名字，0为第一个Sheet
        WritableSheet sheet = book.createSheet("Document Upload Template", 0);
        //单元格
        Label label = null;
        Label label1 = null;
        //把data数组里的数据放到Excel中
        for (int i = 0; i < data.length; i++) {
                //行里写数据，如果要给列里写数据，就把i和0位置调换
                label = new Label(i, 0, data[i]);
                sheet.addCell(label);
            }

        for (int j = 0; j < data1.length; j++) {
            label1 = new Label(j, 1, data1[j]);
            sheet.addCell(label1);
        }
            //写入数据，一定记得写入数据，不然你都开始怀疑世界了，excel里面啥都没有
            book.write();
            //最后一步，关闭工作簿
            book.close();

        }
    }




