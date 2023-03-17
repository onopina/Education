package string_11.string_11_6;

public class Utils1 {

    public void createSequenceAndDeleteSymbols(String string, int number, char symbol){
        StringBuilder sequence = new StringBuilder();
        sequence.append(string);
        int index = string.indexOf(symbol);
        for (int i = 0; i < number-1; i++) {
            sequence.append(string.substring(0,index)).append(string.substring(index+1));
        }
        System.out.println(sequence);
    }
}
