package queue.queue_1_1;

import java.util.NoSuchElementException;

public class MyQueue<T>{
    private Object[] arr;
    private int capacity;

    private int head;
    private int tail;

    public MyQueue() {
        capacity = 10;
        arr = new Object[capacity];
    }

    public boolean offer(T element){
        if (tail+1 >= capacity){
            capacity *= 2;
            Object[] arr1 = new Object[capacity];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[tail++] = element;
        return true;
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public T poll(){
        if (isEmpty())
            return null;
        return (T) arr[head++];
    }

    public T remove(){
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        return (T) arr[head++];
    }

    public T element(){
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
        return (T) arr[head];
    }

    public T peek(){
        if (isEmpty())
            return null;
        return (T) arr[head];
    }
}
