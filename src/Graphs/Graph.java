package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private class Node{
        private String label;

        public Node(String label){
            this.label = label;
        }
    }

    // our structure responsible for keeping track of existing String labels/ nodes in our graph.
    private Map<String, Node> nodes = new HashMap<>();
    // representation of our graph using a Map, with Nodes as our keys, and Lists of nodes keeping track of our edges.
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    /**
     *
     * @param label is a String parameter that addNode takes in and wraps in a Node object which then adds to our map of
     *              nodes and adjacency list, which is implementing a Map as well.
     */
    public void addNode(String label){
        // wraps Sting label in a node object.
        Node node = new Node(label);

        // before adding a node we first check to see if there is a node with String label already existing in our map
        // of nodes, which we use to keep track of which labels we have. If it doesn't exist we add it.
        nodes.putIfAbsent(label, node);
        // before adding our node to our adjacency list graph representation, we check if it's already in there, if not
        // we add it with a new arraylist to keep track of it's edges.
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void removeNode(String label){

    }


}
