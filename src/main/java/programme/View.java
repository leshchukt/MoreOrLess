package programme;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by leshchuk.t on 30.10.2017.
 */
public class View {

    // Resource Bundle Installation
    static String BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(
                    BUNDLE_NAME,
                    new Locale("uk"));
                    //new Locale("en"));

    //text constants
    static String WRONG_INPUT = "input.wrong.int";
    static String WRONG_RANGE = "input.wrong.range";
    static String KEY_OUT = "input.secret.value";
    static String NO_GUESS = "input.wrong.answer";
    static String CONGRATULATION = "input.congratulation";

    private String concatenationStrings(String... strings) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String s: strings) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }

    void printMessage(String message) {
        System.out.println(message);
    }

    String messageWithLimits(int min, int max) {
        return concatenationStrings(bundle.getString("input.int.data"), bundle.getString("input.from"),
                String.valueOf(min), " ", bundle.getString("input.to"), String.valueOf(max), ": ");
    }

    String wrongInput() {
        return bundle.getString(WRONG_INPUT);
    }

    String wrongRange() {
        return bundle.getString(WRONG_RANGE);
    }

    String keyOut() {
        return bundle.getString(KEY_OUT);
    }

    String noGuess() {
        return bundle.getString(NO_GUESS);
    }

    String congratulation() {
        return bundle.getString(CONGRATULATION);
    }

}
