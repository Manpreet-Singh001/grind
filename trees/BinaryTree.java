package trees;

public class BinaryTree {

    static class Node {
        int value;
        Node left, right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (node.value < value) {
            // go right if right is not null
            if (node.right != null) {
                insert(node.right, value);
            }else{
                // insert here
                node.right = new Node(value);
            }
        }else{
            // go left if left is not null
            if(node.left!= null){
                insert(node.left,value);
            }else{
                node.left = new Node(value);
            }
        }



    }

    public void inorder(Node node){
        // left root rigth
        if(node == null) {return;}

        inorder(node.left);
        visit(node);
        inorder(node.right);
    }

    public void visit(Node node){
        System.out.print(node.value + " ");
    }


    public static void main(String[] args){
        int []  inputArr = {1,134,532,12,25,51};
        BinaryTree tree = new BinaryTree();
        Node root = new Node(0);

        for(int i: inputArr){
            tree.insert(root, i);
        }
        tree.inorder(root);

    }

}

