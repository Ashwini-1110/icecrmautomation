package com.ice_hrm_automation_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.EmpDetails;

import com.ice_hrm_automation_utility.ExcelUtilForSingleObject;

public class DataProviderforSingleObject 
{
	ExcelUtilForSingleObject excelutil;
	@DataProvider
	public Object[][] getExcelData()
	{
		excelutil= new ExcelUtilForSingleObject();
		String filepath ="E:\\Test data.xlsx";
		
		String sheetname ="Emp";
		return excelutil.getExcelData(filepath,sheetname);
		
	}
	
  @Test(dataProvider ="getExcelData")
  
   public void test(EmpDetails emp) 
  {
	double id = emp.getId();
	System.out.print(id);
	  
	  String name= emp.getFirstName();
	  System.out.print(name +" ");
	  
	  String lastname = emp.getLastName();
	  System.out.println(lastname+" ");
  }
	  
  }

