package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        CharFinder finder = new CharFinder();
        String randS = "A Green Apple";

        System.out.println(finder.firstNonRepeatingCharacter(randS));

        ///////////////////////////////////////////////////////
        DuplicateFinder dFinder = new DuplicateFinder();
        System.out.println(dFinder.firstDuplicate(randS));

        ///////////////////////////////////////////////////////
        HashTable table = new HashTable();
        table.put(6, "A"); // 1
        table.put(8, "B"); // 3
        table.put(11, "C"); // 1
        table.put(6, "A+");
//        table.remove(6);
//        table.remove(6);
        System.out.println(table.get(6));

        ///////////////////////////////////////////////////////
        System.out.println("////////////Exercises////////////");
        HashTableExercises sol = new HashTableExercises();
        int[] ex = {1, 2, 2, 3, 3, 3, 4};

        var output = sol.mostFrequent(ex);

        System.out.println(output);

    }

}
