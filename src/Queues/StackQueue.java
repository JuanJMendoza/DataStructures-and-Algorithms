package Queues;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    //enqueue, dequeue, peek, isEmpty, isFull
    private Stack holder = new Stack();
    private Stack reversingMechOutput = new Stack();


    public void enqueue(int val){
        holder.push(val);
    }


    public int dequeue(){
        int front;

        // if the queue is empty then there is nothing to dequeue and we throw an exception.
        if(holder.isEmpty()){
            throw new IllegalStateException();
        }

        // reverses element dequeueing ordering of holder so we can pop element at the front.
        while(!holder.isEmpty()){
            reversingMechOutput.push(holder.pop());
        }

        // stores front element inside of the variable front.
        front = (int) reversingMechOutput.pop();

        // reverses the ordering back into holder so when we enqueue it gets added to the back and keeps proper
        // ordering when we dequeue again.
        while(!reversingMechOutput.isEmpty()){
            holder.push(reversingMechOutput.pop());
        }

        return front;
    }

    // shows the top element in the queue.
    public int peek(){
        int peek;
        // if the queue is empty then there is nothing to peek and we throw an exception.
        if(holder.isEmpty()){
            throw new IllegalStateException();
        }

        while(!holder.isEmpty()){
            reversingMechOutput.push(holder.pop());
        }

        peek = (int) reversingMechOutput.peek();

        while(!reversingMechOutput.isEmpty()){
            holder.push(reversingMechOutput.pop());
        }
        return peek;
    }



}
