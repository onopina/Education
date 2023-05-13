package lists.lists.lists_5;

import java.util.List;

public class Util {
    public static <E> void removeEveryThirdElement(List<E> list){
        int index = 2;
        while (index < list.size()){
            list.remove(index);
            index+=2;
        }
    }
}
