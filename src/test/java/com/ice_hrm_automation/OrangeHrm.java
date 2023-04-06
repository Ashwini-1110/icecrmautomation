package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws Exception , InterruptedException 
	{
	 System.setProperty("webdriver.edge.driver", "msedgedriver.exe");	
	 
	 WebDriver driver = new EdgeDriver();
	 
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 Thread.sleep(5000);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 
	 driver.findElement(By.xpath("//button[@type='submit']")).submit();
	 Thread.sleep(5000);
	 String UrlLink=driver.getCurrentUrl();
	 System.out.println(UrlLink);
	 Thread.sleep(5000);
	 String DashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	 
	 if(DashboardText.equals("Dashboard"))
	 {
		 System.out.println("Home page display successfully"); 
	 }
	 else
	 {
		 throw new Exception("Login failed");
		// System.out.println("Login failed");
	 }
	
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	Thread.sleep(5000);
     WebElement resetbutton =driver.findElement(By.xpath("//button[@type=\"reset\"]"));
     
     if(resetbutton.isDisplayed())
     {
    	 System.out.println("You are in PIM module");
    	 if(resetbutton.isEnabled())
    	 {
    		 System.out.println("reset button is enable");
    	 }
    	 else
    	 {
    		 System.out.println("reset button is disable");
    	 }
     }
     else
    	 throw new Exception("Not in PIM module");
	
	WebElement select=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span/i"));
    select.click();
    
	if(select.isSelected())
	{
	System.out.println("select you selected element");
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//img[@alt='profile picture']/following::i[1]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin");
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
   /* Boolean resetbutton =driver.findElement(By.xpath("//button[@type=\"reset\"]")).isDisplayed();
    System.out.println(resetbutton);
    if(resetbutton.equals("Reset"))
    {
   	 System.out.println("You are in PIM module");
  	 if(resetbutton.isEnabled())
   	{
   		 System.out.println("reset button is enable");
   	 }
   	 else
   	 {
   		 System.out.println("reset button is disable");
   	 }
    }
    else
   	 throw new Exception("Not in PIM module");
	
	WebElement select=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span/i"));
   select.click();
   
	if(select.isSelected())
	{
	System.out.println("select you selected element");
	}*/
	 
	}	
	
}
