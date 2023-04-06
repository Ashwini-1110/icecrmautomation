package com.ice_hrm_automation_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtilForSingleObject 
{ private Workbook workbook;
  private Sheet sheet;

  // program for all data kept in single Object
  
  public Object[][] getExcelData(String filepath, String sheetname)
  {
	  try
	  {
		  FileInputStream inputstream = new FileInputStream(filepath);
		   
		  String extension = filepath.substring(filepath.indexOf(".")+1);
		  System.out.println(extension);
		  if(extension.equals("xlsx"))
		  {
			  workbook = new XSSFWorkbook(inputstream);
		  }
		  else if(extension.equals("xlx"))
		  {
			  workbook = new HSSFWorkbook(inputstream);
		  }
		  
		 sheet = workbook.getSheet(sheetname);
		  System.out.println(sheetname);
		 int totalRows = sheet.getPhysicalNumberOfRows();
		 System.out.println(totalRows);
		 int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		 System.out.println(totalColumns);
		 
		 Object[][] obj = new Object[totalRows-1][1];
		 


		 
		 for(int i = 1; i<totalRows; i++)
		 {
			 EmpDetails emp=new EmpDetails();
			// System.out.println("inside for loop");
			double id = sheet.getRow(i).getCell(0).getNumericCellValue();
			
			emp.setId(id);
			
			String firstname= sheet.getRow(i).getCell(1).getStringCellValue();
			
			emp.setFirstName(firstname);
			
//			String middlename = sheet.getRow(i).getCell(2).getStringCellValue();
//			
//			emp.setMiddleName(middlename);
//			
			String lastname = sheet.getRow(i).getCell(2).getStringCellValue();
			
			emp.setLastName(lastname);
			
//			String profile = sheet.getRow(i).getCell(4).getStringCellValue();
//			
//			emp.setProfile(profile);
//			
//			double salary= sheet.getRow(i).getCell(5).getNumericCellValue();
//			
//			emp.setSalary(salary);
//			
//			String city = sheet.getRow(i).getCell(6).getStringCellValue();
//			
//			emp.setCity(city);
//			
//			String company= sheet.getRow(i).getCell(7).getStringCellValue();
//			
//			emp.setCompany(company);
			
			obj[i-1][0] = emp;
			
		 }	
		 
		 workbook.close();
		 inputstream.close();
		 return obj;
	  }
	  catch(IOException e)
	  {
		throw new RuntimeException(e);  
	  }
  }
}
