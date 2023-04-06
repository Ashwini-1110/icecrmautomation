package com.ice_hrm_automation_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer
{
  public boolean retry(ITestResult result)
  {
	  int count =0;
	  int maxcount = 2;
	  if(!result.isSuccess())
	  {
		  if(count<=maxcount)
		  {
			  count++;
			  result.setStatus(ITestResult.FAILURE);
			  return true;
		  }
		  else
		  {
			 result.setStatus(ITestResult.FAILURE);
		  }
	  }
	  else
	  {
		 result.setStatus(ITestResult.SUCCESS); 
	  }
	  
	  return false;  
  }
}
