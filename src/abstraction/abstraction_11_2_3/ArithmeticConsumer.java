package abstraction.abstraction_11_2_3;

public class ArithmeticConsumer extends Consumer{

    @Override
    public double getResult(int a, double b, String operation) {
       double getResult = 0;
        if(operation.equals("+")){
           getResult = a+b;
        }
        else if (operation.equals("-")) {
            getResult = a-b;
        }
        else if (operation.equals("*")) {
            getResult = a*b;
        }
        else if (operation.equals("/")) {
            getResult = a/b;
        }
    return getResult;
    }

}
