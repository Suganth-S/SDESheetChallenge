import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
     int left=0, right=0;
        Arrays.sort(arr);
     ArrayList<ArrayList<Integer>> li = new ArrayList<ArrayList<Integer>>();
      for(int i=0; i<n; i++)
      {
          left = i+1;
          right = n-1;
          while(left<right)
          {
            //check for sum, here we fix arr[i], and then form 2 pair sum over remaining elements of array
              if(arr[left] + arr[right]+ arr[i] == K)
              {
                  li.add(new ArrayList<>(Arrays.asList(arr[i],arr[left],arr[right])));
                  int x = arr[left];
                  int y = arr[right];
                  //skipping the same returned elements of left and right if they are present in duplicate form
                  while(left<right && arr[left]==x)
                  {
                      left++;
                  }
                  while(left<right && arr[right] == y)
                  {
                      right--;
                  }
              }
            //if not match then in else cases move left/right pointer as per condition
              else if (arr[left] + arr[right]+ arr[i] < K)
              {
                  left++;
              }
              else{
                  right--;
              }
          }
        //we need to skip duplicates of arr[i], ith element if present
          while(i+1<n && arr[i]== arr[i+1])
          {
              i++;
          }
      }
        return li;
	}
}
