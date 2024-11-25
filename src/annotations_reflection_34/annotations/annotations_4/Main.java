package annotations_reflection_34.annotations.annotations_4;

/**
 * 4.	Написать собственную аннотацию со следующими полями: год, месяц, число.
 * Данная аннотация должна быть применима только к полям, методам и классам.
 * Видна во время выполнения программы.
 * Сделать так, чтобы можно было делать следующим образом: @Anno(year = 2022), @Anno(2022).
 * При этом в аннотации должны присутствовать остальные поля (месяц и число).
 */
public class Main {
    public static void main(String[] args) {
        Event event = new Event("Birthday");
        System.out.println(event.getType());
    }
}
