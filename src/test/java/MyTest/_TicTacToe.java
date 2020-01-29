package MyTest;

public class _TicTacToe {

    public static void main(String[] args) {
        _TicTacToe aNewGame = new _TicTacToe();
        aNewGame.gameLaunch();
    }

    // задаем стрингу
    public void gameLaunch() {
        String mystring = "xxxooooxx"; // invalid, 2 winners
        //String mystring = "xxxoo----"; // valid, Х won

        Validation aNewLaunch = new Validation();

        if (aNewLaunch.lengthValidation(mystring)) {
            if (aNewLaunch.characterValidation(mystring)) {
                if (aNewLaunch.combinationValidation(mystring)) {
                    if (aNewLaunch.winValidation(mystring)) {
                        if (aNewLaunch.drawValidation(mystring)) {
                            aNewLaunch.whoseMoveValidation(mystring);
                        }
                    }
                }
            }
        }
    }
}
