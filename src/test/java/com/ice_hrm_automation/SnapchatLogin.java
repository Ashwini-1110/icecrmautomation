package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SnapchatLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","msedgedriver.exe");
    	
    	WebDriver driver= new EdgeDriver();
    	
    	driver.navigate().to("https://accounts.snapchat.com/accounts/v2/login");
    	
    	WebElement Emailaddress = driver.findElement(By.id("accountIdentifier"));
    	Emailaddress.sendKeys("ardoke1110@gmail.com");
    	
    	 driver.findElement(By.xpath("//button[text()='Next']")).click();
    	
    	
    	//driver.findElement(By.xpath("//div[@id=\"loginForm\"]/div/div[3]")).click();

	}

}
