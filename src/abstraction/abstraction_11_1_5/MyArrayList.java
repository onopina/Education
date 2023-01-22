package abstraction.abstraction_11_1_5;

import java.util.Arrays;

public class MyArrayList implements Adjustable {

    public int arraySize;
    public int[] array = new int[arraySize];
    public int[] array1 = new int[array.length + 1];
    public int[] array2 = new int[array.length];

    public MyArrayList(int[] array) {
        this.array = array;
    }

    @Override
    public void add_element(int element) {

        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        for (int i = 0; i < array1.length; i++) {
            array1[array1.length - 1] = element;
        }
        array = array1;
    }

    @Override
    public void print_list() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    @Override
    public void delete_element(int index) {
        int[] array2 = new int[array.length - 1];
        for (int i = 0; i < array2.length; i++) {
            if (i + 1 == index) {
                for (int j = i; j < array2.length; j++) {
                    array2[j] = array[j + 1];
                }
                break;
            } else {
                array2[i] = array[i];
            }
        }
        array = array2;
    }
}

