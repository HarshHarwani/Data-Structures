package stackqueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class OverLappingIntervals {

    public final Comparator<Interval> Interval_Order = new Interval_Order();

    public void getoverLappingIntervals(List<Interval> intervalList) {
        Collections.sort(intervalList, new Interval_Order());
        Stack<Interval> s = new Stack<Interval>();
        s.push(intervalList.get(0));
        for (int i = 1; i < intervalList.size(); i++) {
                Interval top=s.peek();
                Interval listele=intervalList.get(i);
                //if the interval is not overlapping we push it to the stack
                if(top.end<listele.start){
                    s.push(listele);
                }else{
                    top.end=listele.end;
                    s.pop();
                    s.push(top);
                }
        }
        printStack(s);
        
    }

    private void printStack(Stack<Interval> s) {
        for(Interval ele:s){
            System.out.println("["+ele.start+","+ele.end+"]"+" ");
        }
    }
    

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
        return o1.end-o2.end;

    }

}
