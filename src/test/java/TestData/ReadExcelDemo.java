package TestData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelDemo {

        public static Object[][] getExcelArray(String sheetName) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File("src/test/java/TestData/TTTdata.xlsx")); // Путь к файлу
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream); // Получить экземпляр книги для файла
        XSSFSheet sheet = workbook.getSheetAt(0); // Открыть ПЕРВУЮ табу файла

//        String [][] data = null;
//        data = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
                //System.out.println(data[i][j]); // для ПРОВЕРКИ
            }
        }
        return data;
    }
}

// https://habr.com/ru/post/56817/
// http://java-online.ru/java-excel-read.xhtml
// https://www.codeflow.site/ru/article/java-microsoft-excel

//    public static String fileToBeRead = "С:\\test.xls";
//    public static String TESTDATA_PATH = "src/test/java/TestData/TTTdata.xlsx"; { System.out.println(TESTDATA_PATH);}

//        https://o7planning.org/ru/11259/read-write-excel-file-in-java-using-apache-poi
//        https://youtu.be/rxlhK8AeD0Q