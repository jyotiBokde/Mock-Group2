package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter11 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("D:\\Apache.jyo\\demo1.xlsx");
		
		//String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2).getNumericCellValue();
		System.out.println(data);
		
	}

}
