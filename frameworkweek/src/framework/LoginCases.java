package framework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class LoginCases {
	@Test(dataProvider = "loginData")
	public void loginTestCases(Integer n, String s,String h) {
		System.out.println(n);
		System.out.println(s);
	}

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] {
			new Object[] { 1,"a","jj" }, 
			new Object[] {2,"b","jj"},
		};
	}
}
