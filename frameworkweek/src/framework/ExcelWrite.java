package framework;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelWrite {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File file = new File("E:\\imlogin.xls");
		System.out.println(1);
        WritableWorkbook wb = Workbook.createWorkbook(file);
        System.out.println(2);
        WritableSheet ws = wb.createSheet("Excelwork", 2);
        System.out.println(3);
        Label label=new Label(0, 0,"HELLO");
        ws.addCell(label);
        for(int i=1;i<6;i++) {
        	for(int j=1;j<6;j++) {
        		if(i==j) {
        			  Label label1=new Label(i, j,"PASS");
        			  ws.addCell(label1);
        		}
        	}
        }	
       wb.write();
       wb.close();        
        
        
        }
	}

