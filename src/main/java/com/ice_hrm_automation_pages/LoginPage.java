package com.ice_hrm_automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ice_hrm_automation_utility.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		//PageFactory.initElements(driver, this);
	}
	
	//declare all the locators
   By username = By.name("username");
   By password = By.name("password");
   By Login = By.xpath("//button[text()='Log in ']");
     public By alert = By.xpath("//div[@class='alert alert-danger']");
//   By reset = By.xpath("//a[contains(text(),'Reset Password')]");
   
	
	// Page Factory 
//   @FindBy(name= "username")
//   public WebElement username;
//   
//   @FindBy(name ="password")
//   public WebElement password;
//   
//   @FindBy(xpath= "//button[text()='Log in ']")
//   public WebElement Login;


  
   
   //Reusable method for login module
   public void login(String username, String password)
   {
	   enterText(this.username, username);
	   enterText(this.password, password);
	   click(Login);
	   
//	   this.username.sendKeys(username);
//	   this.password.sendKeys(password);
//	  this.Login.click();
    }
}
