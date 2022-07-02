import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = arr.size();
        int count =0;
        int cmp= 0;
        for(int i=0;i<n;i++){
            cmp ^= arr.get(i);
            if(map.get(cmp^x)!= null)
                count += map.get(cmp^x);
            if(cmp==x)
                count++;
            if(map.get(cmp)!=null)
                map.put(cmp,map.get(cmp) +1);
            else
                map.put(cmp,1);
        }
        return count;
	}
}
