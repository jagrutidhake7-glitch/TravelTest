package in.TravelTest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.TravelTest.Page.LoginPage;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		LoginPage login = new LoginPage(w);
		w.get("https://travel-test-bug.vercel.app/");
		Thread.sleep(2000);
		login.login();
		Thread.sleep(2000);
		login.enterEmail("jagrutidhake7@gmail.com");
		Thread.sleep(2000);
		login.enterPassword("jags@123");
		Thread.sleep(2000);
		login.showPassword();
		Thread.sleep(2000);
		login.rememberMe();
		Thread.sleep(2000);
		login.loginButton();
	}

}
