package HandsOnPractice.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);                    //Tree Example
        tree.root.left = new Node(5);//                   1
        tree.root.right = new Node(8);//              5       8
        tree.root.left.left = new Node(3);//        3   7       2
        tree.root.left.right = new Node(7);
        tree.root.right.right = new Node(2);

        System.out.print("Pre order traverse : ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Post order traverse : ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("In order traverse : ");
        tree.inorder(tree.root);
        System.out.println();

        int leaf = tree.countLeaf(tree.root);
        System.out.println("Number of leaf nodes are : "+leaf);

    }

}
