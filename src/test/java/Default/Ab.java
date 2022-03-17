package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

  public class Ab {
      WebDriver driver;
	public void opening()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Narendra Powar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	public void loginpage() throws Exception
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(2000);
		 
		WebDriverWait wait =  new WebDriverWait(driver,30); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
	}
	public  void quicklaunch() throws Exception
	{
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();	
		Thread.sleep(1000);	
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("swara");
		Thread.sleep(2000);	
		
		driver.findElement(By.name("assignleave[txtComment]")).sendKeys("hii..all");
		Thread.sleep(2000);	
		driver.quit();
	}
	
	public static void main(String[] args) throws Exception
	{
	  Ab as = new Ab();
	  as.opening();
	  as.loginpage();
	  as.quicklaunch();
	  
       
	}

}
