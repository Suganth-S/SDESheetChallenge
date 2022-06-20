import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		Collections.sort(arr);
        ArrayList<Integer> ele = new ArrayList<Integer>();
        ele.add(arr.get(k-1));
        ele.add(arr.get(n-k));
        return ele;
	}
}
