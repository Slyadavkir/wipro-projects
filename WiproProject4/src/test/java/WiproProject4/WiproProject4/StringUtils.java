package WiproProject4.WiproProject4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {

    @Test
    public void testReverse() {
        assertEquals("olleh", stringutils.reverse("hello"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, stringutils.countVowels("hello"));
        assertEquals(5, stringutils.countVowels("aeiou"));
        assertEquals(0, stringutils.countVowels("xyz"));
    }

    @Test
    public void testCountConsonants() {
        assertEquals(3, stringutils.countConsonants("hello"));
        assertEquals(0, stringutils.countConsonants("aeiou"));
    }

    @Test
    public void testCountCharacter() {
        assertEquals(3, stringutils.countCharacter("banana", 'a'));
        assertEquals(1, stringutils.countCharacter("hello", 'h'));
        assertEquals(0, stringutils.countCharacter("hello", 'z'));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringutils.toUpperCase("hello"));
    }

    @Test
    public void testLength() {
        assertEquals(5, stringutils.length("hello"));
        assertEquals(0, stringutils.length(""));
    }

    @Test
    public void testPalindrome() {
        assertTrue(stringutils.isPalindrome("madam"));
        assertTrue(stringutils.isPalindrome("Madam")); // case insensitive
        assertFalse(stringutils.isPalindrome("hello"));
    }

    @Test
    public void testReplaceConsonants() {
        assertEquals("0e00o", stringutils.replaceConsonants("hello"));
        assertEquals("aeiou", stringutils.replaceConsonants("aeiou"));
        assertEquals("0000", stringutils.replaceConsonants("bcdf"));
    }
}