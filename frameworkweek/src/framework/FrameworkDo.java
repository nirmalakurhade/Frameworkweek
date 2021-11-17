package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameworkDo {
	WebDriver driver = null;

	@BeforeMethod
	public void openBrowser() {
		
		WebDriver driver = CommanSeleniumFunction.openBrowser("Chromedriver.exe");
	}
	@Test
	public void login() {
		new CommanSeleniumFunction(driver);
		WebDriver driver = CommanSeleniumFunction.openBrowser("Chromedriver.exe");
		CommanSeleniumFunction.openUrl(driver,Constant.SETURL);
		CommanSeleniumFunction.enterText(driver,"email","email","kiran@gmail.com");
		CommanSeleniumFunction.enterText(driver,"password","password","123456");
		CommanSeleniumFunction.clickbutton(driver,"",Constant.SINGIN);
	}
	@Test
	public void cheakpassword() {
		new CommanSeleniumFunction(driver);
		WebDriver driver = CommanSeleniumFunction.openBrowser("Chromedriver.exe");
		CommanSeleniumFunction.openUrl(driver,Constant.SETURL);
		 String Wrongepassword =driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		 System.out.println("password_error="+Wrongepassword); 
		 String exp = ""; 
		 Assert.assertEquals(Wrongepassword,exp);
		
	}
	
}
