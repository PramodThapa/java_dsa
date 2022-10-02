package src.com.dsa.Binary_Tree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(12L);
        tree.root.left = new Node(1L);
        tree.root.right = new Node(2L);

        tree.root.left.left = new Node(10L);
        tree.root.left.right = new Node(4L);

        tree.inOrderTraversal(tree.root);
        tree.postOrderTraversal(tree.root);
        tree.preOrderTraversal(tree.root);

        System.out.println(tree.inOrderTraversalNode);
        System.out.println(tree.postOrderTraversalNode);
        System.out.println(tree.preOrderTraversalNode);

        System.out.println("Inside main method");
    }
}
