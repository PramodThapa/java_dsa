package src.com.dsa.Binary_Tree;

public class BinaryTree {

    Node root;

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

}
