package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print2row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("D:\\Apache.jyo\\demo1.xlsx");
		
		 Cell cellinfo = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(3);
		  
		 CellType CT = cellinfo.getCellType();
		 
		 if(CT==CellType.STRING) {
			 
			 System.out.println(cellinfo.getStringCellValue());
			 }
		 
		 else if (CT==CellType.BOOLEAN) {
			 
			 System.out.println(cellinfo.getBooleanCellValue());
			 
		 }
		 
		 else if (CT == CellType.NUMERIC) {
			 
			 System.out.println(cellinfo.getNumericCellValue());
		 }
		 }
		  
		  

}
