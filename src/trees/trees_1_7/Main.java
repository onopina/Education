package trees.trees_1_7;

/**
 * 7.	*Написать программу перевода арабского числа в римское число с помощью дерева.
 * Подсказка: нужно использовать SortedMap или NavigableMap.
 */
public class Main {
    public static void main(String[] args) {
        ConverterToRoman converter = new ConverterToRoman();
        System.out.println(converter.convertToRoman(499));
    }
}