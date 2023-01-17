package LinkedList;

public class Insertion_Deletion_print_in_linkedlist {

    Node head;
    private int size;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;

    }

    //adding data at a last position
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

    //Delete from start

    public void deleteFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }


    public static void main(String args[]){

        Insertion_Deletion_print_in_linkedlist linkedlist = new Insertion_Deletion_print_in_linkedlist();
        linkedlist.addFirst("a");
        linkedlist.addFirst("is");
        linkedlist.addLast("List");
        linkedlist.addFirst("this");

        linkedlist.printList();
    }
}
