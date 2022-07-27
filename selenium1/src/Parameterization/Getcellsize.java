package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getcellsize {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("D:\\Apache.jyo\\demo1.xlsx");
		
		  int data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		  
		  
		  System.out.println(data);
		   
	}

}


