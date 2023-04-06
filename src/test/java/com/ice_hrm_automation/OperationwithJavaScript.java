package com.ice_hrm_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationwithJavaScript
{
   public static void main(String [] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.navigate().to("https://cybersuccess.icehrm.com/");
	   
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   
	   //simple alert
	   
	   js.executeScript("alert('Login to application !!!');");
	   Alert alert= driver.switchTo().alert();
	   Thread.sleep(5000);
	   alert.accept();
	   
	   //Confirmation alert
	   
//	   js.executeScript("confirm('Login to application...');");
//	   Alert alert = driver.switchTo().alert();
//	   //alert.accept();
//	   alert.dismiss();
	   
	   //Prompt alert
//	   js.executeScript("prompt('please enter the text...');");
//	   Alert alert = driver.switchTo().alert();
//	   alert.sendKeys("aaasdfghjkl");
	   //alert.accept();
//	   //alert.dismiss();
	   
	   WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
   
	   js.executeScript("arguments[0].value='admin'",Username);
	   
	   WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	   
	   js.executeScript("arguments[0].value='2zuzfakn'",Password);
	   
	   WebElement LogIn=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	   
	   js.executeScript("arguments[0].click();", LogIn);
   }
}
