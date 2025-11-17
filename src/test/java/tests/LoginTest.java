package tests;

import org.testng.annotations.BeforeMethod;

import pages.LoginPage;
import org.json.simple.JSONObject;

public class LoginTest extends BaseTest{
	
//	@BeforeClass
//	public void signUp() {
//		JSONObject userData = utils.jsonReader.getJsonData("data/signUpCred.json");
//		LoginPage signUp = new LoginPage(driver);
//		
//		signUp.navigateToSignUp();
//        signUp.fillFormDetails(
//                (String) userData.get("name"),
//                (String) userData.get("email"),
//                (String) userData.get("number"),
//                (String) userData.get("password")
//            );
//        signUp.submitButton();        
//	}
	
	@BeforeMethod(dependsOnMethods = "setUp")
	public void login() {
		LoginPage login = new LoginPage(driver);
		
		JSONObject userData = utils.jsonReader.getJsonData("data/signUpCred.json");
		
		login.fillLoginDetails(
				(String) userData.get("email"),
				(String) userData.get("password"));
		
		login.submitButton();
	}
	
}
