package MathUtils_7;

public class Main {
    public static void main(String[] args) {

    //7. Статические поля и методы. Часть 2
        System.out.println("The sum of the array is " + MathUtils.sumArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println("The average of the array is " + MathUtils.averageArray(new int[]{1, 2, 3, 4, 6}));
        System.out.println("The number of elements of the array in the range is " + MathUtils.rangeArray(new int[]{1, 2, 3, 4, 7, 1, 6, 8, 9}, 3, 9));
        System.out.println("The number of elements of the array between min and max is " + MathUtils.rangeMinMaxArray(new int[]{5, 3, 2, 8, 10, 4, 15, 11}));
        System.out.println("The result is " + MathUtils.doubleToInt(5.25));
        System.out.println("The result is " + MathUtils.Formula(8));
    }
}
