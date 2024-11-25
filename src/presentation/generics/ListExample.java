package presentation.generics;

public class ListExample <T>{
    T[] arr;
    int size;

    public ListExample(T[] arr) {
        this.arr = arr;
    }

    public void insert(T element){
        arr[size] = element;
        size++;
        System.out.println(arr[size]);
    }

    public T get(T object){
        return object;
    }



}
