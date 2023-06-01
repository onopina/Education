package map.hashMap.hashMap_2_1;

import java.util.Objects;

public class MyHashMap<K, V> {

    private class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry<?, ?> entry = (Entry<?, ?>) o;
            return Objects.equals(key, entry.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key);
        }

        @Override
        public String toString() {
            return "{key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private Entry<K, V>[] table;
    private int capacity = 10;
    private int realSize;
    private final float loadFactor = 0.75f;

    public MyHashMap() {
        table = new Entry[capacity];
    }

    public int getRealSize() {
        return realSize;
    }

    private int getIndex(K key){
        return key.hashCode() % capacity;
    }

    private boolean checkLoad(){
        return 1.0*realSize / capacity >= loadFactor;
    }

    public void put(K key, V value){

        if (checkLoad()){
            rehash();
        }

        int index = getIndex(key);
        Entry<K, V> e = table[index];
        if (e == null){
            table[index] = new Entry<>(key, value);
        } else {
            while (e.next != null){
                if (e.getKey().equals(key)){
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey().equals(key)) {
                e.setValue(value);
                return;
            }
            e.next = new Entry<K, V>(key, value);
        }
        realSize++;
    }

    public V get(K key){
        int index = getIndex(key);
        Entry<K, V> e = table[index];

        if (e == null){
            return null;
        }
        while (e != null){
            if (e.getKey().equals(key)){
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }

    public Entry<K, V> remove(K key){
        int index = getIndex(key);
        Entry<K, V> e = table[index];

        if (e == null){
            return null;
        }

        if (e.getKey().equals(key)){
            table[index] = e.next;
            e.next = null;
            realSize--;
            return e;
        }

        Entry<K, V> prev = e;
        e = e.next;

        while(e != null){
            if (e.getKey().equals(key)){
                prev.next = e.next;
                e.next = null;
                realSize--;
                return e;
            }
            prev = e;
            e = e.next;

        }
        return null;
    }

    public boolean containsKey(K key){

        for (int i = 0; i < table.length; i++) {
            Entry<K, V> temp = table[i];

            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public void print(){
        for (int i = 0; i < table.length; i++) {
            Entry<K, V> temp = table[i];

            while (temp != null) {
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }

    private void rehash(){
        realSize = 0;
        capacity *= 2;

        Entry<K, V>[] oldTable = table;
        table = new Entry[capacity];

        for (int i = 0; i < oldTable.length; i++) {
            Entry<K, V> temp = oldTable[i];

            while (temp != null) {
                K key = temp.getKey();
                V value = temp.getValue();
                this.put(key, value);
                temp = temp.next;
            }
        }
    }
}
