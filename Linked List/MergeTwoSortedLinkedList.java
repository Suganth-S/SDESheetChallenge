import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		if(first==null)
                return second;
        if(second==null)
                return first;
        LinkedListNode<Integer> head=null, tail=null;
       if(first.data<=second.data)
       {
           head=tail=first;
           first = first.next;
       }else{
           head=tail=second;
           second = second.next;
       }
        
        while(first!=null && second!=null)
        {
            if(first.data<= second.data)
            {
                tail.next=first;
                tail=first;
                first=first.next;
            }
            else{
                tail.next = second;
                tail=second;
                second=second.next;
            }
        }
        
        if(first==null)
        {
            tail.next=second;
        }else{
            tail.next=first;
        }
        return head;
	}
}
