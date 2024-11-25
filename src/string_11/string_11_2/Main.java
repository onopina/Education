package string_11.string_11_2;

/**
 * 2.	Дана строка вида: «filename.exe». Имя файла может быть любой длины, расширение – тоже.
 * Разбить на две строки – имя, расширение.
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.splitFilename("filename.exe");
    }
}
