package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {

@BeforeClass
public void beforeclass() {
	System.out.println("Before executing any methods in the class");
}

@AfterClass
public void afterclass() {
	System.out.println("After executing all methods in class");
}
	
@Parameters({"URL", "APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String key) 
{
		//selenium
		System.out.println("web login car");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileloginCarLoan() {
		//appium
		System.out.println("mobileloginCar");
	}
	
	@Test(enabled = false)
	public void MobilesigninCarLoan() {
		//appium
		System.out.println("mobile signin");
	}
	
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	//(timeOut = 4000)
	@Test(dataProvider = "getData")
	public void MobilesignoutCarLoan(String username, String password) {
		//appium
		System.out.println("mobile signout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods = {"WebloginCarLoan", "MobilesignoutCarLoan"})
	public void LoginAPICarLoan() {
		//Rest API automation
		System.out.println("APILogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//3 combinations of data set to be tested for the testcases  
		//1st combination of username -password - good credit history = row
		//2nd combination of username -password - no credit history
		//3rd combination of username -password - fradulant credit history
		
		Object[][]data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0] = "Secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "Thirdsetusername";
		data[2][1] = "Thirdpassword";
		return data;

		
		}
}
