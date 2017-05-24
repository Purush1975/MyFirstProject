package com.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility 
{	
	public static void main(String[] args) throws IOException 
	{
		// added comment by Purush
	 String file = "C:/Users/Purush/Documents/Selenium_Datadriven/DataTable/OrangeHRM.xlsx",colHead;
     int rows,cols;
     FileInputStream inputStream = new FileInputStream(new File(file));
     Workbook wb = new XSSFWorkbook(inputStream);
     Sheet sheet = wb.getSheetAt(0);
     rows = wb.getSheetAt(0).getPhysicalNumberOfRows();
     cols = wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();
     
     System.out.println("Pysical nbr Rows: "+rows);
     System.out.println("Pysical nbr Cells: "+cols);
	}

}
