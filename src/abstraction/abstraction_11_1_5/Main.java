package abstraction.abstraction_11_1_5;

public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(new int[]{1, 3, 5, 7, 9, 11, 13});
        list.add_element(15);
        list.print_list();
        list.add_element(17);
        list.print_list();
        list.delete_element(3);
        list.print_list();

    }
}
