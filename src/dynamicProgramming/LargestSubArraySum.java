package dynamicProgramming;

public class LargestSubArraySum {
    
    public int getLargestSum(int[] a){
        int max_so_far=0,max_end_here=0;
        for(int i=0;i<a.length;i++){
            max_end_here=max_end_here+a[i];
            if(max_end_here<0)
                max_end_here=0;
            if(max_so_far<max_end_here)
                max_so_far=max_end_here;
        }
        return max_so_far;
    }
    
    public int getLargestSum1(int[] a){
        int max_so_far=a[0],max_end_here=a[0];
        for(int i=0;i<a.length;i++){
            max_end_here=Math.max(a[i], max_end_here+a[i]);
            max_so_far=Math.max(max_end_here, max_so_far);
        }
        return max_so_far;
    }

}
