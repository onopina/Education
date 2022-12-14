package OOP;

import java.util.Scanner;
import java.util.Arrays;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Kate";
        person.age = 35;
        person.gender = "woman";
        person.introduce();

        System.out.println();                                           //5.0.1

        Square square = new Square();
        square.sideLength = 4;
        square.color = "green";
        square.parameters();

        Square square1 = new Square();
        square1.sideLength = 5;
        square1.color = "red";
        square1.parameters();

        System.out.println();                                           //5.0.2

        Phone phone = new Phone();
        phone.brand = "Sony Ericsson";
        phone.model = "K790i";
        phone.price = 249.90;
        phone.modelPhone();
        phone.pricePhone();

        System.out.println();                                           //5.0.3

        phone.number = "+79181082310";
        String phoneNumber = phone.getMyNumber();
        System.out.println("The phone number is " + phoneNumber);

        System.out.println();                                           //5.0.4


        Person1 person1 = new Person1("Max", "Weber", 18);     //5.1.3
        person1.introduce();                                            //5.1.4
        person1.goShop();                                               //5.1.5
        person1.doJob();

        System.out.println();

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
}                                                                          //5.0.1

class Square {
    int sideLength;
    String color;

    void parameters() {
        int perimeter = sideLength*4;
        int area = sideLength*sideLength;
        System.out.println("The perimeter of the " + color + " square is " + perimeter + ", the area is " + area);
    }
}                                                                          //5.0.2

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
}                                                                          //5.0.3, 5.0.4

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


