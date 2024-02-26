package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import TestBase.BaseClass;
import TestCases.App_Alphabet_List;

public class ExcelUtility extends App_Alphabet_List {
	public static void exceldata(List<String> allApp) throws IOException {
		
		try {
			if(BaseClass.browserType.equalsIgnoreCase("Chrome")) {
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\target\\Data.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet sheet = wb.createSheet("Random Apps");
				XSSFRow row = sheet.createRow(0);
				row.createCell(0).setCellValue("Chrome");
				for(int c=1;c<=allApp.size();c++) {
					XSSFRow row1 = sheet.createRow(c);
					row1.createCell(0).setCellValue(allApp.get(c-1));
				} 
				wb.write(file);
				wb.close();
				file.close();
			}
			
			
			else {
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\target\\Data.xlsx");
				XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet sheet = wb.createSheet("Random Apps");
				XSSFRow row = sheet.createRow(0);
				row.createCell(3).setCellValue("Edge");
				for(int c=1;c<=allApp.size();c++) {
					XSSFRow row1 = sheet.createRow(c);
					row1.createCell(3).setCellValue(allApp.get(c-1));
				} 
				wb.write(file);
				wb.close();
				file.close();
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

		 
		
		

