package Queues;

import java.util.Arrays;
import java.util.Queue;

public class ArrayQueue {
    //enqueue, dequeue, peek, isEmpty, isFull
    //Array based
    private int[] backstore;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue(int capacity){
        backstore = new int[capacity];
    }

    public void enqueue(int val){
        // if count == backstore.length then we're at our capacity.
        if(count == backstore.length){
            throw new IllegalStateException();
        }
        // assign backstore[rear] the val then increment after execution.
        backstore[rear] = val;
        rear = (rear + 1) % backstore.length;
        count++;
    }

    public int dequeue(){
        // if count == 0 than this means the queue is empty and there is nothing to remove.
        if(count == 0){
            throw new IllegalStateException();
        }
        int item = backstore[front];
        // assign backstore[front] = 0 and move pointer to the next index.
        backstore[front] = 0;
        front = (front + 1) % backstore.length;
        count--;
        return item;
    }

    // Shows element at the front of the queue.
    public int peek(){
        return backstore[front];
    }

    // if count == 0 return True, else Return false;
    public boolean isEmpty(){
        return count == 0;
    }

    // if rear == length of back store (n) then rear is out of bounds-- meaning there's no room to enqueue.
    public boolean isFull(){
        return rear == backstore.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(backstore);
    }
}
