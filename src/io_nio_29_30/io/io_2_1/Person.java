package io_nio_29_30.io.io_2_1;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable{
    @Serial
    private static final long serialVersionUID = 3030408605456564974L;
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
