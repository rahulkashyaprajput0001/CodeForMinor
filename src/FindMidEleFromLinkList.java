/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahul.kashyap
 */
public class FindMidEleFromLinkList {

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
        Node tmp = head;
        if (head == null) {
            head = new_node;
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new_node;
        }
    }

   static  void prinList(Node head) {
        Node tmp;
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " " + "-->");
            tmp = tmp.next;
        }
        System.out.print("null");
    }

    static void middleEle(Node head) {
        Node fastP = head;
        Node slowP = head;
        Node tmp;
        while (fastP != null && fastP.next != null && fastP.next.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        if (slowP != null) {
            System.out.println(slowP.data);
        }
    }

    public static void main(String[] args) {
        FindMidEleFromLinkList list = new FindMidEleFromLinkList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        middleEle(head);
        prinList(head);

    }
}
