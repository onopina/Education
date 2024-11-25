package multithreading_35_36.multithreading_3_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    List<String> list;
    final Path path = Paths.get("C:\\Users\\Алина\\IdeaProjects\\Education\\src\\multithreading\\multithreading_3_2\\List.txt");
    final Object monitor1 = new Object();
    final Object monitor2 = new Object();

    public Worker() {
        this.list = new ArrayList<>();
    }

    public void work(String string){
        synchronized (monitor1){
            if (string.equals("write")){
                list.add("one");
                list.add("two");
                list.add("three");
                list.add("four");
                list.add("five");
                try {
                    Files.write(path, list, StandardOpenOption.CREATE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        synchronized (monitor2){
            if (string.equals("read")){
                List<String> result;
                try {
                    result = Files.readAllLines(path);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(result);
            }
        }
    }
}
