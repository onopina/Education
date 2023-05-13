package lists.lists.lists_12;

import java.util.Random;

public class MyArrayList {
    private Integer[] data;
    private int capacity;
    private int size;

    public MyArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.data = new Integer[capacity];
    }
    public void ensureCapacity(int capacity){
        this.capacity = capacity;
    }
    public void addRandom(int number){
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            data[i] = random.nextInt(10);
            size++;
        }
    }
    public void trimToSize(){
        capacity = size;
    }
    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
