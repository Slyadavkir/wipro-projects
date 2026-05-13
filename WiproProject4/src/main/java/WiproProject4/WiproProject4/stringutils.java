package WiproProject4.WiproProject4;



public class stringutils {

    // Reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Count vowels
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Count consonants
    public static int countConsonants(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }

    // Count occurrences of a character
    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    // Convert to uppercase
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    // Length of string
    public static int length(String str) {
        return str.length();
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Replace consonants with '0'
    public static String replaceConsonants(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                result.append('0');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}