package string_11.string_11_9;

public class Utils {
    public void countNumberOfSymbol(String string, char symbol){
        int count = 0;
        for (char element : string.toCharArray()){
            if (element == symbol) count++;
        }
        System.out.println(count);
    }
}
