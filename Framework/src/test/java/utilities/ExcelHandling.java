package utilities;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File exFile= new File(System.getProperty("user.dir")+("\\src\\main\\resources\\testData\\excelpracticedata.xls"));
			Workbook wb= Workbook.getWorkbook(exFile);
			Sheet sh= wb.getSheet("Sheet1");
			int rows= sh.getRows();
			int cols=sh.getColumns();
			for(int r=0;r<rows;r++) {
				for(int c=0;c<cols;c++) {
					String dataValue=sh.getCell(c, r).getContents();
					System.out.print(dataValue +"\t");
				}
				System.out.print("\n");
			}
			
		}
catch(Exception e) {
	e.printStackTrace();
}
	}
}
