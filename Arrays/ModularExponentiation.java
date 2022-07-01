import java.util.* ;
import java.io.*; 
public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
       long ans = 1;
       long sq =x;
       while(n>0){
           if(n%2==0){
               sq=(sq%m*sq%m)%m;
               n=n>>1;
           } else{
               ans=(ans*sq%m)%m;
               n=n-1;
           }
       }
       return (int)(ans%m);    
    }
}
