package regex_28.regex_1_8;

/**
 * 8.	Дана строка, состоящая из текста и цифр. Заменить все цифры на («[цифра]»).
 */
public class Main {
    public static void main(String[] args) {
        String st = "The temperature in Moscow varies from -15°C to 20°C during the year";
        String result = st.replaceAll("-?\\d+", "[number]");
        System.out.println(result);
    }
}
