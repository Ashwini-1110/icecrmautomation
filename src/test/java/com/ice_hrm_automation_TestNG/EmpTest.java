package com.ice_hrm_automation_TestNG;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;
import com.ice_hrm_automation_utility.PropertyHandling;

public class EmpTest extends BaseClass 
{
	PropertyHandling propertyHandling;
	@BeforeClass
	public void before()
	{
		 propertyHandling = new PropertyHandling();
	}
  @Test
  public void login()
  {
	  String url = propertyHandling.getProperty("orangehrmurl");
	  
	  launchBrowser("browser");
	  
	  driver.navigate().to(url);
	  
	  String username = propertyHandling.getProperty("orangehrmusername");
	  
	  enterText(By.name("username"),username);
	  
	  String password = propertyHandling.getProperty("orangehrmpassword");
	  
	  enterText(By.name("password"),password);
	  
	  click(By.xpath("//button[@type='submit']"));
	  
	  
  }

}

