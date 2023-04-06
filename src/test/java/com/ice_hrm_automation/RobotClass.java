package com.ice_hrm_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClass 
  {
	public static void main(String [] args) throws AWTException 
	{
      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.navigate().to("https://cybersuccess.icehrm.com/");
	  
	  Actions action = new Actions(driver);
	  
	  action.contextClick(driver.findElement(By.xpath("//button[text()='Log in ']"))).build().perform();
	  
	 
	  Robot robot = new Robot();
	   
	   
	  robot.keyPress(KeyEvent.VK_DOWN);
	  
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);
	  
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  
	}
}