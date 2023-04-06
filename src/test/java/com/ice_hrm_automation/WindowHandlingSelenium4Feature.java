package com.ice_hrm_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingSelenium4Feature 
{
    public static void main(String [] args) throws InterruptedException
    {
    	System.setProperty("webdriver.edge.driver","msedgedriver.exe");
    	
    	WebDriver driver = new EdgeDriver();
    	
    	driver.navigate().to("https://www.snapdeal.com/");
    	
    	//get the title of first tab url
    	System.out.println(driver.getTitle());
    	
    	// get the id of first tab url
    	String FirstTabId = driver.getWindowHandle();
    	
    	//print the id of first tab
    	System.out.println("First Tab Id : "+ FirstTabId);
    	
    	// switch the control from 1st window to 2nd window in same browser
    	//driver.switchTo().newWindow(WindowType.TAB);
    	
    	driver.switchTo().newWindow(WindowType.WINDOW);
    	
    	driver.get("https://twitter.com/login");
    	Thread.sleep(3000);
    	
    	// get the title of second tab
    	System.out.println(driver.getTitle());
    	
    	// get the id of second tab/window
    	String secondTabId =driver.getWindowHandle();
    	
    	//print the id of second Tab id
    	System.out.println("Second Tab Id : "+ secondTabId );
    	
    	//close the second tab 
    	driver.close();
    	
    	// control go from second tab to first tab
    	driver.switchTo().window(FirstTabId);
    	//driver.switchTo().defaultContent();
    	
    	//print the first id again 
    	System.out.println("First Tab Id : "+ FirstTabId);
    }
}
