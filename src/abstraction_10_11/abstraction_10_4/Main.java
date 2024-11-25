package abstraction_10_11.abstraction_10_4;

/**
 * 4.	Реализовать программу гонки: есть 4 разных вида машин: MERCEDES, BMW, KIA, LADA.
 *  Каждая из машин имеет следующие характеристики: скорость, расход топлива на 100 км,
 *  вероятность поломки, количество топлива. Наибольшая скорость у BMW,
 *  далее – Mercedes, Kia, Lada. Наибольший расход – у Mercedes, BMW, Lada, Kia.
 *  Наибольшая вероятность поломки – BMW (у остальных – одинаково).
 *  Необходимо проехать 1000 км.
 *  При этом у всех машин на старте одинаковое количество топлива.
 *  Необходимо учесть, что машины едут с разной скоростью,
 *  но у них разный расход топлива и разная вероятность поломки.
 *  Если машине нужно заправиться или исправить поломку, то она пропускает ход.
 *  Один ход – проехать n км, где N = скорости машины.
 *  Поломка определяется случайным образом на основании вероятности поломки машины.
 */
public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(250, 20, 700, 40);
        BMW bmw = new BMW(270, 18, 500, 40);
        Kia kia = new Kia(220, 12, 700, 40);
        LADA lada = new LADA(180, 15, 700, 40);
        mercedes.drive();
        System.out.println();
        bmw.drive();
        System.out.println();
        kia.drive();
        System.out.println();
        lada.drive();
        System.out.println();


        int[][] chart = {{mercedes.num_steps, bmw.num_steps, kia.num_steps, kia.num_steps},
                          {mercedes.total_km, bmw.total_km, kia.total_km, lada.total_km}};
        int min_steps = chart[0][0];
        int i;
        int j;
        for (i = 0; i < chart.length; i++) {
            for (j = 0; j < chart[i].length; j++) {
                if (chart[0][j] <= min_steps) {
                    min_steps = chart[0][j];
                }
            }
        }

        String[] model = {"Mercedes", "BMW","Kia","LADA"};

        int max_total_km = chart[1][0];
        for (i = 0; i < chart.length; i++) {
            for (j = 0; j < chart[i].length; j++) {
                if ((chart[0][j] == min_steps) && (chart[1][j] > max_total_km)) {
                    max_total_km = chart[1][j];
                    System.out.println("The winner is " + model[j] + "!");
                }
            }
        }







    }
}
