package HashTables;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
    public char firstDuplicate(String s){
        Set<Character> set = new HashSet<>();

        for(var ch : s.toLowerCase().toCharArray()){
            if (!set.contains(ch)){
                set.add(ch);
            }
            else{
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}
