package testUtils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsConstructor {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtilsConstructor (String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}

	/* NO NEED FOR CONSTRUCTOR and codes will be RUN from DIFFERENT CLASS
	public static void main(String[] args) throws Exception {
		getRowCount();
		getCellData();
	}
	*/
	
	public static void getCellData(int rowNum, int colNum) throws IOException {
		
		/* No need as this will be MOVED to CONSTRUCTOR class
		String excelPath = "./data/StaffData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		*/
		
		// Excel Table
		/* 		Col0	Col1	Col2
		 * Row0 Name	Place	Age
		 * Row1	Henry	Ford	40  
		 */

		// example #2 - Better
		DataFormatter formatter = new DataFormatter(); // can get any data type values
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		
		System.out.println(value);
		
	}
	
	public static void getRowCount() {
		
		// example #1 - Good Practice
		/* 
		try {		
			// No need as this will be MOVED to CONSTRUCTOR class
			String excelPath = "./data/StaffData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
		*/	
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows" + rowCount);
			
		/*
		 }catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		*/	
	}
	
	

}
