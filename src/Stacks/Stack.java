package Stacks;

import java.util.Arrays;

public class Stack {

    // Arbitrary starting point for array space initialization.
    private int[] items = new int[5];
    private int count = 0;

    public void push(int k){
        // Throws a StackOverflowError exception if we reach our Stack's data store capacity.
        if (count == items.length){
            throw new StackOverflowError();
        }
        items[count++] = k;
        }
    public int pop(){
        // Throws a IllegalStateException exception if there is nothing to pop from our Stack.
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public int peek(){
        // Throws a IllegalStateException exception if there is nothing to peek from our Stack.
        if(count == 0){
            throw new IllegalStateException();
        }
        return items[count - 1];
        }

    // Boolean method which returns whether our stack is empty or not.
    public boolean isEmpty(){
            return count == 0;
        }

    @Override
    public String toString(){
        // Prints from index 0 to count since we only want to show what we actually have and not the extra space.
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

}


