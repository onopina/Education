package map.hashMap.hashMap_1_4;

import java.util.*;

/**
 * Часть 4.
 * Создать структуру: Employee-Department. У Работника есть два поля: имя и опыт работы.
 * Каждому работнику ставится в соответствие его отдел (Employee и Department – два отдельных класса),
 * в котором он работает. Добавить 7 записей.
 * •	Попробовать добавить дубликат. Проверить, был ли добавлен дубликат в Map.
 * •	Определить отдел, в котором работают больше всего людей
 * •	Определить количество отделов.
 */
public class Main {
    public static void main(String[] args) {
        Map<Employee, Department> employees = new HashMap<>();

        Employee emp1 = new Employee("Maria",5);
        Employee emp2 = new Employee("Alex",7);
        Employee emp3 = new Employee("Makar",3);
        Employee emp4 = new Employee("Kirill",5);
        Employee emp5 = new Employee("Evgenia",10);
        Employee emp6 = new Employee("Michael",7);
        Employee emp7 = new Employee("Olga",8);

        Department construction = new Department("Construction");
        Department geology = new Department("Geology");
        Department geodesic = new Department("Geodesic");

        employees.put(emp1, construction);
        employees.put(emp2, construction);
        employees.put(emp3, geology);
        employees.put(emp4, geology);
        employees.put(emp5, geodesic);
        employees.put(emp6, geodesic);
        employees.put(emp7, geodesic);

        System.out.println(employees);

        Employee emp8 = new Employee("Olga", 8);

        employees.put(emp8, geology);

        System.out.println(employees);

        getLargestDepartment(employees);

        getNumberOfDepartments(employees);
    }

    public static void getLargestDepartment(Map<Employee, Department> employees){
        Map<Department, Integer> result = new HashMap<>();    // Key - Отдел, Value - кол-во повторений

        for (Department department : employees.values()){
            Integer count = result.get(department);
            result.put(department, (count == null) ? 1 : count+1);
        }

        Collection<Integer> values = result.values();
        int max = Collections.max(values);

        for (Map.Entry<Department, Integer> entry : result.entrySet()){
            if (entry.getValue() == max)
                System.out.println("The " + entry.getKey() + " is the largest");
        }
    }

    public static void getNumberOfDepartments(Map<Employee, Department> employees){
        Map<Department, Integer> result = new HashMap<>();

        for (Department department : employees.values()){
            Integer count = result.get(department);
            result.put(department, (count == null) ? 1 : count+1);
        }

        System.out.println("The number of departments is " + result.size());
    }
}
