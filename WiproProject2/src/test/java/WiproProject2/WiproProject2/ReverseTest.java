package WiproProject2.WiproProject2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest {
	 @Test
	    public void testReverse() {
	        Reverse obj = new Reverse();

	        assertEquals("cba", obj.reverse("abc"));
	        assertEquals("olleh", obj.reverse("hello"));
	    }

	    @Test
	    public void testEmptyString() {
	        Reverse obj = new Reverse();

	        assertEquals("", obj.reverse(""));
	    }
}