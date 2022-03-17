package AssignmentConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	@Test
	public void read() throws IOException
	{
		//Path of the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Excel.xlsx");
		//Creating a workbook
		
		XSSFWorkbook wb  = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Auto");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(0);
		System.out.println(sheet.getRow(1).getCell(0));
		/*Row row2 = sheet.getRow(0);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));*/
		
		}
		}


