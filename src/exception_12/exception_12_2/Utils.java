package exception_12.exception_12_2;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public void showElementOfArray(){
        int[] array = {9, 11, 13, 15, 17};
        System.out.println("Elements of the array are: ");
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index of an element of the array: ");
        int index = scanner.nextInt();
        try{
            System.out.println("The element of the array is: " + array[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void getSumLengthOfWords(){
        String word1 = "Hello";
        String word2 = "Java";
        String word3 = null;
        try{
            System.out.println(word1.length() + word2.length() + word3.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
