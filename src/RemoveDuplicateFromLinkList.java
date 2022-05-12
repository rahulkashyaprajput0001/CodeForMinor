import java.util.HashSet;

public class RemoveDuplicateFromLinkList {
    
     static Node head;

    class Node {

        int data;
        Node next;

        Node(int item) {
            data = item;
            next = null;
        }
    }
    
    void insert(int data) {
        Node new_node = new Node(data);
        Node tmp =head;
        if(head == null){
        head = new_node;
        }
        else{
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next= new_node;
        }
    }
    
    void removeDuplicate(Node head){
        HashSet<Integer> hset = new HashSet<>();
        Node pre,curr;
        pre=null;curr=head;
        
        while(curr != null){
            if(!hset.contains(curr.data)){
                hset.add(curr.data);
                pre = curr;
            }
            else{
                pre.next = curr.next;
            }
           // pre = curr;
            curr = curr.next;
        }
    }
     void prinList(Node head) {
        Node tmp;
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " " + "-->");
            tmp = tmp.next;
        }
        System.out.print("null");
    }
    
    public static void main(String[] args) {
        RemoveDuplicateFromLinkList list = new RemoveDuplicateFromLinkList();
        list.insert(12);
        list.insert(11);
        list.insert(12);
        list.insert(21);
        list.insert(41);
        list.insert(43);
        list.insert(21);
        System.out.println("before deleetion of duplicate nodes\n");
        list.prinList(head);
        list.removeDuplicate(head);
        System.out.println("\nafter deleetion of duplicate nodes");
        list.prinList(head);
    }
}
