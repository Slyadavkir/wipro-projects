package WiproProject2.WiproProject2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void testPrimeTrue() {
        Prime obj = new Prime();
        assertTrue(obj.isPrime(7));
    }

    @Test
    public void testPrimeFalse() {
        Prime obj = new Prime();
        assertFalse(obj.isPrime(8));
    }
}