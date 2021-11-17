package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;


public class CommanSeleniumFunction {
	
	static WebDriver driver = null;
	
	CommanSeleniumFunction(WebDriver driver){
		this.driver = driver;
	}
	
	public static  WebDriver openBrowser(String brName) {
		
		return driver;
	   }

	public static void openUrl(WebDriver driver, String OpenUrl) {
		driver.get(OpenUrl);
		
	}

	public static void enterText(WebDriver driver, String LocType, String LocValue , String dataToEnter  ) {
		getElementasperLocator(LocType,LocValue).sendKeys(dataToEnter);
		}

	public static void clickbutton(WebDriver driver, String locType, String LocValue ) {
			getElementasperLocator(locType,LocValue).click();
		
	}
	private static WebElement getElementasperLocator(String locatorName , String locValue) {
		WebElement we;
		switch (locatorName) {
		case"id":
			we= driver.findElement(By.id(locValue));
			break;
		case"xpath":
			we=driver.findElement(By.xpath(locValue));
			break;
			default:
				break;
			}
	
		return null;
	}
}



