package Queues;

import java.util.Arrays;

public class LinkedListQueue {
    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int val){
            this.value =  val;
        }
    }
    Node head;
    Node tail;
    int count = 0;

    public void enqueue(int element){
        Node node = new Node(element);

        if(tail == null){
         head = node;
         tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        ++count;
    }

    public int dequeue(){
        int pop = head.value;
        head = head.next;
        --count;
        return pop;
    }

    public int peek(){
        return head.value;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int[] toArray(){
        int[] retArr = new int[count];
        Node trav = head;
        for(int i = 0; i < count; i++){
            retArr[i] = trav.value;
            trav = trav.next;
        }
        return retArr;
    }

}
