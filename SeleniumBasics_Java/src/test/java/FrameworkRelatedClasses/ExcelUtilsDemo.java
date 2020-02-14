package FrameworkRelatedClasses;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		
		String sProjectPath = System.getProperty("user.dir");
		ExcelUtils oExcelUtils = new ExcelUtils(sProjectPath+"/ExcelFiles/ZeenyxTestData.xlsx", "ZeenyxTestData");
		
		oExcelUtils.GetRowCount();
		oExcelUtils.GetStringCellData(0, 1);
		oExcelUtils.GetNumericCellData(1, 7);
		oExcelUtils.GetColumnCount();
		System.out.println("Called successfully");
		
	}

}
