import java.util.ArrayList;

public class Solution 
{
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        int n=arr.size();
        int x = arr.get(0);
        if(n==1)
        {
            return arr.get(n-1);
        }
        for(int i=1; i<n; i++)
        {
            x^=arr.get(i);
        }
        return x;
    }
}
