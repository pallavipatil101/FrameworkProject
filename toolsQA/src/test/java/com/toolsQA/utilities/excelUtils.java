package com.toolsQA.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	public static XSSFCell cell;
	public static XSSFWorkbook wkbk;
    public static XSSFSheet sheet;
    public static XSSFRow row;
  
	public static void main(String[] args) throws IOException {
		
	}
	
	public static XSSFCell getData(String sheetName, int rowNumber, int cellNumber) throws IOException {
			FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"/Data/Data_DemoQA.xlsx");
			wkbk = new XSSFWorkbook(fin);
			sheet = wkbk.getSheet(sheetName);
			cell =sheet.getRow(rowNumber).getCell(cellNumber);
			//return cell.getStringCellValue();
			return cell;
	}

}
