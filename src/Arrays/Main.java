package Arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println("//////////////// ARRAYS ////////////////");
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);//append to back of AL
        ints.add(0,13);//append at a certain index in AL
        ints.add(5);
        ints.remove(0);//remove from certain index in AL.
        ints.remove((Object)5);//remove first instance of object.
        ints.indexOf(5);//returns index of first occurrence of certain object.
        ints.lastIndexOf(5);//returns index of last occurrence of certain object.
        ints.size();//returns the number of items.
        ints.toArray();//converts AL to Array.

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
