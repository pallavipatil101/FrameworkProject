package excel.utility;

import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDP{
	
	@DataProvider(name ="excel-data") 
	public Object[][] excelDP() {
		Object[][] data = getExcelData(System.getProperty("user.dir")+"/src/test/resources/Data_DemoQA.xlsx", "Textbox");
		return data;
	}

	public Object[][] getExcelData(String filePath, String sheetName) {

		Object[][] data = null;
		Workbook wb = null;
		try{
			FileInputStream fis = new FileInputStream(filePath);
	
			wb = new XSSFWorkbook(fis);		
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(0);
			int noOfRows = sh.getPhysicalNumberOfRows();
			int noOfCols = row.getLastCellNum();
			Cell cell;
			data = new Object[noOfRows - 1][noOfCols];
			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sh.getRow(i);
					cell = row.getCell(j); //1,1
					
					switch (cell.getCellType()) {
                    case STRING :
                    	data[i - 1][j] = cell.getStringCellValue(); //1,1
                        break;
                    case NUMERIC:
                    	data[i - 1][j] = (int)cell.getNumericCellValue();
                        break;
                    case BLANK:
                    	data[i - 1][j] = "";
                        break;
					default:
						data[i - 1][j] = null;
						break;
                }
														
				}
				}
					
		}
		catch(Exception e){		
			e.printStackTrace();
		}
		return data;
	}
}
