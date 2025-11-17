package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CampaignPage;
import utils.ConfigReader;

public class CreateCampaignTest extends LoginTest{
	
	@Test
	public void createNewCampaign() {
		CampaignPage campaign = new CampaignPage(driver);
		String templateName = ConfigReader.propertyReader("src/test/resources/config.properties", "selectTemplateText");
		String campaignTitle = ConfigReader.propertyReader("src/test/resources/config.properties", "campaignTitle");
		String expectedPhoneNumber = ConfigReader.propertyReader("src/test/resources/config.properties", "phoneNumber");
		String newSms = ConfigReader.propertyReader("src/test/resources/config.properties", "newSms");
		String path = ConfigReader.propertyReader("src/test/resources/config.properties", "imagePath");
		
		campaign.navigateToCampaignPage();
		campaign.selectTemplate(templateName);
		campaign.selectSmsChannel();
		campaign.smsFlow(campaignTitle);
		String actualNumber = campaign.actualPhoneNumber();
		Assert.assertEquals(actualNumber,expectedPhoneNumber, "Phone number mismatch");
		campaign.addLogo(path);
		campaign.editSmsAndNumber(newSms,expectedPhoneNumber);
		campaign.testCampaign();
		Assert.assertTrue(campaign.toasterVisible(), "toaster NOT visible!");
		campaign.saveAndExit();
	}
		
	}
