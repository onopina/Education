package string_11.string_11_3;

/**
 * 3.	Дан массив имен файлов.
 * Создать новый массив, содержащий файлы с расширением txt (файлы с другими расширения не нужны).
 */
public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.selectTxtFiles(new String[]{"filename.exe", "filename1.txt", "filename2.txt", "filename3.mp3"});
    }
}
