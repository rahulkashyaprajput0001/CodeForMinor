
import java.util.LinkedList;
import java.util.Queue;

public  class CountLeaf {
    static Node root;      
    static int count = 0,sm=0;
    public static  class Node
    {
        int data;
        Node left,right;
        Node(int val)
        {
            data = val;
            left=right = null;
        }
    }
    public static void levelOrderTraversal(Node root){
       
        if(root.left == null && root.right == null)
        {sm+=root.data;
            count= count+1;
            return;
        }
        levelOrderTraversal(root.left);
        levelOrderTraversal(root.right);
        
    }
    public static void main(String[] args) {
        CountLeaf tree_level= new CountLeaf();
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
        levelOrderTraversal(root);
        System.out.println("leaf" + count+" " +sm);
          
        
    }
    
}
