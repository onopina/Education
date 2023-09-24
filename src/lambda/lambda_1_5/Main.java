package lambda.lambda_1_5;

/**
 * 5.	Написать собственный Функциональный интерфейс, который обрабатывает любой тип.
 * Функция должна преобразовывать параметр в String, добавляя название класса.
 */
public class Main {
    public static void main(String[] args) {
        Integer element = 50;

        func(x -> element.getClass().getSimpleName() + " to String: " + x.toString(), element);
    }

    @FunctionalInterface
    public interface MyFunction<T, R>{
        R apply(T t);
    }

    public static void func(MyFunction<Integer, String> function, Integer element){
        String result = function.apply(element);
        System.out.println(result);
    }
}
