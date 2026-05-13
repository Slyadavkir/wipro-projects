package WiproProject2.WiproProject2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxArrayTest {

    @Test
    void testMax() {
        MaxArray obj = new MaxArray();

        assertEquals(9, obj.findMax(new int[]{1, 5, 3, 9, 2}));
    }

    @Test
    void testSingleElement() {
    	MaxArray obj = new MaxArray();

        assertEquals(7, obj.findMax(new int[]{7}));
    }

    @Test
    void testNegativeNumbers() {
    	MaxArray obj = new MaxArray();

        assertEquals(-1, obj.findMax(new int[]{-5, -2, -1, -9}));
    }
}