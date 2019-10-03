package Stacks;

import java.util.Stack;

public class StringReverser {
    public static StringBuffer reverse(String s){
        Stack<Character> rev = new Stack<>();

        for(char ch : s.toCharArray()){
            rev.push(ch);
        }

//        String reverse = "";
        StringBuffer reverse = new StringBuffer();
        while (!rev.isEmpty()){
            reverse.append(rev.pop());
        }
        return reverse;
    }
}
