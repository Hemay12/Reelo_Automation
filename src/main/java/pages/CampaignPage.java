package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.CampaignsPageLocators;
import utils.BrowserUtil;

public class CampaignPage {
	
	private WebDriver driver;
	
	public CampaignPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToCampaignPage() {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.navigateToCampaign);
	}
	
    public void selectTemplate(String templateName) {
    	BrowserUtil.clickAction(driver, CampaignsPageLocators.selectDefaultTemplate(templateName));
    }
    
	public void selectSmsChannel() {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.selectSms);
	}
	
	public void smsFlow(String Title) {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.customizeAndSend);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.emailCheckbox);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.nextButton);
		BrowserUtil.enterKeys(driver, CampaignsPageLocators.campaignTitle, Title);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.nextButton);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.nextButton);
	}
	
	public String actualPhoneNumber() {
		String actualNumber = driver.findElement(CampaignsPageLocators.actualPhoneNumber()).getText();
		return actualNumber;
	}
	
	public void addLogo(String path) {
		driver.findElement(CampaignsPageLocators.logo).sendKeys(path);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.imageSave);
	}
	
	public void editSmsAndNumber(String message,String mobileNumber) {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.nextButton);
		BrowserUtil.clickAction(driver, CampaignsPageLocators.nextButton);
		BrowserUtil.enterKeys(driver, CampaignsPageLocators.editMessage, message);		
//		BrowserUtil.enterKeys(driver, CampaignsPageLocators.mobileNumber, mobileNumber);		
	}
	
	public void testCampaign() {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.testCampaign);
	}
	
	public boolean toasterVisible() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement toaster = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(CampaignsPageLocators.successToaster)
	        );
	        return toaster.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public void saveAndExit() {
		BrowserUtil.clickAction(driver, CampaignsPageLocators.saveAndExit);
	}
}
