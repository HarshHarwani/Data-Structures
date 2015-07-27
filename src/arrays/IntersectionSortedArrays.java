package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArrays {
    
    public List<Integer> intersection(int[] a,int[] b){
        List<Integer> res=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                res.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
        }
        return res;
    }

}
