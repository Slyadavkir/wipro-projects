
public class ReverseString {

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
}