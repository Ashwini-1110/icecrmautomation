package com.ice_hrm_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperationwithJavaScript {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		
		// scroll to downward direction
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(5000);
		
		// scroll to upward direction
		js.executeScript("window.scrollBy(0, -250)");
		
		//scroll till the bottom
		js.executeScript("0,document.body.scorllHeight");
		
		//scroll to right side
		js.executeScript("window.scrollBy(500, 0)");
		
		//scroll to left side
		js.executeScript("window.scrollBy(-250, 0)");
		
	}

}
