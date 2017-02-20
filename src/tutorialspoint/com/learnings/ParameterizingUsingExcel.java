package tutorialspoint.com.learnings;

import java.io.*;
import org.apache.poi.xssf.usermodel.*;

public class ParameterizingUsingExcel {
	
	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;
	
	//constructor to connect to the Excel with sheetname and Path
	public ParameterizingUsingExcel(String Path, String SheetName) throws Exception {
		
		try {
			//open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			
			//access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		}
		catch (Exception e){
			throw(e);
		}
	}
	
	//This method is to set the rowcount of the excel.
	public int excel_get_rows() throws Exception {
		
		try{
			return ExcelWSheet.getPhysicalNumberOfRows();
		}
		catch (Exception e){
			throw(e);
		}
	}
	
	//this method is to get the data and get the  value as strings.
	public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {
		
		try{
			double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
			System.out.println("The value of CellData " + CellData);
			return CellData;
		}
		catch  (Exception e){
			return 000.00;
		}
	}

}