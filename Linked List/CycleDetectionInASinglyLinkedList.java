import java.util.* ;
import java.io.*; 
/*  

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

*/
//Using floyd cycle detection method
public class Solution {
    
    public static boolean detectCycle(Node<Integer> head) {
        Node<Integer> slow_ptr = head, fast_ptr = head;
        while(fast_ptr!=null && fast_ptr.next!=null)
        {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr)
            {
                return true;
            }
        }
        return false;
    }
}
