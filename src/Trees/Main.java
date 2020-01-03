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

    }

}
