package abstraction_10_11.abstraction_11_2_1;

import java.util.Scanner;
import java.util.Arrays;


public class Array implements Service {
    int size;
    int []array;


    @Override
    public void create() {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
      //  System.out.println(Arrays.toString(array));
    }

    @Override
    public void makeString() {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void clear() {
        array = null;
    }

}



