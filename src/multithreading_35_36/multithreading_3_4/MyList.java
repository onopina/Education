package multithreading_35_36.multithreading_3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyList {
    private final List<Integer> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    public synchronized void addElement(){
        Random random = new Random();
        list.add(random.nextInt(10));
        System.out.println("The element " + list.get(list.size()-1) + " is added to the list: " + getList());
        notify();
    }

    public synchronized void removeElement(){
        if (list.isEmpty()){
            try {
                System.out.println("The list is empty");
                wait(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("The element " + list.remove(list.size()-1) + " is removed from the list: " + getList());
        }
    }
}
