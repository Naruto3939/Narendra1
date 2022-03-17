package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementText;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {
	WebDriver driver;
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
		
	}
	public void assign()throws Exception 
	{
		 driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		 driver.findElement(By.name("assignleave[txtEmployee][empName]")).sendKeys("Narendra");
		 WebElement a = driver.findElement(By.name("assignleave[txtLeaveType]"));
		 Select b=new Select(a);
		 b.selectByValue("7");
		 driver.findElement(By.name("assignleave[txtComment]")).sendKeys("All Good");
		 Thread.sleep(4000);
		 driver.quit();
	}
	
	public static void main(String[] args) throws Exception 
	{
		Implicit a=new Implicit();
		a.open();
		a.login();
		a.assign();
	}

}
