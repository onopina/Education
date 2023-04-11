package generics.generics_3_1;

import java.util.List;

public class Sort<T extends Comparable<T>> {

    public void bubbleSort(List<T> list) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i + 1).compareTo(list.get(i)) < 0) {
                    T temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);
                    isSorted = false;
                }
            }
        }
    }
}
