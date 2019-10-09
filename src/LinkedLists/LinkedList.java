package LinkedLists;


import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    // Inner Node class
    private class Node{
        // Value the node will hold.
        private int value;

        // Reference to the next node.
        private Node next;

        // Node constructor to take in a value on initialization.
        public Node(int data){
            this.value = data;
        }


    }

    // Reference to the head of the Linked List.
    private Node first;

    // Reference to the tail of the Linked List.
    private Node last;

    // Keeps track of the number of nodes in out Linked List.
    private int count = 0;


    // Implement addFirst, addLast, deleteFirst, deleteLast, contains, indexOf

    /**
     * @param val is the value we want to add to the front of our Linked List.
     */
    public void addFirst(int val){
        // Creates a new node and pass in the value we want to add at the head of out Linked List.
        Node newNode = new Node(val);

        // Check if the Linked List is empty.
        if(isEmpty()){
            // Make newNode be the head of our Linked List.
            first = newNode;

            // Since the Linked List is empty, there DNE a tail, so we make newNode the tail as well.
            last = newNode;
        }
        else{
            // Make newNode's next node be the current head of our Linked List.
            newNode.next = first;

            // Make newNode be the head of our Linked List.
            first = newNode;

        }

        // Increment the number of nodes in our Linked List.
        ++count;
    }


    /**
     * @param val is the value we want to add to the end of our Linked List.
     */
    public void addLast(int val){
        // Creates a new node and pass in the value we want to add at the head of out Linked List.
        Node newNode = new Node(val);

        // Check to see if Linked List is empty.
        if(isEmpty()){
            // Make newNode be the head of our Linked List.
            first = newNode;
            // Make newNode be the tail of our Linked List.
            last = newNode;
        }
        else{
            // Make the current tail's next node point to newNode.
            last.next = newNode;

            // Make newNode the new tail.
            last = newNode;
        }

        // Increment the number of nodes in our Linked List.
        ++count;
    }


    /**
     * @return True if the head of our Linked List is null, else returns False.
     */
    public boolean isEmpty(){
        return first == null;
    }


    /**
     * deletes the first node from the linked list and makes the consecutive node the head.
     */
    public void deleteFirst(){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new NoSuchElementException();
        }
        // If LL has only one node make both head and tail null.
        else if(count == 1) {
            first = null;
            last = null;
        }
        else{
            // Make temp node to hold the upcoming new head.
            Node temp = first.next;
            // Make current head's next null so garbage collection can take it one we reallocate first.
            first.next = null;
            // Make head point to what temp is pointing to which is the new head, prev head's next.
            first = temp;
            // Make temp point to null so garbage collection can free memory up.
            temp = null;
        }
        // Decrement count of nodes in LL.
        --count;
    }


    /**
     * deletes the last node from the linked list and makes the second to last node the new tail.
     */
    public void deleteLast(){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new NoSuchElementException();
        }
        else if(count == 1){
            // If LL has only one node make both head and tail null.
            first = null;
            last = null;
        }
        else{
//            // Make temp node to hold the upcoming new head.
//            Node traverse = first;
//
//            // Traverse through LL until we get to second to last node.
//            while (traverse.next != null){
//                traverse = traverse.next;
//
//                // When we get to second to last node we swap tail to point to traverse, and null out traverse.
//                if(traverse.next.next == null){
//                    last = traverse;
//                    last.next = null;
//                    // Make temp point to null so garbage collection can free memory up.
//                    traverse = null;
//                    // Decrement count of nodes in LL.
//                    --count;
//                    break;
//                }
//            }
            // previous holds the previous node to the node passed into getPrevious.
            Node previous = getPrevious(last);
            // point last to previous to make it the new tail.
            last = previous;
            // make last's next null so garbage collection can take care of the node we want to delete.
            last.next = null;
        }
        // Decrement count of nodes in LL.
        --count;
    }


    /**
     * @param val is the value's index we're looking for in our Linked List to remove.
     */
    public void remove(int val){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new NoSuchElementException();
        }
        else if(count == 1){
            // If LL has only one node make both head and tail null.
            first = null;
            last = null;
        }
        // pointer traversing through the linked list.
        Node traverse = first;
        // reference to point to the Node behind the traversing Node.
        Node prev = traverse;

        // while we're still pointing to a valid node.
        while (traverse != null){
            // if the current node's value doesn't equal val we continue traversing.
            if (traverse.value != val){
                // make prev point to the current node we're at with traverse.
                prev = traverse;
                // make traverse point to the next node in the linked list.
                traverse = traverse.next;
            }
            else{
                /*
                 when we find the node who's value matches val, we make the node prev is
                 currently pointing to's next to point to the node traverse's next is pointing
                 to.
                 */
                prev.next = traverse.next;
                // we then make traverse's next point to null.
                traverse.next = null;
                /*
                 then we make  traverse point to null to allow garbage collection take
                 the rouge Node.
                 */
                traverse = null;

            }
        }
        // Decrement count of nodes in LL.
        --count;
    }


    /**
     * @param val is the value's index we're looking for in our Linked List.
     * @return returns the first instance of val's correspoinding index in out Linked List,
     * returns -1 if val is not in out Linked list.
     */
    public int indexOf(int val){
        // if the current node's value doesn't equal val we continue traversing.
        Node traverse = first;
        // index we're going to return which corresponds to where the node holding val is in the LL.
        int index = 0;

        // while we're still pointing to a valid node.
        while(traverse != null){
            // if the current node's value doesn't equal val we continue traversing.
            if(traverse.value != val){
                // make traverse point to the next node.
                traverse = traverse.next;
                // we increment index.
                ++index;
            }
            else{
                // if we find val, we return index.
                return index;
            }
        }
        // return -1 if we exit out the while loop without having found the node holding val.
        return -1;
    }


    /**
     * @return the # of nodes in the Linked List.
     */
    public int size(){ return count; }


    /**
     * @param val is the value we're looking for in our linked list.
     * @return true if val exists in our linked list, return false if otherwise.
     */
    public boolean contains(int val){
        // if indexOf(val) returns a valid index, return true because it exists.
        if(indexOf(val) != -1){
            return true;
        }
        // return false if indexOf(val) returns -1 meaning it doesn't exist in our linked list.
        return false;
    }


    /**
     * @param node is the node the comes after the node we're looking for.
     * @return returns the node before the node being passed in.
     */
    private Node getPrevious(Node node){
        if(first == null || first.next == null){
            return null;
        }
        Node current = first;
        while(current != null){
            if(current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int[] toArray(){
        int[] arr = new int[count];

        Node current = first;
        int i = 0;
        while (current != null){
            arr[i] = current.value;
            current = current.next;
            ++i;
        }
        return arr;


    }


    /**
     * Reverses linked list makes tail the new head, and the previous head the new tail.
     */
    public void reverse(){
        if(isEmpty()) return;

        Node current = first;
        Node prev = null;
        Node next;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        last = first;
        first = prev;
    }


    /**
     * @param k is the kth node from the tail in our linked list.
     * @return returns the kth value from the kth node from the tail from out linked list.
     */
    public int getKthNodeFromTheEnd(int k){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new IllegalStateException();
        }
        else if(count < k || k < 1){
            // Validates k.
            throw new IllegalArgumentException();
        }
        Node detectTail = first;
        Node kthNodeFromEnd = first;

        int i = 1;
        while(detectTail != last){
            // While detectTail hasn't gotten to the tail continue until we do so.
            detectTail = detectTail.next;
            // When detectTail gets k-1 nodes away from the head begin traversing kthNodeFromEnd pointer.
            if(i >= k){
                kthNodeFromEnd = kthNodeFromEnd.next;
            }
            // increment i to keep track of detectTail being k-1 nodes away from head.
            ++i;
        }

        // return the kth value in the kth node from the tail.
        return kthNodeFromEnd.value;
    }


    /**
     * Prints the linked list onto the console.
     */
    public void print(){
        if(!isEmpty()){
            int[] retArr = this.toArray();
            System.out.println(Arrays.toString(retArr));
        }
        else {
            System.out.println("Linked List is empty!");
        }
    }

    /**
     * Prints the middle elements of a linked list.
     * If the size of the linked list is even, it prints 2 elements.
     * Otherwise, prints 1 element.
     */
    public void printMiddle(){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new IllegalStateException();
        }

        Node current = first;
        int mid = count / 2;

        // if there is an odd number of elements in out linked list.
        if(count % 2 != 0){
             for(int i = 0; i < mid; i++){
                 current = current.next;
             }
             System.out.println("The middle element is: " + current.value);
        }

        else{
            for(int i = 0; i < mid; i++){
                current = current.next;
            }
            System.out.println("The middle elements are: " + getPrevious(current).value + " and " + current.value);
        }
    }

    /**
     * @return true if linked list contains a loop, else returns false.
     */
    public boolean hasLoop(){
        Node slow = first;
        Node fast = first;
        // if there is no loop in the linked list, at the speed fast is going, depending on
        // whether the linked list is odd or even sized, fast or fast.next will == null
        // thereby halting the while loop and return false.
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // if there is a loop, fast will catch up to slow and we will return true.
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    /**
     * @return a linked list that contains a loop.
     */
    public static LinkedList createWithLoop(){
        var list = new LinkedList();
        list.addLast(32);
        list.addLast(4);
        list.addLast(1);

        // get reference to a node in the middle
        var node = list.last;

        list.addLast(7);
        list.addLast(9);

        // loop tail to mid node.
        list.last.next = node;

        return list;
    }

}
