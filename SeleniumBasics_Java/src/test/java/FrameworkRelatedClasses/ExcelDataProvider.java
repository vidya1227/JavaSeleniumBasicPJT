package FrameworkRelatedClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	
	/*public static void main(String[] args) {
		String sExcelPath = "D:\VidyaWorkspace\SeleniumWorkspace\SeleniumJava\SeleniumBasics_Java\ExcelFiles\DemoDataJavaSelenium.xlsx";
		TestData(sExcelPath, "Sheet1");
		
	}
	*/

	@Test(dataProvider = "Testcase1Data")
	public void Testcase1Data(String Firstname, String Lastname) {
		System.out.println(Firstname + "  Getting Data from Excel " + Lastname);
	}

	@DataProvider(name="Testcase1Data")
	public Object[][] GetData() {
		String sExcelPath = "D:\\VidyaWorkspace\\SeleniumWorkspace\\SeleniumJava\\SeleniumBasics_Java\\ExcelFiles\\DemoDataJavaSelenium.xlsx";
		Object data[][] = TestData(sExcelPath, "Sheet1");
		return data;
	}

	public static Object[][] TestData(String sExcelPath, String sSheetName) {
		
		ExcelUtils oExcel = new ExcelUtils(sExcelPath, sSheetName);

		int iRowCount = oExcel.GetRowCount();
		int iColumnCount = oExcel.GetColumnCount();

		Object data[][] = new Object[iRowCount-1][iColumnCount];
		
		for (int i = 1; i < iRowCount; i++) {
			for (int j = 0; j < iColumnCount; j++) {
				
				
				String sCelldata = oExcel.GetStringCellData(i, j);
				data[i-1][j] = sCelldata;
				 System.out.print(sCelldata +" | ");
			}
			 System.out.println();
		}
		return data;
	}

	
}
