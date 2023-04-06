package com.ice_hrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcehrmBirhdateSelection {

	public static void main(String[] args) throws InterruptedException  
	{ 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//it is a instance of chrome driver  used to launch the  browser	
		WebDriver driver= new ChromeDriver();
		//navigation on website	
		driver.get("https://cybersuccess.icehrm.com/");
		//it find element to enter username
		//1.valid username and valid password
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("admin");

		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("2zuzfakn");

		WebElement LogIn=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		LogIn.click();
		
		Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//span[text()=\"Employees\"]")).click();
		  
		  driver.findElement(By.xpath("//ul[@id='admin_Employees']//a[1]")).click();
	 
		  driver.findElement(By.xpath("//span[text()=' Add New']")).click();
		  
		  driver.findElement(By.id("birthday")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[@class=\"ant-picker-header-view\"]/button[2]")).click();
		  
		  int Birthyear = 2000;
		  
		  String e =String.valueOf(Birthyear);
		  
		  //get all years in list
		  
		  List<WebElement> AllYear= driver.findElements(By.xpath("//div[@class='ant-picker-cell-inner']"));
			
		  for(WebElement year : AllYear)
		  {
			  String YEARs= year.getText();
			  
			  Integer YEAR = Integer.valueOf(YEARs);
			  
			  if(YEAR>Birthyear) //check the year is greater or lesser than BirthYear
			  {
				  driver.findElement(By.xpath("//span[@class=\"ant-picker-super-prev-icon\"]")).click();
			  }
			  else if(Birthyear==YEAR)// click on particular year
			  {
				  year.click();
				  
				  //get the all month list
				  
				  List<WebElement> AllMonths = driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view']"));
				  for(WebElement months :AllMonths)
				  {
				  String Months = months.getText();
				  if(Months.equals("Oct")) // check the month is equals to BirthMonth
				  {
					  months.click(); // click on that 
					  break;
				  }
				  }
				  // get all dates in list
				  
					  List<WebElement> Alldates = driver.findElements(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-in-view']"));
					//  System.out.println(Alldates);
					  for(WebElement Dates :Alldates)
					  {
						  //System.out.println("Inside date selection");
						 String DATES= Dates.getText();
						// System.out.println(DATES);
						 if(DATES.equals("11")) // check the dates is equals to birthdate
						 {
							 System.out.println("selected date");
							 Dates.click(); //click on that
							
						 }
						 
					  }
				  }
				 
			  }
			  }
		  
		  
		  
//		  WebElement yearsfromList=  driver.findElement(By.xpath("//div[@class='ant-picker-cell-inner']"));
//		  String YearINList=yearsfromList.getText();
//		  System.out.println(YearINList);
//		 Integer s= Integer.valueOf(YearINList);
//		 WebElement yearsfromList=  driver.findElement(By.xpath("//td[@title=\"2019\"]"));
		  
		 /* for(int i =0; i<AllYear.size();i++)
		  {
			  System.out.println("Inside for loop");
		  WebElement YearINList=AllYear.get(i);
		 
		  String year =YearINList.getText(); 
		  try {
		  s= Integer.valueOf(year);}
		  catch(NumberFormatException ex)
		  {
			  
		  
		 try {
		  if(Birthyear>s) 
		  {  System.out.println("Inside if block");
		  
			  driver.findElement(By.xpath("//span[@class=\"ant-picker-super-prev-icon\"]")).click();
		  }
		  else if(Birthyear==s)
		  {    System.out.println("Inside else if block");
			  YearINList.click();
		  }
		 }
		 catch(NullPointerException r) {
			 
		 }
		  }
		  
		  for(int i =0; i<AllYear.size();i++)
		  {
		  WebElement YearINList=AllYear.get(i);
		 
		  String year =YearINList.getText();
		  Integer s= Integer.valueOf(year);
		  
		  if(Birthyear>s) 
		  {
		  
			  driver.findElement(By.xpath("//span[@class=\"ant-picker-super-prev-icon\"]")).click();
		  }
		  else if(Birthyear==s)
		  {
			  YearINList.click();
		  }
		  }*/
	}


