package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	public static void main(String[] args) throws Exception
	{
		OHRMFunctions obj=new OHRMFunctions();
		File  src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		//workbook 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//worksheet
		XSSFSheet ws=wb.getSheet("Sheet1");
		//row count
		int rcnt=ws.getLastRowNum();
		obj.appLaunch("http://opensource.demo.orangehrmlive.com");
		obj.appLogin("Admin","admin");
	for (int i = 1; i <=rcnt; i++)
	{
		String fName=ws.getRow(i).getCell(0).getStringCellValue();
		String lName=ws.getRow(i).getCell(1).getStringCellValue();
		String results=obj.empAdd(fName, lName);
		
		ws.getRow(i).createCell(2).setCellValue(results);
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
				
	}
	
wb.close();
	}

}
