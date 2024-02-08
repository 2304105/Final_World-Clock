package testminiproject;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class ExcelUtility {

	public static void dataToExcel(List<WebElement> a_out) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+ "\\testdata\\Data.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.createSheet("School Names");
			for(int c=0;c<scList.size();c++) {
				XSSFRow row = sheet.createRow(c);
				row.createCell(0).setCellValue(scList.get(c).getText());
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


