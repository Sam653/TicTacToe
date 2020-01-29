package TestData;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderInit {

    @DataProvider(name = "getExcelArray")
    public Object[][] getExcelArray() throws IOException {
        Object data[][] = ReadExcelDemo.getExcelArray("Sheet1");
        return data;
    }
}

// Useful articles/movies:
// https://howtodoinjava.com/testng/testng-dataprovider/
// https://youtu.be/O8yP672fogE

//    // OLD - 1 variables
//    @DataProvider(name = "InputtingOfString")
//    public Object[][] combinations() {
//        Object[][] data = {{"xo-"}, {"xo-------"}, {"xo--------"}};
//        return data;}

//    // OLD - 2 variables
//    @DataProvider(name = "InputtingOfString")
//    public Object[][] combinations() {
//        Object[][] data = {{"xo-", "invalid"}, {"xo-------", "valid"}};
//        return data; }