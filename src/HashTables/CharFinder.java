package HashTables;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char firstNonRepeatingCharacter(String s){
        Map<Character, Integer> map = new HashMap<>();

        // Converts the String s into an array of chars
        char[] sArr = s.toLowerCase().toCharArray();

        for(int i = 0; i < sArr.length; i++){
            // We check if there exists a key in map for each char in sArr. If not we initialize the key as the char,
            // and we initialize its value to 1.
            if (!map.containsKey(sArr[i])){
                map.put(sArr[i],1);
            }
            // Otherwise, we increments the value of the key which corresponds to the current char we're on.
            else{
                map.put(sArr[i], map.get(sArr[i]) + 1);
            }
        }

        // We run a second loop to cross reference the array of chars and the newly formed HashMap.
        for(char ch : sArr){
            // If the current letter's corresponding key in the HashMap has a value of 1 we return it.
            if(map.get(ch) == 1){
                return ch;
            }
        }
        // We return
        return Character.MIN_VALUE;
    }
}
