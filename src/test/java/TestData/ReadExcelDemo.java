package TestData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelDemo {

        public static Object[][] getExcelArray(String sheetName) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File("src/test/java/TestData/TTTdata.xlsx")); // Path to EXCEL file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream); // Get an object of book
        XSSFSheet sheet = workbook.getSheetAt(0); // Open FIRST tab in book

        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }
}

// Useful articles/movies:
// https://habr.com/ru/post/56817/
// http://java-online.ru/java-excel-read.xhtml
// https://www.codeflow.site/ru/article/java-microsoft-excel
// https://o7planning.org/ru/11259/read-write-excel-file-in-java-using-apache-poi
// https://youtu.be/rxlhK8AeD0Q