import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });
        List<Interval> mergedInvervals = new ArrayList<>();
         int newStart = intervals[0].start;
        int maxFinish = intervals[0].finish;
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i].start <= maxFinish){
                maxFinish = Math.max(maxFinish, intervals[i].finish);    
            }else{
                mergedInvervals.add(new Interval(newStart, maxFinish));
                newStart =  intervals[i].start;
                maxFinish = intervals[i].finish;
            }
        }
        
        mergedInvervals.add(new Interval(newStart, maxFinish));
        return mergedInvervals;
    }
}
