package programme;

/**
 * Created by leshchuk.t on 30.10.2017.
 */
public class View {

    //text constants
    static String WRONG_INPUT = "Error! You have entered not an INT. Repeat, please.";
    static String WRONG_RANGE = "Error! You have gone beyond acceptable limits. Repeat, please.";
    static String KEY_OUT = "Here is key to check the answer: ";
    static String NO_GUESS = "You didn\'t guess:( Try one more time!";
    static String CONGRATULATION = "Congratulations! You have guessed a secret value!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    void printMessageWithLimits(int min, int max) {
        System.out.println("Guess the INT number from " + min + " to " + max + ": ");
    }

}
