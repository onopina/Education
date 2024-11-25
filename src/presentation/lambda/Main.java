package presentation.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x>5;
        Function<Integer, String> function = x -> x.toString();
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> new Integer(5);
        UnaryOperator<Integer> unaryOperator = x -> x*x;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(10);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        Comparator<Integer> comparator1 = (Integer::compare);
        Runnable r = () -> System.out.println("Runnable");

        double[] arr = {1.2, 3.2, 5.2};

        processArray(arr, x -> x*10);

        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

//        list.removeIf(x -> x % 5 == 0);

        list.forEach(x -> System.out.println("Element: " + x));

        System.out.println(list);

        func(x -> "Integer to String: " + x.toString(), 200);


    }
    public interface MyPredicate<T>{
        void apply(T t);
    }

    public static void processArray(double[] arr, MyFunction function){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = function.process(arr[i]);
        }
    }
    @FunctionalInterface
    public interface MyFunction{
        double process(double d1);
    }

    public static void func(Function<Integer, String> function, int element){
        String res = function.apply(element);
        System.out.println(res);
    }

}
