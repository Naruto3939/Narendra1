package A;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class A2 extends A1{
	
	
	public static String txtbox = "//input[@id='twotabsearchtextbox']";
	public static String searchbtn = "//input[@id='nav-search-submit-button']";

	@Test
	public void home() {
		driver.findElement(By.xpath(txtbox)).sendKeys(configFileReader("productname"));
		driver.findElement(By.xpath(searchbtn)).click();
	}
}


