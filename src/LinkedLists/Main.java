package LinkedLists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
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
        linkedList.deleteLast();
        linkedList.deleteFirst();
        int[] llArr = linkedList.toArray();
        System.out.println(Arrays.toString(llArr));
        linkedList.reverse();
        int[] reversedLL = linkedList.toArray();
        System.out.println(Arrays.toString(reversedLL));
        System.out.println("------------------------------------------------");

        linkedList.addLast(13);
        linkedList.addLast(5);
        linkedList.addLast(3);
        linkedList.addLast(1);
        linkedList.addLast(0);

        System.out.println("Original Linked List: " + Arrays.toString(linkedList.toArray()));
        System.out.printf("The 4th node from the end is : " +  + linkedList.getKthNodeFromTheEnd(4) + "\n");
        linkedList.reverse();
        System.out.printf("The 4th node from the end is : " +  + linkedList.getKthNodeFromTheEnd(4) + "\n");
        llArr = linkedList.toArray();
        System.out.println("Reversed Linked List: " + Arrays.toString(llArr));

        linkedList.getKthNodeFromTheEnd(2);

        linkedList.print();
        linkedList.printMiddle();
        linkedList.addLast(21);
        linkedList.print();
        linkedList.printMiddle();

        System.out.println("------------------------------------------------");
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addLast(13);
        linkedList2.addLast(5);
        linkedList2.addLast(3);
        linkedList2.addLast(1);
        linkedList2.hasLoop();
        LinkedList loopedLinkedList = LinkedList.createWithLoop();
        loopedLinkedList.hasLoop();
    }
}
