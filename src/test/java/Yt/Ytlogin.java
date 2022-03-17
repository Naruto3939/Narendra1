package Yt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Ytlogin {
	public WebDriver driver;
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.manage().window().maximize();
  }
  @AfterTest
  public void after()
  {
	  String a=driver.getCurrentUrl();
	  System.out.println("URL:-"+a);
  }
  
}
