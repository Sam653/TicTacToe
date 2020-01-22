package MyTest;

public class Message {

    public String statusMessage(int statusCode) {

        String statMess = null;

        switch (statusCode) {
            case 0:
                statMess = "Negative Input: less/more than 9 symbols.";
                System.out.println(statMess);
                break;

            case 1:
                statMess = "Negative Input: invalid symbols.";
                System.out.println(statMess);
                break;

            case 2:
                statMess = "Negative Input: invalid status (illegal combination).";
                System.out.println(statMess);
                break;

            case 3:
                statMess = "Positive Input: we have a winner!";
                System.out.println(statMess);
                break;

            case 4:
                statMess = "Positive Input: it's a Draw.";
                System.out.println(statMess);
                break;

            case 5:
                statMess = "Positive Input: move of player X.";
                System.out.println(statMess);
                break;

            case 6:
                statMess = "Positive Input: move of player O.";
                System.out.println(statMess);
                break;

            default:
                System.out.println("Default");
        }
        return statMess;
    }
}