import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
   
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
	if(head == null)
    {
        return null;
    }
    //Creating new nodes
    LinkedListNode<Integer> updHead = head;
        while(updHead!=null)
        {
            LinkedListNode<Integer> insNode = new LinkedListNode<Integer>(updHead.data);
            insNode.next = updHead.next;
            updHead.next = insNode;
            updHead = updHead.next.next;
        }
    //updating random pointers of new nodes  
        updHead = head;
        while(updHead!=null)
        {
            LinkedListNode<Integer> mid = updHead.next;
            if(updHead.random!=null)
            {
                mid.random = updHead.random.next;
            }else{
                mid.random = null;
            }
            updHead = updHead.next.next;
        }
        //removing new nodes from original linked list
        updHead = head;
        LinkedListNode<Integer> newHead = updHead.next;
        while(updHead!=null)
        {
         LinkedListNode<Integer> mid = updHead.next;
         LinkedListNode<Integer> temp = mid.next;
         if(mid.next!=null)
         {
             mid.next = mid.next.next;
         }
            updHead.next = temp;
            updHead = updHead.next;
        }
        return newHead;
    }
}
