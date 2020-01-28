package TestData;

import MyTest.Decision;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "getExcelArray", dataProviderClass = DataProviderInit.class)
    public void testMethod(String combo, String value) {

        System.out.println("Let's use '" + combo + "' combination with '" + value + "' data!");

        Decision decision = new Decision();
        int status = decision.status(combo);

        System.out.println("Returned status code is: " + status);

        NewMessage message = new NewMessage();
        int statusMessage = message.statusMessage(status);
    }
}