package excelIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentExcel {
public static void main(String[] args) throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowNum = sheet.getLastRowNum();
	System.out.println(rowNum);
	int cellNum = sheet.getRow(0).getLastCellNum();
	System.out.println(cellNum);
	
for (int i = 0; i<= rowNum; i++) {
	XSSFRow row = sheet.getRow(i);
	for (int j = 0; j < args.length; j++) {
		XSSFCell cell = row.getCell(j);
		String data = cell.getStringCellValue();
		System.out.println(data);
	}
}
}
}
