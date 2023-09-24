package optional.optional_2;

import java.util.Optional;

/**
 * 2.	Дано значение null. Попробовать его обернуть в Optional двумя методами: of, ofNullable.
 * Проверить, какой из них работает в случае с null.
 */
public class Main {
    public static void main(String[] args) {
        String str = null;
//        Optional<String> optional1 = Optional.of(str);
//        System.out.println(optional1);

        Optional<String> optional2 = Optional.ofNullable(str);
        System.out.println(optional2);
    }
}
