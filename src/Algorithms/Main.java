package Algorithms;

public class Main {

    public static void main(String[] args) {

//  1.	Дан массив. Определить элемент, который встречается наибольшее количество раз.

        int[] arr = {1, 2, 11, 2, 9, 75, 10, 3, 8, 75, 3, 75, 75};
        int[] arr_count = new int[arr.length];
        int count = 0;
        int result = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                else if (count > result) {
                    result = count;
                    max = arr[j];
                }
            }
        }

        System.out.println("The number " + max + " appears " + result + " times in the array");

        

    }

}