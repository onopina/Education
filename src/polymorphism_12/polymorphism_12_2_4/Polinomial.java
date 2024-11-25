package polymorphism_12.polymorphism_12_2_4;

public abstract class Polinomial {
    public int x;

    public Polinomial(int x) {
        this.x = x;
    }

    public abstract int evaluate(int x);
}
