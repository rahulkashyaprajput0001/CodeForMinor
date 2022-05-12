public  class FindNodesAtK {
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
    public static void findNodesATKDistance(Node root,int k){
       
       if(root == null){
           return;
       }
       if(k == 0){
           System.out.println(root.data);
       }
        findNodesATKDistance(root.left,k-1);
        findNodesATKDistance(root.right,k-1);
        
    }
    public static void main(String[] args) {
        int k =2;
        FindNodesAtK tree_level= new FindNodesAtK();
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
        tree_level.root.right.left = new Node(6); 
        findNodesATKDistance(root,k);
      
          
        
    }
    
}