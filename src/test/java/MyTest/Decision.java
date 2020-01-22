package MyTest;

public class Decision {

    public int status(String input) {
        int status = 0;

        Validation validation = new Validation();

        if (validation.lengthValidation(input)) {
            if (validation.characterValidation(input)) {
                if (validation.combinationValidation(input)) {
                    if (validation.winValidation(input)) {
                        if (validation.drawValidation(input)) {
                            if (validation.whoseMoveValidation(input)) {
                                status = 6;
                            } else {
                                status = 5;
                            }
                        } else {
                            status = 4;
                        }
                    } else {
                        status = 3;
                    }
                } else {
                    status = 2;
                }
            } else {
                status = 1;
            }
        } else {
            System.out.print("");
        }
        return status;
    }
}
