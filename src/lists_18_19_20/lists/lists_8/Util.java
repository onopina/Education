package lists_18_19_20.lists.lists_8;

import java.util.List;

public class Util {
    public static <E> void removeDuplicatesInRow(List<E> list){
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                list.remove(i + 1);
                i--;
            }
        }
    }
}
