package demo.PracticeProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataFromExcel {

	@Test
	public void DataDrivenFromExcel() throws IOException {
		FileInputStream fis = new FileInputStream("F:\\DataExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetsCount = workbook.getNumberOfSheets();

		for (int i = 0; i < sheetsCount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))
				;
			{
				XSSFSheet Sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = Sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k=0;
				int column=0;
				while (ce.hasNext()) {

					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Data3")) {
						column = k;
						
					}
				k++;
					
				}
				
				System.out.println("Column Index is " +column);
			}

		}

	}

}
