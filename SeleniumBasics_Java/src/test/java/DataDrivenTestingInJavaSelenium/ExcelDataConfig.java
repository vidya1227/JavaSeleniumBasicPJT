package DataDrivenTestingInJavaSelenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String sExcelPath)
	{
		try
		{
			File src = new File(sExcelPath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb =new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public String getData(int iSheetNumber, int iRow, int iColumn)
	{
		sheet1 = wb.getSheetAt(iSheetNumber);
		
		String sData = sheet1.getRow(iRow).getCell(iColumn).getStringCellValue();
		
		return sData;
	}
	
	public int getRowCount(int iSheetIndex)
	{
		int iRows = wb.getSheetAt(iSheetIndex).getLastRowNum();
		
		iRows = iRows +1;
					
		return iRows;
	}
	
	
}
