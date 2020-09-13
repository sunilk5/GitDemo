package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo4 {

	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname) 
	{
		//selenium
		System.out.println("web login home");
		System.out.println(uname);
	}
	
	@Test(groups = {"Smoke"})
	public void MobileloginHomeLoan() {
		//appium
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API automation
		System.out.println("APILoginhome");
	}
}
