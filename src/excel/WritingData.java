package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws Exception 
	{
		File  src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		//workbook 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//worksheet
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		ws.getRow(1).createCell(2).setCellValue("vasu");
		ws.getRow(2).createCell(2).setCellValue("Selenium");
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		
		wb.close();

	}

}
