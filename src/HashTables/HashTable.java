package HashTables;

import java.util.LinkedList;

public class HashTable {
    // put(k, v)
    // get(k): v
    // remove(k)
    // k: int
    // v: string
    // Collisions: chaining
    // LinkedList<Entry>
    // [ LL, LL, LL, LL,LL ]
    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private int count = 0;

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        // Hashes the key and outputs the index to which we're going to insert out element
        // in our array.
        var index = hash(key);

        // If there is nothing at this particular index, initialize that place in the array
        // with a linked list.
        if(entries[index] == null){
            entries[index] = new LinkedList<>();
        }

        // Bucket holds the linked list at the particular index of our storing array.
        var bucket = entries[index];

        // We scan the bucket to see if there exists an entry with the same key[continued in if statement]
        for (var entry : bucket){
            // [continued exp.] If so we get that entry with the matching key and replace its
            // current value with the new incoming one.
            if(entry.key == key){
                entry.value = value;
                // ends entire method.
                return;
            }
        }

        // If we get to this point, this means we didn't find an entry with the same key in our bucket.
        // We then create a new Entry object for the given key and value and add it to the end of the
        // Linked list at the particular index of out storing array (bucket).
        var entry = new Entry(key, value);
        bucket.addLast(entry);
    }

    // Hash function to convert key into a valid index based on the size of our array store.
    private int hash(int key) {
        return key % entries.length;
    }

}
