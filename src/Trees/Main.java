package Trees;

public class Main {
    public static void main(String[] args) {
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

//        Tree notValidTree = new Tree();

        System.out.println("\nThis Binary Search Tree is valid: " + tree.isValidBST());

//        tree.swapRoot();
        System.out.println("\nThis Binary Search Tree is valid: " + tree.isValidBST());

//        var list = tree2.getNodesAtDistance(2);
//        for (var item : list) {
//            System.out.println(item);
//        }

        Tree tree4 = new Tree();
        tree4.insert(21);
        tree4.insert(13);
        tree4.insert(25);
        tree4.insert(5);
        tree4.insert(14);
        tree4.insert(27);
        tree4.insert(1);

        var list2 = tree4.getNodesAtDistance(2);

        for (var item: list2){
            System.out.println(item);
        }

        System.out.println("\nLevel Order Traversal: ");
        tree4.levelOrderTraversal();

        Tree nullTree = new Tree();
        System.out.println("\nThe size of this tree is: " + nullTree.size());

        System.out.println("\nThis tree has " + tree4.countLeaves() +" leaves.");

        System.out.println("\nThe max value of this tree is: " + tree.max());

        System.out.println("\nDoes this tree contain the number " + 1 + "? " + tree.contains(1));

        System.out.println("\nAre the numbers " + 5 + " and " + 14 + " siblings? " + tree4.areSiblings(5, 14));
        System.out.println("\nAre the numbers " + 5 + " and " + 100 + " siblings? " + tree4.areSiblings(5, 100));

        System.out.println("\nThe ancestors of the node with the value " + 1 + " are: " + tree4.getAncestors(1));
        System.out.println("\nThe ancestors of the node with the value " + 100 + " are: " + tree4.getAncestors(100));

    }
}
