package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Meesho 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Meesho");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Online Shopping Site')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("Kurtis");
	
	    driver.navigate().back();
        driver.navigate().forward();
		driver.navigate().refresh();
		
       String link=driver.getCurrentUrl();
       System.out.println(link);
		
		String Text=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[3]/div[5]/span")).getText();
		driver.close();
		System.out.println(Text);
	}
}

