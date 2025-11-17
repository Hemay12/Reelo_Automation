package locators;

import org.openqa.selenium.By;

import utils.ConfigReader;

public class CampaignsPageLocators {
	
	public static By navigateToCampaign = By.xpath("//span[normalize-space()='Campaigns']");
	public static By selectSms = By.xpath("//div[normalize-space()='SMS']");
	public static By customizeAndSend = By.xpath("//span[normalize-space()='Customise and Send']");
	public static By emailCheckbox = By.xpath("(//div[@class='custom-checkbox4'])[3]");
	public static By nextButton = By.xpath("//button[normalize-space()='Next']");
	public static By campaignTitle = By.xpath("//input[@placeholder='Enter Title']");
	public static By phoneNumber = By.xpath("//span[@class='filler']");
	public static By logo = By.id("logo-upload");
	public static By editMessage = By.xpath("(//span[@contenteditable])[1]");
	public static By mobileNumber = By.xpath("//input[@id='number']");
	public static By testCampaign = By.xpath("//span[normalize-space()='Test campaign']");
	public static By successToaster = By.xpath("(//div[@class='toastr animated rrt-success'])");
	public static By saveAndExit = By.xpath("//button[normalize-space()='Save and exit']");
	public static By imageSave = By.xpath("//span[normalize-space()='Save']");
	
    public static By selectDefaultTemplate(String templateName) {
        return By.xpath("//h4[normalize-space()='" + templateName + "']");
    }
    
	public static By actualPhoneNumber() {
		return By.xpath("//span[@class='filler']");
	}
}
