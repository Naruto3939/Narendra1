package Assignment2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Amazon extends Configuration2{
	
	static WebDriver driver;
	
	@Test(priority=1)
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get(configFileReader("URL"));
		//driver.get(ConfigExcelFile());
		driver.manage().window().maximize();
	}
	
	public void screenshot() throws IOException
	{
		String fileWithPath ="C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Screenshot\\";
		
		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		
		FileHandler.copy(screenshot, new File(fileWithPath + FileName));
		//*
	}
}
		
		 

	      
	
	
	


