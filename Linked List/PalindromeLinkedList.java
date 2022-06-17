import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
	    int len = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> prev = null;
        while(temp != null) {
            temp = temp.next;
            len++;
        }
        boolean odd = (len%2==0)?false:true;
        temp = head;
        for(int i =0;i < len / 2;i++){
            temp1 = temp.next;
            temp.next = prev;
            prev = temp;
            temp = temp1;
        }
        temp = (odd)?temp.next:temp;
        
        while(temp != null){
            if(prev == null) {
                return false;}
            if(!temp.data.equals(prev.data)) {
                return false;}
            
            temp = temp.next;
            prev = prev.next;
        }
        return true;
    }
}
