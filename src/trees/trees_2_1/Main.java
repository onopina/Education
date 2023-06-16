package trees.trees_2_1;

/**
 * Часть 1.
 * Реализовать простое обобщенное бинарное дерево поиска.
 * Необходимые операции: добавление в дерево, поиск элемента в дереве, удаление из дерева.
 * При реализации хранить только один элемент (<E>). Балансировка не нужна.
 *
 * Часть 2.*
 * Реализовать метод вывода дерева в отсортированном порядке.
 * Подсказка: алгоритм симметричного обхода через рекурсию.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -5, 4, -10, 2, 9, 5, -15};
        MyTree<String> tree = new MyTree<>();

        for (int i = 0; i < arr.length; i++) {
            tree.addElement(arr[i], "Example");
        }

        tree.print(tree.getRoot());

        System.out.println(tree.contains(4));

        tree.deleteElement(4);

        System.out.println(tree.contains(4));
    }
}
