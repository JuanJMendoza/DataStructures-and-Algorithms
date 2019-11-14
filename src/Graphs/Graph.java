package Graphs;

import java.util.*;

public class Graph {
    private class Node{
        private String label;

        public Node(String label){
            this.label = label;
        }
        @Override
        public String toString(){
            return label;
        }
    }

    // our structure responsible for keeping track of existing String labels/ nodes in our graph.
    private Map<String, Node> nodes = new HashMap<>();
    // representation of our graph using a Map, with Nodes as our keys, and Lists of nodes keeping track of our edges.
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    /**
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

    /**
     * @param from is a String parameter, which if it exists in our graph, we want to connect to the node with the to
     *             label.
     * @param to is a String parameter, which if it exists in our graph, we want to connect the node with the from
     *             label to the node with the to label.
     */
    public void addEdge(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode == null){
            throw new IllegalArgumentException();
        }
        if (toNode == null){
            throw new IllegalArgumentException();
        }

        // Since we made it this far without falling into exceptions both instances are valid.
        // We're designing a unidirectional graph here, so we'll only add one edge from fromNode to toNode.
        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeEdge(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if(fromNode == null || toNode == null){
            // we simply return nothing because removing a node that doesn't exist shouldn't cause any side effects.
            return;
        }
        adjacencyList.get(fromNode).remove(toNode);
    }

    public void removeNode(String label){
        Node removingNode = nodes.get(label);
        if (removingNode == null){
            // we simply return nothing because removing a node that doesn't exist shouldn't cause any side effects.
            return;
        }

        // since we're removing the entire node, we need to remove all the edges pointing towards this node.
        // for each node in out graph (adjacency list) we remove the node from each node. (removing edges to this node.)
        for (var n: adjacencyList.keySet()){
            adjacencyList.get(n).remove(removingNode);
        }
        // removing the nodes itself from the graph (adjacency list)
        adjacencyList.remove(removingNode);
        // removing the node from the list of nodes we're using to keep track of which ones exist in our graph.
        nodes.remove(removingNode);
    }

    public void print(){
        for(var source: adjacencyList.keySet()){
            var target = adjacencyList.get(source);
            if(!target.isEmpty()){
                System.out.println(source + " is connected to " + target);
            }
        }
    }

    public void dfs(String root){
        Node node = nodes.get(root);
        if (node == null){
            return;
        }
        recursiveDFS(node, new HashSet<>());
    }

    private void recursiveDFS(Node root, Set<Node> visited){
        System.out.println(root);
        visited.add(root);
        for(var node: adjacencyList.get(root)){
            if(!visited.contains(node)){
                recursiveDFS(node, visited);
            }
        }
    }


}
