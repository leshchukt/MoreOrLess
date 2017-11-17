package programme;

import java.util.Scanner;

/**
 * Created by leshchuk.t on 05.11.2017.
 */
public class Controller {

    Model model;
    View view;

    //Constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //work method
    public void process() {
        Scanner scanner = new Scanner(System.in);

        int minValue = model.getMin();
        int maxValue = model.getMax();
        int inputValue;

        view.printMessage(view.keyOut() + model.getKey());

        view.printMessage(view.messageWithLimits(minValue, maxValue));
        inputValue = intInRange(scanner, minValue, maxValue);
        while (!model.compare(inputValue)) {
            view.printMessage(view.noGuess());
            minValue = model.getMin();
            maxValue = model.getMax();
            view.printMessage(view.messageWithLimits(minValue, maxValue));
            inputValue = intInRange(scanner, minValue, maxValue);
        }
        view.printMessage(view.congratulation());
    }

    //utility methods
    private int intInRange(Scanner scanner, int min, int max) {
        int result = inputInt(scanner);
        while (result > max || result < min) {
            view.printMessage(view.wrongRange());
            result = inputInt(scanner);
        }
        return result;
    }

    private int inputInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            view.printMessage(view.wrongInput());
            scanner.next();
        }
        return scanner.nextInt();
    }

}
