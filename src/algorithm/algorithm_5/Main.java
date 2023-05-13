package algorithm.algorithm_5;

/**
 * 5.	Создать метод get, который принимает массив и индекс элемента, который необходимо вернуть (return).
 * Предусмотреть проверку индекса на корректность. Оценить сложность.
 * BigO = O(1) - константная сложность
 */
public class Main {
    public static void main(String[] args) {
        int element = getElement(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println(element);

    }
    public static int getElement(int[] array, int index){
        int element = 0;
        try{
            element = array[index];
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return element;
    }
}
