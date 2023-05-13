package lists.arrayList.arrayList_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//   public class MyArrayList<E extends Comparable> {
public class MyArrayList<E> {

    private int capacity = 10;
    private E[] data;
    private int size;

    public MyArrayList(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity must be more than zero");
        } else {
            this.data = (E[]) new Object[capacity];
        }
    }

    public MyArrayList(){
        this.data = (E[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public E[] getData() {
        return data;
    }

    public int getCapacity() {
        return capacity;
    }

    private void grow(){
        this.capacity = (int) (capacity * 1.5 + 1);
        E[] newArr = (E[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public void addLast(E element){
        if (size == capacity)
            grow();
        data[size++] = element;
    }                                  //BigO = O(1)

    public void addByIndex(int index, E element){
        if (index > size || index < 0)
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        if (size == capacity)
            grow();
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }                                  //BigO = O(n)
    public void addFirst(E element){
        if (size == capacity)
            grow();
        size++;
        for (int i = size; i > 0; i--) {
            data[i] = data[i-1];
        }
        data[0] = element;
    }                                  //BigO = O(n)

    public void removeLast(){
        data[size-1] = null;
        size--;
    }                                  //BigO = O(1)

    public void removeByIndex(int index){
        if (index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        }
        for (int i = index; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
    }                                  //BigO = O(n)

    public void removeFirst(){
        for (int i = 0; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;
    }                                  //BigO = O(n)

    public E get(int index) {
        if (index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        }
        return data[index];
    }                                  //BigO = O(1)

    public void set(int index, E element) {
        if (index >= size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        }
        this.data[index] = element;
    }                                  //BigO = O(1)

    public boolean contains(E element){
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element))
                return true;
        }
        return false;
    }                                  //BigO = O(n)

    public void trimToSize(){
        capacity = size;
        E[] newArr = (E[]) new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }                                  //BigO = O(n)

    public void ensureCapacity(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity must be more than zero");
        }
        this.capacity = capacity;
    }                                  //BigO = O(1)

    public E[] toArray(E[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = data[i];
        }
        return arr;
    }                                  //BigO = O(n)

    public E[] toArray1(E[] arr) {
        return (E[]) Arrays.copyOf(data, size, arr.getClass());
    }                                  //BigO = O(n)

    public E[] toArray2(Class<E> cl){
        E[] arr = (E[]) Array.newInstance(cl, size);
        for (int i = 0; i < size; i++) {
            arr[i] = data[i];
        }
        return arr;
    }                                  //BigO = O(n)

    public void addAll(List<E> list){
        int newSize = size + list.size();
        while (newSize >= capacity)
            grow();
        for (int i = 0; i < list.size(); i++) {
            data[size+i] = list.get(i);
        }
        size = newSize;
    }                                  //BigO = O(n)

    public void sort(){
        trimToSize();
        Arrays.sort(data);

//  При реализации сортировки вручную вылетает:

//  Exception in thread "main" java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Comparable; ([Ljava.lang.Object; and [Ljava.lang.Comparable; are in module java.base of loader 'bootstrap')
//	at lists.arrayList.arrayList_2.MyArrayList.<init>(MyArrayList.java:23)
//	at lists.arrayList.arrayList_2.Main.main(Main.java:23)

//        boolean isSorted = false;
//        while (!isSorted){
//            isSorted = true;
//            for (int i = 0; i < size-1; i++) {
//                if (data[i+1].compareTo(data[i]) < 0){
//                    E temp = data[i+1];
//                    data[i+1] = data[i];
//                    data[i] = temp;
//                    isSorted = false;
//                }
//            }
//        }                                  //BigO = O(n^2)
    }
}
