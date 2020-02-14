package FrameworkRelatedClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataFromExcel {
	
	@Test
	public  void ExcelTest() throws IOException {
		
		FileInputStream file = new FileInputStream("./TestData/DemoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // Providing sheet name
		
		//XSSFSheet sheet = workbook.getSheetAt(0); // providinh shhet number
		
		int iRowCount = sheet.getLastRowNum();
		System.out.println(iRowCount);
		int iColumnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(iColumnCount);
		
		for(int i=1 ;i<=iRowCount ;i++)
		{
			XSSFRow currentRow=sheet.getRow(i); // focussed on Current row
		
			for(int j=0; j<iColumnCount ;j++)
			{
				String sCellValues=currentRow.getCell(j).toString(); //Read the value from a table
				
				System.out.print("  |  " +sCellValues);
			}
			
			System.out.println();
		}
	}

}
