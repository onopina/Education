package polymorphism.polymorphism_12_2_3;

public class Formula1 implements Polinomial{
    @Override
    public void evaluate(int x) {
        System.out.println("The result is " + (x + 1));
    }
}
