package LinkedList;

import org.w3c.dom.Node;

public class detect_remove_loop {

    //remove loop

        Node head;

        class Node{
            String data;
            Node next;

            Node(String data){
                this.data = data;
                this.next = null;

            }
        }
        // code here
//        // remove the loop without losing any nodes
//        boolean isloop = false;
//        Node slow = head;
//        Node fast = head;
//        while(fast!=null && fast.next!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow==fast){
//                isloop = true;
//                break;
//            }
//        }
//        if(!isloop){
//            return;
//        }
//
//        fast = head;
//
//        if(slow==head){
//            while(fast.next!=head){
//                fast = fast.next;
//            }
//            fast.next = null;
//            return;
//        }
//
//        while(slow.next!=fast.next){
//            slow = slow.next;
//            fast = fast.next;
//        }
//        slow.next = null;
//        return;
//    }



    //find starting point of loop

    public static int findFirstNode(Node head) {

        //code here

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return -1;
        }

        Node start = head;
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
//        return start.data;
        return 0;
    }
}
