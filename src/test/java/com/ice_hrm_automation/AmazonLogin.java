package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(5000);
	WebElement dropdown=driver.findElement(By.name("url"));
	Select select = new Select(dropdown);
   // select.selectByValue("search-alias=electronics-intl-ship");
   // select.selectByVisibleText("Electronics");
    select.selectByIndex(10);
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Mouse");
    
    driver.findElement(By.xpath("//input[@type='submit']")).submit();
    
    String result = driver.findElement(By.xpath("//span[contains(text(),\"1-16 of 117\")]/following::span[2]")).getText();
    System.out.println(result);
    if(result.equals("\"Lenovo Mouse\""))
    {
    	System.out.println("You getting correct result");
    }
    else
    {
    	System.out.println("You does not getting correct result");
    }
    String resultInNO = driver.findElement(By.xpath("//span[contains(text(),\"1-16 of 117\")]")).getText();
      System.out.println("you are getting "+ resultInNO.substring(0,11));
	}

	
	}


