public class LeftViewTree {
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
    public static void leftViewTraversal(Node root,int i){
        if(root == null)
            return;
        if(level < i){
            System.out.println(root.data);
            level=i;
        }
        leftViewTraversal(root.left, i+1);
        leftViewTraversal(root.right, i+1);
        
            
    }
    
    public static void main(String[] args) {
        LeftViewTree lvt = new LeftViewTree();
         lvt.root = new Node(12); 
        lvt.root.left = new Node(10); 
        lvt.root.right = new Node(30); 
        lvt.root.right.left = new Node(25); 
        lvt.root.right.right = new Node(40); 
        leftViewTraversal(root,1);
    }
    
}
