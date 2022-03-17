package A;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class A3 extends A2
{
	public static String a = "//span[@class='a-size-medium a-color-base a-text-normal']";
	public static String b = "//input[@id='add-to-cart-button']";
	public static String c= "//span[@id='attach-sidesheet-checkout-button']";
	
@Test
	public void select() {
		String mainwindow = driver.getWindowHandle();
		System.out.println("Main window: "+mainwindow);
		driver.findElement(By.xpath(a)).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Total windows open: "+allwindows);	
		int count = allwindows.size();
		System.out.println("Total windows open: "+count);

		for(String child:allwindows)
		{
			if(!mainwindow.equals(child))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath(b)).click();
			}
			
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(c)));

		}
	
}
