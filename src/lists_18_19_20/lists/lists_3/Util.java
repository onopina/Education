package lists_18_19_20.lists.lists_3;

import java.util.List;

public class Util{
    public static <E> E[] listToArray(List<E> list){
        E[] arr = (E[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
