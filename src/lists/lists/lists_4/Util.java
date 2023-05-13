package lists.lists.lists_4;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <E> List<E> arrayToList(E[] arr){
        List<E> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
