package AssignmentConfig;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Login extends Configuration {
	static WebDriver driver;
	
	@Test(priority=1)
	public void open() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(configfileReader("url"));
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	public void login() throws Exception 
	{
		driver.findElement(By.name("txtUsername")).sendKeys(configfileReader("username"));
		screenshot();
		//CaptureScreenshot(screenshot);
		driver.findElement(By.id("txtPassword")).sendKeys(configfileReader("password"));
		screenshot();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	@Test(priority=3)
	public void after() 
	{
		String b = driver.getCurrentUrl();
		System.out.println("Url Page 1:-"+b);
		 if(b.equals(driver.getCurrentUrl()))
      	{
	        	System.out.println("You Landed on Right Website");
		
	        }
	      else
	        {
	        	System.err.println("You are Being Taken to Some Other WebPage");
 		}
	}
	@Test()
	public void screenshot() throws IOException
	{
		String fileWithPath ="C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Screenshot\\";
		
		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		
		FileHandler.copy(screenshot, new File(fileWithPath + FileName));
		//*
	}
	/* public void screenshot1(String screenshotName) throws IOException
	 {
		 SimpleDateFormat formatter new = SimpleDateFormat("ddMMyyyyHHss");
		 Date d = new Date();
		 String screenshotNameFormat = screenshotName+ " " + formatter.format(date);
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 org.openqa.selenium.io.FileHandler.copy(screenshot, new File("C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Screenshot\\" +screenshotNameFormat+ ".png"));

	 }*/
}

