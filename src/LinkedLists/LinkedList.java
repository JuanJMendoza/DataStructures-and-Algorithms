package LinkedLists;


import java.lang.reflect.Constructor;

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
            throw new IllegalArgumentException();
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
            // Decrement count of nodes in LL.
            --count;
        }
    }


    /**
     * deletes the last node from the linked list and makes the second to last node the new tail.
     */
    public void deleteLast(){
        if(isEmpty()){
            // If LL is empty throw exception.
            throw new IllegalArgumentException();
        }
        else if(count == 1){
            // If LL has only one node make both head and tail null.
            first = null;
            last = null;
        }
        else{
            // Make temp node to hold the upcoming new head.
            Node traverse = first;

            // Traverse through LL until we get to second to last node.
            while (traverse.next != null){
                traverse = traverse.next;

                // When we get to second to last node we swap tail to point to traverse, and null out traverse.
                if(traverse.next.next == null){
                    last = traverse;
                    last.next = null;
                    // Make temp point to null so garbage collection can free memory up.
                    traverse = null;
                    // Decrement count of nodes in LL.
                    --count;
                    break;
                }
            }
        }
    }


    /**
     * @param val is the value's index we're looking for in our Linked List.
     * @return returns the first instance of val's correspoinding index in out Linked List,
     * returns -1 if val is not in out Linked list.
     */
    public int indexOf(int val){


        return -1;
    }

}




