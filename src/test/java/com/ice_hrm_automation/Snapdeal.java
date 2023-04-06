package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal 
{

	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("//a[contains(text() , 'Gift Cards')]")).click();
		
		
		driver.navigate().back();
		WebElement search= driver.findElement(By.xpath("//input[@placeholder=\"Search products & brands\"]"));
		search.sendKeys("Electronic gadgets");
		
		driver.findElement(By.xpath("//body/div[@id='sdHeader']/div[4]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
	
	}

}
