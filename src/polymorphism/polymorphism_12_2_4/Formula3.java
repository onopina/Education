package polymorphism.polymorphism_12_2_4;

public class Formula3 extends Polinomial{

    public Formula3(int x) {
        super(x);
    }

    @Override
    public int evaluate(int x) {
        return (x*x*x + x*x + x + 1);
    }
}
