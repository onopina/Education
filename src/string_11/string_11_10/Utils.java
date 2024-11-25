package string_11.string_11_10;

public class Utils {
    public void deleteNumberOfSymbols(String string, char symbol, int number){
        int count = 0;
        while (count < number) {
            int index = string.indexOf(symbol);
            string = string.substring(0, index) + string.substring(index+1);
            count++;
        }
        System.out.println(string);
    }
}
