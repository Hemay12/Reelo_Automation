package pages;

import org.openqa.selenium.WebDriver;

import locators.LoginPageLocators;
import utils.BrowserUtil;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToSignUp() {
		BrowserUtil.clickAction(driver, LoginPageLocators.navigateToSignUpPage);
	}
	
	public void fillFormDetails(String name, String email, String number, String password) {
		BrowserUtil.enterKeys(driver, LoginPageLocators.name, name);
		BrowserUtil.enterKeys(driver, LoginPageLocators.email, email);
		BrowserUtil.enterKeys(driver, LoginPageLocators.number, number);
		BrowserUtil.enterKeys(driver, LoginPageLocators.password, password);
	}
	
	public void submitButton() {
		BrowserUtil.clickAction(driver, LoginPageLocators.submitButton);
	}
	
	public void fillLoginDetails(String email, String password) {
		BrowserUtil.enterKeys(driver, LoginPageLocators.email, email);
		BrowserUtil.enterKeys(driver, LoginPageLocators.password, password);
	}

}
