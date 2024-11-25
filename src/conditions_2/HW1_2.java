package conditions_2;

/**
 * 2.	Сделать проверку на совершеннолетие пользователя (возраст определяется переменной int).
 */
public class HW1_2 {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("User is an adult");
        } else if (age > 0 && age < 18) {
            System.out.println("User is a child");
        } else {
            System.out.println("Please enter a correct age");
        }
    }
}
