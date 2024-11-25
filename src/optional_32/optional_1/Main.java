package optional_32.optional_1;

import java.util.Optional;

/**
 * 1.	Дано число. Обернуть его в Optional. Далее – получить число обратно, вывести на консоль.
 */
public class Main {
    public static void main(String[] args) {
        int num = 5;
        Optional<Integer> optional = Optional.of(5);

        int result = optional.get();
        System.out.println(result);
    }
}
