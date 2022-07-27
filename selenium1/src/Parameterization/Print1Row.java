package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print1Row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("D:\\Apache.jyo\\demo1.xlsx");
		
		  Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		  
		   short cellsize = sh.getRow(0).getLastCellNum();     
		   
		   for(int i=0;i<cellsize;i++) {
			   
			   String data = sh.getRow(1).getCell(i).getStringCellValue();
			   
			   System.out.print(data + " ");
			   
		   }
		  
		  
		  

}
}