package com.ice_hrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingEnterData {

	public static void main(String[] args) 
	{
       String filepath = "D:\\Test data.xlsx";	
       
       String extension = filepath.substring(filepath.indexOf(".")+1);
       
       System.out.println(extension);
       
       Workbook workbook= null;
       
       try 
       {
       FileInputStream inputstream = new FileInputStream(filepath);
       
       if(extension.equals("xlsx"))
       {
       workbook = new XSSFWorkbook(inputstream);
       }
       else if(extension.equals("xlx"))
       {
    	  workbook = new HSSFWorkbook(inputstream); 
       }
       
       Sheet sheet = workbook.getSheet("CustomerData");
       
       //check the sheet is present or not if sheet is not present then create sheet
       
       if(sheet == null) 
       {
    	 sheet= workbook.createSheet("CustomerData");
       }
       // create the row & cell
       Cell cell = sheet.createRow(0).createCell(0);
       
       // to enter the value in row & cell
       
       cell.setCellValue("Ashwini Doke");
       
       //to create the instance of Fileoutputstream for perform the write operation
       
       FileOutputStream outputstream = new FileOutputStream(filepath);
       
       workbook.write(outputstream);
       
       workbook.close();
       }
       catch(FileNotFoundException e)
       {
    	   
       }
       catch(IOException e)
       {
    	   
       }
      
	}

}
