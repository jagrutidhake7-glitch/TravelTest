package in.TravelTest.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.tools.javac.util.List;

public class RegisterPage {
private static final String Gender = null;
WebDriver w;
public RegisterPage(WebDriver wd) {
	System.out.println(wd);
	w = wd;
}
//locator
By fullname = By.id("register-full-name-input");
By email = By.name("email");
By phonenumber = By.cssSelector("input[data-testid=\"register-phone-input\"]");
By gender = By.name("gender");
By password = By.xpath("//input[@id=\"register-password-input\"]");
By confirmpassword =By.id("register-confirm-password-input");
By termAndCondition = By.id("register-terms-checkbox");
By registerButton = By.cssSelector("button[data-testid=\"register-submit-button\"]");
By loginLink = By.cssSelector("a[data-testid=\"nav-register-Link\"]");
By registerHomepage = By.cssSelector("a[data-testid=\"nav-register-Link\"]");
//Actions ---> methods

//homepage register
public void register() {
	w.findElement(registerHomepage).click();
}

//full name
public void enterfullName(String fullName) {
	w.findElement(this.fullname).sendKeys(fullName);)
}
 //full name
public void clearFullname() {
	w.findElement(fullname).clear();
}
//email
public void enterEmail(String Email) {
	w.findElement(email).sendKeys(Email);
}
public void clearEmail() {
	w.findElement(email).clear();
}

//phone number
public void enterPhoneNumber(String Phonenumber) {
	w.findElement(phonenumber).sendKeys(Phonenumber);
}
public void clearPhoneNumber() {
	w.findElement(phonenumber).clear();
}

//gender
public void gender(String Gender) {
	List<WebElement> genders = w.findElements(gender);
	for(int i =0; i < gender.size(); i++) {
		if(Gender.equalsIgnoreCase("female")) {
			genders.get(0).click();
		}else if (Gender.equalsIgnoreCase("male")) {
			genders.get(1).click();
		}else if(Gender.equalsIgnoreCase("Other")) {
			genders.get(2).click();
	}
		
	}
}

//password

public void enterPassword(String Password) {
	w.findElement(password).sendKeys(Password);
}
public void clearPassword() {
	w.findElement(password).clear();
}

//confirm password

public void enterConfirmPassword(String ConfirmPassword) {
	w.findElement(confirmpassword).sendKeys(ConfirmPassword);
}
public void clearconfirmPassword() {
	w.findElement(confirmpassword).clear();
}

//Term and condition

public void termAndCondition() {
	w.findElement(termAndCondition).click();
}
//Register

public void registerButton() {
	w.findElement(registerButton).click();
	
}
//Login link
//login link
public void loginlink() {
	w.findElement(loginLink).click();
}
}
