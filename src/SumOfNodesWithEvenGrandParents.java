public class SumOfNodesWithEvenGrandParents {
    
    static Node root;
    static int sum;

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }

    }
    
    static void getSum(Node cNode, Node parent, Node grandParent) {
        if (cNode == null) {
            return;
        }
        if (grandParent != null && grandParent.data % 2 == 0) {
            sum += cNode.data;
        }
        getSum(cNode.left, cNode, parent);
        getSum(cNode.right, cNode, parent);
    }
   
   
   
    public static void main(String[] args) {
        SumOfNodesWithEvenGrandParents tree = new SumOfNodesWithEvenGrandParents();
        tree.root = new Node(22);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(8);
        tree.root.right = new Node(8);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(9);
        tree.root.right.right.right = new Node(2);
        getSum(root, null, null);
        System.out.println(sum);

    }
}
