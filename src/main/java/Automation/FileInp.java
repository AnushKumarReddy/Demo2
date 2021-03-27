package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileInp {
	public static void main(String[] args) throws Exception {
		File source=new File("D:\\anexcel\\salary.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
	System.out.println(sheet1.getRow(0).getCell(2).getStringCellValue());
	String cellvalue= sheet1.getRow(3).getCell(3).getRawValue();
	System.out.println(cellvalue);
	String value = sheet1.getRow(3).getCell(1).getStringCellValue();
	System.out.println(value);
	sheet1.getRow(0).createCell(4).setCellValue("Account Type");
	sheet1.getRow(1).createCell(4).setCellValue("savings");
	FileOutputStream fos=new FileOutputStream(source);
	wb.write(fos);
	
	

		
		
	}

}
