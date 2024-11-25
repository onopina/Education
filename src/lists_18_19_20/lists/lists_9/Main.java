package lists_18_19_20.lists.lists_9;

import java.util.ArrayList;

/**
 * 9.	Дан ArrayList. Расширить его вместимость до миллиона.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.ensureCapacity(1000000);
    }
}
