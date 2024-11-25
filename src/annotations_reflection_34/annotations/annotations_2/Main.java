package annotations_reflection_34.annotations.annotations_2;

/**
 * 2.	Изменить аннотацию так, чтобы можно было указывать только поле класса. Протестировать
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library("Fahrenheit 451", 1);
        System.out.println(library.getBook());
    }
}
