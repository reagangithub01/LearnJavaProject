package testUtils;

import java.io.IOException;

public class ExcelUtilsConstructorMainClass {
	
	public static void main(String[] args) throws IOException {
		
		String excelPath = "./data/StaffData.xlsx";
		String sheetName = "Sheet1";
		ExcelUtilsConstructor excel2 = new ExcelUtilsConstructor(excelPath, sheetName);
		
		excel2.getRowCount();
		excel2.getCellData(1,0);
		/*
		 * excel.getCellData(1, 1); excel.getCellData(1, 2); excel.getCellData(1, 3);
		 * excel.getCellData(1, 4);
		 */
	}
	
	

}
