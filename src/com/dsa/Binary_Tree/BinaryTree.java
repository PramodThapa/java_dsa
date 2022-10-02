package src.com.dsa.Binary_Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    Node root;

    List<Long> inOrderTraversalNode = new ArrayList<>();

    List<Long> preOrderTraversalNode = new ArrayList<>();

    List<Long> postOrderTraversalNode = new ArrayList<>();

    /**
     * No args constructor.
     */
    BinaryTree(){
        this.root = null;
    }

    /**
     * Constructor.
     *
     * @param nodeValue
     */
    BinaryTree(Long nodeValue){
        this.root = new Node(nodeValue);
    }

    /***
     * Recursive function to traverse binary tree.
     *
     * @param node
     */
    public void inOrderTraversal(Node node){

        if(node == null){
            return;
        }

        inOrderTraversal(node.left);

        inOrderTraversalNode.add(node.nodeValue);

        inOrderTraversal(node.right);

    }

    /**
     * Post order traversal.
     *
     * @param node
     */
    public void postOrderTraversal(Node node){
        if(node == null){
            return;
        }

        postOrderTraversal(node.left);

        postOrderTraversal(node.right);

        postOrderTraversalNode.add(node.nodeValue);
    }

    /**
     * Pre order traversal.
     *
     * @param node
     */
    public void preOrderTraversal(Node node){
        if(node == null){
            return;
        }

        preOrderTraversalNode.add(node.nodeValue);

        preOrderTraversal(node.left);

        preOrderTraversal(node.right);

    }

}
