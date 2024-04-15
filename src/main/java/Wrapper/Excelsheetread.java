package Wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import rok.qa.Utilities.BaseClass;

public class Excelsheetread extends BaseClass {
	private static final String FILE_PATH = "C:\\Users\\yogesh.adke\\Downloads\\credsfnew1.0.xlsx";
	private static final String SHEET_NAME = "Sheet1";

	private static FileInputStream fileInputStream;
	private static Workbook workbook;
	private static Sheet sheet;

	public static void excelsheetread() {
		try {
			try {
				fileInputStream = new FileInputStream(new File(FILE_PATH));
			} catch (Exception e) {
				e.printStackTrace();
			}
			workbook = new XSSFWorkbook(fileInputStream);
			sheet = workbook.getSheet(SHEET_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int lastRowNum = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow rows = (XSSFRow) sheet.getRow(i);
			if (rows != null) {
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cells = rows.getCell(j);
					// Process the cell as needed
				}
			}
		}
	}

	public void close() {
		try {
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Sheet getSheet(String sheetName) {
		return sheet;
	}
}
