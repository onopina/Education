package lambda_31.lambda_2_4;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * 4.	Написать код, в котором можно заменить лямбду на ссылку на метод (4 разных случая).
 * Воспроизвести примеры, отличные от примеров в презентации (с другими методами).
 */
public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> op1 = Math::cos;
        System.out.println(op1.apply(15.0));            //case 1

        String str = "Hello Java";
        Predicate<String> predicate = str::contains;
        System.out.println(predicate.test("Java"));     //case 2

        UnaryOperator<String> op2 = String::toLowerCase;
        System.out.println(op2.apply(str));                //case 3

        BiFunction<String, Integer, Student> function = Student::new;
        System.out.println(function.apply("Maria", 100));  //case 4
    }
}
