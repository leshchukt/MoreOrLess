package programme;

/**
 * Created by leshchuk.t on 30.10.2017.
 */
public class Model {

    private int key;
    private int min;
    private int max;

    //Constructor fill array with random numbers from 1 to 15
    public Model() {
        key = (int) (Math.random() * Constants.MAX_LIMIT + 1);
        min = Constants.MIN_LIMIT;
        max = Constants.MAX_LIMIT;
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
