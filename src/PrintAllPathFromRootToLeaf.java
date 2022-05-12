/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;

/**
 *
 * @author rahul.kashyap
 */
public class PrintAllPathFromRootToLeaf {
    
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
 static Stack<Integer> stk = new Stack<>();
    
    static void pritnAllPaths(Node root) {
        if (root == null) {
            return;
        }
        stk.push(root.data);
        pritnAllPaths(root.left);
        if (root.left == null && root.right == null) {
            System.out.println(stk);
        }
        pritnAllPaths(root.right);
        stk.pop();
    }
    
    
    public static void main(String[] args) {
        PrintAllPathFromRootToLeaf lvt = new PrintAllPathFromRootToLeaf();
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
         pritnAllPaths(root);
       
    }
    

    
}
