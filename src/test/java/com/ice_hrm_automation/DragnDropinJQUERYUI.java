package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragnDropinJQUERYUI {

	public static void main(String[] args) throws InterruptedException 
	
	{
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.navigate().to("https://jqueryui.com/");
	  
	  WebElement cursorondrop= driver.findElement(By.linkText("Droppable"));
	  cursorondrop.click();
	  driver.switchTo().frame(0);
	  Actions action = new Actions(driver);
	  
//	  //perform mouse hover operation
//	  //move mouse on specific element
//	  
//	  action.moveToElement(cursorondrop).build().perform();
//	  
//	  //click on specific element
//	  
//	  action.click(cursorondrop).build().perform();
//	  
//	  //Right click on anywhere in the page
//	  
//	  action.contextClick().build().perform();
//	  
//	  //Right click on specific element 
//	  
//      action.contextClick(cursorondrop).build().perform();
//  
//	  //Double click on anywhere on webpage
//	  
//	  action.doubleClick().build().perform();
//	  
//	  //Double click on specific element
//	 
//	  action.doubleClick(cursorondrop).build().perform();
	  
	  
	  
	  WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	  
	  WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	  
	  //drag and drop the element using two parameter
	  action.dragAndDrop(drag, drop).build().perform();
	  
	  // drag and drop the element using clickAndHold() method
	  
	  action.clickAndHold(drag).release(drag).build().perform();
	  
	  
	}

}
