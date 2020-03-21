package seleniumtestngbasic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("declaring and initializing webdriver");
	}
	
	@Test
	public void doRegistration() {
		System.out.println("doing registration");
	}
	
	@Test
	public void loginUser() {
		System.out.println("logging into portal");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("quitting browser");
	}

}
