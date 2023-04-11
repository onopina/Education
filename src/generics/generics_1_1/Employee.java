package generics.generics_1_1;

public class Employee<K, V> {
    private K name;
    private V age;

    public K getName() {
        return name;
    }

    public V getAge() {
        return age;
    }

    public void setName(K name) {
        this.name = name;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public void correctEmployee(K name, V age){
        this.name = name;
        this.age = age;
    }
}
