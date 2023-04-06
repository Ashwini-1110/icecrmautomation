package com.ice_hrm_automation2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;

public class Chrome extends BaseClass
{
@BeforeMethod
public void beforeMethod() 
{
 launchBrowser("Edge");
 
 driver.get("https://www.google.com/");
}
 @Test
 public void test() throws AWTException
 {
 enterText(By.id("input"),"maven repository");
 
 Robot robot= new Robot();
 
 robot.keyPress(KeyEvent.VK_ENTER);
 
 robot.keyRelease(KeyEvent.VK_ENTER);
}	
}

