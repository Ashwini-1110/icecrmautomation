package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CompleteAuto {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        
        driver.navigate().to("https://icehrm.com/app/visualengin/login.php");
        
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("admin");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("2zuzfakn");
        
        WebElement Loginbutton =driver.findElement(By.xpath("//button[contains(text(), \"Log in\")]"));
        Loginbutton.click();
   
	}

}
