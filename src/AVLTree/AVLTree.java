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
        setHeight(root);

        root = balance(root);

        return root;
    }

    private Node balance(Node root){
        //Figuring out if the current node is a balanced subtree.
        if(isLeftHeavy(root)){
            if(balanceFactor(root.leftChild) < 0){
                root.leftChild = rotateLeft(root.leftChild);
            }
            return rotateRight(root);
        }
        else if(isRightHeavy(root)){
            if(balanceFactor(root.rightChild) > 0){
                root.rightChild = rotateRight(root.rightChild);
            }
            return rotateLeft(root);
        }
        //if we get here then out root is balanced.
        return root;
    }

    private Node rotateLeft(Node root){
        //make current root's right child the new root.
        Node newRoot = root.rightChild;
        //take the new root's left child's the right child of the old root.
        root.rightChild = newRoot.leftChild;
        //make the new root's left child the old root.
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private Node rotateRight(Node root){
        //make current root's right child the new root.
        Node newRoot = root.leftChild;
        //take the new root's left child's the right child of the old root.
        root.leftChild = newRoot.rightChild;
        //make the new root's left child the old root.
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(Node node){
        node.height = Math.max(height(node.leftChild), height(node.rightChild)) + 1;

    }
    private boolean isLeftHeavy(Node node){
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(Node node){
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(Node node){
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }
    private int height(Node node){
        return (node == null) ? -1 : node.height;
    }



}
