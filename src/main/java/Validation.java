import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    // ПРОВЕРКА - стринга должна быть из 9 символов
    public boolean lengthValidation(String mystring) {
        if (mystring.length() == 9) {
            return true;
        } else {
            System.out.println("You entered less/more than 9 characters, please try again!");
            return false;
        }
    }

    // ПРОВЕРКА - можно юзать только "х", "о" (в любом регистре) или "-"
    public boolean characterValidation(String mystring) {
        Matcher matcher = Pattern.compile("([^XxOo-])").matcher(mystring);
        int counter = 0;

        while (matcher.find() && counter < 10) {
            counter++;
        }

        if (counter == 0) {
            return true;
        } else {
            System.out.println("You entered an invalid data! Please, use 'X', 'O' or '-' only!");
            return false;
        }
    }

    // ПРОВЕРКА - валидные данные, но некоректный статус
    public boolean combinationValidation(String mystring) {
        Matcher matcherX = Pattern.compile("([Xx])").matcher(mystring);
        Matcher matcherO = Pattern.compile("([Oo])").matcher(mystring);
        int countX = 0;
        int countO = 0;

        while (matcherX.find() && countX < 10) {
            countX++;
        }

        while (matcherO.find() && countO < 10) {
            countO++;
        }

        if (countX > countO + 1) {
            System.out.println("Incorrect combination. 'Player X' has more characters than allowed!");
            return false;
        } else if (countO > countX) {
            System.out.println("Incorrect combination. 'Player O' has more characters than 'Player X'!");
            return false;
        } else {
            return true;
        }
    }

    // ПРОВЕРКА - возможная победа Х или О (ну да, код цейлонский, зато не скомунидзенно)
    public boolean winValidation(String mystring) {

        int counter = 0;
        char winner;

        if (mystring.charAt(0) == mystring.charAt(1) & mystring.charAt(1) == mystring.charAt(2) && mystring.charAt(1) == 'x' | mystring.charAt(1) == 'o') {
            counter++;
            winner = mystring.charAt(1);
            if (mystring.charAt(3) == mystring.charAt(4) & mystring.charAt(4) == mystring.charAt(5) && mystring.charAt(5) == 'x' | mystring.charAt(5) == 'o') {
                counter++;
                winner = mystring.charAt(5);
                if (mystring.charAt(6) == mystring.charAt(7) & mystring.charAt(7) == mystring.charAt(8) && mystring.charAt(7) == 'x' | mystring.charAt(7) == 'o') {
                    counter++;
                    winner = mystring.charAt(7);
                    if (mystring.charAt(0) == mystring.charAt(3) & mystring.charAt(3) == mystring.charAt(6) && mystring.charAt(0) == 'x' | mystring.charAt(0) == 'o') {
                        counter++;
                        winner = mystring.charAt(0);
                        if (mystring.charAt(1) == mystring.charAt(4) & mystring.charAt(4) == mystring.charAt(7) && mystring.charAt(4) == 'x' | mystring.charAt(4) == 'o') {
                            counter++;
                            winner = mystring.charAt(4);
                            if (mystring.charAt(2) == mystring.charAt(5) & mystring.charAt(5) == mystring.charAt(8) && mystring.charAt(2) == 'x' | mystring.charAt(2) == 'o') {
                                counter++;
                                winner = mystring.charAt(2);
                                if (mystring.charAt(0) == mystring.charAt(4) & mystring.charAt(4) == mystring.charAt(8) && mystring.charAt(8) == 'x' | mystring.charAt(8) == 'o') {
                                    counter++;
                                    winner = mystring.charAt(8);
                                    if (mystring.charAt(2) == mystring.charAt(4) & mystring.charAt(4) == mystring.charAt(6) && mystring.charAt(6) == 'x' | mystring.charAt(6) == 'o') {
                                        counter++;
                                        winner = mystring.charAt(6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (counter > 1) {
                System.out.println("Incorrect combination! You have more than one winning combination!");
                return false;
            }
        } else {
            return true;
        }
        System.out.println("The player '" + winner + "' won");
        return false;
    }
    // ПРОВЕРКА - возможная ничья (все ячейки заняты, но нет победителя)
    public boolean drawValidation(String mystring) {
        Matcher matcher = Pattern.compile("([-])").matcher(mystring);
        int counter = 0;

        while (matcher.find() && counter < 10) {
            counter++;
        }

        if (counter > 0) {
            return true;
        } else {
            System.out.println("Holy Egypt. It looks like a Draw!");
            return false;
        }
    }

    // ПРОВЕРКА - чей ход если нет победителя и остались свободные ходы
    public boolean whoseMoveValidation(String mystring) {
        Matcher matcherX = Pattern.compile("([Xx])").matcher(mystring);
        Matcher matcherO = Pattern.compile("([Oo])").matcher(mystring);
        int countX = 0;
        int countO = 0;

        while (matcherX.find() && countX < 10) {
            countX++;
        }

        while (matcherO.find() && countO < 10) {
            countO++;
        }

        if (countX > countO) {
            System.out.println("The game is continuing, move of player O!");
            return true;
        } else {
            System.out.println("The game is continuing, move of player X!");
            return false;
        }
    }
}