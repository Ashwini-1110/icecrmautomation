package com.ice_hrm_automation2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;

public class Edge extends BaseClass
{
 @BeforeMethod
 public void beforeMethod()
 {
	 launchBrowser("Edge");
 
	 
 }
 
 @Test
 public void test()
 {
	 driver.navigate().to("https://www.amazon.in/");
 }

	
}

