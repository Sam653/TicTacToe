package MyTest;

import org.testng.annotations.DataProvider;

public class DataProviderInit {

    // 1 variables
    @DataProvider(name = "InputtingOfString")
    public Object[][] combinations() {
        Object[][] data = {{"xo-"}, {"xo-------"}, {"xo--------"}};
        return data;
    }

//    // 2 variables
//    @DataProvider(name = "InputtingOfString")
//    public Object[][] combinations() {
//        Object[][] data = {
//                {"xo-", "invalid"},
//                {"xo-------", "valid"},
//                {"xo--------", "invalid"}};
//        return data;
//    }

}

//        https://howtodoinjava.com/testng/testng-dataprovider/
//        https://youtu.be/O8yP672fogE