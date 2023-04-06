package com.ice_hrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement Dropdown = driver.findElement(By.xpath("//div[@id=\"sidebar\"]/following::div[1]//p/select"));
		Dropdown.click();
		Select select = new Select(Dropdown);
		
		select.selectByVisibleText("India");
		select.selectByIndex(13);
		select.selectByValue("IND");
		
		List <WebElement> dropdownvalue = select.getOptions();
		
		for(int i=0; i<dropdownvalue.size(); i++)
      {
    	  WebElement element = dropdownvalue.get(i);
    	  String dropdownText = element.getText();
    	  System.out.println(dropdownText);
    	  
      }
		System.out.println("Printing all selected options");
		List<WebElement> selectedvalue =select.getAllSelectedOptions();
		for(int i =0; i<selectedvalue.size(); i++)
		{
			WebElement value= selectedvalue.get(i);
			String SelectedOptions = value.getAttribute("value");
			System.out.println(SelectedOptions);
		}
		
	}

}
