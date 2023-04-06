package com.ice_hrm_automation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample 
{
  public static void main(String [] args)
  {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.amazon.in/");
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			
	.withTimeout(Duration.ofSeconds(10))
	.pollingEvery(Duration.ofSeconds(2))
	.ignoring(NoSuchElementException.class);
	
	/*Function<WebDriver , WebElement > function = new Function<WebDriver , WebElement>()
			{
		       public WebElement apply(WebDriver WebDriver)
		       {
		    	   System.out.println("verifying element to available for operation");
		    	   
		    	   return WebDriver.findElement(By.id("twotabsearchtextbox"));
		       }
			};*/
	
	/*wait.until( new Function<WebDriver , WebElement>()
			{
		       public WebElement apply(WebDriver WebDriver)
		       {
		    	   System.out.println("verifying element to available for operation");
		    	   return WebDriver.findElement(By.id("twotabsearchtextbox"));
		       }
			}
			
			);*/
	
	
	
			wait.until((d)->
			{
				System.out.println("verifying element to available for operation");
		    	   return d.findElement(By.id("twotabsearchtextbox"));
			}
					);
	
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Mouse");
  }
}
