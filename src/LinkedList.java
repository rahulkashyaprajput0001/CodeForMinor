public class LinkedList {

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
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(4);
        list.insert(8);
        list.prinList(head);
    }
}
