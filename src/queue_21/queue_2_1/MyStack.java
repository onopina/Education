package queue_21.queue_2_1;

public class MyStack <T> {
    private Object[] arr;
    private int capacity;

    private int head;

    public MyStack(int size) {
        arr = new Object[size];
        capacity = size;
        head = -1;
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        return head == capacity-1;
    }

    public boolean push(T element){
        if (isFull()){
            capacity *= 2;
            Object[] arr1 = new Object[capacity];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[++head] = element;
        return true;
    }

    public T pop(){
        if (isEmpty())
            return null;
        return (T) arr[head--];
    }

    public T peek(){
        if (isEmpty())
            return null;
        return (T) arr[head];
    }
}
