import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
      /**
      *Cases to be consider
      *1. What if head is null ?
      *2. What if next of head is null ?
      *3. what if middle of odd and even lengthed of LinkedList
      */
        if(head == null)
        {
            return null;
        }
        
        if(head.next==null)
        {
            return head;
        }
        Node curr = head;
        int count=0;
        for(Node r = head; r!=null; r=r.next)
        {
            count++;
        }
        
        for(int i=0; i<count/2; i++)
        {
            curr=curr.next;
        }
        return curr;
    }
}
