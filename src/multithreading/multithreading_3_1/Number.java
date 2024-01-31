package multithreading.multithreading_3_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Number {
    private AtomicInteger num;

    public Number(int num) {
        this.num = new AtomicInteger(num);
    }

    public void setNum(int num) {
        this.num = new AtomicInteger(num);
    }

    public AtomicInteger getNum() {
        return num;
    }
}
