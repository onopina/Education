package multithreading.multithreading_2_4;

public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void incrementNum(){
        synchronized (Number.class){
        for (int i = 0; i < 10_000_000; i++) {
            num++;
        }
        }
    }
}
