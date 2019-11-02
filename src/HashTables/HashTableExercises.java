package HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {
    //Exercise 1: Find the most repeated element in an array of integers. What is the time complexity of this method?
    // (A variation of this exercise is finding the most repeated word in a sentence. The algorithm is the same.
    // Here we use an array of numbers for simplicity.)  Input: [1, 2, 2, 3, 3, 3, 4] Output: 3
    public int mostFrequent(int[] arr){
        Map<Integer, Integer> hashmap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (var item: arr){
            if (!hashmap.containsKey(item)){
                hashmap.put(item, 1);
                continue;
            }
            var value = hashmap.get(item);
            hashmap.put(item, ++value);
        }

        for(var item: hashmap.entrySet()){
            if(item.getValue() > max){
                max = item.getKey();
            }
        }
        return max;
    }
}
