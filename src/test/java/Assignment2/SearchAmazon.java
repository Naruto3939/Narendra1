package Assignment2;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchAmazon extends Amazon
{
	@Test(priority=2)
	public void search() throws Exception 
	{

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 128 gb");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']
		//span[contains(text(),'Apple iPhone 13 (128GB) - Midnight')]
	}
}
	
	







