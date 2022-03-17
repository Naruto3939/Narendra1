package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginohrm {
	WebDriver driver;
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	public void login() throws Exception
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("URL:-"+ url);
		Thread.sleep(3000);
		driver.quit();
	}
	public static void main(String args[]) throws Exception
	{
		Loginohrm a=new Loginohrm();
		a.open();
		a.login();
	}
}
