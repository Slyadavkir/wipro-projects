package WiproProject2.WiproProject2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {
	
	@Test
	void testEvenNumber() {
		Even obj = new Even();
		assertTrue(obj.isEven(10));
	}
	
	void TestOddNumbers() {
		Even obj = new Even();
		assertFalse(obj.isEven(7));
	}
}