package com.Main;

import Arrays.Array;

public class Main {
    public static void main(String[] args){
        Array numbers = new Array(5);
        numbers.print();

        System.out.println("----------------");

        numbers.insert(5);
        numbers.insert(10);
        numbers.insert(10000);
        numbers.insert(15);
        numbers.insert(20);
        numbers.insert(25);
        numbers.print();

        System.out.println("----------------");

        numbers.removeAt(1);
        numbers.print();

        System.out.println("----------------");

        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.indexOf(20));

        System.out.println("----------------");

        System.out.println(numbers.max());

        System.out.println("----------------");

        Array numbers2 = new Array(5);
        numbers.print();

        numbers2.insert(5);
        numbers2.insert(0);
        numbers2.insert(10000);
        numbers2.insert(1);
        numbers2.insert(20);
        numbers2.insert(2);
        numbers2.insert(235);
        numbers2.print();

        System.out.println("----------------");

        numbers.intersect(numbers2).print();

        System.out.println("----------------");

        System.out.println("numbers: ");
        numbers.print();
        numbers.reverse();
        System.out.println("numbers reversed: ");
        numbers.print();

        System.out.println("----------------");

        numbers.print();

        numbers.insertAt(3, 5);
        numbers.print();

        numbers.insertAt(1,0);
        numbers.print();

        numbers.insertAt(7,3);
        System.out.println("numbers' back store size: " + numbers.getActualSize());
        System.out.println("numbers' size: " + numbers.size());
        numbers.print();
    }
}
