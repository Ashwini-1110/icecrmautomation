package com.ice_hrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) 
	{
		String filepath = "D:\\Ashu.xlsx";
		
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
			
			Sheet sheet = workbook.getSheet("EmployeeRecord1");
			
			if(sheet == null)
			{
				System.out.println(".....");
				sheet = workbook.createSheet("EmployeeRecord1");
				
				Cell cell = sheet.createRow(0).createCell(0);
				
				cell.setCellValue("01832");
				
				
				FileOutputStream outputstream = new FileOutputStream(filepath);
				
				workbook.write(outputstream);
				
			}
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("tttt");
		}
		catch(IOException e)
		{
			System.out.println("hhhh");
		}
	}

}
