import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                hm.replace(arr.get(i),hm.get(arr.get(i))+1);
            }else{
                hm.put(arr.get(i),1);
            }
        }
        int limit = arr.size()/3;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
            if(entry.getValue() > limit)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
