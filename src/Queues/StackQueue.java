package Queues;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
    //enqueue, dequeue, peek, isEmpty, isFull
    private Stack<Integer> holder = new Stack();
    private Stack<Integer> reversingMechOutput = new Stack();


    public void enqueue(int val){
        holder.push(val);
    }


    public int dequeue(){
        // if the queue is empty then there is nothing to dequeue and we throw an exception.
        if(holder.isEmpty()){
            throw new IllegalStateException();
        }

        TransferElementsFromStack1ToStack2();

        return reversingMechOutput.pop();
    }

    // shows the top element in the queue.
    public int peek(){
        // if the queue is empty then there is nothing to dequeue and we throw an exception.
        if(holder.isEmpty()){
            throw new IllegalStateException();
        }

        TransferElementsFromStack1ToStack2();

        return reversingMechOutput.peek();
    }

    private void TransferElementsFromStack1ToStack2() {
        if (reversingMechOutput.isEmpty()) {
            // reverses element dequeueing ordering of holder so we can pop element at the front.
            while (!holder.isEmpty()) {
                reversingMechOutput.push(holder.pop());
            }
        }
    }

}
