package ice_hrm_automation.loginPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ice_hrm_automation_utility.BaseClass;
import com.ice_hrm_automation_pages.LoginPage;
import com.ice_hrm_automation_utility.PropertyHandling;
import com.ice_hrm_automation_utility.RetryTest;
import com.ice_hrm_automation_utility.TestListeners;


public class LoginTest extends BaseClass 
{
//	TestListeners testlisteners;
	
	PropertyHandling property;
	LoginPage loginpage;
	@BeforeClass
	public void before()
	{
	    property = new PropertyHandling();
		launchBrowser(property.getProperty("browser"));
		//System.out.println("driver value 1 "+driver);
		driver.get(property.getProperty("icehrmurl"));
		
		loginpage = new LoginPage(driver);
		
		
	}
  @Test(dataProvider="getLoginData" ,retryAnalyzer= RetryTest.class )
  public void verifyLogin(String username , String password, String alert) throws Exception  
  {  
	  //System.out.println("driver value 2 "+driver);
	  loginpage.login(username, password);
	  if(!username.isEmpty() && !password.isEmpty())
	  {
		String alertmsg = driver.findElement(loginpage.alert).getText();
		
		Assert.assertEquals(alertmsg, alert);
		
	 }
	  
  }
  
  @DataProvider
  public Object[][] getLoginData()
  {
	 Object[][] obj = new Object[][] {
		 //{"admin123","admin" ,"Login Failed"},
		 {"admin","admin1234","Login failed" },
		 {"admin123","2Zuzfakn","Login failed" },
		 {"","2Zuzfakn","" },
		 {"admin123","","" },
		 {"","",""}
	 } ;
	 return obj;
  }
}
