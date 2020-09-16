package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider 
{

	XSSFWorkbook wb;
	
	public ExcelDataProvider()//This is constructor
	{
		File src=new File("./TestData/Data.xlsx");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) 
		{
		  System.out.println("Unable to read the file:" +e.getMessage());
		}
	}
	
	public String getStringData(int sheetIndex, int row, int column) //This is method overloading
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	public String getStringData(String sheetName, int row, int column) //This is method overloading
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName, int row, int column) //This is method overloading
	{
	  return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}
