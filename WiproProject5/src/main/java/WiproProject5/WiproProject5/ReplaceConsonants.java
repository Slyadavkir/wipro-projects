package WiproProject5.WiproProject5;

public class ReplaceConsonants {

    public String replace(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            char lower = Character.toLowerCase(ch);

            if (Character.isLetter(ch) &&
                lower != 'a' && lower != 'e' && lower != 'i' && lower != 'o' && lower != 'u') {
                result.append('0');
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}