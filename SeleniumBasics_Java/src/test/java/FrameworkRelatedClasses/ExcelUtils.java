package FrameworkRelatedClasses;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String sProjectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String sExcelPath, String sSheetName) {
		try {

			
			workbook = new XSSFWorkbook(sExcelPath);
			sheet = workbook.getSheet(sSheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getStackTrace());

		}

	}

	public static void main(String[] args) {
		//GetRowCount();
		//GetStringCellData(0, 0);
		//GetNumericCellData(1, 7);
		//GetColumnCount(0);
	}

	public static int GetRowCount() {
		int iRowCount=0;
		
		try {

			 iRowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : " + iRowCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getStackTrace());

		}
		return iRowCount;

	}
	
	public static int GetColumnCount() {
		
		int iColumnCount=0;
		try {

			 iColumnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Columns : " + iColumnCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getStackTrace());

		}
		return iColumnCount;

	}


	public static String GetStringCellData(int iRowNum, int iColNum) {
		String sCelldata = null;
		
		try {

			 sCelldata = sheet.getRow(iRowNum).getCell(iColNum).getStringCellValue();
			//System.out.println("String Cell test data are : " + sCelldata);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getStackTrace());

		}
		return sCelldata;

	}

	public static void GetNumericCellData(int iRowNum, int iColNum) {
		try {

			double dCelldata = sheet.getRow(iRowNum).getCell(iColNum).getNumericCellValue();
			//System.out.println("Numeric Cell test data are : " + dCelldata);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getCause());
			//System.out.println(e.getStackTrace());

		}

	}

}
