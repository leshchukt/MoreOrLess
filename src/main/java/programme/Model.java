package programme;

/**
 * Created by leshchuk.t on 30.10.2017.
 */
public class Model {

    //number constants
    public static final int MIN_LIMIT = 0;
    public static final int MAX_LIMIT = 100;

    private int key;
    private int min;
    private int max;

    //Constructor fill array with random numbers from 1 to 15
    public Model() {
        key = (int) (Math.random() * MAX_LIMIT + 1);
        min = MIN_LIMIT;
        max = MAX_LIMIT;
    }

    //program logic

    /**
     * method for comparing inputValue and keyValue, setting new limits
     * @param inputValue
     * @return true, if inputValue equals keyValue
     */
    public boolean compare(int inputValue) {
        if (inputValue == key) {
            return true;
        } else if (inputValue < key) {
            min = inputValue;
        } else {
            max = inputValue;
        }
        return false;
    }

    public int getKey() {
        return this.key;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
