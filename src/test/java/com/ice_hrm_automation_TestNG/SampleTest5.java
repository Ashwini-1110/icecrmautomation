package com.ice_hrm_automation_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest5 {
	@BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("Before Suite from Sample Test 5");
	  }
	  
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("Before Test from Sample Test 5");
	 }
	 
	 @BeforeClass
	 public void beforeClass()
	 {
		 System.out.println("Before Class from Sample Test 5");
	 }
	 
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("Before Method from Sample Test 5");
	 }
	 
	 @Test
	 public void test()
	 {
		 System.out.println(" Test from Sample Test 5");
	 }
	 
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("After Method from Sample Test 5");
	 }
	 
	 @AfterClass
	 public void afterClass()
	 {
		 System.out.println("After Class from Sample Test 5");
	 }
	 
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("After Test from Sample Test 5");
	 }
	 
	 @AfterSuite
	 public void afterSuite()
	 {
		 System.out.println("After Suite from Sample Test 5");
	 }
}
