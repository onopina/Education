package generics_13.generics_1_7;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;

    public MyArrayList(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public T[] addElement(T value){
        int size = array.length+1;
        T[] tempArray = (T[]) new Object[size];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        tempArray[tempArray.length-1] = value;
        array = tempArray;
        return array;
    }

    public T[] removeElementByIndex(int index){
        int size = array.length-1;
        T[] tempArray = (T[]) new Object[size];
        try{
            for (int i = 0; i < index; i++) {
                tempArray[i] = array[i];
            }
            for (int i = index; i < tempArray.length; i++) {
                tempArray[i] = array[i+1];
            }
            array = tempArray;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        return array;
    }

    public T[] removeFirstElement(){
        int size = array.length-1;
        T[] tempArray = (T[]) new Object[size];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i+1];
        }
        array = tempArray;
        return array;
    }

    public T getElementByIndex(int index){
        T result = null;
        try{
            result = array[index];
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        return result;
    }

    public T[] setElementByIndex(T element, int index){
        try{
            array[index] = element;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        return array;
    }
}
