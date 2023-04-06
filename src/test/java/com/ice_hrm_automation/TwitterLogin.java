package com.ice_hrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TwitterLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver edge.driver","msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://twitter.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")).sendKeys("ardoke");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[6]/div")).click();
	}

}
