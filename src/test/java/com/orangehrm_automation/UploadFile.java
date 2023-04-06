package com.orangehrm_automation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;
import com.ice_hrm_automation_utility.PropertyHandling;
import com.orangehrm_automation.pages.MyInfoPage;
import com.orangehrm_automation.pages.OrangehrmLoginPage;

public class UploadFile extends BaseClass
{ 
	MyInfoPage myinfo;
	OrangehrmLoginPage orangehrmlogin;
	PropertyHandling property ;
	@BeforeClass
	public void before()
	{
		orangehrmlogin = new OrangehrmLoginPage();
		property = new PropertyHandling();
		String username = property.getProperty("orangehrmusername");
		String password = property.getProperty("orangehrmpassword");
		String browser= property.getProperty("browser");
		String url = property.getProperty("orangehrmurl");
		launchBrowser(browser);
		driver.get(url);
		orangehrmlogin.login(username, password);
		
	    myinfo = new MyInfoPage(driver);
	}
	
@Test
public void fileUpload()
{
	click(myinfo.myInfoMenu);
	click(myinfo.profileimg);
	click(myinfo.addImg); 
	try
	{
		System.out.println("try block");
//		PropertyHandling property = new PropertyHandling();
//		String autoItScript = property.getProperty("autoItScript");
		Thread.sleep(1000);
		Runtime.getRuntime().exec( "C:\\Users\\ardok\\OneDrive\\Documents\\UploadFileScript.exe");
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	click(myinfo.save);
}


}
