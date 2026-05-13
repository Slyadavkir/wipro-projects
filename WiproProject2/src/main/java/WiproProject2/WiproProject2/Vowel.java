package WiproProject2.WiproProject2;
public class Vowel {

    public boolean isVowel(char a) {
        a = Character.toLowerCase(a); 

        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }
}