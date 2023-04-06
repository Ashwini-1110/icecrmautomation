package com.ice_hrm_automation_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderForAdditionOfArray 
{
	@DataProvider()
	public Object[][] arrayData()
	{
		Object[][] obj= new Object[][]
		{
			{1,4,3,4},
			{3,55,67,23},
			{55,67,23,980},
		};
		return obj;
	}
	int sum=0;
  @Test(dataProvider="arrayData")
  
  public void test(int a , int b, int c, int d) 
  {
	  sum= sum+(a+b+c+d);
	  System.out.println(sum);
  }
}
