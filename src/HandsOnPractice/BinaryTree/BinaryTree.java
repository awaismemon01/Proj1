package HandsOnPractice.BinaryTree;

public class BinaryTree implements PostOrderTraverse, PreOrderTraverse, InOrderTraverse {
    Node root;

    BinaryTree(){
        root=null;
    }

    public int countLeaf(Node node){
        if(node==null){
            return 0;
        }

        if(node.left==null && node.right==null){
            return 1;
        }
        else
            return countLeaf(node.left) + countLeaf(node.right);
    }

    @Override
    public void inorder(Node node) {
        if(node==null){
            return;
        }

        inorder(node.left);
        System.out.print(node.key+" -> ");
        inorder(node.right);
    }

    @Override
    public void postorder(Node node) {
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+" -> ");

    }

    @Override
    public void preorder(Node node) {
        if(node==null){
            return;
        }

        System.out.print(node.key+" -> ");
        preorder(node.left);
        preorder(node.right);
    }

}
