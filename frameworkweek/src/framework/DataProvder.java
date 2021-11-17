package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvder {
	WebDriver driver;

	@BeforeMethod
	public void Pagesetup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}
	

	@Test(dataProvider = "loginData")
	public void loginregisterpage(String TcId , String testDesc , String Email , String Pasword , String ExpemailErr , String ExppasswordErr ) {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("dgfghhjh");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("cbvnjhjhm");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	}
	@DataProvider
	//public Object[][] loginData() {
		//Object[][] arrayObject = getExcelData("E:\\login","Sheet1");
		//return U;
	
	
	
	
	@AfterMethod
	public void closedriver() {
		driver.close();
	}
}
