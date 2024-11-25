package map_22_23.map.map_1;

import java.util.*;

/**
 * Часть 1
 * 10 друзей загадывают какое-либо число от 1 до 10. Найти число, которого загадали больше всего раз.
 */
public class Main {
    public static void main(String[] args) {
        Map<Friend, Integer> map = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {
            map.put(new Friend(), getRandomNumber());
        }

        Map<Integer, Integer> result = new HashMap<>();   // Key - повторяющееся число, Value - кол-во повторений

        for (Integer number : map.values()){
            Integer count = result.get(number);
            result.put(number, (count == null) ? 1 : count+1);
        }

        printResult(result);
    }

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1, 11);
    }

    public static void printResult(Map<Integer, Integer> result){
        Collection<Integer> values = result.values();
        int max = Collections.max(values);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()){
            if (entry.getValue() == max)
                System.out.println("The number " + entry.getKey() + " has been asked " + entry.getValue() + " times");
        }
    }
}
