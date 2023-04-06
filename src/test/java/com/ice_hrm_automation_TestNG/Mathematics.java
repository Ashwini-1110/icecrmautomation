package com.ice_hrm_automation_TestNG;

import org.testng.annotations.Test;

public class Mathematics 
{
  @Test
  public void addition() 
  {
	  int a = 50 , b= 100;
	  
	  System.out.println("Addtion : " +(a+b));
	  
  }
  @Test
  public void substraction()
  {
	  float a =50.5f , b= 45.5f;
	  
	  System.out.println("Subtraction : "+(a-b));
  }
  @Test
  public void multiplication()
  {
	  short a = 50, b = 5;
	  
	  System.out.println("Multiplication : "+a*b);
  }
  @Test
  public void division()
  {
	  byte a = 100, b= 50;
	  
	  System.out.println("Division : "+a/b);
  }
}
