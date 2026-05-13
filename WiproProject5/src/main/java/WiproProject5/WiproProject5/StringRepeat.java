package WiproProject5.WiproProject5;
public class StringRepeat {

    public int countChar(String s, char target) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }
}