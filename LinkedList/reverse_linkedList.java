package LinkedList;

//reverse a linked list both iterative and recursive

import java.util.LinkedList;


public class reverse_linkedList {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;

        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode!=null){
            System.out.println(currNode.data +" ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }


    public Node reverse(){
        if(head==null || head.next==null){
            return head;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
             // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

        return  head;
    }


    public static void main(String args[]){
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        reverse_linkedList list = new reverse_linkedList();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.reverse();
        list.printList();



    }
}
