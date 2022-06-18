import java.util.* ;
import java.io.*; 
/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
//Time - O((m+n)+(l1-l2)+min(m,n), space - O(1)
public class Solution {

	public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        int l1 = length(firstHead);
        int l2 = length(secondHead);
        int d = 0;
        LinkedListNode<Integer> ptr1 = null;
        LinkedListNode<Integer> ptr2 = null;
        
        if(l1>l2)
        {
            d = l1-l2;
            ptr1 = firstHead;
            ptr2 = secondHead;
        }else{
            d = l2-l1;
            ptr1 = secondHead;
            ptr2 = firstHead;
        }
        
        while(d>0)
        {
            if(ptr1==null)
            {
                return -1;
            }
            ptr1 = ptr1.next;
            d--;
        }
        
        while(ptr1!=null && ptr2!=null)
        {
            if(ptr1 == ptr2)
            {
                return ptr1.data;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return -1;
    }
    
    static int length(LinkedListNode<Integer> head)
    {
        int i=0;
        while(head!=null)
        {
            i++;
            head = head.next;
        }
        return i;
    }
}
