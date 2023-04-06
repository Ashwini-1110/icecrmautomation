package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException 
	{
	   System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver(options);
	   
	  /* driver.navigate().to("https://www.elegantthemes.com/");
	   Thread.sleep(3000);
        driver.switchTo().frame(0) ; 
	   
	  driver.findElement(By.xpath("//div[@id=\"trust-score\"]")).click();
	  //driver.switchTo().defaultContent();
	  
	  driver.findElement(By.xpath("//div[@class=\"styles_mainContent__nFxAv\"]/div/h3/a")).click();*/
	
	   driver.navigate().to("https://omayo.blogspot.com/");
	   
	   String input = "Selenium";
	   //Thread.sleep(3000);
	   driver.switchTo().frame("navbar-iframe");
	   
	   driver.findElement(By.id("b-query")).sendKeys(input);
	   
	   driver.findElement(By.id("b-query-icon")).click();
	   
	   //driver.switchTo().defaultContent();
	   
	   String output = driver.findElement(By.xpath("//div[@class='status-msg-body']/b")).getText();
	   
	   if(output.equals(input))
	   {
		   System.out.println("successfully able to see");
	   }
	   else
	   {
		   System.out.println("not able to see");
	   }
	
	}

}
