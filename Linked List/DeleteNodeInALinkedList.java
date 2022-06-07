import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        LinkedListNode(T data)
        {
            this.data = data;
            this.next = null;
        }
    }

*****************************************************************/

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
    /**
    *Here comes the twis thathere is no head given, but we have a node that we need to delete,
    *so what i did is referring next node data and next nodes next make my given node removed
    *and alsohelps to keep next one alive....
    */
		if(node!=null && node.next!=null)
        {
            node.data= node.next.data;
            node.next = node.next.next;
        }
	}
}
