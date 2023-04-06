package com.orangehrm_automation.pages;

import org.openqa.selenium.By;

import com.ice_hrm_automation_utility.BaseClass;

public class OrangehrmLoginPage extends BaseClass
{
	
   By username = By.name("username");
   By password = By.name("password");
   By Login = By.xpath("//button[@type='submit']");
   
   public void login(String username , String Password)
   {
	   enterText(this.username , username);
	   enterText(this.password, Password);
	   click(Login);
   }
}
