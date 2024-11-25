package exceptions_12.exceptions_12_1;

public class Utils {
    public void divide(int a, int b){
        try{
            int result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The end");
        }
    }
}
