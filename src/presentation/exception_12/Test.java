package presentation.exception_12;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C://File/test.txt");
        String text = "Hello world";
        writer.write(text);
        writer.close();


//        String separator = File.separator;
//        String path = separator + "C" + separator + "Users" + separator + "Алина" + separator + "Desktop";
//        File file = new File("C:\\Users\\Алина\\Desktop\\test.txt");

//        File file = new File("test");
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();







//        try{
//            System.out.println("0");
//            if (true) {
//                throw new RuntimeException();  //stop
//            }
//            System.out.println("1");
//        }
//        catch (RuntimeException e){
//            System.out.println("2.1");
//            try{
//                System.out.println("2.2");
//                if (true) {
//                    throw new Error();  //stop
//                }
//                System.out.println("2.3");
//            }
//            catch (Throwable t){
//                System.out.println("2.4");
//            }
//            System.out.println("2.5");
//        }
//        catch (Error e){
//            System.out.println("3");
//        }
//        System.out.println("4");














//        System.out.println(divide(5, 1));
//
//    }
//
//    public static int divide(int a, int b){
//        if (b==0){
//            throw new ArithmeticException("Division by zero");
//        }
//        return a/b;
    }
}
