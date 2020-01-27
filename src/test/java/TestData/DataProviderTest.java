package TestData;

import MyTest.Decision;
import MyTest.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "getExcelArray", dataProviderClass = DataProviderInit.class)
    public void testMethod(String combo) {
        System.out.println("Let's use '" + combo + "' combination!");

        Decision decision = new Decision();
        int status = decision.status(combo);

        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 0);
        Assert.assertEquals(statusMessage, "Negative Input: less/more than 9 symbols.");
    }
}