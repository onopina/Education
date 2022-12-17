package MyArray_5;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    //ООП. Часть 3
        MyArray array = new MyArray();
        array.inputArray();
        array.outputArray();
        array.sumArray();
        array.averageArray();
        array.changeArray();
        boolean check = array.positiveArray();
        System.out.println(check);
        int count = array.countNegArray();
        System.out.println("The numbers of negative elements is " + count);
        array.changeNegArray();
    }
}
