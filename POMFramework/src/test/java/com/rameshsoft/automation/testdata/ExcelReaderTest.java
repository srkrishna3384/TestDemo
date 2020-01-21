package com.rameshsoft.automation.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderTest {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	//FileInputStream fip = new FileInputStream("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
	
	/*Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet = workbook.getSheet("hello");
	
	Row row0 = sheet.getRow(0);
	Cell cell02 = row0.createCell(2);
	
	cell02.setCellValue("PLZ PRACTICE");
	
	Row row2 = sheet.createRow(2);
	
	Cell cell20 = row2.createCell(0);
	cell20.setCellValue("JOB");
	
	Cell cell21 = row2.createCell(1);
	cell21.setCellValue("PRE REQ IS PRACTICE");
	
	FileOutputStream fop = new FileOutputStream("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");
	workbook.write(fop);
	
	*/
	
	/*File file= new File("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");	
	FileInputStream fip = new FileInputStream(file);
	
	
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet = workbook.getSheet("hello");
	
	Row row0 = sheet.getRow(0);
	
	Cell cell00 = row0.getCell(0);
	
	String cell00Value = cell00.getStringCellValue();
	System.out.println("oROW O COLUMN DATA IA: " +cell00Value);
	
	Cell cell01 = row0.getCell(1);
	String cell01Value = cell01.getStringCellValue();
	System.out.println("oROW 1 COLUMN  DATA IS: " +cell01Value);
	
	Row row1 = sheet.getRow(1);
	Cell cell10 = row1.getCell(0);
	String cell10Value = cell10.getStringCellValue();
	
	System.out.println("1ROW 0 COLUMN DATA IS: " +cell10Value);
	
	Cell cell11 = row1.getCell(1);
	String cell11Value = cell11.getStringCellValue();
	
	System.out.println("1ROW 1 COLUMN DATA IS: " +cell11Value);*/
	
	
	
	
	/*File file= new File("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");	
	FileInputStream fip = new FileInputStream(file);
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet = workbook.getSheet("hello");
	
	Row row0 = sheet.getRow(0);
	
	Cell cell00 = row0.getCell(0);
	
	if(cell00.getCellType() == Cell.CELL_TYPE_STRING)
	{
		String cell00Value = cell00.getStringCellValue();
		System.out.println("oROW O COLUMN DATA IA: " +cell00Value);
	}
	else if (cell00.getCellType() == Cell.CELL_TYPE_NUMERIC)
	{
		String cell00Value = cell00.getNumericCellValue()+"";//456
		System.out.println("oROW O COLUMN DATA IA: " +cell00Value);
		//int data = Integer.parseInt(cell00Value);
	}
	
	
	Cell cell01 = row0.getCell(1);
	if(cell01.getCellType() == Cell.CELL_TYPE_STRING)
	{
		String cell01Value = cell01.getStringCellValue();
		System.out.println("oROW O COLUMN DATA IA: " +cell01Value);
	}
	else if (cell01.getCellType() == Cell.CELL_TYPE_NUMERIC)
	{
		String cell01Value = cell01.getNumericCellValue()+"";//456
		System.out.println("oROW O COLUMN DATA IA: " +cell01Value);
		//int data = Integer.parseInt(cell00Value);
	}
	
	Row row1 = sheet.getRow(1);
	Cell cell10 = row1.getCell(0);
	String cell10Value = cell10.getStringCellValue();
	
	System.out.println("1ROW 0 COLUMN DATA IS: " +cell10Value);
	
	Cell cell11 = row1.getCell(1);
	String cell11Value = cell11.getStringCellValue();
	
	System.out.println("1ROW 1 COLUMN DATA IS: " +cell11Value);
	*/
	
	File file= new File("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\testdata\\test.xls");	
	FileInputStream fip = new FileInputStream(file);
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet = workbook.getSheet("hello");
	
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		Row row = sheet.getRow(i);
		
		for(int j=0;j<row.getLastCellNum();j++)
		{
			Cell cell = row.getCell(j);
			if(cell.getCellType() == Cell.CELL_TYPE_STRING)
			{
				String cellValue = cell.getStringCellValue();
				System.out.println(i+"ROW " +j+ " COLUMN DATA IA: " +cellValue);
			}
			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
			{
				String cellValue = cell.getNumericCellValue()+"";//456
				System.out.println(i+"ROW " +j+ " COLUMN DATA IA: " +cellValue);
				//int data = Integer.parseInt(cell00Value);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
