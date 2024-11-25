package string_11.string_11_6;

public class Utils {

    public String createSequence(String string, int number) {
        return string.repeat(number);
    }

    public void deleteSymbols(char symbol, String sequence){
        int index = sequence.indexOf(symbol);
        String temp = sequence.substring(0, index+1);
        sequence = sequence.substring(index+1);
        while (sequence.contains(String.valueOf(symbol))){
            index = sequence.indexOf(symbol);
            sequence = sequence.substring(0, index) + sequence.substring(index+1);
        }
        sequence = temp + sequence;
        System.out.println(sequence);
    }
}


