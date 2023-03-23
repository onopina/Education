package exception_12.exception_12_6;

import java.io.IOException;

/**
 * 6.	Написать метод, который сообщает о том, что он может бросить IOException.
 * Протестировать такой метод.
 * В чем разница между задачей 5 и 6?
 * IOException - это checked exception (проверяется на этапе компиляции), его надо обработать:
 * поместить в try-catch или пробросить наверх
 * (В задаче 5: ArithmeticException - это unchecked exception - обрабатывать необязательно)
 */
public class Main {
    public static void main(String[] args)  {
        Utils utils = new Utils();
        try{
            utils.createTest();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
