package multithreading_35_36.multithreading_2_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FillList {
    private final List<Integer> list1 = new ArrayList<>();
    private final List<Integer> list2 = new ArrayList<>();
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public void fill(){
        for (int i = 0; i < 10; i++) {
            synchronized (monitor1){
                list1.add(new Random().nextInt(10));
            }
            synchronized (monitor2){
                list2.add(new Random().nextInt(10));
            }
        }
    }

    public void getSizeOfLists(){
        System.out.println("The size of List1 is " + list1.size());
        System.out.println("The size of List2 is " + list2.size());
    }
}
