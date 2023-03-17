package string_11.string_11_9;

/**
 * 9.	Подсчитать количество вхождений символа в строку (например, «1»).
 */
public class Utils {
    public void countNumberOfSymbol(String string, char symbol){
        int count = 0;
        for (char element : string.toCharArray()){
            if (element == symbol) count++;
        }
        System.out.println(count);
    }
}
