package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		// Specify the location of Excel file
		File src = new File("C:\\Users\\MFG\\Desktop\\DemoSheet.xlsx");

		// Load file
		FileInputStream fis = new FileInputStream(src);
		
		// Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load worksheet
		XSSFSheet sh = wb.getSheet("DemoSheet");

		// print loaded sheet name
		System.out.println(sh.getSheetName());

		// print user name for Excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// Print p4 from Excel Sheet
		System.out.println(sh.getRow(4).getCell(2).getStringCellValue());

		// Print total number of Rows 1st Way
		System.out.println("TotalRowa:-" + sh.getPhysicalNumberOfRows());
		
		// Print Total Number of rows 2nd way
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getFirstRowNum());
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum()) + 1;
		System.out.println("Total Number of Rows:-" + rows);

			//print total number of rows 3rd way
		System.out.println("Total rows:-"+(sh.getLastRowNum()+1));
		
		//Print Total Number of column 1st way
		System.out.println("Total columns:-"+sh.getRow(0).getPhysicalNumberOfCells());
		
		//Print number of column 2nd way
		System.out.println("Total column:-"+sh.getRow(5).getLastCellNum());
			
		
		//Print number of column 3nd way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total Column:-"+columns);
	}

}
