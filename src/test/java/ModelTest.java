import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programme.Model;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by leshchuk.t on 12.11.2017.
 */
public class ModelTest {
    Model model = new Model();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareTest(){
        assertFalse(model.compare(13));
    }
}
