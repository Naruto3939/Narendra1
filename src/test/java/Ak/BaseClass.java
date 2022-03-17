package Ak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr164225";
	public String password="jahetAp";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Narendra Powar\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
//		Logger logger=Logger.getLogger("ebanking");
//		PropertyConfigurator.configure("Log4j.properties");
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

