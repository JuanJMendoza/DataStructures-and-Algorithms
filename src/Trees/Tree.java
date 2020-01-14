package Trees;

import java.util.ArrayList;

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


    /**
     * Recursive method to traverse tree in inOrder traversal(left, root, right).
     */
    public void traverseInOrder(){
        // call to private recursive method.
        traverseInOrder(root);
    }


    /**
     * Recursive method to traverse tree in inOrder traversal(left, root, right).
     * @param root is the root node of the tree.
     */
    private void traverseInOrder(Node root){
        // Base case: we check to see if we're at a leaf, hence if we go down a leaf's 'child' we will get a null.
        if (root == null){
            return;
        }

        // this function calls itself on its left child until we get to the base case.
        traverseInOrder(root.leftChild);
        // print the current node's value on the console.
        System.out.println(root);
        // this function calls itself on its right child until we get to the base case.
        traverseInOrder(root.rightChild);
    }


    /**
     * Recursive method to traverse tree in postOrder traversal(left, right, root).
     */
    public void traversePostOrder(){
        // call to private recursive method.
        traversePostOrder(root);
    }


    /**
     * Recursive method to traverse tree in postOrder traversal(left, right, root).
     * @param root is the root node of the tree.
     */
    private void traversePostOrder(Node root){
        // Base case: we check to see if we're at a leaf, hence if we go down a leaf's 'child' we will get a null.
        if (root == null){
            return;
        }

        // this function calls itself on its left child until we get to the base case.
        traversePostOrder(root.leftChild);
        // this function calls itself on its right child until we get to the base case.
        traversePostOrder(root.rightChild);
        // print the current node's value on the console.
        System.out.println(root);
    }


    /**
     *  height returns the number of edges in the longest path from leaf to root.
     * @return returns an int value which conveys the height of the tree.
     */
    public int height(){
        // call to private recursive method.
        return height(root);
    }


    /**
     * height returns the number of edges in the longest path from leaf to root.
     * @param root is the node we're traversing from as we're counting down from this particular node.
     * @return returns an int value which conveys the height of the tree.
     */
    private int height(Node root){
        // Base case 1: if root is null return -1.
        if (root == null) {
            return -1;
        }
        // Base case 2: if both children of current node are null then we are on a leaf, so we return 0.
        if (root.leftChild == null && root.rightChild == null){
            return 0;
        }

        // Recursively call height on both left child and right child. When we get a leaf node of left child, we return
        // 0 as per base case 2. Then we recursively call height on right child until we get to base case 2. We do this
        // for both side and once finished for a sub tree, we compare and return the max of either on and add 1. We then
        // continue until we propogate back to the root of the tree and do it for the right subtree, and continue doing
        // so until we finally come back to the root of the tree and add 1 to the max of either subtree height, and
        // return that sum. Formula for height of a tree is 1 + max(height(LeftChild), height(RightChile));
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }


    public int minValue(){
        // we make a call to the recursive function, minValue.
        return minValue(root);
    }


    /**
     * O(n) because we have to check each node in the tree, and there are n nodes.
     * @param root is the current node we're on.
     * @return the min value between the roots left and right subtrees and itself.
     */
    private int minValue(Node root) {
        // if the this current root node is a leaf we return its value.
        if (isLeaf(root)){
            return root.value;
        }

        var left = minValue(root.leftChild);
        var right = minValue(root.rightChild);
        // otherwise we return the minimum of both subtrees of the tree's root node and the minimum of those two we use
        // to compare the smallest between that value and the tree's root value (postOrder - left, right, root), and
        // return the min of those values.
        return Math.min(Math.min(left, right), root.value);
    }


    /**
     *  O(log n) because we get rid of half the tree's node each pass we make in the loop since we're only trying to
     *  get to the left most node of the binary search tree.
     * @return returns the smallest value (left most node) of the tree.
     */
    public int minValueOfBST(){
        // throws an exception if root is null.
        if (root == null) {
            throw new IllegalStateException();
        }
        // current is a traversing node
        Node current = root;
        // last will be the last node current is before taking a null value and having us exit the loop.
        Node last = current;

        // while current is not null we will continue iterating through the left subtrees
        while (current != null){
            // last takes the current value of current before current takes the value of its left subtree node
            last = current;
            // current takes the value of its left subtree node
            current = current.leftChild;
        }
        // returns the value if last, the left most node's value.
        return last.value;
    }


    /**
     * @param node is the input node we're checking to see if it is a leaf node.
     * @return returns a boolean value conveying if the node is a leaf or not.
     */
    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }

    /**
     *  equals checks if two binary trees are the same.
     * @param other is the binary tree we're comparing with.
     * @return returns a boolean value convey if the trees are the same or not.
     */
    public boolean equals(Tree other){
        // check if other is null.
        if (other == null){
            return false;
        }
        // returns if both this tree and the other are equal.
        return equals(root, other.root);
    }


    private boolean equals(Node first, Node second){
        // Check if both nodes are leaves
        if (first == null && second == null){
            return true;
        }

        // Check if both nodes are not null
        if (first != null && second != null){
            // if they both aren't null, then check if their roots, left subtrees, and right subtrees match.
            return first.value == second.value && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }

        // Otherwise, we return false.
        return false;
    }

    /**
     * @return returns a boolean value - true if the tree is a valid BST, otherwise returns false.
     */
    public boolean isValidBST(){
        return isValidBST(root, null, null);
    }

    /**
     *
     * @param root is the current node we are in.
     * @param lower is the lower bound that the current node's value is allowed to be.
     * @param upper is the upper bound that the current node;s value is allowed to be.
     * @return returns a boolean value - true if the tree is a valid BST, otherwise returns false.
     */
    private boolean isValidBST(Node root, Integer lower, Integer upper) {
        // if root is null then it is a valid null binary tree.
        if (root == null) return true;

        // We need to keep track of both upper and lower bounds for each node while traversing
        // the tree, and compare the node value not with children values but with these limits.
        int val = root.value;

        // we need to make sure if lower or upper bounds aren't null, to check if current value
        // is within the correct bounds - if not we return false.
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        // otherwise we update our upper and lower bounds so while we traverse down the tree,
        // we can assure the subtrees and their nodes are within the correct bounds for each subtree.
        // if any of the recursive calls return false, then we propagate the falses up the call stack
        // by negating the false return values and continue to return false.
        if (!isValidBST(root.leftChild, lower, val)) return false;
        if (!isValidBST(root.rightChild, val, upper)) return false;


        return true;
    }

    /**
     * This method is used to test the method that tests whether this tree is a valid BST.
     *
     * swapRoot swaps the root with its left child, and vice versa.
     */
    public void swapRoot(){
        var temp = root;
        var left = root.leftChild;
        root = left;
        root.leftChild = temp;
    }

    /**
     *
     * @param distance is the distance, measeured in nodes away from the root.
     * @return returns an arraylist with values of nodes that are 'distance' nodes away from the root.
     */
    public ArrayList<Integer> getNodesAtDistance(int distance){
        ArrayList<Integer> list = new ArrayList<>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    /**
     *  getNodesAtDistance
     * @param node is the particular node we're traversing from when trying to see how far we're from our desired nodes.
     * @param distance is the distance, measeured in nodes away from 'node'.
     * @param list is the arraylist we're propagating back to the calling function which is accumulating the nodes.
     */
    private void getNodesAtDistance(Node node, int distance, ArrayList<Integer> list){
        // Base Case: if the current node is null we just "return" to quit the function.
        if (node == null) {
            return;
        }

        // Base Case: if we reach the designated distance in the tree (distance = 0) we add the
        //            the current node's value into the list.
        if (distance == 0) {
            list.add(node.value);
            return;
        }

        // Otherwise we want to continue traversing down the tree & decrement the distance the
        // closer we get to the desired distance.
        getNodesAtDistance(node.leftChild, distance -1, list);
        getNodesAtDistance(node.rightChild, distance - 1, list);
        return;
    }


    /**
     * Prints out nodes level by level starting from the root.
     */
    public void levelOrderTraversal(){
        for(int i = 0; i <= height(); i++){
            for (var node : getNodesAtDistance(i)){
                System.out.println(node);
            }
        }
    }


    /**
     * Size() returns the number of nodes inside the tree.
     * @return returns an int value representing the number of nodes in the tree.
     */
    public int size(){
        int total = 0;
        for(int i = 0; i <= height(); i++){
            total += getNodesAtDistance(i).size();
        }
        return total;
    }


    /**
     * @return returns the number of leaves in the tree.
     */
    public int countLeaves(){
        return countLeaves(root);
    }


    /**
     * @param node is the current node we're on, its used to check if we're on a leaf or not.
     * @return returns the accumulated number of leaves we have in the tree.
     */
    private int countLeaves(Node node){
        // checks if current node is null, we return 0.
        if (node == null){
            return 0;
        }
        // checks if current node is a leaf, we return 1 if so.
        if (isLeaf(node)) {
            return 1;
        }
        // we return, and propagate up to the root, the number of leaves from left and right subtrees.
        return countLeaves(node.leftChild) + countLeaves(node.rightChild);
    }


    /**
     * @return Returns the maximum value in a BST using recursion.
     */
    public int max(){
        return max(root);
    }


    /**
     * @param node the node we are traversing down from.
     * @return Returns the maximum value in a BST using recursion.
     */
    private int max(Node node){
        // Base case 1: If node is null, return 0.
        if (node == null) {
            return 0;
        }
        // Base case 2: If node is a leaf, return the node's value.
        if (isLeaf(node)){
            return node.value;
        }
        // assign left the max of the left subtree of the current node.
        var left = max(node.leftChild);
        // assign right the max of the right subtree of the current node.
        var right = max(node.rightChild);
        // return the max between this node's value and the max of the left and right subtrees of this node.
        return Math.max(Math.max(left, right), node.value);
    }


    /**
     * @param val is the value we're looking for.
     * @return returns true if the value exists in our tree otherwise returns false.
     */
    public boolean contains(int val){
        return contains(root, val);
    }


    /**
     * @param node is the node whose value we're checking if its less than, greater than,
     *            or equal to the value we're looking for.
     * @param val is the value we're looking for.
     * @return returns true if the value exists in our tree otherwise returns false.
     */
    private boolean contains(Node node, int val){
        // Base case: If node is null, return false.
        if(node == null) {
            return false;
        }
        // Base case: If the value matches the value of the current node we're on, return true.
        if (val == node.value) {
            return true;
        }
        // return the logical or of contains for both left and right subtrees of the current node we're on.
        return contains(node.leftChild, val) || contains(node.rightChild, val);
    }


    /**
     * A method to check to see if two values are siblings.
     * @param left int value we're trying to figure out if is a sibling to right.
     * @param right int value we're trying to figure out if is a sibling to left.
     * @return return true if left and right share the same parent.
     */
    public boolean areSiblings(int left, int right){
        return areSiblings(root, left, right);
    }


    /**
     * A method to check to see if two values are siblings.
     * @param parent current parent node whose children we're checking
     * @param left int value we're trying to figure out if is a sibling to right.
     * @param right int value we're trying to figure out if is a sibling to left.
     * @return return true if left and right share the same parent.
     */
    private boolean areSiblings(Node parent, int left, int right){
        // Base case 1: If parent is null, we have a null tree and we return false.
        if (parent == null){ return false;}
        // Base case 2: If parent is a leaf, we return false since we've reached the end of a subtree
        // and know the siblings cannot exist here.
        if (isLeaf(parent)){return false;}
        // Base case 3: If parent's left & right child aren't null, we check if they equal to the values
        // we're looking to see if they're siblings.
        if (parent.leftChild != null && parent.rightChild != null){
            // If both children equal to the values we're looking to see if they're siblings,
            // we return true.
            if (siblingsExist(parent, left, right)){
                return true;
            }
        }
        // Assign a variable existsLeft the return value of this function on parent's left child, left, right.
        // In other words, we continue to traverse down the left subtree and run this function on the left subtree
        // of this parent node.
        boolean existsLeft = areSiblings(parent.leftChild, left, right);
        // Assign a variable existsRight the return value of this function on parent's right child, left, right.
        // In other words, we continue to traverse down the right subtree and run this function on the right subtree
        // of this parent node.
        boolean existsRight = areSiblings(parent.rightChild, left, right);
        // We propagate the logical or of both values all the way up to the root where we finally return the logical
        // or between the root's subtrees.
        return existsLeft || existsRight;
    }


    /**
     *  A method to check of infact left and right are siblings and share the same parent.
     * @param parent current parent node whose children we're checking
     * @param left int value we're trying to figure out if is a sibling to right.
     * @param right int value we're trying to figure out if is a sibling to left.
     * @return return true if left and right share the same parent.
     */
    private boolean siblingsExist(Node parent, int left, int right){
        return (parent.leftChild.value == left && parent.rightChild.value == right) || (parent.leftChild.value == right && parent.rightChild.value == left);
    }


    /**
     * A method to return the ancestors of a value in an arraylist<Integer>
     * @param k is the value where looking for in out tree.
     * @return returns a list of k's ancestors.
     */
    public ArrayList<Integer> getAncestors(int k) {
        ArrayList<Integer> list = new ArrayList<>();
        getAncestors(root, list, k);
        return list;
    }


    /**
     * A method to return the ancestors of a value in an arraylist<Integer>
     * @param parent the node we're check to see if its value equals to val.
     * @param list a list of val's ancestors.
     * @param val is the value where looking for in out tree.
     * @return returns a node which is propagated back up the stack.
     */
    private Node getAncestors(Node parent, ArrayList<Integer> list, int val){
        // Base case: if parent is null we've reached the end of a subtree where the value didn't
        // exist and return it. We also return parent if it does equal to the value we're looking for.
        if(parent == null || parent.value == val){
            return parent;
        }
        // We traverse down the left subtree and check if we found the value in the left subtree.
        Node left = getAncestors(parent.leftChild, list, val);
        // if so we add this current node's value to the list and continue propagating the status of
        // the found value up the call stack.
        if (left != null && left.value == val){
            list.add(parent.value);
            return left;
        }
        // We traverse down the right subtree and check if we found the value in the right subtree.
        Node right = getAncestors(parent.rightChild, list, val);
        // if so we add this current node's value to the list and continue propagating the status of
        // the found value up the call stack.
        if (right != null && right.value == val){
            list.add(parent.value);
            return right;
        }
        // we return parent as a way to continue propagating back up the call stack if we havent
        // found the value we're looking for.
        return parent;
    }
}