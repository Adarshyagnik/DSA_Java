package LinkedList;

import java.util.LinkedList;

//Reverse a Linked List in group of Given Size.
public class reverse_linkedlist_size_is_given {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public Node reverse2(Node node,int k){

        if(node==null || node.next==null){
            return node;
        }

        Node prevNode = null;
        Node currNode = node;
        Node next = null;
        int count = 0;
        while(currNode!=null && count<k){
            next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
            count++;
        }
        if(next!=null){
            node.next = reverse2(next,k);
        }
        return prevNode;
    }

    public static void main(String args[]) {
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        reverse_linkedlist_size_is_given list = new reverse_linkedlist_size_is_given();
        list.addLast("1");
        list.addLast("2");
        list.addLast("2");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");

        list.reverse2(list.head, 4);
        list.printList();

    }
}
