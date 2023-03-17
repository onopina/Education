package string_11.string_11_11;

/**
 * 11.	Реализовать самостоятельно метод, разворачивающий строку (обратный порядок символов: hello -> olleh).
 */
public class Utils {
    public void reverseString(String string){
        char[] chars = string.toCharArray();
        char[] reverse = new char[chars.length];
        StringBuilder result = new StringBuilder();
        for (int i = chars.length-1; i >= 0 ; i--) {
            for (int j = 0; j < reverse.length; j++) {
                reverse[j] = chars[i];
                i--;
                result.append(reverse[j]);
            }
        }
        System.out.println(result);
    }
}
