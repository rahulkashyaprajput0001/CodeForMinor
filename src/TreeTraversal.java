public class TreeTraversal {
    static  Node root;
    public static class Node{
        int data;
        Node left,right;
        Node(int val)
        {
            data = val;
            left=right=null;
        }
    }public static void inorderTraversal(Node root)
    {
        if(root == null){
            return;
        }else{
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }
    }
    public static void main(String args[]){
        TreeTraversal tTravesal = new TreeTraversal();
        tTravesal.root = new Node(1);
        tTravesal.root.left = new Node(2);
        tTravesal.root.right = new Node(3);
        tTravesal.root.right.left = new Node(4);
        inorderTraversal(root);

            
       // tTravesal.root = new Node(1);
        //tTravesal.root.left = new Node(2);
        //tTravesal.root.right = new Node(3);
        //tTravesal.root.left.left = new Node(4);
        //tTravesal.root.left.left.right = new Node(5);
        //tTravesal.root.left.left.right.left = new Node(6);
        //inorderTraversal(root);
    }
    
}
