package Yt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Search extends Play{
	
	String uname = "Hitman040";
	@Test(priority=1)
	public void clickAdmin()
	{
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.cssSelector("input[id='btnAdd']")).click();
		
	}
	
	@Test(priority=2)
	public void addUser() throws Exception
	{
		Select dd=new Select(driver.findElement(By.cssSelector("#systemUser_userType")));
		dd.selectByVisibleText("Admin");
		driver.findElement(By.cssSelector("input[class='formInputText inputFormatHint ac_input']")).sendKeys("Alice Duval");
		driver.findElement(By.cssSelector("#systemUser_userName")).sendKeys(uname);
		Select dd1=new Select(driver.findElement(By.cssSelector("#systemUser_status")));
		dd1.selectByVisibleText("Disabled");
		Thread.sleep(2000);
		Select dd2=new Select(driver.findElement(By.cssSelector("#systemUser_status")));
		dd2.selectByVisibleText("Enabled");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='systemUser[password]']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='systemUser[confirmPassword]']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".addbutton")).click();
		Thread.sleep(2000);
		
		}
    @Test(priority=3)
	public void searchUser() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#searchSystemUser_userName")).sendKeys(uname);
		Thread.sleep(2000);
		Select dd=new Select(driver.findElement(By.cssSelector("#searchSystemUser_userType")));
		dd.selectByVisibleText("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='searchSystemUser_employeeName_empName']")).sendKeys("Alice Duval");
		Thread.sleep(2000);
		Select dd1=new Select(driver.findElement(By.cssSelector("#searchSystemUser_status")));
		dd1.selectByVisibleText("Enabled");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#searchBtn")).click();
		Thread.sleep(5000);
		
	}
    @Test(priority=4)
      public void editUser() throws Exception
      {
    	  driver.findElement(By.cssSelector("a[href*='saveSystemUser?userId']")).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.cssSelector("#btnSave")).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.cssSelector("#systemUser_chkChangePassword")).click();
    	  Thread.sleep(1000);
    	  driver.findElement(By.cssSelector("input[name='systemUser[password]']")).sendKeys("11111111");
    	  Thread.sleep(1000);
    	  driver.findElement(By.cssSelector("input[name='systemUser[confirmPassword]']")).sendKeys("11111111");
    	  Thread.sleep(1000);
    	  driver.findElement(By.cssSelector("#btnSave")).click();
    	  Thread.sleep(1000);
    	  driver.close();
      }
 }