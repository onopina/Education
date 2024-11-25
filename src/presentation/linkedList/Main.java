package presentation.linkedList;

/**
 * LinkedList – связный список
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(10);
        list.addFirst(15);
        list.addFirst(20);
        list.addFirst(25);
        list.addAnyPosition(30, 5);
        list.addAnyPosition(35, 6);

//        list.iterate();

        list.removeByKey(10);

        list.iterate();

        System.out.println("The element is " + list.findElement(3));
    }

}


