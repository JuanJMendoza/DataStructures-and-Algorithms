package Trees;

public class Tree {
    ///////////////////
    /// Node Class ///
    ///////////////////
    /**
     * private node class with implementation details.
     */
    private class Node{
        // value is a reference to the int type value the node will hold.
        private int value;
        // leftChild is a reference to the left node child of this particular node.
        private Node leftChild;
        // rightChild is a reference to the right node child of this particular node.
        private Node rightChild;

        /**
         * This is a public Node constructor, allowing us to instantiate a Node object with a int value parameter.
         * @param value is the value this particular node will hold.
         */
        public Node(int value){
            this.value = value;
        }

        // overrode the toString method in the Node class so Node values would convey better in the debugger.
        @Override
        public String toString(){
            return "Node = " + this.value;
        }

    }
    // root is a reference to the starting node in the tree class.
    private Node root;

    /**
     * @param value is the value we are trying to insert into the Tree.
     */
    public void insert(int value){
        // if root is null then this means there are no nodes in out Tree object.
        if(root == null){
            // we can give the root the value we're trying to insert.
            root = new Node(value);
            // we immediately break out of the function so the rest of the function does not execute.
            return;
        }

        // getting here means there is an existing root in out Tree, so we reference to the root with a
        // variable with a more discerning name for us to navigate through the Tree.
        Node current = root;

        // Until we break out of the while loop manually from inside the loop after inserting.
        while(true){
            // if value is less then the current node's value we know we should go down the left subtree.
            if(value < current.value){
                // we check if the left subtree is empty, if so we know to insert a new node with value as its value
                if(current.leftChild == null){
                    // we insert a new node and make it the current node's left child w/ the input value as its value.
                    current.leftChild = new Node(value);
                    // we break out the loop.
                    break;
                }
                // if the left subtree wasn't empty then we traverse down the left subtree and make the current node
                // equal to the current node's left child.
                current = current.leftChild;
            }
            // otherwise, the value is larger then the current node's value.
            else if(value > current.value){
                // if the right subtree is empty, if so we know to insert a new node w/ the input value as its value.
                if(current.rightChild == null) {
                    // we insert a new node and make it the current node's right child w/ the input value as its value.
                    current.rightChild = new Node(value);
                    // we break out the loop.
                    break;
                }
                // if the right subtree wasn't empty then we traverse down the right subtree and make the current node
                // equal to the current node's left child.
                current = current.rightChild;
            }
        }
    }

    /**
     * @param value parameter is the value we're searching for in out Tree.
     * @return returns a boolean which will convey whether the value is found in the Tree or not.
     */
    public boolean find(int value){
        Node current = root;

        // until we've found the node with our corresponding value, or we traversed down to a null child,
        // we will continue to traverse down the tree.
        while (current != null){
            // if the value we're looking for is less than the current node's value, check if its left child is valid
            if(value < current.value){
                // if there is a left child we make current equal to current node's left child.
                current = current.leftChild;
            }
            // if the value we're looking for is greater than the current node's value, check if its right child is valid
            else if (value > current.value){
                // if there is a right child we make current equal to current node's right child.
                current = current.rightChild;
            }
            else { // if we get to this case, then we've found the node in our tree with the value we were looking for
                // and we return true.
                return true;
            }
        }
        // we exited the loop b/c we traversed past a leaf to a null child, or the root was null, and return false.
        return false;
    }

    /**
     * Recursive method to traverse tree in preOrder traversal(root, left, right).
     */
    public void traversePreOrder(){
        // call to private recursive method.
        traversePreOrder(root);
    }

    /**
     * Recursive method to traverse tree in preOrder traversal(root, left, right).
     * @param root is the root node of the tree.
     */
    private void traversePreOrder(Node root) {
        // Base case: we check to see if we're at a leaf, hence if we go down a leaf's 'child' we will get a null.
        if (root == null) {
            return;
        }
        // print the current node's value on the console.
        System.out.println(root);
        // this function calls itself on its left child until we get to the base case.
        traversePreOrder(root.leftChild);
        // this function calls itself on its right child until we get to the base case.
        traversePreOrder(root.rightChild);
    }
}
