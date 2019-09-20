package com.Main;

import Arrays.Array;
import LinkedLists.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    //////////////// ARRAYS ////////////////
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

    //////////////// LINKED LISTS ////////////////
        System.out.println("\n//////////////// LINKED LISTS ////////////////\n");
                // Can specify a particular type of object for LL to store
        java.util.LinkedList<Integer> numList = new java.util.LinkedList();
        // OR we don't specify a type and out LL can store a mix of objects.
        java.util.LinkedList list = new java.util.LinkedList();
        list.addFirst(10);//adds given Obj at the head of the LL.
        list.addLast(30);//adds given Obj at the tail of the LL.
        list.add(13);//adds given Obj at the end of the LL.
        list.add(0,1);//adds give Obj at the given index.
        list.removeFirst();//removes and returns the first Obj in LL.
        list.removeLast();//removes and returns the Obj at the tail of LL.
        list.removeLastOccurrence(13);//removes the last occurrence of the given Obj in LL.
        list.removeFirstOccurrence(5);//removes the first occurrence of the given Obj in LL.
        list.remove(0);//removes Obj in given index from LL. Return removed El.
        list.remove((Object) 9);//removes given Obj from LL, return true if done else false.
        list.contains(7);//returns bool if LL contains Obj.
        list.size();//returns num of items in LL.
        list.indexOf(4);//returns index of first occurrence of Obj or -1 if DNE.
        list.lastIndexOf(5);//returns index of last occurrence of Obj or -1 if DNE
        list.toArray();//converts LL to array
//        String e = list.toString();
//        System.out.println(e);
        System.out.println(list);
        System.out.println("------------------------------------------------");
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(13);
        linkedList.addLast(5);
        linkedList.addLast(3);
        linkedList.addLast(1);
        linkedList.addLast(0);
        //        System.out.println(linkedList.toString().toCharArray());
        linkedList.deleteFirst();
        linkedList.deleteLast();
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(5));
        System.out.println(linkedList.indexOf(13));
        linkedList.remove(3);
        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(5));
        int[] llArr = linkedList.toArray();
        System.out.println(Arrays.toString(llArr));
        linkedList.reverse();
        int[] reversedLL = linkedList.toArray();
        System.out.println(Arrays.toString(reversedLL));



    }
}
