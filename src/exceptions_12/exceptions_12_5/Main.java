package exceptions_12.exceptions_12_5;

/**
 * 5.	Написать метод, который сообщает о том, что он может бросить ArithmeticException.
 * Протестировать такой метод.
 */
public class Main {
    public static void main(String[] args){
        Utils utils = new Utils();
        try{
            utils.divide(5, 0);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
    }
}
