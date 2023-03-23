package exception_12.exception_12_8;

import java.io.FileReader;
import java.io.IOException;

/**
 * 8.	*Создать FileReader. Обработать проверяемое исключение в соответствии с примером из презентации.
 * Убедиться, что программа продолжает свое выполнение после исключения.
 */
public class Main {
    public static void main(String[] args){
        FileReader reader = null;
        try {
            reader = new FileReader("C://Users/Алина/Desktop/test.txt");
            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (reader != null)
                    reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println();
            System.out.println("The program continues working");
        }
    }
}
