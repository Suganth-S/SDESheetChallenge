import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr)    {
    int n = arr.size();
    int maxLen=0;
    int sum=0;
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    for(int i=0; i<n; i++)
    {
        sum+=arr.get(i);
        if(sum==0)
        {
            maxLen = i+1;
        }
        else if(hm.containsKey(sum))
        {
            maxLen = Math.max(maxLen,i-hm.get(sum));
        }
        else{
            hm.put(sum,i);
        }
    }
        return maxLen;
   }
}
