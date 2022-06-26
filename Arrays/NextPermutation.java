import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
        int n = permutation.size();
        //taking 2nd last element
		int i = n-2;
        //compare untilwe find a smallest element than i
        while(i>=0 && permutation.get(i+1)<=permutation.get(i))
        {
            i--;
        }
        
        if(i>=0)
        {
            int j= permutation.size()-1;
            //After we found, we again find the next next greater element of the element we found
            while(permutation.get(j)<=permutation.get(i))
            {
                j--;
            }
            //we swap those
            swap(permutation,i,j);
        }  
        //and we reverse all after swap,so that we get next permutation of array
        reverse(permutation,i+1);
        
        return permutation;
	}
    
    static void swap(ArrayList<Integer> permutation, int i, int j)
    {
        int temp = permutation.get(i);
        permutation.set(i,permutation.get(j));
        permutation.set(j, temp);
    }
    
    static void reverse(ArrayList<Integer> permutation,int start)
    {
        int i = start, j = permutation.size()-1;
        while(i<j)
        {
            swap(permutation,i,j);
            i++;
            j--;
        }
    }
}
