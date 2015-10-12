package com.live.magento.spreadsheet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	//method to set up and load the excel file
	public static void setExcelFile (String PATH, String SheetName) throws Exception {
	
	try {
		FileInputStream ExcelFile = new FileInputStream (PATH);
		ExcelWBook = new XSSFWorkbook (ExcelFile);
//		ExcelWSheet = ExcelWBook.getSheetAt(0);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
	}catch (Exception e) {
		throw (e);
	}
	}
	
	//method to get the data from excel sheet
	public static String getCellData (int RowNum, int ColNum) {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
		}catch (Exception e) {
			return "";
		}
	}
	//
	public static void setCellData (String result, int RowNum, int ColNum) throws Exception {
		try {
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if(Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(result);
			}else {
				Cell.setCellValue(result);
			}
			
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.file_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch (Exception e) {
			throw e;
		}
	}	
	
	

}
