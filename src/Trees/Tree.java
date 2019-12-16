package Trees;

public class Tree {
    ///////////////////
    /// Node Class ///
    ///////////////////
    /**
     * private node class with implementation details.
     */
    private class Node{
        // value is the int type value the node will hold.
        private int value;
        // leftChild is the left node child of this particular node.
        private Node leftChild;
        // rightChild is the right node child of this particular node.
        private Node rightChild;

        /**
         *
         * @param value is the value this particular node will hold.
         * @param leftChild is the left node child of this particular node.
         * @param rightChild is the right node child of this particular node.
         */
        public Node(int value, Node leftChild, Node rightChild){
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

    }


}
