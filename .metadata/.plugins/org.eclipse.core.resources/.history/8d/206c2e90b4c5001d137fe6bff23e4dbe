package com.ice_hrm_automation_TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.ExcelUtil;

public class ExcelTest 
{
	@DataProvider
	public Object[][] getExcelData() 
	{
		ExcelUtil excelutil = new ExcelUtil();
		
		String filepath ="E:\\Test data.xlsx";
		
		String sheetname = "Creditials";
		
	    return excelutil.getExcelData(filepath, sheetname);
		
		
	}
	
  @Test(dataProvider = "getExcelData")
  public void test(String username, String Password) 
  {
	  System.out.println(username+ " "+ Password );
  }
}
