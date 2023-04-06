package com.orangehrm_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ice_hrm_automation_utility.BaseClass;

public class MyInfoPage extends BaseClass
{
   public MyInfoPage(WebDriver driver)
   {
	   this.driver = driver;
   }
	
  By username = By.name("username");
  By password = By.name("password");
  By Login = By.xpath("//button[@type='submit']");
  public By myInfoMenu = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[5]/a/span");
  public By profileimg = By.xpath("//img[@class='employee-image']");
  public  By addImg = By.xpath("//i[@class='oxd-icon bi-plus']");
  public By save = By.xpath("//button[@type='submit']");
  
//  public void fileUpload()
//  {
//
//  	click(myInfo);
//  	click(profileimg);
//  	click(addImg);
//  	
//  }
}