import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programme.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leshchuk.t on 09.11.2017.
 */

class ControllerTest {
    Controller controller;
    @BeforeEach
    void setUp() {
        controller = new Controller(new Model(), new View());
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void intInRange() {
        assertEquals(2,1+1);
    }

}