package AVLTree;

public class AVLTree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        // private height field for node class to hold its height in the tree.
        private int height;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Value=" + this.value;
        }

    }

    private Node root;

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node root, int value){
        if(root == null){ // base case: if root s
            return new Node(value);
        }
        if(value < root.value){
            root.leftChild  = insert(root.leftChild, value);
        }
        else if(value > root.value){
            root.rightChild = insert(root.rightChild, value);
        }
        // set the current node's height.
        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
        return root;
    }

    private int height(Node node){
        return (node == null) ? -1 : node.height;
    }



}
