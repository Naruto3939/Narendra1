package AssignmentConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Admin extends Login
{
	
	@Test(priority=4)
	
	public void admin() throws Exception 
		{
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		
		WebElement a = driver.findElement(By.name("systemUser[userType]"));
		 Select b=new Select(a);
		 b.selectByVisibleText(configfileReader("value1"));
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Sara Tencrady");
		driver.findElement(By.id("systemUser_userName")).sendKeys("Naruto3");
		
		 WebElement c = driver.findElement(By.name("systemUser[status]"));
		 Select d=new Select(c);
		 d.selectByVisibleText(configfileReader("value2"));

		driver.findElement(By.id("systemUser_password")).sendKeys("Narendra393$");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Narendra393$");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		}
	
	@Test(priority=5)
	public void search() 
	{
		//driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("Naruto3");
		//driver.findElement(By.id("searchBtn")).click();
		String a=driver.getCurrentUrl();
		System.out.println("url="+a);
	}
	
	@AfterTest
	public void after1()
	{
		String a = driver.getCurrentUrl();
		System.out.println("Url Page 2:-"+a);
		driver.close();
	}
	
		
	
	
	}

