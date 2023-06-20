package iterator.iterator_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1.	Протерироваться по списку с помощью Iterator.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();

        list.add("Tokio");
        list.add("Paris");
        list.add("Madrid");
        list.add("Washington");
        list.add("Ottawa");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String st = iterator.next();
            System.out.println(st);
        }
    }
}
