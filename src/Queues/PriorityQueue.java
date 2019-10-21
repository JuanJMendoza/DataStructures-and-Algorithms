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
        if (count == backstore.length){
            // Implement automatic resizing.
        }
        if (count == 0){
            backstore[0] = element;
            ++count;
        }
        else {
            // we're starting out iteration from the back of the array backstore.
            int i = count - 1;
            // while i > -1 b/c when i == 0 we're at the 'last' element, once we pass that we're at -1 and stop.
            while(i > -1){
                // if the current element is greater than the element we're trying to insert than we move that current
                // element up one index and check the next one towards the front.
                if (backstore[i] > element){
                    backstore[i + 1] = backstore[i];
                    --i;
                }
                // if the current element is less than or equal to the element we're trying to insert than
                // we insert the element at the position the previous number was at.
                else{
                    break;
                }
            }
            backstore[i + 1] = element;
            ++count;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(backstore);
    }

}
