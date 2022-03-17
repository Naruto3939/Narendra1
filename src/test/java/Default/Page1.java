package Default;


import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Page1 extends Login
{
	
	/*@BeforeTest
	public void fetch()
	{
		String b = driver.findElement(By.id("welcome")).getText();
		System.out.println("Text-" + b);
	}*/
	
	/*@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(),'Pending Leave Requests')]")));
		
	}*/
	@Test(priority=3)
	
	public void admin() throws Exception 
		{
		

		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		
		
		/* WebElement a = driver.findElement(By.id("systemUser_userType"));
		 Select b=new Select(a);
		 b.selectByValue("");*/
		
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Sara Tencrady");
		driver.findElement(By.id("systemUser_userName")).sendKeys("Naruto2");
		
		
		/* WebElement c = driver.findElement(By.className("systemUser_userType"));
		 Select d=new Select(a);
		 b.selectByValue("7");*/
		
		driver.findElement(By.id("systemUser_password")).sendKeys("Narendra393$");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Narendra393$");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Naruto2");
		driver.findElement(By.id("searchBtn")).click();
	}
	@AfterTest
	public void admin1()
	{
		String a = driver.getCurrentUrl();
		System.out.println("URL"+ a);
	}
	}

