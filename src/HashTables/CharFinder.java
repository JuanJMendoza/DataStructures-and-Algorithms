package HashTables;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char firstNonRepeatingCharacter(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toLowerCase().toCharArray();

        for(int i = 0; i < sArr.length; i++){
            if (!map.containsKey(sArr[i])){
                map.put(sArr[i],1);
            }
            else{
                map.put(sArr[i], map.get(sArr[i]) + 1);
            }
        }

        for(char ch : sArr){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
