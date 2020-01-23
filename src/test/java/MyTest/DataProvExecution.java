package MyTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvExecution {

    @Test(dataProvider = "testname")
    public void testMethod(String combination, String status) {
        System.out.println(combination + " " + status);
    }







    @DataProvider(name = "testname")
    public Object[][] getData() {
        Object[][] data = {
                {"xo-", "invalid"},
                {"xo-------", "valid"},
                {"xo--------", "invalid"},
                {"data1", "status"}
        };
        return data;
    }
}
