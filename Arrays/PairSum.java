import java.util.* ;
import java.io.*; 
/**
Approach:
1.Sort the array
2.Store the no of time the number is repeating in hashMap.
3.Us the TWO POINTER approach.
    if(arr[i]+arr[j]==s) ==>here we have to think as the numbers are repeated
If the ‘left’ and the ‘right’ elements are unequal, get the count of elements which are equal to them.
The number of pairs in the result would be the product of the two counts.
         left  += c1
         right -= c2
If the ‘left’ and the ‘right’ elements are equal, the number of pairs that can be generated is c * (c-1) / 2, 
where c is the number of times the element is present.
          left  += c1
         right -= c1
*/
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<int[]> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int i=0,j=n-1;
        while(i<j)
        {
            int sum = arr[i]+arr[j];
            if(sum>s)
            {
                j--;
            }else if(sum < s)
            {
                i++;
            }else{
                if(arr[i]== arr[j])
                {
                    int c1 = map.get(arr[i]);
                    for(int k=1; k<=c1*(c1-1)/2; k++)
                    {
                        res.add(new int[] {arr[i],arr[j]});
                    }
                    i+=c1;
                    j-=c1;
                }else{
                    int c1 = map.get(arr[i]);
                    int c2 = map.get(arr[j]);
                    for(int k=1; k<=c1*c2; k++)
                    {
                        res.add(new int[]{arr[i],arr[j]});
                    }
                    i+=c1;
                    j-=c2;
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
