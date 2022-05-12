public class FindStringInTree {
    static Node root;     
    static int i=0;
    static String st="RAHUL";
    public static  class Node
    {
       
        char data;
        Node left,right;
        Node(char val)
        {
            data = val;
            left=right = null;
        }
    }
    public static void findSeq(Node root,int i){
       
       if(root != null){
           if(root.data==st.charAt(i)){
               i=i+1;
               System.out.println("found " + root.data);
               findSeq(root.left, i);
               findSeq(root.right, i);
           }
       }
        
    }
    public static void main(String[] args) {
      
         
        FindStringInTree tree_level= new FindStringInTree();
        tree_level.root = new Node('R'); 
        tree_level.root.left = new Node('Y'); 
        tree_level.root.right = new Node('A'); 
        tree_level.root.left.left = new Node('R'); 
        tree_level.root.left.right = new Node('O'); 
        tree_level.root.right.left = new Node('H');
        tree_level.root.right.right = new Node('D');
        tree_level.root.right.left.left = new Node('X');
        tree_level.root.right.left.right = new Node('U');
        tree_level.root.right.left.right.left = new Node('P');
        tree_level.root.right.left.right.right = new Node('L');
        findSeq(root,i);
      /*  tree_level.root = new Node('S'); 
        tree_level.root.left = new Node('T'); 
        tree_level.root.right = new Node('X'); 
        tree_level.root.left.left = new Node('X'); 
        tree_level.root.left.right = new Node('R'); 
        tree_level.root.left.right.right = new Node('X'); 
        tree_level.root.left.right.left = new Node('I'); 
        tree_level.root.left.right.left.left = new Node('N'); 
         tree_level.root.left.right.left.right = new Node('G'); */
          
        
    }
}
