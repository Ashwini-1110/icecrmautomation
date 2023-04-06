package com.ice_hrm_automation_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;

public class LoginTest extends BaseClass
{
  @BeforeClass
  public void beforeClass()
  {
	  launchBrowser("chrome");
	  
	  driver.navigate().to("https://cybersuccess.icehrm.com/");
  }
  
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }
  
  @Test
  public void LoginWithValidCreditials() throws Exception
  {
	  enterText(By.id("username"),"admin");
	  
	  enterText(By.id("password"),"2zuzfakn");
	  
	  click(By.xpath("//button[contains(text(),'Log in')]"));
	  
	  WebElement  Dashboard = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
	  
	  if(Dashboard.isDisplayed())
	  {
		  System.out.println("Test case successfully passed");
	  }
	  else
	  {
		  throw new Exception("Test case is failed");
	  }
	  
	  click(By.xpath("//li[@class='dropdown user user-menu']/a/span"));
	  
	  click(By.xpath("//a[contains(text(),'Sign out')]"));
  }
 
  @Test
  public void LoginWithInvalidPassword() throws Exception
  {
      enterText(By.id("username"),"admin");
	  
	  enterText(By.id("password"),"12345");
	  
	  click(By.xpath("//button[contains(text(),'Log in')]"));
	  
	  boolean alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed();
	  
	  if(alertmsg== true)
	   {
		System.out.println("Test case is pass for invalid password"); 
	   }
	  else
	   {
		 throw new Exception("Test case is failed for invalid password");
	   }
	  
   }
  
  
  @Test
  public void LoginWithInvalidUsername() throws Exception
  {
      enterText(By.id("username"),"ashwini");
	  
	  enterText(By.id("password"),"2zuzfakn");
	  
	  click(By.xpath("//button[contains(text(),'Log in')]"));
	  boolean alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed();
	  
		 if(alertmsg== true)
		 {
			System.out.println("Test case is pass for invalid Username"); 
		 }
		 else
		 {
			 throw new Exception("Test case is failed for invalid Username");
		 }
  }
  
  @Test
  public void LoginWithBlankPassword() throws Exception
  {
      enterText(By.id("username"),"admin");
	  
	  enterText(By.id("password"),"");
	  
	  click(By.xpath("//button[contains(text(),'Log in')]"));
	  
	  boolean loginpage = driver.findElement(By.xpath("//h3[contains(text(),'IceHrm Login')]")).isDisplayed();
	  
	  if(loginpage==true)
	  {
		  System.out.println("Test case is passed for Blank Password ");
	  }
	  else
	  {
		  throw new Exception("Test case is failed for Blank Password");
	  }
  }
  @Test
  public void LoginWithBlankUsername() throws Exception
  {
      enterText(By.id("username"),"");
	  
	  enterText(By.id("password"),"2zuzfakn");
	  
	  click(By.xpath("//button[contains(text(),'Log in')]"));
	  
	  boolean loginpage = driver.findElement(By.xpath("//h3[contains(text(),'IceHrm Login')]")).isDisplayed();
	  
	  if(loginpage==true)
	  {
		  System.out.println("Test case is passed for Blank Username ");
	  }
	  else
	  {
		  throw new Exception("Test case is failed for Blank Username");
	  }
}
}