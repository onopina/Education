package lists.lists.lists_6;

import java.util.List;

public class Util {
    public static <E> void removeFirstAndLast(List<E> list) {
        list.remove(0);
        list.remove(list.size() - 1);
    }
}
