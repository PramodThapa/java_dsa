package src.com.dsa.Binary_Tree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(12L);
        tree.root.left = new Node(1L);
        tree.root.right = new Node(2L);

        tree.root.left.left = new Node(10L);




        System.out.println("Inside main method");
    }
}
