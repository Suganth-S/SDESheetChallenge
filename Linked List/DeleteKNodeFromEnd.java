import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        int len=0;
		if(head==null || K==0)
        {
            return head;
        }
        for(LinkedListNode<Integer> curr = head; curr!=null; curr=curr.next)
        {
            len++;
        }
        
        int diff = len-K;
        if(diff == 0)
        {
            head = head.next;
            return head;
        }
        LinkedListNode<Integer> curr = head;
        for(int i=0; i<diff-1; i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
	}
}
