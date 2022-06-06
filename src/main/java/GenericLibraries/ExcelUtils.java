package GenericLibraries;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of ExcelFileUtils
 * @author vinay
 *
 */
public class ExcelUtils {

	public String readTestData(String SheetName, int rowNo, int cellNo) throws Throwable{
		FileInputStream fis=new FileInputStream(Constants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row ro = sh.getRow(rowNo);
		Cell cel = ro.getCell(cellNo);
		String value = cel.getStringCellValue();
		return value;
		
	}
}
