package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Users\\ardok\\eclipse-workspace\\Automation\\ice_hrm_automation\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://icehrm.com/app/visualengin/login.php");
      
      WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("admin");
      WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("2zuzfakn");
      WebElement Loginbutton =driver.findElement(By.xpath("//button[contains(text(), \"Log in\")]"));
        Loginbutton.click();
	}

}
