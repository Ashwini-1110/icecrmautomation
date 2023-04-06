package com.ice_hrm_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliExpliWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//to create instance of WebDriverWait class for explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown=driver.findElement(By.name("url"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(16);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox"))));
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Mouse");
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).submit();

	}

}
