package com.ice_hrm_automation_utility;

public class EmpDetails 
{
   private double id;
   
   private String FirstName;
   
   private String MiddleName;
   
   private String LastName;
   
   private String Profile;
   
   private double Salary;
   
   private String City;
   
   private String Company;
   
   public void setId(double id)
   {
	this.id= id;   
   }
   
   public double getId()
   {
	   return this.id;
   }
   public void setFirstName(String firstname)
   {
	   this.FirstName= firstname;
   }
   public String getFirstName()
   {
	   return this.FirstName;
   }
	
   public void setMiddleName(String Middlename)
   {
	   this.MiddleName= Middlename;
   }
   public String getMiddleName()
   {
	   return this.MiddleName;
   }
   
   public void setLastName(String Lastname)
   {
	   this.LastName= Lastname;
   }
   public String getLastName()
   {
	   return this.LastName;
   }
   public void setProfile(String profile)
   {
	   this.Profile= profile;
   }
   public String getProfile()
   {
	   return this.Profile;
   }
   public void setSalary(double salary)
   {
	   this.Salary= salary;
   }
   public double getSalary()
   {
	   return this.Salary;
   }
   public void setCity(String city)
   {
	   this.City= city;
   }
   public String getCity()
   {
	   return this.City;
   }
   public void setCompany(String company)
   {
	   this.Company= company;
   }
   public String getCompany()
   {
	   return this.Company;
   }
}
