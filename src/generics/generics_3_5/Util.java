package generics.generics_3_5;

import java.util.List;

public class Util {
    public static <E> void addElements(List<E> list, E... elements){
        for(E element : elements){
            list.add(element);
        }
    }
}
