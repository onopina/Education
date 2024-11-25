package annotations_reflection_34.annotations.annotations_1;

/**
 * 1.	Написать собственную аннотацию со следующими полями: автор, год, описание.
 * Данная аннотация должна быть применима только к полям и методам.
 * Видна во время выполнения программы.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library("Fahrenheit 451", 1);
        System.out.println(library.getBook());
    }
}


