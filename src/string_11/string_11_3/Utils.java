package string_11.string_11_3;

/**
 * 3.	Дан массив имен файлов. Создать новый массив, содержащий файлы с расширением txt
 * (файлы с другими расширения не нужны).
 */
public class Utils {
    public void selectTxtFiles(String[] files){
        int size = 0;
        for (String file : files) {
            if (file.endsWith(".txt")) size++;
        }
        String[] txtFiles = new String[size];
        for (int i = 0, j=0; i < files.length; i++) {
            if (files[i].endsWith(".txt")){
                txtFiles[j] = files[i];
                System.out.println(txtFiles[j]);
                j++;
            }
        }
    }
}
