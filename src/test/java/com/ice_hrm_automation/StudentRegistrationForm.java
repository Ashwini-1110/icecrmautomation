package com.ice_hrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentRegistrationForm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
         driver.navigate().to("https://demoqa.com/automation-practice-form");
         
         driver.findElement(By.id("firstName")).sendKeys("Ashwini");
         
         driver.findElement(By.id("lastName")).sendKeys("Doke");
         
         driver.findElement(By.id("userEmail")).sendKeys("ardoke@gmail.com");
         
         driver.findElement(By.xpath("//input[@id=\"gender-radio-2\"]/following::label[1]")).click();
         
         driver.findElement(By.id("userNumber")).sendKeys("8788158009");
         
        // driver.findElement(By.id("dateOfBirthInput")).sendKeys("11 oct 2000");
         //Thread.sleep(9000);
         
        // driver.findElement(By.xpath("//div[@id=\"dateOfBirth-wrapper\"]/following::div[5]")).sendKeys("Automation Testing");
         
         driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-3\"]/following::label[1]")).click();
         
         driver.findElement(By.id("currentAddress")).sendKeys("Katraj , Pune");
         
         driver.findElement(By.xpath("//div[@id=\"stateCity-wrapper\"]/div[2]/div/div/div[2]/div")).click();
         
         List<WebElement> selectedState = driver.findElements(By.xpath("//div[@id=\"stateCity-wrapper\"]/div[2]/div/div/div[2]"));
         
         for(int i =0; i<selectedState.size(); i++) 
         {
           WebElement select = selectedState.get(i);
           String element = select.getText();
           System.out.println(element);
         }
        }

}
