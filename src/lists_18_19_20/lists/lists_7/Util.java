package lists_18_19_20.lists.lists_7;

import java.util.List;

public class Util {
    public static <E> void moveArrayToCenterOfList(List<E> list, E[] arr) {
        int center = list.size()/2;
        for (int i = 0; i < arr.length; i++) {
            list.add(center+i, arr[i]);
        }
    }
}
