package demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelData_Pick_any_value {



	public static void main(String[] args) throws IOException {

		//to print user id and password of Mayur Chavan		

		//1. create object of workbook

		FileInputStream fis=new FileInputStream("C:\\Users\\yogesh.adke\\Downloads\\aa.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook(fis);		

		//2. create object of sheet and allocate respective sheet

		int numsheet=workbook.getNumberOfSheets();
		XSSFSheet sheet = null;

		for(int i=0;i<numsheet;i++)

		{
			if(workbook.getSheetName(i).equalsIgnoreCase("LoginSF1"))

			{sheet=workbook.getSheetAt(i);

			}

		}

	
		//3. Fetch data from sheet using two iterators

		Iterator<Row> itrow=sheet.iterator();
		while(itrow.hasNext())

		{			Row row=itrow.next();

					Iterator itcell=row.cellIterator();
					Cell c=(Cell) itcell.next();
//
//			if(c.getStringCellValue().equals("Mayur Chavan"))
//
//			{				while(itcell.hasNext())
//
//				{				c=(Cell) itcell.next();

					if(c.getCellType()==CellType.STRING)

					{	System.out.println(c.getStringCellValue());

					}

//					else if(c.getCellType()==CellType.NUMERIC)
//
//					{
//						System.out.println((int)c.getNumericCellValue());
//
//					}

				}

			}

		



	}




