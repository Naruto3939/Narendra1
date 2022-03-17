package A;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class A4 extends A3
{
	@Test
	public void addcart() throws IOException {
		screenshotmethod();
		driver.findElement(By.xpath(c)).click();
		screenshotmethod();

}
	
	public void screenshotmethod() throws IOException {
		String filewithpath = "C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Screenshot\\";
		Date d = new Date();
		String FileName = d.toString().replace(":", "").replace(" ", "")+".png";
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File(filewithpath + FileName));
		//driver.quit();
	
}
}

