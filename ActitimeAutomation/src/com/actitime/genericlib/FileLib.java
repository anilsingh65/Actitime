package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	String fLoc="./TestData/TestData.xlsx";
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream file= new FileInputStream("./TestData/CommonData.properties");
		Properties pr=new Properties();
		pr.load(file);
		String data=pr.getProperty(key);
		file.close();
		return data;
	}
	public String getExcelData(String sheetName,int rowNum,int colNum) throws Throwable {
		FileInputStream file=new FileInputStream(fLoc);
		Workbook wb=WorkbookFactory.create(file);
    	Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cl=row.getCell(colNum);
		String data=cl.getStringCellValue();
		wb.close();
		return data;
	}
	public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws Throwable {
		FileInputStream file=new FileInputStream(fLoc);
		Workbook wb=WorkbookFactory.create(file);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cl=row.getCell(colNum);
		cl.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(fLoc);
		wb.write(fos);
		wb.close();
		
	}
	}


