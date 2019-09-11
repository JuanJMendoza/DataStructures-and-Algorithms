package com.company;

public class Main {
    public static void main(String[] args){
        Array numbers = new Array(5);
        numbers.print();

        System.out.println("----------------");

        numbers.insert(5);
        numbers.insert(10);
        numbers.insert(15);
        numbers.insert(20);
        numbers.insert(25);
        numbers.print();

        System.out.println("----------------");

        numbers.removeAt(1);
        numbers.print();

        System.out.println("----------------");

        numbers.indexOf(2);

        System.out.println("----------------");

        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(20));

    }
}
