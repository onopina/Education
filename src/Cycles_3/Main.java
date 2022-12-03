package Cycles_3;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20 * 2; i = i + 2)
        {
            System.out.println(i);
        }

        System.out.println();                                           	//1



        for (int i = -100; i <= 100; i = i + 2)
        {
            System.out.println(i);
        }

        System.out.println();                                           	//2



        int b = 2;
        for (int i = 0; i < 20; i++)
        {
            System.out.println(b);
            b = b * 2;
        }

        System.out.println();                                           	//3



        for (int i = 0; i <= 100; i++)
        {
            if (i != 4 && i != 13)
            {
                System.out.println(i);
            }
        }

        System.out.println();                                           	//4



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

        System.out.println();                                           	//4.1



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

        System.out.println();                                           	//5



        int m = 2;
        for (int i = 0; i < 10; i++)
        {
            System.out.println(m);
            m = m * 2;
        }

        System.out.println();                                           	//5.1



        for (int i = 10; i >= 0; i = i - 2)
        {
            System.out.println(i);
        }

        System.out.println();                                           	//6



        for (int i = 0; i < 4; i++)
        {
            System.out.println("+++++");
        }

        System.out.println();                                           	//7



        for (int i = 2; i < 10; i++)
        {
            for (int a = 2; a < 10; a++)
            {
                System.out.println(i + " x " + a + " = " + a*i);
            }
            System.out.println();
        }

        System.out.println();                                           	//8



        float c = 100.00f;
        for (int i = 0; i < 10; i++)
        {
            float a = 1.07f;
            System.out.println(c * a);
            c = c * a;
        }

        System.out.println();                                           	//9



        int d = 0;
        for (int i = 0; i <= 100; i++)
        {
            d = d + i;
        }
        System.out.println(d);

        System.out.println();                                           	//10



        int f = 0;
        for (int i = 0; i <= 100; i++)
        {
            if (i % 2 == 0)
                f = f + i;
        }
        System.out.println(f);

        System.out.println();                                           	//11



        int e = 0;
        for (int i = 0; i <= 100; i = i + 2)
        {
            e = e + i;
        }
        System.out.println(e);

        System.out.println();                                           	//12


        int g = 1;
        for (int i = 1; i <= 10; i++)
        {
            g = g * i;
        }
        System.out.println(g);

        System.out.println();                                           	//13



    }
}
