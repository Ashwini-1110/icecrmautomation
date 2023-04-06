package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.edge.driver","msedgedriver.exe");
    	
    	WebDriver driver= new EdgeDriver();
    	
    	driver.navigate().to("https://www.instagram.com/accounts/login/");
    	Thread.sleep(5000);
    	WebElement Emailaddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[1]/div/label/input"));
    	Emailaddress.sendKeys("ardoke1110@gmail.com");
    	
    	WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[2]/div/label/input"));
    	password.sendKeys("Ashwini@1");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//div[text()=\"Log in\"]")).click();

	}

}
