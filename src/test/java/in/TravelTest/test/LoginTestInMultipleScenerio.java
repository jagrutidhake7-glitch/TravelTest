package in.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.TravelTest.Page.LoginPage;

public class LoginTestInMultipleScenerio {
WebDriver w;  //declaration ---> In this
LoginPage lp;
@BeforeMethod
public void precondition() {
	w = new ChromeDriver();
	w.get("https://travel-test-bug.vercel.app");
	lp = new LoginPage(w);
}

@Test (priority = 0)

public void checkLoginLink() throws Exception{
	Thread.sleep(2000);
	lp.login();
}
@Test (priority = 1)

public void loginWithValidData() throws Exception{
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.enterEmail("jagrutipatil123@atomicmail.io");
	Thread.sleep(2000);
	lp.enterPassword("jagruti@123");
	Thread.sleep(2000);
	lp.rememberMe();
	Thread.sleep(2000);
	lp.loginButton();
	Thread.sleep(5000);
}

@Test (priority = 2)

public void loginWithInvalidData() throws Exception{
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.enterEmail("jagrutipatil123@atomicmail.io");
	Thread.sleep(2000);
	lp.enterPassword("jagruti@123");
	Thread.sleep(2000);
	lp.rememberMe();
	Thread.sleep(2000);
	lp.loginButton();
	Thread.sleep(2000);
}

@Test (priority = 3)

public void forgetPasswordLink() throws Exception{
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.forgetPassword();
}

@Test (priority = 4)

public void createAnAccountLink() throws Exception{
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.createAnAccount();
}

@AfterMethod
public void closeAnBrowser() throws Exception{
	Thread.sleep(2000);
	w.quit();
	
}
	
}