package string_11.string_11_6;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        String sequence = utils.createSequence("123", 5);
        utils.deleteSymbols('3', sequence);

        Utils1 utils1 = new Utils1();
        utils1.createSequenceAndDeleteSymbols("123",5, '3');



    }
}
