import java.util.Queue;
 
import java.util.LinkedList; 

public  class LevelOrderTraversal {
    static Node root;            
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
       Queue <Node> q = new LinkedList<Node>(); 
        if(root == null){
            return;
        }
        System.out.println("root add" + root.data);
        q.add(root);
        while(!q.isEmpty()){
            Node tNode = q.poll();
            if(tNode != null)
            System.out.println(tNode.data);
            if(tNode.left != null){
                q.add(tNode.left);
            }if(tNode.right != null){
                q.add(tNode.right);
            }
        }
        
    }
    public static void main(String[] args) {
        LevelOrderTraversal tree_level= new LevelOrderTraversal();
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
        levelOrderTraversal(root);
          
        
    }
    
}
