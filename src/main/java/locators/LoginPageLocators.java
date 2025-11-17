package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	
	//We can also use encapsulation here by wrapping into methods
	
	public static By navigateToSignUpPage = By.xpath("//span[text()='Sign up']");
	public static By name = By.cssSelector("#name");
	public static By email = By.cssSelector("#email");
	public static By number = By.cssSelector("#number");
	public static By password = By.cssSelector("#password");
	public static By submitButton = By.cssSelector(".button-text");
}
