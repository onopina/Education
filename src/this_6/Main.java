package this_6;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int addTwoNumbers = calc.add(5, 3);
        System.out.println("The sum of two numbers is " + addTwoNumbers);
        int addThreeNumbers = calc.add(5, 3, 9);
        System.out.println("The sum of three numbers is " + addThreeNumbers);
        double addTwoDoubleNumbers = calc.add(5, 4.5);
        System.out.println("The sum of two numbers is " + addTwoDoubleNumbers);
        int sub = calc.sub(5, 3);
        System.out.println("The difference of two numbers is " + sub);
        int mul = calc.mul(5, 3);
        System.out.println("The product of two numbers is " + mul);
        int div = calc.div(5, 3);
        System.out.println("The quotient of two numbers is " + div);
    }
}
