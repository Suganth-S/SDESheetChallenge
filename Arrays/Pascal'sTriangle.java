import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
         ArrayList<ArrayList<Long>> arr = new ArrayList<ArrayList<Long>> ();
        for(int line=0; line<n; line++)
        {
            ArrayList<Long> temp= new ArrayList<Long>();
            long val=1;
            for(int i=0; i<=line; i++)
            {
                  temp.add(val);
                  //pascals formula
                  val = val*(line-i)/(i+1);
            }
            arr.add(temp);
        }
        return arr;
	}
}
