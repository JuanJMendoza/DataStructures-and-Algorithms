package Trees;

public class Main {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(13);
        tree.insert(3);
        tree.insert(21);
        tree.insert(1);
        tree.insert(5);
        System.out.println("Finished!");

        System.out.println(tree.find(5));
        System.out.println(tree.find(0));
        System.out.println(tree.find(21));

        System.out.println("\nPreOrder Traversal");
        tree.traversePreOrder();

        System.out.println("\nInOrder Traversal");
        tree.traverseInOrder();

        System.out.println("\nPostOrder Traversal");
        tree.traversePostOrder();

        System.out.println("\nThe height of the Tree is " + tree.height());

        Tree testBST = new Tree();
        System.out.println("\nThe height of the Tree is " + testBST.height());

        testBST.insert(513);
        System.out.println("\nThe height of the Tree is " + testBST.height());
        testBST.insert(-32);
        testBST.insert(0);
        testBST.insert(2);
        testBST.insert(32);

        System.out.println("\nThe minimum value of this tree is " + tree.minValue());
        System.out.println("\nThe height value of this tree is " + testBST.height());
        System.out.println("\nThe minimum value of this tree is " + testBST.minValueOfBST());

        Tree tree2 = new Tree();
        tree2.insert(13);
        tree2.insert(3);
        tree2.insert(21);
        tree2.insert(1);
        tree2.insert(5);

        Tree tree3 = new Tree();
        System.out.println("\nEquality of tree and tree2 is: " + tree3.equals(tree));

    }

}
