package Queues;

import java.util.Arrays;

public class PriorityQueue {
    // PriorityQueue
    // insert(2)
    // [1, 2, 3, 3, 5, 7]

    private int[] backstore;
    private int count = 0;

    public PriorityQueue(int capacity){
        backstore = new int[capacity];
    }

    public void add(int element){
        // When we've reached capacity of the backstore we double the initial size,
        //  and keep doubling whenever we reach capacity.
        if (isFull()){
             int[]temp = new int[backstore.length * 2];
             for(int i = 0; i < backstore.length; i++){
                 temp[i] = backstore[i];
             }
             backstore = temp;
        }
        var i = shiftItemsToInsert(element);
        backstore[i] = element;
        ++count;
    }

    // return the last element in our queue, i.e the highest element.
    public int remove(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        // we decrement the count and then return the element at that index because count start to count
        // our elements at 1 and so we need n-1 to get the last element in our backstore.
        return backstore[--count];
    }

    public int shiftItemsToInsert(int element){
        int i;
        // we're starting out iteration at the index of the first element in the backstore(count - 1).
        for(i = count - 1; i >= 0; i--){
            // if the current element is greater than the element we're trying to insert than we move that current
            // element up one index and check the next one towards the front.
            if (backstore[i] > element){
                backstore[i + 1] = backstore[i];
            }
            // if the current element is less than or equal to the element we're trying to insert than
            // we insert the element at the position the previous number was at.
            else{
                break;
            }
        }
        return i + 1;
    }

    // returns true if our priority queue is empty, ow returns false.
    public boolean isEmpty(){
        return count == 0;
    }

    // returns true if our priority queue is full, ow returns false;
    public boolean isFull(){
        return count == backstore.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(backstore);
    }

    /////////////EXERCISES/////////////
    // Ex 1: Given an integer K and a queue of integers, write code to reverse the order
    //       of the first K elements of the queue.
    // i.e. Input: Q = [10, 20, 30, 40, 50], K = 3
    //      Output: Q = [30, 20, 10, 40, 50
    public void reverseFirstKElements(int k){
        int i = 0;
        int j = k - 1;
        while(i < j){
            int temp = backstore[i];
            backstore[i] = backstore[j];
            backstore[j] = temp;
            ++i;
            --j;
        }
        System.out.println(toString());
    }



}
