package WiproProject2.WiproProject2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    void testAddition() {
        Addition obj = new Addition();

        int result = obj.add(2, 3);

        assertEquals(5, result);
    }
}