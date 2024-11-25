package string_11.string_11_4;

/**
 * 4.	Дан массив имен файлов. Создать новый массив, содержащий файлы с теми же названиями, но без расширений.
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.selectFilenames(new String[]{"filename.exe", "filename1.txt", "filename2.txt", "filename3.mp3"});
    }
}
