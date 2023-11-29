package annotations_reflection.annotations.annotations_3;

/**
 * 3.	Изменить аннотацию так, чтобы можно было передать несколько значений параметров год. Протестировать
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library("Fahrenheit 451", 1);
        System.out.println(library.getBook());
    }
}
