package stackqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class OverLappingIntervals {

    public final Comparator<Interval> Interval_Order = new Interval_Order();

    public List<Interval> getoverLappingIntervals(List<Interval> intervalList) {
        Collections.sort(intervalList, new Interval_Order());
        Stack<Interval> s = new Stack<Interval>();
        for (int i = 0; i < intervalList.size(); i++) {
            Interval interval = intervalList.get(i);
            if (s.isEmpty()) {
                s.push(interval);
            } else {
                Interval top = s.peek();
                if (!(interval.start > top.start) && !(interval.end > top.end)) {
                    s.push(interval);
                }else{
                    top=s.pop();
                    top.end=interval.end;
                    s.push(top);
                }
            }
        }
        List<Interval> result=new ArrayList<Interval>();
        while(s.isEmpty()){
            result.add(s.pop());
        }
        return result;
    }
    
   /* public String toString(List<Interval> intervals){
            
    }*/
}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Interval_Order implements Comparator<Interval> {

    public int compare(Interval o1, Interval o2) {
        if (o1.start < o1.end)
            return -1;
        if (o1.start > o1.end)
            return 1;
        else
            return 0;

    }

}
