/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
public class RIghtViewTree {
    static Node root;
   static int level = 0;
    static   class Node{
        int data;
        Node left,right;
        public Node(int val) {
            data= val;
            left=right=null;
        }
        
    }
    public static void rightViewTraversal(Node root,int i){
        if(root == null)
            return;
        if(level < i){
            System.out.println(root.data);
            level=i;
        }
        rightViewTraversal(root.right, i+1);
        rightViewTraversal(root.left, i+1);
        
            
    }
    
    public static void main(String[] args) {
        RIghtViewTree lvt = new RIghtViewTree();
      //   lvt.root = new Node(12); 
        //lvt.root.left = new Node(10); 
        ///lvt.root.right = new Node(30); 
        //lvt.root.right.left = new Node(25); 
        //lvt.root.right.right = new Node(40); 
        
        lvt.root = new Node(1); 
        lvt.root.left = new Node(2); 
        lvt.root.right = new Node(3); 
        lvt.root.left.left = new Node(4); 
        lvt.root.left.right = new Node(5); 
        lvt.root.right.left = new Node(6); 
        lvt.root.right.right = new Node(7); 
        lvt.root.right.left.right = new Node(8); 
          
        rightViewTraversal(root,1);
    }
    
}
