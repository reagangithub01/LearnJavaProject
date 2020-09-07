package utils;

import java.io.IOException;

public class ExcelUtilsMainConstructorClass {

	public static void main(String[] args) throws IOException {
		
		String excelPath = "./data/StaffData.xlsx";
		String sheetName = "Sheet1";
		ExcelUtilsWithContructor excel = new ExcelUtilsWithContructor(excelPath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1, 0);
		excel.getCellData(1, 1);
		excel.getCellData(1, 2);
		excel.getCellData(1, 3);
		excel.getCellData(1, 4);
	}
	
	
}
