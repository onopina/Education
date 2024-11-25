package presentation.linkedList;

public class MyLinkedList {    //Односвязный список (в одном напр-ии, только next)
    private Node first;
    private int size;
    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void iterate(){
        Node current = first;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (first != null){
            newNode.next = first;
        }
        first = newNode;
        size++;
    }
    public void addAnyPosition(int data, int index){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node current = first;
        while (index-1 > 0){
            current = current.next;
            index--;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    public void addLast(int data){
        if (size == 0){
            addFirst(data);
        }
        else {
            Node current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
            size++;
        }
    }
    public void removeFirst(){
        if (size <= 0)
            return;
        first = first.next;
        size--;
    }
    public void removeByKey(int key){
        Node parent = first;
        Node current = first;
        while(current.data != key){
            if (current.next != null){
                parent = current;
                current = current.next;
            }
            else
                return;
        }
        if (current == parent)
            removeFirst();
        else {
            parent.next = current.next;
            size--;
        }
    }
    public int findElement(int index){
        Node current = first;
        while(index > 0){
            current = current.next;
            index--;
        }
        return current.data;
    }

}
