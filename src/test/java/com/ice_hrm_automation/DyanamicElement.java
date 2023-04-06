package com.ice_hrm_automation;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DyanamicElement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.name("url"));
		Select select = new Select(dropdown);
	   // select.selectByValue("search-alias=electronics-intl-ship");
	   select.selectByVisibleText("Electronics");
	    //select.selectByIndex(10);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Washing Machine");
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).submit();
	    Thread.sleep(5000);
	    int totalResult;
	    //get all the search result
	    List <WebElement> WashingMachineResult= driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
	    
	   // get the total size of an Washing Machine Result(array)
	    totalResult= WashingMachineResult.size();
	    System.out.println("Total Result="+ totalResult);
	    
	    for(int i= 3; i<=totalResult;i++)
	    {
	    	try {
	    		 String namexpath = "//div[starts-with(@data-cel-widget,'search_result_')]["+i+"]/descendant::h2//span";
	    		 String pricexpath ="//div[starts-with(@data-cel-widget,'search_result_')]["+i+"]/descendant::span[@class='a-price-whole']";
	    		 //Thread.sleep(3000);
	    		 String name = driver.findElement(By.xpath(namexpath)).getText();
	    		 String price = driver.findElement(By.xpath(pricexpath)).getText();
	    		 price=price.replace(",","");
	    		 int replacedprice = Integer.parseInt(price);
	    		 if(replacedprice>=20000) {
	    		 System.out.println("Price :"+ replacedprice + " Name :"+ name);
	    		 }
	    	  }
	    	catch(Exception e) 
	    	     {
	    	   // System.out.println(e.getMessage());
	    	      }
	    }
	    
	   
	    
	       
	   }
	}
	

