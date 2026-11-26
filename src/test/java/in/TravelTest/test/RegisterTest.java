package in.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.TravelTest.Page.RegisterPage;

public class RegisterTest {

	public static void main(String[]args) throws Exception{
		
		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug-vercel.app/");
		RegisterPage rp = new RegisterPage(w);
		Thread.sleep(2000);
		rp.register();
		Thread.sleep(2000);
		rp.enterfullName("Jagruti patil");
		Thread.sleep(2000);
		rp.enterEmail("jagrutipatil123@atomicmail.io");
		rp.enterPhoneNumber("98342321321");
		Thread.sleep(2000);
		rp.gender("female");
		Thread.sleep(2000);
		rp.enterPassword("jagruti@123");
		Thread.sleep(2000);
		rp.clearconfirmPassword();
		Thread.sleep(2000);
		rp.enterConfirmPassword("jagruti@123");
		Thread.sleep(2000);
		rp.registerButton();
		
		
	}
}
