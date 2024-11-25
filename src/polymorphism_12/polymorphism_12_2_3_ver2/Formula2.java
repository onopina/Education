package polymorphism_12.polymorphism_12_2_3_ver2;

public class Formula2 extends Polinomial{

    public Formula2(int x) {
        super(x);
    }

    @Override
    public int evaluate(int x) {
        return (x*x + x + 1);
    }
}
