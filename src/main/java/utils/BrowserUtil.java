package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {
	
	public static void clickAction(WebDriver driver, By ele ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Thread.sleep(1000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
        try {
            element.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            // fallback to JS click if Selenium click fails
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
	}
	
	public static void enterKeys(WebDriver driver, By ele, String str) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ele));

	    element.click();

	    try {
	        element.clear();
	    } catch (Exception e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].value='';", element);
	    }

	    element.sendKeys(str);
	}

}
