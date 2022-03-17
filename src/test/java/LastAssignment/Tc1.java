package LastAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tc1 
{
	static WebDriver driver;
	@BeforeSuite
	public void suit()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
	}
	@Test
	public void signIn() 
	{
		  driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("");
		  driver.findElement(By.xpath(" //input[@class='a-button-input']")).click();
		  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("");
		  driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		  
	}

}
