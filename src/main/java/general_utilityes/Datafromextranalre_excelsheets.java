package general_utilityes;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datafromextranalre_excelsheets {
	
	public String getdatafromexcel(String aheetname,int rownum,int colnum) throws Throwable {
		FileInputStream fis=new FileInputStream("src\\test\\resources\\flipdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		String data = df.formatCellValue(book.getSheet(aheetname).getRow(rownum).getCell(colnum));
		return data;
	}

}
