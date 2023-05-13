package lists.lists.lists_2;

import java.util.List;

public class Util {

    public static <E> void removeDuplicates(List<E> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j = i;
                }
            }
        }
    }
}
