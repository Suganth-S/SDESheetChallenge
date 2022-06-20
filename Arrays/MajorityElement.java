import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int ele = arr[0];
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(ele == arr[i])
            {
                count++;
            }else{
                count--;
            }
            if(count==0)
            {
                ele = arr[i];
                count=1;
            }
        }
        
        count=0;
        for(int i=0;i<n;i++)
        {
            if(ele==arr[i])
            {
                count++;
            }
        }
        if(count >(n/2))
        {
            return ele;
        }else{
            return -1;
        }
	}
}
