package multithreading_35_36.multithreading_2_3.way_3;

/**
 * Способ 3 (synchronized блок)
 */
public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void incrementNum(){
        synchronized (this){
            num++;
        }

    }
}
