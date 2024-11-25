package cycles_3;
public class Main {
    public static void main(String[] args) {

        //1.	Создайте программу, выводящую на экран первые 20 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        for (int i = 1; i <= 20 * 2; i = i + 2)
        {
            System.out.println(i);
        }

        System.out.println();


        //2.	Вывести на консоль только четные числа.
        for (int i = -100; i <= 100; i = i + 2)
        {
            System.out.println(i);
        }

        System.out.println();


        //3.	Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int b = 2;
        for (int i = 0; i < 20; i++)
        {
            System.out.println(b);
            b = b * 2;
        }

        System.out.println();


        //4.	Вывести на консоль все числа от 0 до 100, не включая 4 и 13. Реализовать программу двумя способами.
        for (int i = 0; i <= 100; i++)
        {
            if (i != 4 && i != 13)
            {
                System.out.println(i);
            }
        }

        System.out.println();



        for (int i = 0; i < 4; i++)
        {
            System.out.println(i);
        }
        for (int i = 5; i < 13; i++)
        {
            System.out.println(i);
        }
        for (int i = 14; i <= 100; i++)
        {
            System.out.println(i);
        }

        System.out.println();


        //5.	Написать бесконечный цикл. Прервать его в тот момент, когда была достигнута 10 степень двойки
        // (в цикле необходимо увеличивать переменную в 2 раза на каждой итерации).
        // Попробовать переписать код без использования break.
        int n = 2;
        int x = 0;
        while (true)
        {
            System.out.println(n);
            n = n * 2;
            x++;
            if (x >= 10)
                break;
        }

        System.out.println();



        int m = 2;
        for (int i = 0; i < 10; i++)
        {
            System.out.println(m);
            m = m * 2;
        }

        System.out.println();


        //6.	Вывести на консоль числа 10, 8, 6 … 0.
        for (int i = 10; i >= 0; i = i - 2)
        {
            System.out.println(i);
        }

        System.out.println();


        //7.	Вывести на консоль таблицу 4на5, состоящую из «+». (четыре строки по пять плюсов в каждой).
        for (int i = 0; i < 4; i++)
        {
            System.out.println("+++++");
        }

        System.out.println();


        //8.	Вывести на консоль таблицу умножения.
        for (int i = 2; i < 10; i++)
        {
            for (int a = 2; a < 10; a++)
            {
                System.out.println(i + " x " + a + " = " + a*i);
            }
            System.out.println();
        }

        System.out.println();


        //9.	*Дана сумма вклада, процент, на который увеличивается вклад каждый год,
        // а также срок вклада (три переменные).
        // Посчитать общую сумму денег, которую получит клиент по истечении всего срока вклада.
        // Например: вклад 100 Р, ставка 7% -> через год будет 107 Р и так далее.
        float c = 100.00f;
        for (int i = 0; i < 10; i++)
        {
            float a = 1.07f;
            System.out.println(c * a);
            c = c * a;
        }

        System.out.println();


        //10.	*Посчитать сумму чисел от 0 до 100.
        int d = 0;
        for (int i = 0; i <= 100; i++)
        {
            d = d + i;
        }
        System.out.println(d);

        System.out.println();


        //11.	*Посчитать сумму четных чисел от 0 до 100.
        int f = 0;
        for (int i = 0; i <= 100; i++)
        {
            if (i % 2 == 0)
                f = f + i;
        }
        System.out.println(f);

        System.out.println();


        //12.	*Посчитать сумму четных чисел без использования if.
        int e = 0;
        for (int i = 0; i <= 100; i = i + 2)
        {
            e = e + i;
        }
        System.out.println(e);

        System.out.println();


        //13.	*Написать цикл, вычисляющий факториал числа (про факториал можно посмотреть в гугле).
        int g = 1;
        for (int i = 1; i <= 10; i++)
        {
            g = g * i;
        }
        System.out.println(g);

        System.out.println();

    }
}
