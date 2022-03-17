package Assignment2;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AddToCart extends SearchAmazon
{
	
	
	@Test(priority=3)
	public void add() throws Exception
	{
		
		Set<String> abc = driver. getWindowHandles();
		System.out.println("Opened windows are" +abc);
		int count =abc.size();
		System.out.println("count of windows opened are :" +count);
		String mainwindow =driver.getWindowHandle(); 
		System.out.println("parent window:" +mainwindow);
		for (String child:abc)
		{
			if(!mainwindow.endsWith(child))
			{
				driver.switchTo().window(child);
			
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,400)");
				driver.findElement(By.id("add-to-cart-button")).click();
				Thread.sleep(2000);
				screenshot();
				//driver.findElement(By.xpath("//span[@id='attachSiAddCoverage']")).click();  
				//driver.findElement(By.xpath("//form[@id='sw-ptc-form']"));
				driver.findElement(By.cssSelector("#sw-ptc-form"));
				//driver.findElement(By.xpath("//form[@id='sw-ptc-form']")).click();
				//driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-span12 a-button-primary']")).click();
				//driver.findElement(By.xpath("//span[@id='a-autoid-0']")).click();
			}
			
		}
	}
}
	

