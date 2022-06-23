import java.util.*;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int arrMR[] = new int[2];
      //checks element is repeating
        for(int i=0; i<n; i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                arrMR[0] = arr.get(i);
             }else{ hm.put(arr.get(i),hm.getOrDefault(arr.get(i),0)+1);
            }
        }
        //check missing element
        for(int i=1; i<=n; i++)
        {
            if(!hm.containsKey(i))
            {
                arrMR[1] = i;
                break;
            }
        }
        
        int temp = arrMR[0];
        arrMR[0] = arrMR[1];
        arrMR[1] = temp;
        return arrMR;
    }
}
