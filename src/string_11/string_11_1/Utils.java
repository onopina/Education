package string_11.string_11_1;

/**
 * 1.	Проитерироваться по строке (не использовать char[]).
 */
public class Utils {
    public void iterateString(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
