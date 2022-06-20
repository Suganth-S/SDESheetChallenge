import java.util.*;
//using two pointers
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        int dup=0,low=0,high=1;
        while(high<n)
        {
            if(arr.get(low)==arr.get(high))
            {
                dup++;
            }
            low++;
            high++;
        }
        return n-dup;
	}
}
