package generics.generics_1_2345;

import java.util.List;

public class Util<E> {

    public static <E> void printList(List<E> list){
            System.out.println(list);
    }

    public static <E> void fill(List<E> list, E value){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    public static <E> void addElement(List<E> list, E value){
        list.add(value);
    }

    public static <E> E getElement(List<E> list, int index){
        return list.get(index);
    }
}
