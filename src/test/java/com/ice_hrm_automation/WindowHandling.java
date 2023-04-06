package com.ice_hrm_automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
		String parentWindowId = driver.getWindowHandle();
		 
		System.out.println("First Tab Id : "+ parentWindowId);
		
		driver.findElement(By.xpath("//div[@id=\"navSwmHoliday\"]/a")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		
		System.out.println("Print all ids :"+allIds);
		for(String id :allIds)
		{
			if(!id.equals(parentWindowId))
			{
			  System.out.println("2nd Tab id: "+ id);
			  driver.switchTo().window(id);
			  System.out.println("Control go to 2nd tab");
			  //Thread.sleep(1000);
			  String secondTabTitle = driver.getTitle();
			  System.out.println("second Tab Title :"+secondTabTitle);
			  
			  List<WebElement> Links = driver.findElements(By.tagName("a"));
			  
			  for(int i =0; i<Links.size(); i++)
			  {
				 WebElement element = Links.get(i); 
				 String url= element.getAttribute("href");
				// System.out.println(url);
				 try {
				 if(!url.equals(null))
				 {
					 System.out.println(url);
					 
				 }}
				 catch(Exception e)
				 {
					 
				 }
			  }
			  driver.close();
			  }
		}
			driver.switchTo().window(parentWindowId);
			System.out.println("control go to 1st tab");
			String firstTabTitle = driver.getTitle();
			System.out.println("First Tab Title:"+ firstTabTitle);
			driver.quit();
		}

	}


