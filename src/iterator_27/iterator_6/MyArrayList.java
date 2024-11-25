package iterator_27.iterator_6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterable<E>{

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

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor = 0;
            private int lastReturned = -1;
            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                if (cursor >= size)
                    throw new NoSuchElementException();
                lastReturned = cursor;
                cursor++;
                return get(lastReturned);
            }

            @Override
            public void remove() {
                if (lastReturned < 0)
                    throw new IllegalStateException();
                removeByIndex(lastReturned);
                cursor = lastReturned;
                lastReturned = -1;
            }
        };
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
    }                                 //BigO = O(n^2)
}
