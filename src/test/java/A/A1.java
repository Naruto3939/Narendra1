package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class A1 extends Configuration1 {
	
	
	static WebDriver driver;
	protected static WebDriverWait wait;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(configFileReader("url"));
		driver.manage().window().maximize();
	
	}
	}

