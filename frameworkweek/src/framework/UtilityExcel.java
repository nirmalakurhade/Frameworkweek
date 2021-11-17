package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;


public class UtilityExcel {
	public static String[][] getExcelData(String login, String sheet1) throws Exception{
  		String[][] arrayExcelData = null;
  		try {
			FileInputStream fs = new FileInputStream("E:\\loginExcel.xls");
			Workbook workbook = Workbook.getWorkbook(fs);
			Sheet sheet = workbook.getSheet(0);
            System.out.println(1);
			int totalColumns = sheet.getColumns();
			int totalRows = sheet.getRows();
			 System.out.println("rows >> " +totalRows);
			  System.out.println("columns >> " +totalColumns);
			
			arrayExcelData = new String[totalRows-1][totalColumns];
			
			for (int i= 1 ; i < totalRows; i++) {

				for (int j=0; j < totalColumns; j++) {
					arrayExcelData[i-1][j] = sheet.getCell(j, i).getContents();
				}
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}
}
