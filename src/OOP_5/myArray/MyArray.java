package oop_5.myArray;

import java.util.Scanner;
import java.util.Arrays;

public class MyArray {
    public int[] arr;                                               //5.3.1

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10");
        arr = new int[scanner.nextInt()];
        System.out.println("Fill an array with " + arr.length + " numbers");
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
    }

    public void outputArray() {
        System.out.println("Your array is " + Arrays.toString(arr));
    }                                                                //5.3.3

    public void sumArray() {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the array is " + sum);
    }

    public void averageArray() {
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        double aver = sum/arr.length;
        System.out.println("The average of the array is " + aver);
    }                                                                //5.3.4

    public void changeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an index of your array");
        int index = scanner.nextInt();
        System.out.println("Change the element #" + index + " of your array");
        arr[index-1] = scanner.nextInt();
        System.out.println("Your new array is " + Arrays.toString(arr));
    }                                                                //5.3.5

    public boolean positiveArray() {
        boolean check = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0)
                check = true;
            else
                check = false;
            break;
        }
        return check;
    }                                                                //5.3.6

    public int countNegArray() {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0)
                count++;
        }
        return count;
    }                                                                //5.3.7

    public void changeNegArray() {
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0)
                arr[i]-=arr[i]*2;
        }
        System.out.println("Your new array is " + Arrays.toString(arr));
    }                                                                //5.3.8
}
