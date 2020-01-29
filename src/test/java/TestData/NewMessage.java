package TestData;

public class NewMessage {

    public int statusMessage(int status) {

        if (status == 0) {
            System.out.println("Negative Input: less/more than 9 symbols.");
        }
        if (status == 1) {
            System.out.println("Negative Input: invalid symbols.");
        }
        if (status == 2) {
            System.out.println("Negative Input: invalid status (illegal combination).");
        }
        if (status == 3) {
            System.out.println("Positive Input: we have a winner!");
        }
        if (status == 4) {
            System.out.println("Positive Input: it's a Draw.");
        }
        if (status == 5) {
            System.out.println("Positive Input: move of player X.");
        }
        if (status == 6) {
            System.out.println("Positive Input: move of player O.");
        }
        return status;
    }
}