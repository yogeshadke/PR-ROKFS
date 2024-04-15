package Wrapper;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import rok.qa.Utilities.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ApachePOI{
	
	
	
    public static void excelReader(String fileName, String sheetName) throws IOException {
        File file = new File("C:\\Users\\yogesh.adke\\Downloads\\aa.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=wb.getSheet("LoginSF1");
        
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        for(int i=0;i<=rowCount;i++){
            
            int cellcount=sheet.getRow(i).getLastCellNum();
           // System.out.println("Row"+ i+" data is :");
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            	String Value = sheet.getRow(i).getCell(j).getStringCellValue();
            	
            }
            System.out.println();
        }
    }
    
    
    
    
    
}