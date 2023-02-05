package polymorphism.polymorphism_12_2_3_ver2;

public class Formula1 extends Polinomial{

    public Formula1(int x) {
        super(x);
    }

    @Override
    public int evaluate(int x) {
        return (x + 1);
    }
}
