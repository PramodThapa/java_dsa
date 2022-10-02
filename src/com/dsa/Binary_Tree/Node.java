package src.com.dsa.Binary_Tree;

/**
 * Node of the tree.
 */
public class Node {

     Long nodeValue;
     Node left, right;

    /**
     * Constructor.
     *
     * @param nodeValue
     */
    Node(Long nodeValue){
        this.nodeValue = nodeValue;
        left = right = null;
    }
}
