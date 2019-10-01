package testng;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
public void testlogin() {
		throw new SkipException("reason");
	//System.out.println("login");
}
	
	@Test(priority=2,dependsOnMethods={"testlogin"})
	public void password() {
		System.out.println("password");
	}
	
	@Test(priority=3,dependsOnMethods= {"testlogin","password"})
	public void logout() {
		System.out.println("logout");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("execute before every testcase");
	}
	@AfterMethod
	public void feforemethod() {
		System.out.println("execute after every testcase");
	}
	
	@BeforeTest
	public void beforetestmethod() {
		System.out.println("execute before test");
	}
	@AfterTest
	public void aftertestmethod() {
		System.out.println("execute after test");
	}
}
