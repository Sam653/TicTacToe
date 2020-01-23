package MyTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvExecution {

//    public static String fileToBeRead = "С:\\test.xls";
//    public static String TESTDATA_PATH = "src/test/java/TestData/TTTdata.xlsx"; { System.out.println(TESTDATA_PATH);}


    @DataProvider(name = "testname")
    public Object[][] getData() {
        Object[][] data = {
                {"xo-", "invalid"},
                {"xo-------", "valid"},
                {"xo--------", "invalid"},
                {"combo", "status"}
        };
        return data;
    }





    @Test(dataProvider = "testname")
    public void testMethod(String combo, String status) {
        System.out.println(combo + " " + status);
    }





}


//        https://o7planning.org/ru/11259/read-write-excel-file-in-java-using-apache-poi
//        https://youtu.be/O8yP672fogE
//        https://youtu.be/rxlhK8AeD0Q