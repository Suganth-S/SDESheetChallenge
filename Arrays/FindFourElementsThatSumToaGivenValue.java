import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      if(arr==null || arr.length<4){
          return "No";
      }
      Arrays.sort(arr);
      for(int i=0;i<n-3;i++){
          for(int j=i+1;j<n-2;j++){
              int low=j+1;
              int high=n-1;
              while(low<high){
                  int sum=arr[i]+arr[j]+arr[low]+arr[high];
                  if(sum==target){
                      low++;
                      high--;
                      return "Yes";
                  }
                  else if(sum<target){
                      low++;
                  }
                  else{
                      high--;
                  }
              }
          }
      }
      return "No";
  }
}
