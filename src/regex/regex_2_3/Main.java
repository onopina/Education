package regex.regex_2_3;

/**
 * 3.	Написать валидатор для IP адреса (простой).
 */
public class Main {
    public static void main(String[] args) {
        String ip = "192.168.1.1";

        boolean check = ip.matches("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        System.out.println(check);
    }
}
