package string_11.string_11_4;

/**
 * 4.	Дан массив имен файлов. Создать новый массив, содержащий файлы с теми же названиями, но без расширений.
 */
public class Utils {
    public void selectFilenames(String[] files){
        String[]filenames = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            filenames[i] = files[i].substring(0, files[i].indexOf('.'));
            System.out.println(filenames[i]);
        }
    }
}
