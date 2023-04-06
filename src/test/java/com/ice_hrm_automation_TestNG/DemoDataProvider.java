package com.ice_hrm_automation_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;

public class DemoDataProvider extends BaseClass
{
	@DataProvider
	public Object [][] credentials()
	{
		return new Object[][]
		{
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"},
			{"username4","password4"}
		};
	}
	
	@BeforeClass
	public void beforeClass()
	{
		launchBrowser("Edge");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
  @Test(dataProvider = "credentials")
  public void test(String username , String password)
  {
	  System.out.println("Username "+ username +" Password "+ password);
  }
}
