package com.ice_hrm_automation_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;
public class DemoParameters extends BaseClass
{
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser)
	{
		System.out.println("Browser "+ browser);
		
		launchBrowser("Edge");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@Parameters({"username","password"})
  @Test
  public void test(String username , String password)
  {
	System.out.println("Username "+ username +"Password "+ password);
	
  }
}
