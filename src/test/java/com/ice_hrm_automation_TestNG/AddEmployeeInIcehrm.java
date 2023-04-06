package com.ice_hrm_automation_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;

public class AddEmployeeInIcehrm extends BaseClass {
	@BeforeMethod
	public void beforeMethod() {
		launchBrowser("firefox ṃ");

		driver.get("https://cybersuccess.icehrm.com/");

		enterText(By.id("username"), "admin");

		enterText(By.id("password"), "2zuzfakn");

		click(By.xpath("//button[contains(text(),'Log in')]"));

		click(By.xpath("//span[text()=\"Employees\"]"));

		click(By.xpath("//ul[@id='admin_Employees']//a[1]"));

	}

	@Test
	public void addEmp() {
		click(By.xpath("//span[text()=' Add New']"));

		enterText(By.id("employee_id"), "8788158009");

		enterText(By.id("first_name"), "Ashwini");

		enterText(By.id("middle_name"), "Ramhari");

		enterText(By.id("last_name"), "Doke");

		enterText(By.id("birthday"), "2000-10-11");

// List<WebElement> nationality= driver.findElements(By.xpath("//div[@id='rc_select_0_list']/following::div[1]/div[1]/div/div/div"));
//	  
//	  for(int i=0; i<nationality.size();i++) 
//	  {
//		  WebElement country= nationality.get(i);
//		  
//		  String selectcountry = country.getText();
//		  
//		  if(selectcountry.equals("Austrian"))
//          {
//			  System.out.println(selectcountry);
//			  country.click();
//			  break;
//		  }
//	  }

		click(By.id("rc_select_1"));

		list(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"), "Female");

		click(By.id("rc_select_2"));

		list(By.xpath("//div[@id='rc_select_2_list']/following::div[4]/div"), "Single");
		// Thread.sleep(3000);

		click(By.xpath("//span[text()='Save']"));

		// List<WebElement> nationality=
		// driver.findElements(By.xpath("//div[@id='rc_select_0_list']/following::div[1]/div[1]/div/div/div"));

		enterText(By.xpath("//input[@id='rc_select_0']"), "Indian");

		click(By.xpath("//div[text()='Indian']"));

		click(By.xpath("//span[text()='Save']"));

		list(By.xpath("//div[@id='rc_select_5_list']//div[@id='rc_select_5_list']/following::div[1]/div/div/div/div"),
				"Full Time Permanent");
		// click(By.xpath("//div[text()='Full Time Permanent']"));
//		   for(int i =0; i<Employmentstatus.size(); i++)
//		   {
//			   WebElement status = Employmentstatus.get(i);
//			   
//			   String Employement =  status.getText();
//			   
//			   if(Employement.equals("Full Time Permanent"))
//			   {
//				   status.click();
//			   }
//		   }

		list(By.xpath("//div[@id='rc_select_6_list']/following::div[1]/div/div/div/div"), "Head Office");
		// click(By.xpath("//div[text()='Head Office']"));
//		   for(int i=0; i<Department.size();i++ )
//		   {
//               WebElement Dept = Employmentstatus.get(i);
//			   
//			   String EmpDepartment =  Dept.getText();
//			   
//			   if(EmpDepartment.equals("Head Office"))
//			   {
//				   Dept.click();
//			   } 
//		   }

		list(By.xpath("//div[@id='rc_select_7_list']/following::div[1]/div/div/div/div"), "Assistant QA Engineer");
		// click(By.xpath("//div[text()='Assistant QA Engineer ']"));
//		   
//		   for(int i=0; i<JobTitle.size();i++)
//		   {
//               WebElement JB = Employmentstatus.get(i);
//			   
//			   String EmpJobTitle =  JB.getText();
//			   
//			   if(EmpJobTitle.equals("Assistant QA Engineer "))
//			   {
//				   JB.click();
//			   } 
//		   }

		enterText(By.id("joined_date"), "2022-11-12");

		click(By.xpath("//span[text()='Save']"));
		driver.findElement(By.id("rc_select_5")).click();
		list(By.xpath("//div[@id='rc_select_5_list']//div[@id='rc_select_5_list']/following::div[1]/div/div/div/div"),
				"Full Time Permanent");
		click(By.xpath("//div[text()='Full Time Permanent']"));

		driver.findElement(By.id("rc_select_6")).click();
		list(By.xpath("//div[@id='rc_select_6_list']/following::div[1]/div/div/div/div"), "Head Office");
		click(By.xpath("//div[text()='Head Office']"));

		driver.findElement(By.id("rc_select_7")).click();
		list(By.xpath("//div[@id='rc_select_7_list']/following::div[1]/div/div/div/div"), "Assistant QA Engineer");
		click(By.xpath("//div[text()='Assistant QA Engineer ']"));
		click(By.xpath("//span[text()='Save']"));

		enterText(By.id("rc_select_9"), "India");
		click(By.xpath("//div[text()='India']"));
		click(By.xpath("//span[text()='Save']"));
//		  WebElement nextpage = driver.findElement(By.xpath("//div[text()='Employment Status']"));
//		  
//		  if(nextpage.isDisplayed())
//		  {
//			  System.out.println("next page is open");
//		  }
//		  else
//		  {
//			  System.out.println("required filled is mandatory");
//		  }

	}

}
