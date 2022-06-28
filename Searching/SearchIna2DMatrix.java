import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
  //T.C: O(row+col), using two-pointer approach
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		int i=0, j= mat.get(0).size()-1;
        while(i<mat.size() && j>=0)
        {
            if(mat.get(i).get(j) == target)
            {
                return true;
            }else if(mat.get(i).get(j) < target)
            {
                i++;
            }else if(mat.get(i).get(j) > target)
            {
                j--;
            }
        }
        return false;
	}
}
