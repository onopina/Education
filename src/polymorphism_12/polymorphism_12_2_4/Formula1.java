package polymorphism_12.polymorphism_12_2_4;

public class Formula1 extends Polinomial {

    public Formula1(int x) {
        super(x);
    }

    @Override
    public int evaluate(int x) {
        return (x + 1);
    }
}
