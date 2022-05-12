public  class FindTargetNode {
    static Node root,targetN;      

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
    public static Node getTargetNode(Node root,int k){
       boolean  found = false;
       if(root != null){
            if(root.data == k){
                  found =true;
                  targetN = root;
                  return targetN;
       }
               getTargetNode(root.left,k);
               getTargetNode(root.right,k);
    }
        return targetN;
    }
    public static void main(String[] args) {
        int k =2;
        FindTargetNode tree_level= new FindTargetNode();
        tree_level.root = new Node(1); 
        tree_level.root.left = new Node(2); 
        tree_level.root.right = new Node(3); 
        tree_level.root.left.left = new Node(4); 
        tree_level.root.left.right = new Node(5); 
        tree_level.root.right.left = new Node(6); 
        Node res = getTargetNode(root, 4);
        System.out.println(res.data);
      
          
        
    }
    
}