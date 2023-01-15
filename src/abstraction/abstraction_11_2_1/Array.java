package abstraction.abstraction_11_2_1;

import java.util.Scanner;
import java.util.Arrays;

public class Array implements Service {
    int size;
    int []array = new int[size];

    @Override
    public void create() {
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
     //   int []array = new int[size];
        int []array1 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            array1[i] = scanner.nextInt();
        }
        array = array1;
      //  System.out.println(Arrays.toString(array));
    }

    @Override
    public void makeString() {
        System.out.println(Arrays.toString(array));
    }


}
