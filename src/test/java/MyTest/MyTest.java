package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    final String INVALID_STATUS_LESS_THAN_NINE = "x-o";
    final String INVALID_STATUS_MORE_THAN_NINE = "xx-------o";
    final String INVALID_SYMBOLS = "xSaturno-";
    final String INVALID_STATUS_A = "xxxOOOooo";
    final String INVALID_STATUS_B = "xxxXXXooo";
    final String INVALID_STATUS_C = "o--------";
    final String WIN_OF_X = "xxxoo----";
    final String WIN_OF_O = "oooxx-x--";
    final String A_DRAW = "xoxooxxxo";
    final String MOVE_X = "xo-------";
    final String MOVE_O = "xxo------";
    final String WIN_WIN = "xxxooooxx";

//    @BeforeTest
//    public void beforeTest() {
//        System.out.println(" ");
//        System.out.println("••• A new Test:");
//    }

    @Test
    public void status01() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_STATUS_LESS_THAN_NINE);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 0);
        Assert.assertEquals(statusMessage, "Negative Input: less/more than 9 symbols.");
    }

    @Test
    public void status02() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_STATUS_MORE_THAN_NINE);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 0);
        Assert.assertEquals(statusMessage, "Negative Input: less/more than 9 symbols.");
    }

    @Test
    public void status03() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_SYMBOLS);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 1);
        Assert.assertEquals(statusMessage, "Negative Input: invalid symbols.");
    }

    @Test
    public void status04() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_STATUS_A);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 2);
        Assert.assertEquals(statusMessage, "Negative Input: invalid status (illegal combination).");
    }

    @Test
    public void status05() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_STATUS_B);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 2);
        Assert.assertEquals(statusMessage, "Negative Input: invalid status (illegal combination).");
    }

    @Test
    public void status06() {
        Decision decision = new Decision();
        int status = decision.status(INVALID_STATUS_C);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 2);
        Assert.assertEquals(statusMessage, "Negative Input: invalid status (illegal combination).");
    }

    @Test
    public void status07() {
        Decision decision = new Decision();
        int status = decision.status(WIN_OF_X);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 3);
        Assert.assertEquals(statusMessage, "Positive Input: we have a winner!");
    }

    @Test
    public void status08() {
        Decision decision = new Decision();
        int status = decision.status(WIN_OF_O);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 3);
        Assert.assertEquals(statusMessage, "Positive Input: we have a winner!");
    }

    @Test
    public void status09() {
        Decision decision = new Decision();
        int status = decision.status(A_DRAW);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 4);
        Assert.assertEquals(statusMessage, "Positive Input: it's a Draw.");
    }

    @Test
    public void status10() {
        Decision decision = new Decision();
        int status = decision.status(MOVE_X);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 5);
        Assert.assertEquals(statusMessage, "Positive Input: move of player X.");
    }

    @Test
    public void status11() {
        Decision decision = new Decision();
        int status = decision.status(MOVE_O);
        Message message = new Message();
        String statusMessage = message.statusMessage(status);

        Assert.assertEquals(status, 6);
        Assert.assertEquals(statusMessage, "Positive Input: move of player O.");
    }

    @Test
    public void status12() {
        Decision decision = new Decision();
        int status = decision.status(WIN_WIN);
        Assert.assertEquals(status, 3);
    }
}