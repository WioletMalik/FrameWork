package com.automationPractice.Qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String pathOfFile, String sheetName) throws Exception {
		int noofRows;
		fi = new FileInputStream(pathOfFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheetName);
		noofRows = ws.getLastRowNum();
		wb.close();
		fi.close();

		return noofRows;

	}

	public static int getCellCount(String pathOfFile, String sheetName, int rowNo) throws Exception {
		int colCnt;

		fi = new FileInputStream(pathOfFile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(sheetName);
		row = ws.getRow(rowNo);
		colCnt = row.getLastCellNum();
		wb.close();
		fi.close();

		return colCnt;
	}

	@SuppressWarnings("static-access")
	public static String getCellData(String pathOfFile, String sheetName, int rowNo, int colNo) throws Exception {

		String data;

		fi = new FileInputStream(pathOfFile);

		wb = new XSSFWorkbook(fi);

		ws = wb.getSheet(sheetName);

		row = ws.getRow(rowNo);

		cell = row.getCell(colNo);

		cell.setCellType(cell.CELL_TYPE_STRING);

		data = cell.getStringCellValue();

		return data;
	}
}
