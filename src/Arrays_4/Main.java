package Arrays_4;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

            int[]arr = new int[4];
            arr[0] = 5;
            arr[1] = 10;
            arr[2] = 15;
            arr[3] = 20;

            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }

            System.out.println();


            int[]arr1 = {5, 10, 15, 20};

            for(int num: arr1){
                System.out.println(num);
            }

            System.out.println();                                               //1



            int[]arr2 = new int[7];

            for(int i=0; i<arr2.length; i++){
                arr2[i] = i*2;
                System.out.println(arr2[i]);
            }

            System.out.println();                                               //2



            int[]arr3 = {3, 6, 9, 12};
            int sum = 0;
            for(int i=0; i<arr3.length; i++){
                sum = sum + arr3[i];
            }

            System.out.println(sum);

            System.out.println();                                               //3



            String[]strings = {"1", "2", "3", "4"};
            int[]numbers = new int[strings.length];
            int sum1 = 0;
            for(int i=0; i<numbers.length; i++){
                numbers[i] = Integer.parseInt(strings[i]);
                sum1 = sum1 + numbers[i];
            }

            System.out.println(sum1);

            System.out.println();                                               //4



//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter a number from 1 to 100: ");
//            int num = scanner.nextInt();
//            int[]arr5 = new int[num];
//            System.out.println();
//
//            for(int i=0; i<arr5.length; i++){
//                arr5[i] = i;
//                System.out.print(arr5[i]);
//             }
//
//             System.out.println();                                              //5



            int[]arr6 = {3, 6, 9, 12, 15};
            int sum6 = 0;
            for(int i=0; i<arr6.length; i++){
                sum6 = sum6 + arr6[i];
            }
            double average = sum6/arr6.length;
            System.out.println(average);

            System.out.println();                                               //6



            int[]arr7 = {1, 3, 5, 7, 9};
            int[]mirror = new int[arr7.length];

            for(int i=arr7.length-1; i>=0;i--){
                for(int j=0; j<mirror.length; j++) {
                    mirror[j] = arr7[i];
                    i--;
                }
            }
            System.out.print(Arrays.toString(mirror));

            System.out.println();                                               //7



            int[]arr8 = {1, 3, 5, 7, 9};
            for(int i=0; i<arr8.length/2;i++){
                int x = arr8[arr8.length-1-i];
                arr8[arr8.length-1-i] = arr8[i];
                arr8[i] = x;
            }
            System.out.print(Arrays.toString(arr8));

            System.out.println();                                               //8


            
            Scanner scanner9 = new Scanner(System.in);
            System.out.print("Enter a number from 1 to 100: ");
            int num9 = scanner9.nextInt();
            int amount = 0;

            int[]arr9 = {3, 6, 9, 9, 12};

            for(int i=0; i<arr9.length; i++){
                   if (arr9[i] == num9)
                  amount++;
              }
            System.out.println("The number " + num9 + " appears " + amount + " times in the array");

            System.out.println();                                               //9



            Scanner scanner10 = new Scanner(System.in);
            int[]arr10 = new int[5];
            System.out.println("Fill an array with " + arr10.length + " numbers");
            for(int i=0; i<arr10.length; i++){
            	    arr10[i] = scanner10.nextInt();
            	}
            System.out.println("Your array is " + Arrays.toString(arr10));

            System.out.println();                                               //10



            int[]arr11 = {6, 9, 3, 15, 12};
            int max = arr11[0];
            for(int i=1; i<arr11.length; i++){
                if (arr11[i] > max) {
                    max = arr11[i];
                }
            }
            int min = arr11[0];
            for(int i=1; i<arr11.length; i++){
                if (arr11[i] < min) {
                    min = arr11[i];
                }
            }
            System.out.println("The maximum value is " + max);
            System.out.println("The minimum value is " + min);

            System.out.println();                                               //11



            int[]arr12 = {-6, 9, 3, 15, 12, -15, 2};

            int count = 0;
            int result = 0;

            for(int i=0; i<arr12.length; i++){
                if (arr12[i] > 0) {
                    count++;
                }
                else if (count > result) {
                    result = count;
                } else {
                    count = 0;
                }
            }
            System.out.println(result);

            System.out.println();                                               //12



            int[]arr13 = {9, 3, 15, 12, 10, 45, 8, 17, 28, 5, 16, 10};

            int sum13 = 0;

            for(int i=0; i<arr13.length; i++) {
                    sum13 = sum13 + arr13[i];
                    if (sum13 >=100) {
                        sum13 = sum13 - arr13[i];
                        break;
                    }
            }
            System.out.println(sum13);

            System.out.println();                                               //13



            int[][]matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();                                            //14



            int[][]matrix15 = {{1, 2}, {3, 4}, {5, 6}};
            int sum15 = 0;
            for(int i=0; i<3; i++){
                for(int j=0; j<2; j++){
                    sum15 = sum15 + matrix15[i][j];
                }
            }
            System.out.println(sum15);

            System.out.println();                                            //15



            int[][]matrix16 = {{3, 6, 9}, {2, 4, 6}, {10, 20, 30}};
            int sum_first_row = 0;
            int sum_last_column = 0;
            for(int i=0; i<3; i++) {
                sum_last_column = sum_last_column + matrix16[i][2];
            }
            for(int j=0; j<3; j++){
                sum_first_row = sum_first_row + matrix16[0][j];
                }
            System.out.println("The sum of the numbers in the first row is " + sum_first_row);
            System.out.println("The sum of the numbers in the last column is " + sum_last_column);

            System.out.println();                                            //16

        }
}
