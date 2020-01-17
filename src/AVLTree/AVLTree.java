package AVLTree;

public class AVLTree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value){
        Node node = new Node(value);
        insert(root, node);
    }

    private void insert(Node root, Node node){
        if(node.value < root.value && root.leftChild == null){
            root.leftChild = node;
            return;
        }
        else if(node.value > root.value && root.rightChild == null){
            root.rightChild = node;
            return;
        }
        if(node.value < root.value){
            insert(root.leftChild, node);
        }
        else if(node.value > root.rightChild.value){
            insert(root.rightChild, node);
        }
        return;
    }
}
