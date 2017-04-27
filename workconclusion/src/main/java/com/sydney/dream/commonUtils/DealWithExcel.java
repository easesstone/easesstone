package com.sydney.dream.commonUtils;

import com.sun.org.apache.xerces.internal.impl.dv.xs.XSSimpleTypeDecl;
import com.sydney.dream.module.Work;
import com.sydney.dream.service.WorkService;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lWX355499 on 2017/4/25.
 */
public class DealWithExcel {
    @Autowired
    private WorkService workService;

    public void readFromtheExcel(String path) throws IOException {
        InputStream in = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet xssfSheet = workbook.getSheetAt(0);
        XSSFRow xssfRow = xssfSheet.getRow(1);
        Work work = null;
        int lable = 13;
        List<Work> list = new ArrayList<Work>();
        XSSFCell cell = xssfRow.getCell(0);
        cell.getRichStringCellValue();
        for(int i = 5; i<60; i+=4) {
            work = new Work();
            work.setId(lable);
            lable++;
            work.setWorkContent(getValue(xssfRow.getCell(i)));
            work.setWorkStatus(getValue(xssfRow.getCell(i+1)));
            work.setNextPlan(getValue(xssfRow.getCell(i+2)));
            work.setConclusion(getValue(xssfRow.getCell(i+3)));
            list.add(work);
            workService.addWork(work);
            System.out.println("====================\n" + work + "================================\n");
        }


    }

    @SuppressWarnings("static-access")
    private String getValue(XSSFCell xssfRow) {
        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }


    public static void main(String []args){
        //  System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(2017-04)));
    }
}