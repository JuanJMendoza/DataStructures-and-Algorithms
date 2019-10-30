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



}
