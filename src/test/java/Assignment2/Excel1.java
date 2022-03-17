package Assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel1 {
	@Test
	public ArrayList<String> ConfigExcelFile() throws Exception 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\Narendra Powar\\eclipse-workspace\\Narendra1\\Excel1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb1=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb1.getSheetAt(0);
		
		ArrayList<String> exceldata=new ArrayList<String>();

		for(int i=0;i<=(sheet.getLastRowNum());i++){
            
            for(int j=0;j<sheet.getRow(i).getLastCellNum();j++){
                exceldata.add(sheet.getRow(i).getCell(j).getStringCellValue());
          
            }
		}
		return exceldata;
	}

}