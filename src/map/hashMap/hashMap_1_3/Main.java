package map.hashMap.hashMap_1_3;

import java.util.*;

/**
 * Часть 3.
 * Создать таблицу пациентов: каждому пациенту присваивается свой id (Integer). Он уникальный.
 * Добавить 10 пациентов с номерами от 1 до 10.
 * Необходимо:
 * •	Удалить пациентов с четными номерами
 * •	Получить пациента в таблице по введенному с помощью сканнера ID
 * •	*Заменить пациента в таблице по введенному с помощью сканнера ID.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Patient> patients = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {
            patients.put(1001+i, new Patient(i+1));
        }

        System.out.println(patients);

        removeEvenNumbers(patients);

        System.out.println(patients);

        Patient patient = getPatientByID(patients);
        System.out.println(patient);

        changePatientByID(patients);

        System.out.println(patients);
    }

    public static Map<Integer, Patient> removeEvenNumbers(Map<Integer, Patient> patients){
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, Patient> entry : patients.entrySet()){
            if (entry.getValue().getNumber()%2 == 0) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (Integer key : keysToRemove){
            patients.remove(key);
        }
        return patients;
    }

    public static Patient getPatientByID(Map<Integer, Patient> patients){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Patient's ID number: ");
        int ID = scanner.nextInt();
        for (Integer key : patients.keySet()){
            if (ID == key){
                return patients.get(key);
            }
        }
        return null;
    }

    public static Map<Integer, Patient> changePatientByID(Map<Integer, Patient> patients){
        Scanner scanner = new Scanner(System.in);
        System.out.print("To change a Patient enter an ID number: ");
        int ID = scanner.nextInt();
        System.out.print("Enter a new Patient's number: ");
        int number = scanner.nextInt();
        for (Integer key : patients.keySet()){
            if (ID == key){
                patients.put(key, new Patient(number));
            }
        }
        return patients;
    }
}
