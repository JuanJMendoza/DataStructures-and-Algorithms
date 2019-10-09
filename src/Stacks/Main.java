package Stacks;

public class Main {
    public static void main(String[] args){
        String example = "Felix the Cat";
        StringBuffer reversedString = StringReverser.reverse(example);
        System.out.println(reversedString);

        String example2 = "(1+2)";
        System.out.println(Expression.isBalanced(example2));
        String example3 = ")1+2(";
        System.out.println(Expression.isBalanced(example3));
        String example4 = "(<1+2>)";
        System.out.println(Expression.isBalanced(example4));
        String example5 = "(<1+2)";
        System.out.println(Expression.isBalanced(example5));
    }
}
