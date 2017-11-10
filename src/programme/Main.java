package programme;

/**
 * Created by leshchuk.t on 30.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.process();
    }
}
