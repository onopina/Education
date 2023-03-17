package string_11.string_11_2;

/**
 * 2.	Дана строка вида: «filename.exe». Имя файла может быть любой длины, расширение – тоже.
 * Разбить на две строки – имя, расширение.
 */
public class Utils {
    public void splitFilename(String filename){
        int index = filename.indexOf('.');
        String name = filename.substring(0, index);
        String extension = filename.substring(index+1);
        System.out.println(name);
        System.out.println(extension);
    }
}
