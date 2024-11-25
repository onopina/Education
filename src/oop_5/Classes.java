package oop_5;

public class Classes {

    public static void main(String[] args) {

        //1.	Написать класс Человек: определить три поля, один метод
        // (void, должна происходить только печать на консоль).
        // По аналогии с примером (Manager): создать объект класса Человек, вызвать метод.
        Person person = new Person();
        person.name = "Kate";
        person.age = 35;
        person.gender = "woman";
        person.introduce();

        System.out.println();


        //2.	Написать класс Квадрат: определить возможные поля, один метод (void).
        // В методе вывести на консоль описание (характеристики) квадрата.
        // Создать два объекта класса Квадрат (два разных объекта). Вывести для обоих объектов метод.
        Square square = new Square();
        square.sideLength = 4;
        square.color = "green";
        square.parameters();

        Square square1 = new Square();
        square1.sideLength = 5;
        square1.color = "red";
        square1.parameters();

        System.out.println();


        //3.	Написать класс Телефон: определить 3 поля, два метода (void). Создать объект. Вызвать два метода.
        Phone phone = new Phone();
        phone.brand = "Sony Ericsson";
        phone.model = "K790i";
        phone.price = 249.90;
        phone.modelPhone();
        phone.pricePhone();

        System.out.println();


        //4.	В класс телефон добавить метод: String getMyNumber() {}.
        // Метод возвращает номер телефона: return “+79999999”.
        // Попробовать сохранить результат выполнения (вызова) метода в переменную.
        phone.number = "+79181082310";
        String phoneNumber = phone.getMyNumber();
        System.out.println("The phone number is " + phoneNumber);

        System.out.println();


        //ООП.
        //1.	Создать класс Person. Определить его поля: имя, фамилия, возраст.
        //2.	Добавить конструктор для задания трех полей сразу (при создании объекта).
        //3.	Создать объект класса Person. Вывести на консоль все его поля.
        //4.	Добавить в класс Person метод (void), который просто выводит на консоль все поля объекта
        // (имя, возраст, фамилия).
        //5.	Добавить еще два метода: сходить в магазин, сделать работу (void).
        // Эти методы просто печатают на консоль то, что сделал человек (сходил в магазин, сделал работу).
        Person1 person1 = new Person1("Max", "Weber", 18);     //5.1.3
        person1.introduce();                                            //5.1.4
        person1.goShop();                                               //5.1.5
        person1.doJob();

        System.out.println();


        //Часть 2:
        //1.	Создать класс Calculator. Добавить два поля: num1, num2.
        //2.	Для задания num1 и num2 использовать конструктор.
        //3.	Добавить метод add(). Он должен возвращать результат сложения num1 и num2 (не void).
        //4.	Создать объект класса калькулятор. Вызвать метод add(), сохранив результат работы метода.
        // Вывести на консоль.
        //5.	Добавить аналогично еще 3 метода: (sub, mul, div – вычитание, умножение, деление).
        // Протестировать работу методов, удостовериться, что все работает правильно.
        //6.	В методе div добавить проверку: нельзя делить на ноль.
        // Если происходит деление на ноль, то возвращать Infinity или NaN.
        //7.	Добавить в калькулятор метод для вычисления факториала для поля num1 (возвращает факториал num1).
        Calculator calc = new Calculator(10, 5);                        //5.2.4
        double add = calc.add();
        System.out.println(add);                                        //5.2.4
        double sub = calc.sub();
        System.out.println(sub);
        double mul = calc.mul();
        System.out.println(mul);
        double div = calc.div();
        System.out.println(div);                                        //5.2.5
        double fact = calc.factorial();
        System.out.println(fact);                                       //5.2.7

    }
}

class Person {
    String name;
    int age;
    String gender;

    void introduce() {
        System.out.println(name + " is " + age + "-years-old " + gender);
    }
}                                                                          //5.1

class Square {
    int sideLength;
    String color;

    void parameters() {
        int perimeter = sideLength*4;
        int area = sideLength*sideLength;
        System.out.println("The perimeter of the " + color + " square is " + perimeter + ", the area is " + area);
    }
}                                                                          //5.2

class Phone {
    String brand;
    String model;
    double price;
    String number;

    void modelPhone() {
        System.out.println("The model of the phone is " + brand + " " + model);
    }

    void pricePhone() {
        System.out.println("The price of the phone is $" + price);
    }

    String getMyNumber() {
        return number;
    }
}                                                                          //5.3, 5.4

class Person1 {                                                            //5.1.1
    String name;
    String lastName;
    int age;

    public Person1(String n, String l, int a){                              //5.1.2
        name = n;
        lastName = l;
        age = a;
        System.out.println(n + " " + l + " " + a);                          //5.1.3
    }

    void introduce() {
        System.out.println(name + " " + lastName + " " + age);              //5.1.4
    }
    void goShop() {
        System.out.println("The person went to shop");                      //5.1.5
    }
    void doJob() {
        System.out.println("The person did the job");
    }
}

class Calculator {
    int num1;
    double num2;                                                               //5.2.1

    public Calculator(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }                                                                       //5.2.2

    double add(){
        double add = num1 + num2;
        return add;
    }                                                                       //5.2.3
    double sub(){
        double sub = num1 - num2;
        return sub;
    }
    double mul(){
        double mul = num1 * num2;
        return mul;
    }
    double div(){
        double div = 0;
        if (num2!=0) {
            div = num1/num2;
        }
        return div;
    }                                                                       //5.2.5, 5.2.6

    double factorial(){
        double fact = 1;
        for (int i = 1; i <= num1; i++)
        {
            fact = fact * i;
        }
        return fact;
    }                                                                       //5.2.7
}


