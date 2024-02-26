package testminiproject;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelUtility {

	public static void dataToExcel(List<WebElement> student) {
		// TODO Auto-generated method stub
		
		try {
			String path = System.getProperty("user.dir")+ "\\testdata\\Data.xlsx";
			FileOutputStream file = new FileOutputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet();
			sheet.createRow(0).createCell(0).setCellValue("School Names");
			for(int c=1;c<student.size();c++) {
				XSSFRow row = sheet.createRow(c);
				row.createCell(0).setCellValue(student.get(c).getText());
			}
			wb.write(file);
			wb.close();
			file.close();
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


