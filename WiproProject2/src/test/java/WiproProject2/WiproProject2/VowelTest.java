package WiproProject2.WiproProject2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VowelTest {

    @Test
    void testVowels() {
        Vowel obj = new Vowel();

        assertTrue(obj.isVowel('a'));
        assertTrue(obj.isVowel('E'));
        assertTrue(obj.isVowel('i'));
    }

    @Test
    void testNonVowels() {
        Vowel obj = new Vowel();

        assertFalse(obj.isVowel('b'));
        assertFalse(obj.isVowel('z'));
    }
}