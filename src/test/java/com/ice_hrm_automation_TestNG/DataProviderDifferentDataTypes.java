package com.ice_hrm_automation_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDifferentDataTypes 
{
	@DataProvider()
	public Object[][] DataTypes()
	{
		Object[][] obj = new Object[][] {
			
			{1, "Pune", "city"},
			{2, "Mumbai", "city"},
			{3, "Nagpur","city"},
			{4,"Goa","State"},
			{5,"Solapur","city"}
			
		};
		return obj;
	}
	
	@Test(dataProvider="DataTypes")
  public void test(int num, String city, String type)
  {
	  System.out.println("Num: "+num +" City: "+city +" Type: " + type);	
  }
}
