package com.ice_hrm_automation_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling
{
	Properties properties;
	
	public PropertyHandling() 
	{
	  try 
	  {
		  //config.properties filepath
		  
	    String filepath = System.getProperty("user.dir")+"/config.properties";
	    
		FileInputStream inputstream = new FileInputStream(filepath);//to read the file
		
	    properties = new Properties();
		
	    //load the file in properties class to retrieve 
	    
	    properties.load(inputstream);
		} 
	  
	  catch (IOException e) 
	    {
		  throw new RuntimeException(e);
	    }
	}
	  public String getProperty(String key)
	  {
		String value = properties.getProperty(key);
		  System.out.println(value);
		return value;
	  }
		
	
	  
	

}
