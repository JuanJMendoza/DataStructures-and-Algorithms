package HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        CharFinder finder = new CharFinder();
        String randS = "A Green Apple";

        System.out.println(finder.firstNonRepeatingCharacter(randS));

        //////////////////////////////////
        DuplicateFinder dFinder = new DuplicateFinder();
        System.out.println(dFinder.firstDuplicate(randS));

    }


}
