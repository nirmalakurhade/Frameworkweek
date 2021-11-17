package framework;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoFrameWork {
	WebDriver driver = null;
	
	public void openBrowser() {
		 driver = SeleniumCommanFunctions.openBrowser("ChromeDriver.exe");
	}
	
	@Test
	public void login() {
		WebDriver driver = SeleniumCommanFunctions.openBrowser("brName");
		SeleniumCommanFunctions.openUrl(driver,Constant.SETURL);
		SeleniumCommanFunctions.enterText(driver,"id","email","kiran@gmail.com");
		SeleniumCommanFunctions.enterText(driver,"id","password","123456");
		SeleniumCommanFunctions.clickbutton(driver,"","",Constant.SINGIN);
		SeleniumCommanFunctions.openUrl(driver,Constant.LOGINURL);
		driver.close();
	}
	
	@Test
	public void checkmail() {
		WebDriver driver = SeleniumCommanFunctions.openBrowser("brName");
		SeleniumCommanFunctions.openUrl(driver,Constant.SETURL);
		SeleniumCommanFunctions.enterText(driver,"email_error","email","kiran19@gmail.com");
		String wrongmail = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		String act = driver.getTitle();
		System.out.println("Actual:"+act);
		String exp ="email_error";
		//System.out.println("Expected"+exp);
		Assert.assertEquals(act,exp);
		}
	
	@Test 
	public void verifypassword() {
		WebDriver driver = SeleniumCommanFunctions.openBrowser("ChromeDriver.exe");
		SeleniumCommanFunctions.openUrl(driver,Constant.SETURL);
		SeleniumCommanFunctions.enterText(driver,"password_error","password","456789");
		System.out.println("password_error");
		String exp ="";
		Assert.assertEquals("",exp);
				
	}
	
	@Test
	public void Adduser() {
		WebDriver driver = SeleniumCommanFunctions.openBrowser("ChromeDriver.exe");
		SeleniumCommanFunctions.openUrl(driver,Constant.SETURL);
		SeleniumCommanFunctions.enterText(driver,"id","email","kiran@gmail.com");
		SeleniumCommanFunctions.enterText(driver,"id","password","123456");
		SeleniumCommanFunctions.clickbutton(driver,"","",Constant.SINGIN);
		SeleniumCommanFunctions.openUrl(driver,Constant.LOGINURL);
		SeleniumCommanFunctions.useradd(driver,Constant.USER);
		SeleniumCommanFunctions.useradd(driver,Constant.ADDUSER);
		SeleniumCommanFunctions.enterText(driver,"id","username","nirmala");
		SeleniumCommanFunctions.enterText(driver,"id","email","nirmala@gmail.com");
		SeleniumCommanFunctions.enterText(driver,"id","mobile","988774455");
		SeleniumCommanFunctions.enterText(driver,"id","course","JAVA");
		driver.close();
		
	}

}
