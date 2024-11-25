package generics_13.generics_1_7;

public class MyArrayList1<T> {
    private T[] data;
    private int capacity;
    private int size;

    public MyArrayList1() {
        this.capacity = 16;
        this.size = 0;
        this.data = (T[]) new Object[capacity];
    }

    private void grow(){
        this.capacity *= 2;
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
        data = newArr;
    }

    public void add(T element){
        if (size == capacity)
            grow();
        data[size++] = element;
    }

    public void add(T element, int index){
        if (index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        }
        if (size == capacity)
            grow();
        for (int i = size; i > index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;
        size++;
    }

    public int find(T element){
        for (int i = 0; i < size; i++) {
            if (data[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void delete(int index){
        if (index>size || index<0){
            throw new ArrayIndexOutOfBoundsException("Index cannot be more than size or negative");
        }
        for (int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }
}
