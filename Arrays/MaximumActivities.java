import java.util.*;

class Activities{
    int pos;
    Integer start;
    Integer end;
    public Activities(int x, Integer y, Integer z)
    {
        pos = x;
        start = y;
        end = z;
    }
}

class SortbyActivity implements Comparator<Activities> {
    public int compare(Activities a, Activities b )
    {
        return a.end-b.end;
    }
}

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
       List<Activities> activity = new ArrayList<Activities>();
        
        for(int i=0; i<start.size(); i++)
        {
            activity.add(new Activities(i, start.get(i), end.get(i)));
        }
        
        Collections.sort(activity, new SortbyActivity());
        int answer = 1;
        int endtime = activity.get(0).end;
        for(int i=1; i<activity.size();i++)
        {
            if(endtime<=activity.get(i).start)
            {
                endtime = activity.get(i).end;
                answer++;
            }
        }
        return answer;
    }
}
