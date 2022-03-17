package Yt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Play {
     static WebDriver driver;
 @BeforeClass
 public void beforeClass()
	{
	  System.out.println("Before  called");
    }
      
         @BeforeTest
	       public void invokeBrowser() throws Exception
	        {
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\Narendra Powar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	         driver = new ChromeDriver();
  	         driver.manage().window().maximize();
  	         driver.get("https://opensource-demo.orangehrmlive.com/");
  	         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
            }
     
                 @Test
               	public void loginOhrm() throws Exception 
	          {
	            driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
     	        Thread.sleep(1000);
		        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		        Thread.sleep(1000);
		        driver.findElement(By.id("btnLogin")).click();
	        	Thread.sleep(1000);
		        System.out.println(driver.getCurrentUrl());
		        Thread.sleep(1000);
		
				
				  WebDriverWait abc= new WebDriverWait(driver,20);
				  abc.until(ExpectedConditions.visibilityOfElementLocated(By.
				  xpath("//td[contains(text(),'Not assigned to Subunits')]")));
				 
		
		       String a="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		       if(a.equals(driver.getCurrentUrl()))
	         	{
		        	System.out.println("You Landed on Right Website");
			
		        }
		      else
		        {
		        	System.err.println("You are Being Taken to Some Other WebPage");
        		}
	
                
         
        
             	}
	    
@AfterClass
 public void afterClass()
     {
    	 System.out.println("After Class called");
     }
}