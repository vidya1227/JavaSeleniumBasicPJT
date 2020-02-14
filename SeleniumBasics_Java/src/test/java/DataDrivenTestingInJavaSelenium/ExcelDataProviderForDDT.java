package DataDrivenTestingInJavaSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataProviderForDDT {
	
	static Workbook WB;
	static Sheet sheet;
	
	public static Object[][] ReadData(String sheetName) throws IOException
	{
		FileInputStream file=null;
		Object[][] data=null;
	try
	{
		 file=new FileInputStream("./TestData/DemoData.xlsx");
		
			WB=WorkbookFactory.create(file);
			sheet=WB.getSheet(sheetName);
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=1; i<sheet.getLastRowNum();i++)
			{
				for(int j=0; j<sheet.getRow(i).getLastCellNum();j++)
				{
					data[i][j]=sheet.getRow(i+1).getCell(j).toString();
					//System.out.println(data[i][j]);
				}
			}
		} 
	catch (InvalidFormatException e)
	   {			
			e.printStackTrace();
		} 
		
	file.close();
	return data;
	
		
	}


}
