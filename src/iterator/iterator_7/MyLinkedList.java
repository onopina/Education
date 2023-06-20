package iterator.iterator_7;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E>{
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor = 0;
            private int lastReturned = -1;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                if (cursor >= size)
                    throw new NoSuchElementException();
                lastReturned = cursor;
                cursor++;
                return getByIndex(lastReturned);
            }

            @Override
            public void remove() {
                if (lastReturned < 0)
                    throw new IllegalStateException();
                removeByIndex(lastReturned);
                cursor = lastReturned;
                lastReturned = -1;
            }
        };
    }

    private static class Node<E>{
        private E current;
        private Node<E> prev;
        private Node<E> next;

        public Node(E current) {
            this.current = current;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public void print(){
        Node<E> temp = first;
        while (temp != null) {
            System.out.println(temp.current);
            temp = temp.next;
        }
    }

    public void addFirst(E element){
        Node<E> temp = new Node<>(element);
        if (isEmpty())
            last = temp;
        else
            first.prev = temp;

        temp.next = first;
        first = temp;
        size++;
    }                                  //BigO = O(1)

    public void addLast(E element){
        Node<E> temp = new Node<>(element);
        if (isEmpty())
            first = temp;
        else
            last.next = temp;

        temp.prev = last;
        last = temp;
        size++;
    }                                  //BigO = O(1)

    public void addByIndex(int index, E element){
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node<E> current = first;

        while (index > 0){
            current = current.next;
            index--;
        }

        if (current == null){
            addLast(element);
            return;
        }
        Node<E> temp = new Node<>(element);
        current.prev.next = temp;
        temp.prev = current.prev;
        current.prev = temp;
        temp.next = current;
        size++;
    }                                  //BigO = O(n)

    public void removeFirst(){
            first = first.next;
            first.prev = null;
            size--;
    }                                  //BigO = O(1)

    public void removeLast(){
        last = last.prev;
        last.next = null;
        size--;
    }                                  //BigO = O(1)

    public void removeByIndex(int index){
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<E> current = first;

        while (index > 0) {
            current = current.next;
            index--;
        }

        if (current.next == null){
            removeLast();
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        size--;
    }                                  //BigO = O(n)

    public void removeByKey(E key) {
        while (true) {
            Node<E> current = first;
            while (current.current != key) {
                current = current.next;
                if (current == null)
                    return;
            }
            if (current == first) {
                removeFirst();
                return;
            }
            if (current == last) {
                removeLast();
            }

            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
        }
    }                                  //BigO = O(n^2)

    public E getByIndex(int index){
        Node<E> temp = first;
        int count = 0;
        while (count < index){
            temp = temp.next;
            count++;
        }
        return temp.current;
    }

    public boolean contains(E element){
        Node<E> temp = first;
        while (temp != null){
            if (temp.current.equals(element))
                return true;
            temp = temp.next;
        }
        return false;
    }                                  //BigO = O(n)

    public E[] toArray(Class<E> cl){
        E[] arr = (E[]) Array.newInstance(cl, size);
        Node<E> temp = first;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.current;
            temp = temp.next;
        }
        return arr;
    }                                  //BigO = O(n)

    public int getSum(){
        int sum = 0;
        Node<E> temp = first;
        while (temp != null){
            sum += (int) temp.current;
            temp = temp.next;
        }
        return sum;
    }                                  //BigO = O(n)

    public void push(E element){
        addFirst(element);
    }                                  //BigO = O(1)

    public E pop(){
        Node<E> temp = first;
        removeFirst();
        return temp.current;
    }                                  //BigO = O(1)

    public E peek(){
        return first.current;
    }                                  //BigO = O(1)
}
