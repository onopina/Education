package exception_12.exception_12_6;

import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    public void createTest() throws IOException{
        FileWriter writer = new FileWriter("C://Users/Алина/Desktop/test.txt");
        String word = "Java";
        writer.write(word);
        writer.close();
    }
}
