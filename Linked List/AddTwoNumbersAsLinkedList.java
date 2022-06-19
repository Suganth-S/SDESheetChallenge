import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
    int carry = 0;
    LinkedListNode p, dummy = new LinkedListNode(0);
    p = dummy;
    while (head1 != null || head2 != null || carry != 0) {
        if (head1 != null) {
            carry += head1.data;
            head1 = head1.next;
        }
        if (head2 != null) {
            carry += head2.data;
            head2 = head2.next;
        }
        p.next = new LinkedListNode(carry%10);
        carry /= 10;
        p = p.next;
    }
    return dummy.next;
    }
}
