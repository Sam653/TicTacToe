/*
package MyTest;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File("src/test/java/TestData/TTTdata.xlsx")); // Путь к файлу
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream); // Получить экземпляр книги для файла
        XSSFSheet sheet = workbook.getSheetAt(0); // Открыть первую табу файла

        // https://habr.com/ru/post/56817/
        // http://java-online.ru/java-excel-read.xhtml
        // https://www.codeflow.site/ru/article/java-microsoft-excel

//    public static String fileToBeRead = "С:\\test.xls";
//    public static String TESTDATA_PATH = "src/test/java/TestData/TTTdata.xlsx"; { System.out.println(TESTDATA_PATH);}

//        https://o7planning.org/ru/11259/read-write-excel-file-in-java-using-apache-poi
//        https://youtu.be/rxlhK8AeD0Q

        Iterator rowIter = sheet.rowIterator();
        while (rowIter.hasNext()) {
            XSSFRow row = (XSSFRow) rowIter.next();
            System.out.println(row);
        }









//        Когда значение перечисления типа ячейки STRING , содержимое будет считано с использованием метода getRichStringCellValue () интерфейса Cell :
//
//        data.get(new Integer(i)).add(cell.getRichStringCellValue().getString());
//        Ячейки с типом содержимого NUMERIC могут содержать дату или число и считываться следующим образом:
//
//        if (DateUtil.isCellDateFormatted(cell)) {
//            data.get(i).add(cell.getDateCellValue() + "");
//        } else {
//            data.get(i).add(cell.getNumericCellValue() + "");
//        }










//        // дальше тупо скомунизженно  : ((
//
//                Iterator<Row> rowIterator = sheet.iterator(); // Получить итератор для строк в табе
//
//        while (rowIterator.hasNext()) {
//            Row row = rowIterator.next();
//            // Get iterator to all cells of current row
//            Iterator<Cell> cellIterator = row.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//                // Change to getCellType() if using POI 4.x
//                CellType cellType = cell.getCellTypeEnum();
//
//                switch (cellType) {
//                    case _NONE:
//                        System.out.print("");
//                        System.out.print("\t");
//                        break;
//                    case NUMERIC:
//                        System.out.print(cell.getNumericCellValue());
//                        System.out.print("\t");
//                        break;
//                    case STRING:
//                        System.out.print(cell.getStringCellValue());
//                        System.out.print("\t");
//                        break;
//                }
//            }
//            System.out.println("");
//        }

    }
}

*/
