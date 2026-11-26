package in.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.TravelTest.Page.LoginPage;

public class LoginTestWithValidAndInvalidData {
	
	@Test (priority = 0)
	
	public void loginWithValid() throws Exception{
	WebDriver w = new ChromeDriver();
	w.get("https://travel-test-bug.vercel.app/");
	Thread.sleep(2000);
	LoginPage p = new LoginPage(w);
	p.login();
	Thread.sleep(2000);
	p.enterEmail("jagrutipatil123@atomicmail.io");
	Thread.sleep(2000);
	p.enterPassword("jagruti@123");
	Thread.sleep(2000);
	p.rememberMe();
	Thread.sleep(2000);
	p.loginButton();
	Thread.sleep(2000);
	w.quit();

}
	@Test (priority = 1)
	
	public void loginWithInvalid() throws Exception{
		WebDriver w = new ChromeDriver(); //precondition
		w.get("https://travel-test-bug.vercel.app/"); //pre-condition
		Thread.sleep(2000);
		LoginPage p =new LoginPage(w);
		p.login();
		Thread.sleep(2000);
		p.enterEmail("jagghumiyaterejaisanakoi@gmail.com"); //test condition
		Thread.sleep(2000);
		p.enterPassword("yekyahorahai"); //test condition
		Thread.sleep(2000);
		p.loginButton();
		Thread.sleep(2000);
		w.quit();
		Assert.assertEquals(true,false);
	}
	}
	
