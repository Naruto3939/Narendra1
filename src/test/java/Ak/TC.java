package Ak;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC extends BaseClass {
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank manager HomePage")) {
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

}
	 


