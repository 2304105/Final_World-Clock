package testcasproject;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ApachePOI {
	public static void dataToExcel(List<WebElement> a_out) {
		try {
			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\target\\Data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet("World Clock");
			for(int c=0;c<a_out.size();c++) {
				XSSFRow row = sheet.createRow(c);
				row.createCell(0).setCellValue(a_out.get(c).getText());
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

	

