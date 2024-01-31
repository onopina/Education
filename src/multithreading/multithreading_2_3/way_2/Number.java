package multithreading.multithreading_2_3.way_2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Способ 2 (AtomicInteger)
 */
public class Number {
    private AtomicInteger num;

    public Number(AtomicInteger num) {
        this.num = num;
    }

    public AtomicInteger getNum() {
        return num;
    }

    public int incrementNum() {
        return num.incrementAndGet();
    }
}
