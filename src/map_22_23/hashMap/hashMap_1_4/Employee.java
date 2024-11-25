package map_22_23.hashMap.hashMap_1_4;

import java.util.Objects;

public class Employee {
    private String name;
    private int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience);
    }
}
