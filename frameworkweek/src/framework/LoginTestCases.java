package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCases {

	@Test(dataProvider = "loginData")
	public void blankUnameTest(String tcId, String testDesc,String email,String password, String ExpEmailErr, String ExpPasswordErr) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String actResult = "";
		if (!"correct".equals(testDesc)) {
			actResult = driver.findElement(By.id("email_error")).getText();
		} else {
			actResult = driver.getTitle();
		}

		String exp1Result = ExpEmailErr;
		Assert.assertEquals(actResult, exp1Result);
		driver.close();
	}

	@DataProvider
	public Object[][] loginData() throws Exception {
		 return UtilityExcel.getExcelData("E:\\Imlogin.xls","Sheet 1");
	}

}
