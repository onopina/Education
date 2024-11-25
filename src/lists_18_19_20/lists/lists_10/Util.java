package lists_18_19_20.lists.lists_10;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void switchLists(List<Number> arrayList, List<Number> linkedList){
        List<Number> tmp = new ArrayList<>();
        tmp.addAll(arrayList);
        arrayList.removeAll(arrayList);
        arrayList.addAll(linkedList);
        linkedList.removeAll(linkedList);
        linkedList.addAll(tmp);
    }
}
