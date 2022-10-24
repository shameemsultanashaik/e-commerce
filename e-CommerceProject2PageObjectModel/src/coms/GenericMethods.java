package coms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GenericMethods {

	public static String[][] getData(String fileName,String sheetName) throws IOException{
		File file = new File(fileName);
		FileInputStream ips = new FileInputStream(file);
//		System.out.println("Reading  File1");
		Workbook wb = new XSSFWorkbook(ips);
//		System.out.println("Reading  File2");

		Sheet sh = wb.getSheet(sheetName);
//		System.out.println("Reading  File3");

		int rowNumber = sh.getLastRowNum()+1;
		int colNumber = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowNumber][colNumber];
		
		for(int i = 0;i<rowNumber;i++) {
			Row row = sh.getRow(i);
			for(int j=0;j<colNumber;j++) {
				Cell cell = row.getCell(j);
				String value = new DataFormatter().formatCellValue(cell);
				data[i][j] = value;
				
			}
		}
		wb.close();
		return data;
	}


	}

