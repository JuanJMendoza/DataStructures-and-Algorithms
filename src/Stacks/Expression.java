package Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private static final List<Character> leftBrackets = Arrays.asList('(', '[', '<', '{');
    private static final List<Character> rightBrackets = Arrays.asList(')', ']', '>', '}');

    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if(isLeft(ch)){
                stack.push(ch);
            }
            else if(isRight(ch)){
                if(stack.isEmpty()){
                    return false;
                }

                var top = stack.pop();
                if(isLeftAndRight(top,ch)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isLeft(char ch){
        return leftBrackets.contains(ch);
    }

    private static boolean isRight(char ch){
        return rightBrackets.contains(ch);
    }

    private static boolean isLeftAndRight(char left, char right){
        return  leftBrackets.indexOf(left) != rightBrackets.indexOf(right);
    }
}
