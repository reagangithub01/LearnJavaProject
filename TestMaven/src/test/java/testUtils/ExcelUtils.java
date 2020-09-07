package testUtils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


	public static void main(String[] args) throws Exception {
		getRowCount();
		getCellData();
	}
	
	public static void getCellData() throws IOException {
		
		String excelPath = "./data/StaffData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		
		/* 		Col0	Col1	Col2
		 * Row0 Name	Place	Age
		 * Row1	Henry	Ford	40  
		 */

		// example #1 - Good
		//String value = sheet.getRow(1).getCell(1).getStringCellValue(); // ONLY FOR STRING VALUE
		//String value = sheet.getRow(1).getCell(2).getStringCellValue(); //exception due to Cannot get a STRING value from a NUMERIC cell
		//double value = sheet.getRow(1).getCell(2).getNumericCellValue(); //result HAS DECIMAL i.e. 40.0

		// example #2 - Better
		DataFormatter formatter = new DataFormatter(); // can get any data type values
		Object value = formatter.formatCellValue(sheet.getRow(1).getCell(3));
		
		System.out.println(value);
		
	}
	
	public static void getRowCount() {
		/*
			// example #2 NOT RECOMMENDED
			//String projDir = System.getProperty("user.dir");
			//System.out.println(projDir);
			// example #2 NOT RECOMMENDED
			//String excelPath = projDir + "./data/StaffData.xlsx";
			//XSSFWorkbook workbook = new XSSFWorkbook();
		*/
		
		// example #1 - Good Practice
		try {		
			String excelPath = "./data/StaffData.xlsx";
			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows" + rowCount);
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}	
	}

	
	
}
