package org.leaftaps.util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] readExcel(String excelName)  throws IOException {
		
		// Enter into the WorkBook 
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelName+".xlsx");
			
		// enter into sheet 
		
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		
	  // need to get the row count 
		
		int lastRowNum = sheet.getLastRowNum();
		
		System.out.println("Row Count :" +lastRowNum );
		
		// get the cloumn count
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Col Count :" +lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		
		for (int i = 1; i <= lastRowNum; i++) {
					
			// get the row 
			
			XSSFRow Firstrow = sheet.getRow(i);
			
			
			for (int j = 0; j < lastCellNum;  j++) {
				
				// get coloumn 
				
				XSSFCell cell = Firstrow.getCell(j);
				
				
				//Action :Read
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
				
				data[i-1][j] =  stringCellValue;
				
				
			}
			
			
		}
		
		return data;

	}

}
