package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class SeleniumCommanFunctions {
	
	public static WebDriver openBrowser(String brName) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    return driver;
	
	}

	public static void openUrl(WebDriver driver, String OpenUrl) {
		driver.get(OpenUrl);
		
	}

	public static void enterText(WebDriver driver, String LocName, String LocValue, String dataToEnter) {
		if("id".equals(LocName)) {
			driver.findElement(By.id(LocValue)).sendKeys(dataToEnter);
		}
		if("xpath".equals(LocName)) {
			driver.findElement(By.xpath(LocValue)).sendKeys(dataToEnter);
		}	
		}

	public static void clickbutton(WebDriver driver, String clickon, String dataToEnter) {
		driver.get(clickon);
		
	}

	public static void clickbutton(WebDriver driver, String LocName, String LocValue, String dataToEnter) {
		if("id".equals(LocName)) {
			driver.findElement(By.id(LocValue)).sendKeys(dataToEnter);
		}
		if("xpath".equals(LocName)) {
			driver.findElement(By.xpath(LocValue)).sendKeys(dataToEnter);
		}	
	}
	public void pause(int timeTowait) {
		try {
			Thread.sleep(timeTowait);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

	public static void useradd(WebDriver driver, String useradd) {
		  driver.get(useradd);
		
	}
		
	}
	
