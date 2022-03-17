package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Narendra {
	public void Demo()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static void main(String args[])
	{
		Narendra app = new Narendra();
		app.Demo();
	}
}
