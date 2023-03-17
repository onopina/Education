package string_11.string_11_8;

/**
 * 8.	Даны три строки. Отсортировать их по алфавиту (вывести на консоль в алфавитном порядке).
 */
public class Utils {
    public void sortByAlphabeticalOrder(String[] words){
        String temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < words.length-1; i++) {
                if (words[i+1].compareTo(words[i]) < 0) {
                    isSorted = false;
                    temp = words[i];
                    words[i] = words[i+1];
                    words[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
