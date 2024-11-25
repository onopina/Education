package multithreading_35_36.multithreading_2_3.way_1;

/**
 * Способ 1 (synchronized метод)
 */
public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public synchronized void incrementNum(){
        num++;
    }
}
