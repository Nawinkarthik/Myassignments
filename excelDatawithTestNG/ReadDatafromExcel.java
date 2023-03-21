package excelDatawithTestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatafromExcel {
	public static String[][] readata() throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowNum = sheet.getLastRowNum();
	int cellNum = sheet.getRow(0).getLastCellNum();
	
	String[][] data=new String[rowNum][cellNum];
	
for (int i = 1; i<= rowNum; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j = 0; j < cellNum; j++) {
		XSSFCell cell = row.getCell(j);
		data[i-1][j]=cell.getStringCellValue();
	}
}
return data;

	}
	}
		


		



